package demo35;

public class Orders {
    public int id;
    public String receiverName;
    public String address;
    public String phone;
    public int totalMoney;
    public String email;
    public boolean isReceived;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", receiverName='" + receiverName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", totalMoney=" + totalMoney +
                ", email='" + email + '\'' +
                ", isReceived=" + isReceived +
                '}';
    }
}
