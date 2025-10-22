//import org.junit.jupiter.api.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class MyJunit {
//    WebDriver driver;
//    @BeforeAll
//    public void setup(){
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//    }
//    @Test
//    public void visitUrl(){
//        driver.get("https://demoqa.com/");
//        String titleActual = driver.getTitle();
//        String expectedTitle = "DEMOQA";
//        Assertions.assertEquals(expectedTitle,titleActual);
//    }
//    @Test
//    @DisplayName("Verify that admin can create new user")
//    public void createUser() {
//        driver.get("https://demoqa.com/text-box");
//        driver.findElement(By.id("userName")).sendKeys("Test User");
//        driver.findElements(By.className("form-control")).get(1).sendKeys("user@gmail.com");
//        driver.findElements(By.className("form-control")).get(2).sendKeys("Gulshan");
//        driver.findElements(By.className("form-control")).get(3).sendKeys("Dhaka");
//
//        Utils.scroll(driver,500);
//
////        driver.findElements(By.cssSelector("[type=button")).get(1).click();
//        driver.findElements(By.tagName("button")).get(1).click();
//
//        List<WebElement> userInfo = driver.findElements(By.tagName("p"));
//        String usernameActual = userInfo.get(0).getText();
//        String userEmailActual = userInfo.get(1).getText();
//        String userCaddressActual = userInfo.get(2).getText();
//        String userPaddressActual = userInfo.get(3).getText();
//
//        String usernameExpected = "Test User";
//        String userEMailExpected = "user@gmail.com";
//        String userCaddressExpected = "Gulshan";
//        String userPaddressExpected = "Dhaka";
//
//        Assertions.assertEquals(usernameActual.contains(usernameExpected), true);
//        Assertions.assertEquals(userEmailActual.contains(userEMailExpected), true);
//        Assertions.assertEquals(userCaddressActual.contains(userCaddressExpected), true);
//        Assertions.assertEquals(userPaddressActual.contains(userPaddressExpected), true);
//
//
//    }
//
//    @Test
//    public void doubleClick(){
//        driver.get("https://demoqa.com/buttons");
//        Actions actions = new Actions (driver);
//        actions.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
//        actions.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();
//    }
//
//    @Test
//    public void handleAlert() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
//        driver.findElement(By.id("alertButton")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
//    }
//
//    @Test
//    public void selectDate(){
//        driver.get("https://demoqa.com/date-picker");
//        driver.findElement(By.id("datePickerMonthYearInput")).click();
//        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
//        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys("09/25/2025");
//        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.ENTER);
//    }
//
//    @Test
//    public void select(){
//        driver.get("https://demoqa.com/select-menu");
//        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
//        select.selectByVisibleText("White");
//
//    }
//    @Test
//    public void mouseHover(){
//        driver.get("https://www.aiub.edu/");
//        Actions actions = new Actions (driver);
//        actions.moveToElement(driver.findElements(By.cssSelector("[href='/about']")).get(0));
//
//    }
//
//    @Test
//    public void handleNewTab(){
//        driver.get("https://demoqa.com/browser-windows");
//        driver.findElement(By.id("tabButton")).click();
//        ArrayList<String> arrayList=new ArrayList(driver.getWindowHandles());
//        System.out.println(driver.getWindowHandles());
//        driver.switchTo().window(arrayList.get(1)); //switching to new / current tab
//        String text= driver.findElement(By.id("sampleHeading")).getText();
//        System.out.println(text);
//        driver.close();
//        driver.switchTo().window((arrayList.get(0)));
//
//    }
//    @Test
//    public void handleMultipleWindow(){
//        driver.get("https://demoqa.com/browser-windows");
//        driver.findElement(By.id("windowButton")).click();
//        String mainWindowHandle= driver.getWindowHandle();
//        Set<String> allWindowHandles= driver.getWindowHandles();
//        Iterator<String> iterator= allWindowHandles.iterator();
//
//        while(iterator.hasNext()){
//            String childWindow= iterator.next();
//
//            if(!mainWindowHandle.equals(childWindow)){
//                driver.switchTo().window(childWindow);
//                String text= driver.findElement(By.id("sampleHeading")).getText();
//                System.out.println(text);
//                driver.close();
//            }
//        }
//
//    }
//    @Test
//    public void scrapTableData(){
//        driver.get("https://demoqa.com/webtables");
//        WebElement table= driver.findElement(By.className("rt-tbody"));
//        List<WebElement> allRows= table.findElements(By.className("rt-tr"));
//        for(WebElement row:allRows){
//            List<WebElement> cells= row.findElements(By.className("rt-td"));
//            for(WebElement cell:cells){
//                System.out.println(cell.getText());
//            }
//        }
//    }
//
//
//
//    @AfterAll
//    public void quitDriver(){
//        driver.quit();
//
//    }
//}


