package lt.kestutis.pom.pages.ikea;

public class IkeaBusinessPage {
    public static void clickButtonAcceptCookies() {
Common.clickElement(Locators.IkeaHome.clickWebCookies);
    }
    public static
    void clickButtonPlaceTheOrder() {
        Common.clickElement(Locators.IkeaBusiness.clickButtonPlaceTheOrder);
    }


}

