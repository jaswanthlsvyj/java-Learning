package Encapsulation;

public class basics {
    public static float radius = 10.0f;

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.length = 10f;

        Triangle t1 = new Triangle(9, 10);

        System.out.println("The area of Circle: " + Circle.area(radius));
        System.out.println("The area of Squre: " + s1.area());
        System.out.println("The area of Triangle: " + t1.area());

        getset gs = new getset(9, 11);
        System.out.println("a :" + gs.geta() + " , b :"+ gs.getb());
        gs.seta(999);
        System.out.println(gs.geta());
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
 * Circle
 */ 
class Circle {
    public final static float PI = 3.1414f;

    // private method
    private static float square(float radius){
        return radius * radius;
    }

    public static float area(float radius){
        return PI * square(radius);
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

// priavte, getter and setter
class getset{
    // private variables
    private int a;
    private int b;

    public getset(int a, int b){
        this.a = a ;
        this.b = b ;
    }

    public int geta(){
        return this.a;
    }

    public int getb(){
        return this.b;
    }

    public void seta(int a){
        this.a = a;
    }
}