import java.util.Scanner;

public class Main {
    static int countYears(double balance, double rate, double withdraw) {
        if (balance * (rate/100) >= withdraw) {
            return Integer.MAX_VALUE;
        } else {
            int years = 0;
            while (true) {
                balance = balance + balance * (rate/100) - withdraw;
                if (balance < 0) {
                    break;
                }
                years++;
            }
            return years;
        }
    }

    public static void main(String[] args) {
        // Om vi har X kronor, och en ränta på Y%, hur många år kan vi ta ut Z kronor.

        Scanner input = new Scanner(System.in);
        System.out.print("Ange summan: ");
        double balance = input.nextDouble();
        System.out.print("Ange räntesatsen: ");
        double rate = input.nextDouble();
        System.out.print("Ange uttaget: ");
        double withdraw = input.nextDouble();

        System.out.println("Antal år: " + countYears(balance, rate, withdraw));
    }
}