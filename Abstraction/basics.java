package Abstraction;

public class basics {
    public static float radius = 10.0f;

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.length = 10f;

        Triangle t1 = new Triangle(9, 10);

        System.out.println("The area of Circle: " + Circle.area(radius));
        System.out.println("The area of Squre: " + s1.area());
        System.out.println("The area of Triangle: " + t1.area());
    }
}

/**
 * Circle
 */ 
class Circle {
    public final static float PI = 3.1414f;
    public static float area(float radius){
        return PI * radius * radius;
    }
    
}

/**
 * Square
 */
class Square{
    public float length;
    public float area(){
        return this.length * this.length;
    }
}

/**
 * Triangle
 */
class Triangle {
    public float base;
    public float height;
    
    // constructor
    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    public float area(){
        return (float) ((1.0/2.0) * this.base * this.height);
    }
    
}