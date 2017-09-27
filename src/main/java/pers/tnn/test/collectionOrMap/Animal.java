package pers.tnn.test.collectionOrMap;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/12
 */
public class Animal implements Comparable {

    private String name;

    public Animal(String name) {

        this.name = name;
    }

    // 根据name判断两对象的大小
    @Override
    public int compareTo(Object o) {

        Animal animal = (Animal)o;

        return this.name.equals(animal.name) ? 0: 1;
    }

    //  根据name判断两对象是否相等
    @Override
    public boolean equals(Object o) {

        return this.name.equals(((Animal)o).name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
