import java.util.Scanner;

public class baek2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 4 == 0) {
            if (a % 400 == 0)
                System.out.printf("1");
            else if (a % 100 == 0)
                System.out.printf("0");
            else System.out.printf("1");

        } else System.out.printf("0");
    }
}




