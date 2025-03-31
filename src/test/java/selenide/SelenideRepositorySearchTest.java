package selenide;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class SelenideRepositorySearchTest{

    @BeforeAll
    static void beforeAll() {
//        Configuration.holdBrowserOpen = true;

    }

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("https://github.com/");
        $(".search-input").click();
        $(".FormControl-input").setValue("selenide").pressEnter();
        $$("[data-testid='results-list'] > div").first().$("a").click();
//        $("#repository-container-header").shouldHave(text("selenide\n/\nselenide"));
        $("#repository-container-header").shouldHave(text("selenide / selenide")); //перевод строки
        // ARRANGE - подготовка
        // ACT - действие
        // ACT
        // (ASSERT) - проверка
        // ACT
        // ASSERT



    }
}