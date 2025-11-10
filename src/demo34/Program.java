package demo34;

public class Program {
    public static void main(String[] args) {
        Account account = new Account();

        System.out.println(account.fullName);
        account.fullName = "Duc Anh";
        System.out.println(account.fullName);
    }
}
