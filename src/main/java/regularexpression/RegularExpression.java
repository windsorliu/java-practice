package regularexpression;

import java.util.Scanner;

public class RegularExpression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat, str;

        while (true) {
            System.out.print("請輸入樣式：");
            pat = sc.nextLine();
            System.out.print("請輸入字串：");
            str = sc.nextLine();

            if (str.matches(pat))
                System.out.println("相符");
            else
                System.out.println("不相符");

            System.out.println();
        }
    }
}
