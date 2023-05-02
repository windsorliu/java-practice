package triangle;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("印出普通三角形");
        System.out.print("請輸入層數：");
        int line = sc.nextInt();
        triangle.general(line);

        System.out.println("印出菱形");
        System.out.print("請輸入層數：");
        line = sc.nextInt();
        triangle.diamond(line);

        System.out.println("印出空格三角形");
        System.out.print("請輸入層數：");
        line = sc.nextInt();
        triangle.spaceType(line);

        sc.close();
    }

    private void general(int line) {

        for (int i = 1; i <= line; i++) {

            System.out.print(i + "\t");// 顯示層數

            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void diamond(int line) {
        int count = line;

        general(line);

        // line-1是為了減去重複的那層
        for (int i = line - 1; i >= 1; i--) {
            count++;
            System.out.print(count + "\t"); // 顯示層數

            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private void spaceType(int line) {
        for (int i = 1; i <= line; i++) {

            System.out.print(i + "\t");// 顯示層數

            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {

                if (k % 2 == 0) { // k為偶數時 不要輸出* 改輸出空格
                    System.out.print(" ");
                    continue;
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