import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// ❌ REMOVED: @TestInstance(TestInstance.Lifecycle.PER_CLASS)
// (It is no longer necessary when using @BeforeEach and @AfterEach)
public class MyJunit {
    WebDriver driver;

    // 🌟 FIX 1: Changed @BeforeAll to @BeforeEach
    @BeforeEach
    public void setupTest(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void visitUrl(){
        // Test logic remains the same
        driver.get("https://demoqa.com/");
        String titleActual = driver.getTitle();
        String expectedTitle = "DEMOQA";
        Assertions.assertEquals(expectedTitle,titleActual);
    }

    @Test
    @DisplayName("Verify that admin can create new user")
    public void createUser() {
        // Test logic remains the same
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Test User");
        driver.findElements(By.className("form-control")).get(1).sendKeys("user@gmail.com");
        driver.findElements(By.className("form-control")).get(2).sendKeys("Gulshan");
        driver.findElements(By.className("form-control")).get(3).sendKeys("Dhaka");

        // NOTE: Utils.scroll is an external, unprovided utility class/method.
        // Assuming it works correctly.
        // Utils.scroll(driver,500);

        WebElement submitButton = driver.findElements(By.tagName("button")).get(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submitButton);

        List<WebElement> userInfo = driver.findElements(By.tagName("p"));
        String usernameActual = userInfo.get(0).getText();
        String userEmailActual = userInfo.get(1).getText();
        String userCaddressActual = userInfo.get(2).getText();
        String userPaddressActual = userInfo.get(3).getText();

        String usernameExpected = "Test User";
        String userEMailExpected = "user@gmail.com";
        String userCaddressExpected = "Gulshan";
        String userPaddressExpected = "Dhaka";

        Assertions.assertEquals(usernameActual.contains(usernameExpected), true);
        Assertions.assertEquals(userEmailActual.contains(userEMailExpected), true);
        Assertions.assertEquals(userCaddressActual.contains(userCaddressExpected), true);
        Assertions.assertEquals(userPaddressActual.contains(userPaddressExpected), true);


    }

    @Test
    public void doubleClick(){
        // Test logic remains the same
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions (driver);
        actions.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
        actions.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();
    }

    @Test
    public void handleAlert() throws InterruptedException {
        // Test logic remains the same
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

    @Test
    public void selectDate(){
        // Test logic remains the same
        driver.get("https://demoqa.com/date-picker");
        driver.findElement(By.id("datePickerMonthYearInput")).click();
        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys("09/25/2025");
        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.ENTER);
    }

    @Test
    public void select(){
        // Test logic remains the same
        driver.get("https://demoqa.com/select-menu");
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        select.selectByVisibleText("White");

    }
    @Test
    public void mouseHover(){
        // Test logic remains the same
        driver.get("https://www.aiub.edu/");
        Actions actions = new Actions (driver);
        actions.moveToElement(driver.findElements(By.cssSelector("[href='/about']")).get(0));

    }

    @Test
    public void handleNewTab(){
        // Test logic remains the same
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> arrayList=new ArrayList(driver.getWindowHandles());
        System.out.println(driver.getWindowHandles());
        driver.switchTo().window(arrayList.get(1)); //switching to new / current tab
        String text= driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text);
        driver.close();
        driver.switchTo().window((arrayList.get(0)));

    }
    @Test
    public void handleMultipleWindow(){
        // Test logic remains the same
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        String mainWindowHandle= driver.getWindowHandle();
        Set<String> allWindowHandles= driver.getWindowHandles();
        Iterator<String> iterator= allWindowHandles.iterator();

        while(iterator.hasNext()){
            String childWindow= iterator.next();

            if(!mainWindowHandle.equals(childWindow)){
                driver.switchTo().window(childWindow);
                String text= driver.findElement(By.id("sampleHeading")).getText();
                System.out.println(text);
                driver.close();
            }
        }

    }
    @Test
    public void scrapTableData(){
        // Test logic remains the same
        driver.get("https://demoqa.com/webtables");
        WebElement table= driver.findElement(By.className("rt-tbody"));
        List<WebElement> allRows= table.findElements(By.className("rt-tr"));
        for(WebElement row:allRows){
            List<WebElement> cells= row.findElements(By.className("rt-td"));
            for(WebElement cell:cells){
                System.out.println(cell.getText());
            }
        }
    }


    // 🌟 FIX 2: Changed @AfterAll to @AfterEach
    @AfterEach
    public void quitTest(){
        if (driver != null) {
            driver.quit();
        }
    }
}