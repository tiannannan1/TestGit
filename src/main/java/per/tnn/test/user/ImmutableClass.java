package per.tnn.test.user;

public class ImmutableClass {

    private final String name;
    private final String telNum;

    public ImmutableClass() {

        this.name = "";
        this.telNum = "";
    }

    public ImmutableClass(String name, String telNum) {

        this.name = name;
        this.telNum = telNum;
    }

    public String getTelNum() {
        return telNum;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", telNum='" + telNum + '\'' +
                '}';
    }
}
