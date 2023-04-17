package tests;

import base.ClickMethods;
import hashmaps.ActualHashMaps;
import hashmaps.ExpectedHashMaps;
import io.qameta.allure.Epic;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.AviaMainPage;

public class OpenMainPage {

    ActualHashMaps actualHashMaps = new ActualHashMaps();
    ExpectedHashMaps expectedHashMaps = new ExpectedHashMaps();

    ClickMethods clickMethods = new ClickMethods();
    private static String SITE_URL = "https://www.aviasales.ru/";

    @Epic(value = "Open main page site")
    @Test
    public void openCorrectMainPage(){
        new AviaMainPage().siteUrl(SITE_URL);
        clickMethods.clickButton("Хорошо");

        // Делаем ассерт для подтверждения корректности теста
        Assertions.assertThat(actualHashMaps.actualValueHeader()).isEqualTo(expectedHashMaps.expectedValueHeader());
    }
}
