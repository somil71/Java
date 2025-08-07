import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value in meters= ");
        double meteres = scanner.nextDouble();
        double feet = meteres * 3.28084;
        System.out.println(meteres + " meters is equal to " + feet + " feet.");
        scanner.close();

        }
    }
