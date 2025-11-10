package demo30;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Cal cal = new Cal();
        int result = cal.getMultiple(4, 5);
        System.out.println("result" + result);

        cal.getMoney();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = cal.getMoney2(a, b);

        System.out.println("C: " + c);
    }
}
