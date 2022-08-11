import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What is the secret number?");
        int SecretNumber = 10;

        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();

        if (a == SecretNumber)   {System.out.println("Correct! Well done");}
        if (a<10)   {System.out.println("Sorry!(Too Low) Try again :(");}
        if (a>10)   {System.out.println("Sorry!(Too High) Try again :(");}



    }
}
