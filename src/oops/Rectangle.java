package oops;

public class Rectangle {
double length;
double width;
double getArea(){
   return length*width;
}
double getPerimeter(){
    return 2*(length + width);
}

Rectangle(double width,double length){
    this.width=width;
    this.length=length;

}

 public void  setwidth(double width){
    this.width=width;

}
public void  setLength(double length){
    this.length=length;
}

public double getWidth(){
    return width;
}
public double getLength(){
    return length;
}


    public static void main(String[] args) {
        Rectangle r1=new Rectangle(3.0,8.0);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
