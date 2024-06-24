package oops;

public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = "Maruti";
        this.year = year;
    }

 public   String call(){

        return "Call method";
    }
    public static String drive(){
     return "I am driving";
 }


    public static void main(String[] args) {

        drive();
        Car c=new Car("",2003);
 System.out.println("Name:"+c.brand);
 System.out.println(c.call());
    }
}
