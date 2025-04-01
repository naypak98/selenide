package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class WikiPageTest {

//    @BeforeAll
//    static void beforeAll() {
//        Configuration.holdBrowserOpen = true;
//
//    }

    @Test
    void checkWikiPage() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
//        $(byText("Chapters")).closest(".markdown-heading").sibling(0).$(byText("Soft assertions")).click();
        $(byText("Soft assertions")).click();
        $(withText("Using JUnit5 extend test class:")).closest("div").sibling(0).$("pre").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})"));

    }
}
