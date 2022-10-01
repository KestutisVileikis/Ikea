package lt.kestutis.pom.pages.ikea;

public class IkeaBusinessPage {
    public static void clickButtonAcceptCookies() {
Common.clickElement(Locators.IkeaHome.clickWebCookies);
    }
    public static
    void clickButtonPlaceTheOrder() {
        Common.clickElement(Locators.IkeaBusiness.clickButtonPlaceTheOrder);
    }


    public static void enterProductCode(String productCode) {
        Common.sendKeysToElement(Locators.IkeaBusiness.enterProductCode, productCode);
    }
    public static void clickButtonAddItem() {
Common.clickElement(Locators.IkeaBusiness.clickButtonAddItem);
    }
    public static void enterNameOfTheRepresentative(String nameOfTheRepresentative) {
        Common.sendKeysToElement(Locators.IkeaBusiness.enterPersonName, nameOfTheRepresentative);
    }

    public static void enterSurnameOfTheRepresentative(String surnameOfTheRepresentative) {
        Common.sendKeysToElement(Locators.IkeaBusiness.enterPersonSurname, surnameOfTheRepresentative);
    }

    public static void enterCompanyName(String companyName) {
        Common.sendKeysToElement(Locators.IkeaBusiness.inputCompanyName, companyName);
    }
    public static void enterCompanyAddress(String companyAddress) {
        Common.sendKeysToElement(Locators.IkeaBusiness.inputCompanyAddress, companyAddress);
    }
    public static void enterEmail(String email) {
        Common.sendKeysToElement(Locators.IkeaBusiness.inputEmailAddress, email);
    }
    public static void enterCompanyCode(String companyCode) {
        Common.sendKeysToElement(Locators.IkeaBusiness.inputCompanyCode, companyCode);
    }

    public static void enterTelephoneNumber(String telephoneNumber) {
        Common.sendKeysToElement(Locators.IkeaBusiness.inputTelephoneNumber, telephoneNumber);
    }
}

