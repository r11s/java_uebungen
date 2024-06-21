public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\nTest initial Deutsch <-------------");
        System.out.println(Season.FRUEHLING);
        System.out.println(Season.SOMMER);
        System.out.println(Season.HERBST);
        System.out.println(Season.WINTER);

        System.out.println("\nTest Französisch <-------------");
        Season.setSprache(Languages.FRANZOESISCH);
        System.out.println(Season.FRUEHLING);
        System.out.println(Season.SOMMER);
        System.out.println(Season.HERBST);
        System.out.println(Season.WINTER);

        System.out.println("\nTest Englisch <-------------");
        Season.setSprache(Languages.ENGLISCH);
        System.out.println(Season.FRUEHLING);
        System.out.println(Season.SOMMER);
        System.out.println(Season.HERBST);
        System.out.println(Season.WINTER);

        System.out.println("\nTest Deutsch <-------------");
        Season.setSprache(Languages.DEUTSCH);
        System.out.println(Season.FRUEHLING);
        System.out.println(Season.SOMMER);
        System.out.println(Season.HERBST);
        System.out.println(Season.WINTER);

        System.out.println("\nTest Italienisch <-------------");
        Season.setSprache(Languages.ITALIENISCH);
        System.out.println(Season.FRUEHLING);
        System.out.println(Season.SOMMER);
        System.out.println(Season.HERBST);
        System.out.println(Season.WINTER);

    }
}
