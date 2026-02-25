package B1;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        System.out.println(" Nhập: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int letters = 0;
        int digits = 0;
        int special = 0;
        boolean isPalindrome = true;
        int n = s.length();
        for (int i = 0;i< n;i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c))
                letters++;
            else if (Character.isDigit(c))
                digits++;
            else
                special++;

            if (i < n/2) {
                if (s.charAt(i) != s.charAt(n-1-i)) {
                    isPalindrome = false;
                }
            }

        }
        System.out.println("Chữ cái: " + letters);
        System.out.println("Chữ số: " + digits);
        System.out.println("Ký tự đặc biệt: " + special);
        if (isPalindrome)
            System.out.println("Chuỗi đối xứng");
        else
            System.out.println("Không đối xứng");
    }
}
