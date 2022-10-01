package lt.kestutis.pom.pages.ikea;

public class IkeaHomePages {

    public static void open(
    ) {
        Common.openUrl("https://www.ikea.lt/en");
    }

    public static void clickElementPage() {
        Common.clickElementByAction(
                Locators.IkeaHome.menuBusiness
        );
    }
}