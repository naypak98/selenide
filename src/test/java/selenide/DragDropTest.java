package selenide;

//import com.codeborne.selenide.Configuration;
//import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;

import static com.codeborne.selenide.Selenide.*;

public class DragDropTest {

//    @BeforeAll
//    static void beforeAll () {
//        Configuration.holdBrowserOpen = true;
//
//    }

    @Test
    void dragDroptest () {

        open("https://the-internet.herokuapp.com/drag_and_drop");
//        actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-a")).release().perform();
//        $("#column-a").dragAndDrop(to($("#column-b")));
        actions().dragAndDrop($("#column-a"), $("#column-b") ).perform();
        $("#column-b header").shouldHave(text("A"));



    }
}
