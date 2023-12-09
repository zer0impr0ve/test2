//Implement a class named Rectangle, which has two integer fields: a, b (the side lengths
//of the rectangle). Please, add a constructor, which will set values of all fields. Add to
//class definition also the method named getArea(), which returns the area of the
//rectangle and getPerimeter() returning figure perimeter.
//For the created class definition add a test class with main() method, where you have to
//create an instance of type Rectangle using two-arguments constructor, then call
//getArea() and getPerimeter() methods and display returned values on the standard
//output.
package excs;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void setA(int a){
        this.a = a;
    }

    protected int getArea(){
        return a * b;
    }

    public int getPerimeter(){
        return (2 * a) + (2 * b);
    }

}
