package BaiTap;

public class Person {
    public String name;
    public Integer age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        String s = "";
        if (name != null) s += "Name: " + name + " ";
        if (age != null) s += "Age: " + age;
        return s.isEmpty() ? "Person chưa có thông tin" : s;
    }
}
