package lt.kestutis.pom.pages.test.ikea;

import lt.kestutis.pom.pages.ikea.FurniturePlanningPage;
import lt.kestutis.pom.pages.ikea.IkeaBusinessPage;
import lt.kestutis.pom.pages.ikea.IkeaHomePages;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FurniturePlanningTest extends TestBase{

    @BeforeTest

    public void setUp() {

        IkeaHomePages.open();
        IkeaBusinessPage.clickButtonAcceptCookies();
        IkeaHomePages.clickPlanningPage();
    }

    @Test
    public void testIkeaFurniturePlanningRegistration (){

        String kitchenWallOne = "300";
        String kitchenWallTwo = "200";
        String ceilingHeight = "280";
        String doorStyle = "Bodbyn";
        String doorColor = "Grey";
        String kitchenWorktop = "KARLBY";
        String deliveryCity = "Siauliai";
        String kitchenSink = "VATTUDALEN";
        String kitchenMixer = "JUTTERN";
        String notesText = "Only automating testing";
        String name = "Kestutis";
        String surname = "Vileikis";
        String email = "yes@exportgateway.eu";
        String phone = "+37069851148";

        FurniturePlanningPage.clickPlanKitchenFourSteps();
        FurniturePlanningPage.clickKitchenPlanningForm();
        FurniturePlanningPage.clickButtonKitchenLayout();
        FurniturePlanningPage.enterKitchenWallNumberOne(kitchenWallOne);
        FurniturePlanningPage.enterKitchenWallNumberTwo(kitchenWallTwo);
        FurniturePlanningPage.clickButtonCabinetHeight();
        FurniturePlanningPage.enterCeilingWallHeight(ceilingHeight);
        FurniturePlanningPage.clickButtonWallCabinetOpening();
        FurniturePlanningPage.enterFrontDoorStyle(doorStyle);
        FurniturePlanningPage.enterFrontDoorColor(doorColor);
        FurniturePlanningPage.clickButtonWorktop();
        FurniturePlanningPage.enterKitchenWorktopName(kitchenWorktop);
        FurniturePlanningPage.clickButtonWallPanel();
        FurniturePlanningPage.clickButtonWorktopLighting();
        FurniturePlanningPage.clickButtonHomeDelivery();
        FurniturePlanningPage.enterDeliveryCity(deliveryCity);
        FurniturePlanningPage.clickButtonFridgeOption();
        FurniturePlanningPage.clickButtonHobOption();
        FurniturePlanningPage.clickButtonOvenOption();
        FurniturePlanningPage.clickButtonMicrowaveOption();
        FurniturePlanningPage.clickButtonDishwasherOption();
        FurniturePlanningPage.clickButtonWashingMachineOption();
        FurniturePlanningPage.clickButtonExtractorOption();
        FurniturePlanningPage.clickButtonSinkOption();
        FurniturePlanningPage.enterKitchenSinkName(kitchenSink);
        FurniturePlanningPage.clickButtonMixerOption();
        FurniturePlanningPage.enterKitchenMixerName(kitchenMixer);
        FurniturePlanningPage.enterNotes(notesText);
        FurniturePlanningPage.clickButtonMoneyToSpend();
        FurniturePlanningPage.enterNameOfThePerson(name);
        FurniturePlanningPage.enterSurnameOfThePerson(surname);
        FurniturePlanningPage.enterEmailOfThePerson(email);
        FurniturePlanningPage.enterPhoneNumberOfThePerson(phone);
        FurniturePlanningPage.clickButtonPrivacyPolicy();
        //FurniturePlanningPage.clickButtonNotRobot();
        FurniturePlanningPage.clickButtonSubmitForm();

    }
}
