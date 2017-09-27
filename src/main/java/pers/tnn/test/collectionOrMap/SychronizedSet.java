package pers.tnn.test.collectionOrMap;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/9
 */
public class SychronizedSet {

    public static void main(String[] args) {

        SortedSet<Color> treeSet = Collections.synchronizedSortedSet(new TreeSet<Color>());
        treeSet.add(Color.Black);
        System.out.println(treeSet);
    }
}
