package lesson9_creatinAnUser;

public class Main {
    public static void main(String[] args) {
        User user = new User(33, "Sascha", "xyz");

        User user1 = new User(22, "Julija");

        User user2 = new User();

        user1.setName("Wasya");


        System.out.println(user.getAge());
        System.out.println(user1.getName());
        System.out.println(user2.getPasswordData());
    }
}
