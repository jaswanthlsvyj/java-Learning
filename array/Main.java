package array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};

        for (int i = 0; i<5; i++){
            System.out.println(a[i]);
        }

        try (Scanner input = new Scanner(System.in)) {
            System.err.print("Enter the string: ");
            String s = input.nextLine();
            for (int i =0; i< s.length() ; i++){
                System.out.println(s);
            }
        }
    }
}
