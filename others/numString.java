package others;

import java.util.Scanner;

public class numString {
    public static void main(String[] args) {
        System.out.print("Enter the number :");
        int t ;
        try (Scanner inp = new Scanner(System.in)) {
            t = inp.nextInt();
            while (t > 0){
                System.out.println(inp.nextInt()+" "+inp.next());
                t--;
            }
        }
    }
}
