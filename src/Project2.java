import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Girin: ");
        int n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Girin:");
        int n2 = input.nextInt();
        int ebob = 1, i, ekok = 1;
        if (n1 < n2) {
            i = n1;
            while (i >= 1) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                    break;
                }
                i--;
            }
        } else {
            i = n2;
            while (i >= 1) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                    break;
                }
                i--;
            }

        }
        i = 1;
        while (i <= n1 * n2) {
            if ((i % n1 == 0) && (i % n2 == 0)) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);

    }
}
