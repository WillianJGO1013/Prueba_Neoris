package saucedemo.elements;

import org.openqa.selenium.By;

public enum flowSaucedemoElements {
	
	//PAGINA INICIAL
	logPageIni(By.xpath("//div[@class='login_logo']")),
	txtUserName (By.xpath("//div[1]/input[@class='input_error form_input']")),
	txtPassword (By.xpath("//div[2]/input[@class='input_error form_input']")),
	btnLogin (By.xpath("//input[@class='submit-button btn_action']")),
	
	//PRODUCTOS
	ttlSecciones(By.xpath("//span[@class='title']")),
	btnProduct1(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")),
	btnProduct2(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")),
	btncar(By.xpath("//a[@class='shopping_cart_link']")),
	
	//CARRITO
	ttlProduct1(By.xpath("//div[3]/div[2]/a/div[@class='inventory_item_name']")),
	ttlProduct2(By.xpath("//div[4]/div[2]/a/div[@class='inventory_item_name']")),
	btnCheckOut(By.xpath("//button[@id='checkout']")),
	
	//CHECKOUT
	txtFirstName (By.xpath("//input[@id='first-name']")),
	txtLastName (By.xpath("//input[@id='last-name']")),
	txtPostalCode (By.xpath("//input[@id='postal-code']")),
	btnContinue (By.xpath("//input[@id='continue']")),
	
	//CHECKOUT: OVERVIEW
	btnFinish (By.xpath("//button[@id='finish']")),
	
	//FINAL
	msgFinal (By.xpath("//h2[@class='complete-header']"))
	
	;
	
	
	private By valor_campo;

	flowSaucedemoElements(By valorCampo) {
		this.setValor_campo(valorCampo);
	}

	public void setValor_campo(By valorCampo) {
		this.valor_campo = valorCampo;
	}
	
	public By getValor_campo() {
		return valor_campo;
	}

}
