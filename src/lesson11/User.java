package lesson11;

public class User extends Object {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is "+ name + " and my age is "+ age+"!";
    }
}
