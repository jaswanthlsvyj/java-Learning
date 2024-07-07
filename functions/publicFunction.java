package functions;

public class publicFunction {
    public static void main(String[] args) {
        printHello();

        System.out.println(printInt());

        printValue("This is trail  string");

        System.out.println(sum(1,2));
    }

    public static void printHello(){
        System.out.println("Hello world");
    }

    public static int printInt(){
        return 69;
    }

    public static void printValue(String val){
        System.out.println(val);
    }

    public static int sum(int a, int b){
        return (a+b);
    }
}
