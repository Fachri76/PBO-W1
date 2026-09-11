import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for (int i = 0; i < T; i++) {

            String angka = input.next();

            try {
                long n = Long.parseLong(angka);

                System.out.println(n + " can be fitted in:");

                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }

                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }

                if (n >= -2147483648L && n <= 2147483647L) {
                    System.out.println("* int");
                }

                System.out.println("* long");

            } catch (NumberFormatException e) {
                System.out.println(angka + " can't be fitted anywhere.");
            }
        }

        input.close();
    }
}