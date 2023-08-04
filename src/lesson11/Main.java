package lesson11;

public class Main {
    public static void main(String[] args) {
        User user = new User(67, "Petr");
        System.out.println(user.toString());

        User user1 = new User(33,"Olena");
        System.out.println(user1.toString());

        System.out.println(user.equals(user1));
    }
}
