import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String A = input.nextLine();
        String B = input.nextLine();

        // Menjumlahkan panjang String
        System.out.println(A.length() + B.length());

        // Membandingkan secara lexicographical
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Mengubah huruf pertama menjadi kapital
        String kapitalA =
                A.substring(0, 1).toUpperCase()
                + A.substring(1);

        String kapitalB =
                B.substring(0, 1).toUpperCase()
                + B.substring(1);

        System.out.println(kapitalA + " " + kapitalB);

        input.close();
    }
}