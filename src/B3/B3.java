package B3;
import java.util.Scanner;
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int k = sc.nextInt();
        boolean found = false;
        for (int i = 0;i <n && !found;i++) {
            for (int j =i + 1;j < n;j++) {
                if (a[i] + a[j]==k) {
                    System.out.println("Cặp tìm được: " + a[i] + " và " + a[j]);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
            System.out.println("Không tồn tại cặp nào");
    }
}
