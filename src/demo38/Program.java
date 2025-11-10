package demo38;

public class Program {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.fullName);

        s1.fullName = "Anh";
        System.out.println("Sau khi set: " + s1.fullName);

        Student s2 = new Student();
        s2.setFullName("Duc");

        System.out.println("Sau khi set: " + s2.getFullName());
    }


}
