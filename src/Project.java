import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Girin: ");
        int n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Girin:");
        int n2 = input.nextInt();
        int ebob = 1;
        if (n1 < n2) {
            for (int k = n1; k >= 1; k--) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                    System.out.println("Ebob" + ebob);
                    break;
                }
            }
            for (int i = 1; i <= (n1 * n2); i++) {
                if (i % n1 == 0 && i % n2 == 0) {
                    System.out.println("Ekok:" + i);
                    break;
                }
            }


        } else {
            for (int k = n2; k >= 1; k--) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                    System.out.println("Ebob" + ebob);
                    break;
                }
            }
            for (int i = 1; i <= (n1 * n2); i++) {
                if (i % n1 == 0 && i % n2 == 0) {
                    System.out.println("Ekok:" + i);
                    break;
                }
            }
        }
    }
}
