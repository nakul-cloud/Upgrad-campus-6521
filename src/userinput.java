import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        int numberA;
        int numberB;
        int numberC;
        Scanner input = new Scanner(System.in);

        System.out.println("input the value for a");
        numberA = input.nextInt();

        System.out.println("input the value for b");
        numberB = input.nextInt();

        System.out.println("input the value for C");
        numberC = input.nextInt();

        System.out.println(numberA * numberB + numberC);

    }
}