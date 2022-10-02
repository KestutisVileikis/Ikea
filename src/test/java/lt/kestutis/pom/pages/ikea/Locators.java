package lt.kestutis.pom.pages.ikea;

import org.openqa.selenium.By;

public class Locators {

    public static class IkeaHome {
        public static By menuBusiness = By.xpath("//*[@id=\"hideOnScroll\"]/ul[1]/li[4]/a");
        public static By clickWebCookies = By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]");

        public static By menuPlanning = By.xpath("//*[@id=\"headerMainToggler\"]/div/div[2]/ul/li[5]/a");
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

    public static class FurniturePlanning {

        public static By clickButtonPlanKitchen = By.xpath("//*[@id=\"plan-a-kitchen-in-4-steps-lt-en\"]/b");

        public static By clickButtonKitchenPlanningForm = By.xpath("//*[@id=\"kitchen-planning-form-lt-en\"]/b");
        public static By clickButtonKitchenShape = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[1]/div[3]/div[1]/span/span/div/ins");
        public static By inputWallNumberOneSize = By.xpath("//*[@id=\"kitchen_layout_03-01\"]");
        public static By inputWallNumberTwoSize = By.xpath("//*[@id=\"kitchen_layout_03-02\"]");
        public static By clickButtonCabinetWallHeight = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[2]/div[2]/div/span/span/div/ins");
        public static By inputCeilingHeight = By.xpath("//*[@id=\"ceiling_height\"]");
        public static By clickButtonWallCabinetOpening = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[4]/div[1]/div[2]/div/span/span/div/ins");

        public static By inputFrontDoorStyle = By.xpath("//*[@id=\"fronts_choosen_name\"]");

        public static By inputFrontDoorColor = By.xpath("//*[@id=\"fronts_choosen_colour\"]");

        public static By clickButtonKitchenWorktop = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[6]/div[1]/div/span/span/div/ins");
        public static By inputKitchenWorktopName = By.xpath("//*[@id=\"worktop_type_name\"]");
        public static By clickButtonWallPanelOption = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[7]/div/div/div[2]/span/span/div/ins");

        public static By clickButtonWorktopLigths = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[8]/div[1]/div/span/span/div/ins");
        public static By clickButtonDeliveryServices = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[9]/div[2]/div[1]/span/span/div/ins");
        public static By inputDeliveryCity = By.xpath("//*[@id=\"kitchen_extra_services_02-01\"]");
        public static By clickButtonFridge = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[10]/div[1]/div[7]/span/span/div/ins");

        public static By clickButtonHob = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[10]/div[2]/div[4]/span/span/div/ins");
        public static By clickButtonOven = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[10]/div[3]/div[4]/span/span/div/ins");
        public static By clickButtonMicrowave = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[10]/div[4]/div[5]/span/span/div/ins");
        public static By clickButtonDishwasher = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[10]/div[5]/div[4]/span/span/div/ins");
        public static By clickButtonWashingmachine = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[10]/div[6]/div[3]/span/span/div/ins");
        public static By clickButtonExtractor = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[10]/div[7]/div[3]/span/span/div/ins");
        public static By clickButtonKitchenSink = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[10]/div[8]/div[1]/span/span/div/ins");

        public static By inputKitchenSinkName = By.xpath("//*[@id=\"appliance_sink_tap_01-01\"]");
        public static By clickButtonKitchenMixer = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[10]/div[8]/div[2]/span/span/div/ins");
        public static By inputKitchenMixerName = By.xpath("//*[@id=\"appliance_sink_tap_02-01\"]");
        public static By inputNotesText = By.xpath("//*[@id=\"kitchen_mailer_notes\"]");
        public static By clickButtonAmountOfMoney = By.xpath("//*[@id=\"kitchen_mailer\"]/fieldset[12]/div/div[8]/span/span/div/ins");
        public static By inputPersonName = By.xpath("//*[@id=\"personal_info_name\"]");
        public static By inputPersonSurname = By.xpath("//*[@id=\"personal_info_surname\"]");
        public static By inputPersonEmail = By.xpath("//*[@id=\"personal_info_email\"]");
        public static By inputPersonPhone = By.xpath("//*[@id=\"personal_info_phone\"]");
        public static By clickButtonPrivacyTerms = By.xpath("//*[@id=\"kitchen_mailer\"]/div/span/div/ins");
        public static By clickButtonNotRobotConfimration = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]");
        public static By clickButtonRegistrationForm = By.xpath("//*[@id=\"sendForm\"]");
    }

}
