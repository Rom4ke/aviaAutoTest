package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static helpers.Screenshot.attachScreenshot;

public class AviaMainPage {

//    private static final SelenideElement clickButton =

    @Step("Открыть сайт")
    public AviaMainPage siteUrl(String SITE_URL){
        open(SITE_URL);
        attachScreenshot();
        return this;
    }
}
