//package exam;
//
//import java.util.Observable;
//import java.util.Observer;
//
//
//class Antique extends Observable {
//    private float price;
//
//    public Antique(float price) {
//        this.price = price;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        super.setChanged();
//        super.notifyObservers(price);
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "古董的价格为:" + this.price;
//    }
//}
//
//
//class People implements Observer {
//    private String name;
//
//    public People(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void update(Observable o, Object arg) {
//        System.out.println("update name:" + this.name + "+price:" + ((Float) arg).floatValue());
//    }
//}
//
//public class Observe {
//
//
//    public static void main(String[] args) {
//
//        Antique house = new Antique(1222f);
//        People p1 = new People("p1");
//        People p2 = new People("p2");
//        People p3 = new People("p3");
//
//        house.addObserver(p1);
//        house.addObserver(p2);
//        house.addObserver(p3);
//        System.out.println("价格是："+house.getPrice());
//        house.setPrice(1000);
//
//    }
//}
