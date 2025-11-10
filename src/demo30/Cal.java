package demo30;

import java.util.Scanner;

public class Cal {
    public int getMultiple(int a, int b) {
        return a * b;
    }

    public void getMoney() {
        Scanner sc = new Scanner(System.in);
        int money1 = sc.nextInt();
        int money2 = sc.nextInt();

        int total = money1 + money2;
        if (total >= 100000) {
            System.out.println("Du tien de mua doi giay");
        } else {
            System.out.println("Ko du tien de mua giay");
        }
    }

    public int getMoney2(int money1, int money2) {
        int total = money1 + money2;
        return total;
    }


}
