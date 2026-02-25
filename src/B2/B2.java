package B2;

import java.util.Scanner;
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i =0;i<n;i++)
            a[i] = sc.nextInt();
        boolean symmetric  = true;
        for (int i=0;i<n/2;i++) {
            if (a[i] != a[n-1-i]) {
                symmetric = false;
                break;
            }
        }
        if (symmetric) {
                System.out.println(" Mảng đối xứng ");
        }else {
                System.out.println("Mảng không đối xứng");
        }
        int maxCount = 0;
        int result = a[0];
        for (int i = 0;i<n;i++) {
            int count = 0;
            for (int j =0;j<n;j++) {
                if (a[i] == a[j])
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                result = a[i];
            }
        }

        System.out.println("Số xuất hiện nhiều nhất: " +result);
        System.out.println("Số lần: "+maxCount);
    }
}
