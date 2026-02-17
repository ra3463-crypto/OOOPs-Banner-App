public class OOPSBannerApp {
    public static void main(String[] args) {

        // UC1: Print Hello World
        System.out.println("Hello World");

        // UC2 + UC3: Display OOPS banner using String.join()
        System.out.println();

        // Line 1
        System.out.println(String.join("", " ***", "    ", "***   ****    ****"));
        // Line 2
        System.out.println(String.join("", "*   *", "  ", "*   *  *   *  *    "));
        // Line 3
        System.out.println(String.join("", "*   *", "  ", "*   *  *   *  *    "));
        // Line 4
        System.out.println(String.join("", "*   *", "  ", "*   *  ****    *** "));
        // Line 5
        System.out.println(String.join("", "*   *", "  ", "*   *  *          *"));
        // Line 6
        System.out.println(String.join("", "*   *", "  ", "*   *  *          *"));
        // Line 7
        System.out.println(String.join("", " ***", "    ", "***   *      **** "));

        System.out.println();
}
}
