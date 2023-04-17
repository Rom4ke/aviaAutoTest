package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static helpers.Screenshot.attachScreenshot;

public class AviaMainPage {

    private static final SelenideElement
            pageTitle = $x("//h1[@class][text()[normalize-space()='Поиск дешёвых авиабилетов']]");

    @Step("Проверка заголовка страницы")
    public boolean pageTitle(){
        return pageTitle.should(visible).exists();
    }

    @Step("Открыть сайт")
    public AviaMainPage siteUrl(String SITE_URL){
        open(SITE_URL);
        attachScreenshot();
        return this;
    }
}
