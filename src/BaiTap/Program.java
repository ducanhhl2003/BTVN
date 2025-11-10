package BaiTap;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten tu ban phim: ");
        name = sc.nextLine();
        if (name.isEmpty()) {
            System.out.println("Bạn vừa nhập tên là chuỗi rỗng");
        } else {
            System.out.println("Xin chào, " + name);
        }

        Student s1 = new Student();

        Car c1 = new Car("Honda1", 2015);
        Car c2 = new Car("Honda2", 2016);

        System.out.println("C1 : " + c1);
        System.out.println("C2 : " + c2);

        Rectangle t1 = new Rectangle(3, 4);
        System.out.println("Dien tich la: " + t1.cal());

        System.out.println("Nhap ban kinh hinh 1");
        Double b1 = sc.nextDouble();
        System.out.println("Nhap ban kinh hinh 2");
        Double b2 = sc.nextDouble();

        Circle h1 = new Circle(b1);
        Circle h2 = new Circle(b2);
        System.out.println("Dien tich hinh 1: " + h1.dienTich());
        System.out.println("Dien tich hinh 2: " + h2.dienTich());

        Person p1 = new Person();
        Person p2 = new Person("Ducanh");
        Person p3 = new Person(18);
        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);
        System.out.println("P3: "+p3);

    }
}
