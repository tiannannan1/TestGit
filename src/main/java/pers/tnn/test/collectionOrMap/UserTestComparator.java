package pers.tnn.test.collectionOrMap;

import java.util.Comparator;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/9
 */
public class UserTestComparator implements Comparator<UserTest> {

    @Override
    public int compare(UserTest userTest, UserTest t1) {

        return userTest.getAge() - t1.getAge();
    }
}
