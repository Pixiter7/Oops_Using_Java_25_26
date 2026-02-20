// UID: 24BCS12643
// Name: Himanshu Kumar


public class Overloading {
    public static int area(int length, int breadth){
        return length*breadth;
    }
    public static int area(int side){
        return side*side;
    }
    public static void main(String[] args){
        int rect = area(20,10);
        int square = area(49);
        System.out.println("Area of rectangle : "+ rect);
        System.out.println("Area of Square : "+ square);
    }
}