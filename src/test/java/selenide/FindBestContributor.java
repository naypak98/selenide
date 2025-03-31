package selenide;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FindBestContributor {

    @BeforeAll
    static void beforeAll() {
//        Configuration.holdBrowserOpen = true;

    }


    @Test
    void findContributorTest() {
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(byText("Contributors")).closest(".BorderGrid-cell").$$("ul li").first().hover();
//        $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev")); - если есть невидимые элементы с таким же классом
        $(".Popover").shouldHave(text("Andrei Solntsev"));
    }
}
