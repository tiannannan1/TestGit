package pers.tnn.test.jdbc;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Description: 使用try块自动关闭资源
 * User: Tian nan nan
 * Date: 2017/8/22
 */
public class JDBCNoCatchTest {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        String sql = "SELECT * FROM  class";

        try (
                // try块自动关闭实现AutoCloseable的资源
                //Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.213:3306/test", "root", "123456");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");

                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);
                ){

            // 使用RowSetProvider创建RowSetFactory
            RowSetFactory factory = RowSetProvider.newFactory();
            // 创建默认的CachedRowSet
            CachedRowSet cachedRowSet = factory.createCachedRowSet();
            // 使用ResultSet装填CachedRowSet
            //cachedRowSet.populate(resultSet);
            // 向前滚动结果集
            /*cachedRowSet.afterLast();

            while (cachedRowSet.previous()) {

                System.out.println(cachedRowSet.getInt(1) + ":" + cachedRowSet.getString(2));

                if(cachedRowSet.getInt(1) == 1) {

                    //cachedRowSet.setString("name", "1班"); 不支持
                    cachedRowSet.updateString("name", "一班");
                    cachedRowSet.updateRow();
                }
            }*/

            // 设置每页显示的条数
            cachedRowSet.setPageSize(2);
            //从第几笔开始查询
            cachedRowSet.populate(resultSet, 3);
            //cachedRowSet.nextPage();
            cachedRowSet.previousPage();
            // 向后滚动结果集
            while (cachedRowSet.next()) {

                System.out.println(cachedRowSet.getInt(1) + ":" + cachedRowSet.getString(2));
            }

            // 将提交设置为
            connection.setAutoCommit(false);
            // 将对RowSet的修改同步到数据库
            cachedRowSet.acceptChanges(connection);


            /*if(resultSet != null ) {

                while (resultSet.next()) {

                    System.out.println(resultSet.getString(1) + ":" + resultSet.getString(2));
                }
            }

            boolean i = statement.execute(sql);*/
            System.out.println(cachedRowSet);
        }
    }
}
