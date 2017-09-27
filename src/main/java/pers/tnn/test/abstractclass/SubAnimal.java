package pers.tnn.test.abstractclass;

public class SubAnimal extends Animal {

    public int getLegNum() {

        return 0;
    }

    public static void main(String [] args) {

        SubAnimal animal = new SubAnimal();
        animal.moveMode();
    }
}
