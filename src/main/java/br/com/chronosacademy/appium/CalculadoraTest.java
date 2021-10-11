package br.com.chronosacademy.appium;
import static org.junit.jupiter.api.Assertions.*;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CalculadoraTest {


    @Test
    public void validarMultiplicacao() throws MalformedURLException {
        DriveFactory driveFactory = new DriveFactory();
        driveFactory.setCapabilities("Android","ChronosMobile","uiautomator2"
                ,"com.android.calculator2","com.android.calculator2.Calculator");
        driveFactory.setDriver();

        driveFactory.getDriver().findElement(MobileBy.id("digit_9")).click();
        driveFactory.getDriver().findElement(MobileBy.id("op_mul")).click();
        driveFactory.getDriver().findElement(MobileBy.id("digit_7")).click();
        driveFactory.getDriver().findElement(MobileBy.id("eq")).click();
        String resultado =driveFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("63",resultado);
        }

    @Test
    public void validarSubtracao() throws MalformedURLException {
        DriveFactory driveFactory = new DriveFactory();
        driveFactory.setCapabilities("Android","ChronosMobile","uiautomator2"
                ,"com.android.calculator2","com.android.calculator2.Calculator");
        driveFactory.setDriver();

        driveFactory.getDriver().findElement(MobileBy.id("digit_5")).click();
        driveFactory.getDriver().findElement(MobileBy.id("op_sub")).click();
        driveFactory.getDriver().findElement(MobileBy.id("digit_3")).click();
        driveFactory.getDriver().findElement(MobileBy.id("eq")).click();
        String resultado =driveFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("2",resultado);
    }
    @Test
    public void validarAdicao() throws MalformedURLException {
        DriveFactory driveFactory = new DriveFactory();
        driveFactory.setCapabilities("Android","ChronosMobile","uiautomator2"
                ,"com.android.calculator2","com.android.calculator2.Calculator");
        driveFactory.setDriver();

        driveFactory.getDriver().findElement(MobileBy.id("digit_1")).click();
        driveFactory.getDriver().findElement(MobileBy.id("op_add")).click();
        driveFactory.getDriver().findElement(MobileBy.id("digit_4")).click();
        driveFactory.getDriver().findElement(MobileBy.id("eq")).click();
        String resultado =driveFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("5",resultado);
    }
    @Test
    public void validarDivisao() throws MalformedURLException {
        DriveFactory driveFactory = new DriveFactory();
        driveFactory.setCapabilities("Android","ChronosMobile","uiautomator2"
                ,"com.android.calculator2","com.android.calculator2.Calculator");
        driveFactory.setDriver();

        driveFactory.getDriver().findElement(MobileBy.id("digit_1")).click();
        driveFactory.getDriver().findElement(MobileBy.id("digit_0")).click();
        driveFactory.getDriver().findElement(MobileBy.id("digit_0")).click();
        driveFactory.getDriver().findElement(MobileBy.id("op_div")).click();
        driveFactory.getDriver().findElement(MobileBy.id("digit_2")).click();
        driveFactory.getDriver().findElement(MobileBy.id("eq")).click();
        String resultado =driveFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("50",resultado);
    }
}
