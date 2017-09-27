package pers.tnn.test.jdbc;

import java.sql.*;

/**
 * Description: JDBC编程测试
 * User: Tian nan nan
 * Date: 2017/8/21
 */
public class JdbcTest {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";

        String sql = "select id, name from student s";

        try {

            /*
            * ①.加载数据库驱动
            * */
            Class.forName("com.mysql.jdbc.Driver");
            // 加载数据库驱动并不是真的使用数据库驱动类，只是使用数据库驱动类名的字符串而已

            // java7自动关闭资源的try块
            try (
                /*
                * ②.通过DriverManager获取数据库连接
                * */
                Connection connection =  DriverManager.getConnection(url, user, password);

                /*
                * ③.通过Connection获取Statement(PrapareStatement)对象
                * */

                // 创建基本的Statement对象
                Statement statement = connection.createStatement();
                // 根据SQL创建一个预编译的Statement对象(PrepareStatement)
                Statement prepareStatement = connection.prepareStatement(sql);
                // 根据传入SQL创建CallStatement对象，该方法用于调存储过程
                Statement callStatement = connection.prepareCall(sql);

                /*
                * ④.使用Statement对象执行SQL语句，所有的Statement对象都有如下方法：
                * */
                //statement.execute();// 可以执行任何语句，但比较麻烦
                //prepareStatement.executeUpdate(""); // 执行DML语句和DDL语句
                ResultSet resultSet = callStatement.executeQuery(sql); //  执行查询语句，返回ResultSet对象

                /*
                * ⑤.操作结果集，如果执行的是查询语句，则会返回一个ResultSet对象，该对象保存了查询结果。
                * ResultSet对象提供了两类方法来获取查询的结果：
                * next()， previous()， last()， first()等移动记录指针的方法；
                *getXxx()获取指针当前行、特定的列的值
                * */
            ){ if(resultSet != null) {

                   while(resultSet.next()) {
                       System.out.println(resultSet.getString("name"));
                   }
               }

               /*
               * ⑥.回收资源库文件，包括关闭ResultSet，Statement，Connection
               * java7改写了ResultSet，Statement，Connection,均继承了AutoCloseable，所以可以使用try块关闭资源
               * 如果不使用try块关闭，就需要手动从小到大依次关闭
               * */
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
