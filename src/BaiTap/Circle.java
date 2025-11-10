package BaiTap;

public class Circle {
    public double r;
    private final double pi=3.14;
    public Circle(double r) {
        this.r = r;
    }

    public Double chuVi()
    {
        return r*pi*2;
    }
    public Double dienTich()
    {
        return pi*Math.pow(r,2);
    }


}
