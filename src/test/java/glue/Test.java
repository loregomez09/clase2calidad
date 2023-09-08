package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver;
    private WebElement usuario;
    private WebElement contraseña;
    private WebElement botonInicio;

    private String usu,contra;

    @Given("el usuario se encuentra en la pagina pincipal")
    public void el_usuario_se_encuentra_en_la_pagina_pincipal() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Usuario\\Desktop\\Escritorio\\10mo semestre\\CALIDAD DE SOFTWARE\\clase2calidad\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();

    }
    @When("el ingresa usuario y contraseña")
    public void el_ingresa_usuario_y_contraseña() {
        usu = "standard_user";
        contra = "secret_sauce";
        usuario = driver.findElement(By.xpath("//input[@id='user-name']"));
        contraseña = driver.findElement(By.xpath("//input[@id='password']"));

        botonInicio = driver.findElement(By.xpath("//input[@id='login-button']"));

        usuario.sendKeys(usu);
        contraseña.sendKeys(contra);



    }
    @Then("deberia hacer el proceso de login")
    public void deberia_hacer_el_proceso_de_login() {

        botonInicio.click();

    }

}
