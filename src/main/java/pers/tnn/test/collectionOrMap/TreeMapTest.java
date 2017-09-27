package pers.tnn.test.collectionOrMap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/11
 */
public class TreeMapTest {

    public static void main(String[] args) {

        // 自定义类最为key
        TreeMap treeMap = new TreeMap<>();
        treeMap.put(new Animal("p"),"pig");
        treeMap.put(new Animal("t"),"tiger");
        treeMap.put(new Animal("c"),"cat");
        treeMap.put(new Animal("d"),"dog");

        // 输出结果为：{Animal{name='p'}=pig, Animal{name='t'}=tiger, Animal{name='c'}=cat, Animal{name='d'}=dog}
        System.out.println("Animal对象作为key的TreeMap:" + treeMap);
        System.out.println("返回最小key对应的key-value对：" + treeMap.firstEntry()); // Animal{name='p'}=pig
        System.out.println("返回最小的key：" + treeMap.firstKey()); // Animal{name='p'}
        System.out.println("返回最大key对应的key-value对：" + treeMap.lastEntry()); // Animal{name='d'}=dog
        System.out.println("返回最大的key：" + treeMap.lastKey()); // Animal{name='d'}
        System.out.println("返回比指定key的后一位key-value对，没有返回null：" + treeMap.higherEntry(new Animal("c")));// null
        System.out.println("返回比指定key大的后一位key值，没有返回null：" + treeMap.higherKey(new Animal("c")));// null
        System.out.println("返回比指定key的前一位key-value对，没有返回null：" + treeMap.lowerEntry(new Animal("p"))); //  Animal{name='d'}=dog
        System.out.println("返回比指定key的前一位key值，没有返回null：" + treeMap.lowerKey(new Animal("p"))); //  Animal{name='d'}
        //System.out.println("返回比指定范围的key-value对：" + treeMap.subMap(new Animal("c"), new Animal("p"))); //   fromKey > toKey

        // 字符串作为key
        TreeMap tm = new TreeMap();
        tm.put("a", "a");
        tm.put("q", "q");
        tm.put("z", "z");
        tm.put("b", "b");

        System.out.println("字符串TreeMap：" + tm); // 输出结果：{a=a, b=b, q=q, z=z}
        System.out.println("返回比指定key大的最小key-value对，没有返回null：" + tm.higherEntry("z")); // q=q
        System.out.println("返回比指定key大的最小key值，没有返回null：" + tm.higherKey("c")); // q
        System.out.println("返回比指定key的前一位，没有返回null：" + tm.lowerEntry("a")); // null
        System.out.println("返回指定范围的key-value对(包括fromKey，不包括toKey):" + tm.subMap("a", "q")); // {a=a, b=b}

        // {{b=b, q=q}
        System.out.println("返回指定范围的key-value对(是否包括fromKey-value，toKey-value取决于其后面的参数true包括，false不包括):" + tm.subMap("a", false,"q", true ));
       // {a=a, b=b, q=q}
        System.out.println("返回指定范围的key-value对(是否包括fromKey-value，toKey-value取决于其后面的参数true包括，false不包括):" + tm.subMap("a", true ,"q", true ));
        System.out.println("返回key之后(包括key)的key-value对：" + tm.tailMap("q")); // {q=q, z=z}
        System.out.println("返回key之后(是否包括key，取决于随后的参数，true包括，false不包括)的key-value对：" + tm.tailMap("q",false));// {z=z}
        System.out.println("返回key之前(不包括key)的key-value对：" + tm.headMap("q")); // {a=a, b=b}
        System.out.println("返回key之前(是否包括key，取决于随后的参数，true包括，false不包括)的key-value对：" + tm.headMap("q",true));// {a=a, b=b, q=q}

        TreeMap treeMap1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o, Object t1) {

                String str1 = (String)o;
                String str2 = (String)t1;

                System.out.println(str1 + ":str1:" + str1.hashCode() + ">>"+ str2 +":str2:" + str2.hashCode());

                return str1.equals(str2) ? 0 : 1;
            }
        });

        treeMap1.put("a", "a");
        treeMap1.put("q", "q");
        treeMap1.put("b", "b");
        treeMap1.put("z", "z");

        System.out.println(treeMap1); // {a=a, q=q, b=b, z=z}
        System.out.println(treeMap1.tailMap("a")); // {b=b, z=z}
        //System.out.println(treeMap1.headMap("b")); // {b=b, z=z}
    }
}
