package pers.tnn.test.enumClass;

public enum EnumClassFirst {

    VIDEO(1,"视频"),
    AUDIO(2,"音频");

    int value;
    String name;

    EnumClassFirst(int value, String name) {
        this.value = value;
        this.name = name;
    }

 /*   public String getName() {
        return name;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
