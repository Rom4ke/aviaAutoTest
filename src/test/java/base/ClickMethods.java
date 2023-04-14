package base;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ClickMethods {

    //Клик по кнопке (кнопка ищется по названию)
    public void serviceClickButton(String button) {
        $x("//*[text()='" + button + "']/..").should(visible, enabled).click();
    }

    @Step(value = "Кликаем на кнопку \"{button}\"")
    public ClickMethods clickButton(String button) {
        serviceClickButton(button);
        return this;
    }
}


