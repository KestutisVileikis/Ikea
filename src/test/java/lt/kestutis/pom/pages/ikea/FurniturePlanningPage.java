package lt.kestutis.pom.pages.ikea;

import java.util.concurrent.Callable;

public class FurniturePlanningPage {
    public static void clickPlanKitchenFourSteps() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonPlanKitchen);

    }

    public static void clickKitchenPlanningForm() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonKitchenPlanningForm);
    }

    public static void clickButtonKitchenLayout() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonKitchenShape);
    }

    public static void enterKitchenWallNumberOne(String kitchenWallOne) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputWallNumberOneSize, kitchenWallOne);
    }

    public static void enterKitchenWallNumberTwo(String kitchenWallTwo) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputWallNumberTwoSize, kitchenWallTwo);

    }

    public static void clickButtonCabinetHeight() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonCabinetWallHeight);
    }

    public static void enterCeilingWallHeight(String ceilingHeight) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputCeilingHeight, ceilingHeight);

    }

    public static void clickButtonWallCabinetOpening() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonWallCabinetOpening);
    }

    public static void enterFrontDoorStyle(String doorStyle) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputFrontDoorStyle, doorStyle);
    }

    public static void enterFrontDoorColor(String doorColor) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputFrontDoorColor, doorColor);
    }

    public static void clickButtonWorktop() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonKitchenWorktop);
    }

    public static void enterKitchenWorktopName(String kitchenWorktop) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputKitchenWorktopName, kitchenWorktop);
    }

    public static void clickButtonWallPanel() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonWallPanelOption);
    }

    public static void clickButtonWorktopLighting() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonWorktopLigths);
    }

    public static void clickButtonHomeDelivery() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonDeliveryServices);
    }

    public static void enterDeliveryCity(String deliveryCity) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputDeliveryCity, deliveryCity);
    }

    public static void clickButtonFridgeOption() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonFridge);
    }

    public static void clickButtonHobOption() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonHob);
    }

    public static void clickButtonOvenOption() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonOven);
    }

    public static void clickButtonMicrowaveOption() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonMicrowave);
    }

    public static void clickButtonDishwasherOption() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonDishwasher);
    }

    public static void clickButtonWashingMachineOption() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonWashingmachine);
    }

    public static void clickButtonExtractorOption() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonExtractor);

    }

    public static void clickButtonSinkOption() {


    }

    public static void enterKitchenSinkName(String kitchenSink) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputKitchenSinkName, kitchenSink);
    }

    public static void clickButtonMixerOption() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonKitchenMixer);
    }

    public static void enterKitchenMixerName(String kitchenMixer) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputKitchenMixerName, kitchenMixer);
    }

    public static void enterNotes(String notesText) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputNotesText, notesText);
    }

    public static void clickButtonMoneyToSpend() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonAmountOfMoney);
    }

    public static void enterNameOfThePerson(String name) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputPersonName, name);
    }

    public static void enterSurnameOfThePerson(String surname) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputPersonSurname, surname);
    }

    public static void enterEmailOfThePerson(String email) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputPersonEmail, email);
    }

    public static void enterPhoneNumberOfThePerson(String phone) {
        Common.sendKeysToElement(Locators.FurniturePlanning.inputPersonPhone, phone);
    }

    public static void clickButtonPrivacyPolicy() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonPrivacyTerms);

    }

    public static void clickButtonNotRobot() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonNotRobotConfimration);

    }

    public static void clickButtonSubmitForm() {
        Common.clickElement(Locators.FurniturePlanning.clickButtonRegistrationForm);
    }
}

