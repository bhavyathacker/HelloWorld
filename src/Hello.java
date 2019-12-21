
public class Hello {
    public static void main(String[] args) {

        printStarBox();
//        printOneToFourBox();
//        printOneToSixTriangle();
//        printAbcTriangle();
//        printDollarBox();
    }

    private static void printStarBox() {
//        * * * *
//        * * * *
//        * * * *
//        * * * *
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 4; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printOneToFourBox() {
        /*1 2 3 4
          1 2 3 4
          1 2 3 4
          1 2 3 4*/
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 4; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void printDollarBox() {
//        $ $ $ $
//        $     $
//        $     $
//        $ $ $ $
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printAbcTriangle() {
        /*A
          A B
          A B C*/
        for (char i = 'A'; i <= 'C'; i++) {

            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printOneToSixTriangle() {
        /*1
          1 2
          1 2 3
          1 2 3 4
          1 2 3 4 5
          1 2 3 4 5 6*/
        for (int j = 1; j <= 6; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
