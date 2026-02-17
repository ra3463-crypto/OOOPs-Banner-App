
public class OOPSBannerApp {
    public static void main(String[] args) {

        // UC1: Print Hello World
        System.out.println("Hello World");

        // UC5: Inline array initialization with String.join() in single statement
        String[] bannerLines = {
            String.join("", " ***", "    ", "***   ****    ****"),
            String.join("", "*   *", "  ", "*   *  *   *  *    "),
            String.join("", "*   *", "  ", "*   *  *   *  *    "),
            String.join("", "*   *", "  ", "*   *  ****    *** "),
            String.join("", "*   *", "  ", "*   *  *          *"),
            String.join("", "*   *", "  ", "*   *  *          *"),
            String.join("", " ***", "    ", "***   *      **** ")
        };

        System.out.println();
        for (String line : bannerLines) {
            System.out.println(line);
        }
        System.out.println();
    }
}
