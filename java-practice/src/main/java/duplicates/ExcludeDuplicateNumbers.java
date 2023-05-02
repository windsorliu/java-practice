package duplicates;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExcludeDuplicateNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExcludeDuplicateNumbers main = new ExcludeDuplicateNumbers();

        System.out.print("請輸入數字陣列(用空格區隔)：");
        String str = sc.nextLine(); // 用nextLine將輸入字串連同空格儲存起來
        sc.close();

        String[] origin = str.split("\\s+"); // 以空格為界限 分割數字

        System.out.print("使用TreeSet：");
        main.useSet(origin);
        System.out.print("\n不使用TreeSet，單純使用array：");
        main.notUseSet(origin);
    }

    private void useSet(String[] origin) {

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < origin.length; i++) {
            // 避免將""字串轉成數字
            if (origin[i].equals("")) {
                continue;
            }

            set.add(Integer.valueOf(origin[i]));
        }

        System.out.println(set);
    }

    private void notUseSet(String[] origin) {

        int[] result;
        int resultSize = 0;

        // 去除重複數字
        for (int i = 0; i < origin.length; i++) {
            if (origin[i].equals("")) {
                continue;
            }

            resultSize++;

            for (int j = (i + 1); j < origin.length; j++) {
                if (origin[i].equals(origin[j])) {
                    origin[j] = "";
                }
            }
        }

        result = new int[resultSize]; // 用result陣列儲存origin的資料


        // 將String轉成Integer存進result
        for (int i = 0; i < origin.length; i++) {
            // 避免將""字串轉成數字
            if (origin[i].equals("")) {
                continue;
            }

            resultSize--;
            result[resultSize] = Integer.parseInt(origin[i]);
        }

        // BubbleSort 小-->大
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        // 輸出數字
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
    }
}
