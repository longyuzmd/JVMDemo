package day02;

public class Order<T> {

    String orderName;

    int orderId;

    // 类的内部（属性 方法 构造器）可以使用泛型

    T orderT;

    public Order(){};

    public Order(String orderName,int orderId,T orderT){
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderT = orderT;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
}
