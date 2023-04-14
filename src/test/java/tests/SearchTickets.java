package tests;

import base.ClickMethods;
import base.InputMethods;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.Test;
import pages.AviaMainPage;

public class SearchTickets {

    ClickMethods clickMethods = new ClickMethods();
    InputMethods inputMethods = new InputMethods();
    private static String SITE_URL = "https://www.aviasales.ru/";

    @Epic(value = "Open main page site")
    @Test
    public void openCorrectMainPage(){
        new AviaMainPage().siteUrl(SITE_URL);
        clickMethods.clickButton("Хорошо");
        inputMethods.inputStringField("Куда", "Москва");
        clickMethods.clickButton("Найти билеты");
    }
}
