package tests;

import base.ClickMethods;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.Test;
import pages.AviaMainPage;

public class OpenMainPage {

    ClickMethods clickMethods = new ClickMethods();
    private static String SITE_URL = "https://www.aviasales.ru/";

    @Epic(value = "Open main page site")
    @Test
    public void openCorrectMainPage(){
        new AviaMainPage().siteUrl(SITE_URL);
        clickMethods.clickButton("Хорошо");
    }
}
