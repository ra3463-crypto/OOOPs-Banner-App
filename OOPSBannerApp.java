public class OOPSBannerApp {
    public static void main(String[] args) {

        // UC1: Print Hello World
        System.out.println("Hello World");

        // UC4: Store banner lines in a String array and print using a loop
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
