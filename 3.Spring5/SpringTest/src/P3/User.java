package P3;

public class User {
    private int count;

    public User() {
        count = 1;
    }

    public void print() {
        System.out.println("hello user " + (count++));
    }
}
