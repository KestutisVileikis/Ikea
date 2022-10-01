package lt.kestutis.pom.pages.ikea;

import org.openqa.selenium.By;

public class Locators {

    public static class IkeaHome {
        public static By menuBusiness = By.xpath("//*[@id=\"hideOnScroll\"]/ul[1]/li[4]/a");
        public static By clickWebCookies = By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]");
    }

    public static class IkeaBusiness {

        public static By clickButtonPlaceTheOrder = By.xpath("//*[@id=\"place-an-order-b2c-lt-en\"]");
        public static By enterProductCode = By.xpath("//*[@class='form-control']");
        public static By clickButtonAddItem = By.xpath("//*[@id=\"root\"]/div[4]/div[3]/div[1]/div/button");
        public static By enterPersonName = By.xpath("//*[@id=\"root\"]/div[6]/div[1]/div[1]/input");
        public static By enterPersonSurname = By.xpath("//*[@id=\"root\"]/div[6]/div[1]/div[2]/input");
        public static By inputCompanyName = By.xpath("//*[@id=\"root\"]/div[6]/div[1]/div[3]/input");
        public static By inputCompanyAddress = By.xpath("//*[@id=\"root\"]/div[6]/div[1]/div[4]/input");
        public static By inputEmailAddress = By.xpath("//*[@id=\"root\"]/div[6]/div[1]/div[5]/input");

        public static By inputCompanyCode = By.xpath("//*[@id=\"root\"]/div[6]/div[1]/div[6]/input");
        public static By inputTelephoneNumber = By.xpath("//*[@id=\"root\"]/div[6]/div[1]/div[7]/input");

        public static By clickCheckBoxTermsAndConditions = By.xpath("//*[@id=\"agree_terms\"]");

        public static By clickCheckBoxMarketing = By.xpath("//*[@id=\"agree_newsletter\"]");

        public static By clickButtonAssemblyServices = By.xpath("//*[@id=\"services_required\"]");
        public static By clickDeliveryOption = By.xpath("//*[@id=\"root\"]/div[6]/div[3]/div/select/option[2]");

        public static By clickSubmit = By.xpath("//*[@id=\"root\"]/button");
        public static By readRegistrationText = By.xpath("//*[@id=\"modal-container\"]/div/h2");
    }
}
