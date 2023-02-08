package saucedemo.pageobjects;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import saucedemo.elements.flowSaucedemoElements;

public class flowSaucedemoPageObjects extends PageObject {
	
	static By logoPageIni = flowSaucedemoElements.logPageIni.getValor_campo();
	static By textUserName = flowSaucedemoElements.txtUserName.getValor_campo();
	static By textPassword = flowSaucedemoElements.txtPassword.getValor_campo();
	static By buttonLogin = flowSaucedemoElements.btnLogin.getValor_campo();
	static By titleSecciones = flowSaucedemoElements.ttlSecciones.getValor_campo();
	static By buttonProduct1 = flowSaucedemoElements.btnProduct1.getValor_campo();
	static By buttonProduct2 = flowSaucedemoElements.btnProduct2.getValor_campo();
	static By buttoncar = flowSaucedemoElements.btncar.getValor_campo();
	static By titleProduct1 = flowSaucedemoElements.ttlProduct1.getValor_campo();
	static By titleProduct2 = flowSaucedemoElements.ttlProduct2.getValor_campo();
	static By buttonCheckOut = flowSaucedemoElements.btnCheckOut.getValor_campo();
	static By textFirstName = flowSaucedemoElements.txtFirstName.getValor_campo();
	static By textLastName = flowSaucedemoElements.txtLastName.getValor_campo();
	static By textPostalCode = flowSaucedemoElements.txtPostalCode.getValor_campo();
	static By buttonContinue = flowSaucedemoElements.btnContinue.getValor_campo();
	static By buttonFinish = flowSaucedemoElements.btnFinish.getValor_campo();
	static By messageFinal = flowSaucedemoElements.msgFinal.getValor_campo();
	
	
	Properties loadProperty = new Properties();

	public void paginaInicial() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(logoPageIni));
		Boolean logoPageIniSua = find(logoPageIni).isEnabled();
		/*loadProperty.load(new FileReader("./params.properties"));
		String ttl_PageIniSau = find(titlePageIni).getText();
		String ttl_PageIniPP = loadProperty.getProperty("Title_PageIni");*/
		assertEquals(logoPageIniSua,true);
		System.out.print("Se abrió correctamente SwagLabs");
	}

	public void Login() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		loadProperty.load(new FileReader("./params.properties"));
		String UserNamePP = loadProperty.getProperty("UserName");
		String PasswordPP = loadProperty.getProperty("Password");
		find(textUserName).type(UserNamePP);
		find(textPassword).type(PasswordPP);
		find(buttonLogin).click();
	}

	public void agregaCarrito() {
		// TODO Auto-generated method stub
		String ttl_ProductsSau = find(titleSecciones).getText();
		String ttl_ProductsPP = loadProperty.getProperty("Title_Products");
		assertEquals(ttl_ProductsSau,ttl_ProductsPP);
		System.out.print("El login se realizó correctamente");
		find(buttonProduct1).click();
		find(buttonProduct2).click();
		find(buttoncar).click();
	}

	public void validaCarrito() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		loadProperty.load(new FileReader("./params.properties"));
		String ttl_CarSau = find(titleSecciones).getText();
		String ttl_CarPP = loadProperty.getProperty("Title_Car");
		assertEquals(ttl_CarSau,ttl_CarPP);
		System.out.print("El direccionamiento al carrito se realizó correctamente --- ");
		String ttl_Product1Sau = find(titleProduct1).getText();
		String ttl_Product1PP = loadProperty.getProperty("Title_Product1");
		String ttl_Product2Sau = find(titleProduct2).getText();
		String ttl_Product2PP = loadProperty.getProperty("Title_Product2");
		assertEquals(ttl_Product1Sau,ttl_Product1PP);
		assertEquals(ttl_Product2Sau,ttl_Product2PP);
		System.out.print("Los productos se agregaron correctamente al carrito");
		find(buttonCheckOut).click();
	}

	public void completaFormulario() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		loadProperty.load(new FileReader("./params.properties"));
		String ttl_CheckOutSau = find(titleSecciones).getText();
		String ttl_CheckOutPP = loadProperty.getProperty("Title_CheckOut");
		assertEquals(ttl_CheckOutSau,ttl_CheckOutPP);
		System.out.print("El direccionamiento al checkout se realizó correctamente");	
		String textFirstNamePP = loadProperty.getProperty("FirstName");
		String textLastNamePP = loadProperty.getProperty("LastName");
		String textPostalCodePP = loadProperty.getProperty("PostalCode");
		find(textFirstName).type(textFirstNamePP);
		find(textLastName).type(textLastNamePP);
		find(textPostalCode).type(textPostalCodePP);
		find(buttonContinue).click();
	}

	public void finalizaProceso() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		loadProperty.load(new FileReader("./params.properties"));
		String ttl_CheckOutOVSau = find(titleSecciones).getText();
		String ttl_CheckOutOVPP = loadProperty.getProperty("Title_CheckOutOV");
		assertEquals(ttl_CheckOutOVSau,ttl_CheckOutOVPP);
		System.out.print("El direccionamiento al checkout: overview se realizó correctamente");
		find(buttonFinish).click();
	}

	public void validaFinalizacion() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		loadProperty.load(new FileReader("./params.properties"));
		String msg_FinalPPSau = find(messageFinal).getText();
		String msg_FinalPP = loadProperty.getProperty("MSG_Final");
		assertEquals(msg_FinalPPSau,msg_FinalPP);
		System.out.print("La compra finalizó correctamente");
	}

}
