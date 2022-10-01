package lt.kestutis.pom.pages.test.ikea;

import lt.kestutis.pom.pages.ikea.IkeaBusinessPage;
import lt.kestutis.pom.pages.ikea.IkeaHomePages;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IkeaBusinessTest extends TestBase {
    @BeforeTest

    public void setUp() {

        IkeaHomePages.open();
        IkeaBusinessPage.clickButtonAcceptCookies();
        IkeaHomePages.clickElementPage();
    }

    @Test
    public void testIkeaBusinessRegistration() {

        String productCode = "59281847";
        String nameOfTheRepresentative = "Kestutis";
        String surnameOfTheRepresentative = "Vileikis";
        String companyName = "Rojaus virtuve";
        String companyAddress = "Dvaro st. 135, Siauliai";
        String email = "yes@exportgateway.eu";
        String companyCode = "303401364";
        String telephoneNumber = "+37069851148";

        String expectedMessage = "We will contact you soon ";
        String actualMessage = "";


        IkeaBusinessPage.clickButtonPlaceTheOrder();
        IkeaBusinessPage.enterProductCode(productCode);
        IkeaBusinessPage.clickButtonAddItem();

        IkeaBusinessPage.enterNameOfTheRepresentative(nameOfTheRepresentative);
        IkeaBusinessPage.enterSurnameOfTheRepresentative(surnameOfTheRepresentative);
        IkeaBusinessPage.enterCompanyName(companyName);
        IkeaBusinessPage.enterCompanyAddress(companyAddress);
        IkeaBusinessPage.enterEmail(email);
        IkeaBusinessPage.enterCompanyCode(companyCode);
        IkeaBusinessPage.enterTelephoneNumber(telephoneNumber);

        IkeaBusinessPage.clickTermsAndConditions();
        IkeaBusinessPage.clickMarketingNewsletter();

        IkeaBusinessPage.clickButtonAssembly();
        IkeaBusinessPage.clickButtonDelivery();

        IkeaBusinessPage.clickButtonSubmit();
        IkeaBusinessPage.readRegistrationText();

        Assert.assertEquals(actualMessage, expectedMessage);

        }
    }

