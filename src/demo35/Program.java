package demo35;

public class Program {
    public static void main(String[] args) {
        Orders o = new Orders();
        o.id=1;
        o.receiverName="Duc";
        o.address="Ha Noi";
        o.phone = "09712424";
        o.totalMoney=150000;
        o.email="duc@gmail.com";
        o.isReceived=true;

        System.out.println(o);
        Orders o1 = new Orders();
        o1.id=1;
        o1.receiverName="Anh";
        o1.address="Ha Noi";
        o1.phone = "09712422334";
        o1.totalMoney=170000;
        o1.email="duc22@gmail.com";
        o1.isReceived=true;

        System.out.println(o1);
    }


}
