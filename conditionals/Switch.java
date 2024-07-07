package conditionals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n =input.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Its 1");
                    break;

                case 2:
                    System.out.println("Its 2");
                    break;

                case 3:
                    System.out.println("Its 3");
                    break;
            
                default:
                    System.err.println("Its more than 3");
                    break;
            }
        }
    }
}
