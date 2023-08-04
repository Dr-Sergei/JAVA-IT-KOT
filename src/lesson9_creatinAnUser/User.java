package lesson9_creatinAnUser;

public class User {
    private int age;
    private String name;
    private String passwordData;

    public User(int age, String name, String passwordData) {
        this.age = age;
        this.name = name;
        this.passwordData = passwordData;
    }
    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public User() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswordData() {
        return passwordData;
    }
}
