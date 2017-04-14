package parentTest;

public class TestTask {
    public static void main(String[] args) {

        String star = "*";
        for (int i = 0; i < 20; i++) {
            star += "*";
        }

//        System.out.println(star);

//        for (int i = 0; i < 21; i++) {
//            System.out.println(star);
//            star = star.substring(0, star.length() - 1);
//        }

        String star2 = "*";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j--) {
                System.out.print(star2);
            }
            System.out.println();
        }


        String star3 = "*";
        for (int i = 20; i > 0; i--) {
            for (int x = 0; x < i; x++) {
                System.out.print(star3);
//
            }
            System.out.println();
        }


    }
}
    