package pers.tnn.test.collectionOrMap;

import java.io.Serializable;

/**
 * Description: String test
 * User: Tian nan nan
 * Date: 2017/8/9
 */
public class StringTest implements Serializable , Comparable<String>, CharSequence {

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int i) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return null;
    }

    @Override
    public int compareTo(String s) {
        return 0;
    }
}
