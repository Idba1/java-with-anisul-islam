import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int number;
        System.out.println("Enter a number:\n");
        number = Input.nextInt();
        System.out.println("your provide number is: " + number);

        Scanner Num = new Scanner(System.in);
        int Num2;
        System.out.println("Enter a Num:\n");
        Num2 = Num.nextInt();
        System.out.println("your provide Num is: " + Num2);

        int Sum = number + Num2;
        System.out.println("Sum is :" + Sum);
    }
}
