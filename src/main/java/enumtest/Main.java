package enumtest;

public class Main {

    // 使用name() valueOf()在enum和String之間做轉換
    public static void main(String[] args) {
        ProductCategory category = ProductCategory.FOOD;

        String str = category.name();
        System.out.println(str); // FOOD

        String s2 = "CAR";
        ProductCategory category2 = ProductCategory.valueOf(s2);

        System.out.println(category2);
    }

}
