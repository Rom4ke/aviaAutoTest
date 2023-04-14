package base;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.editable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class InputMethods {
    private void serviceInputField(String field, String value) {
        $x("//*[text()[normalize-space() = '"+field+"']]/..//input").should(visible, editable).clear();
        $x("//*[text()[normalize-space() = '"+field+"']]/..//input").setValue(value);
    }

    @Step(value = "Заполняем поле \"{field}\" значением \"{value}\"")
    public InputMethods inputStringField(String field, String value) {
        serviceInputField(field, value);
        return this;
    }
}
