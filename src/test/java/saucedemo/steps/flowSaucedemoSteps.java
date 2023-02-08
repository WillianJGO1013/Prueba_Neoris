package saucedemo.steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import net.thucydides.core.annotations.Step;
import saucedemo.pageobjects.flowSaucedemoPageObjects;

public class flowSaucedemoSteps {
	
	flowSaucedemoPageObjects flowSaucedemoPageObjects;

	@Step
	public void abrirUrlSaucedemo() {
		// TODO Auto-generated method stub
		flowSaucedemoPageObjects.open();
	}

	@Step
	public void abrirPaginaInicial() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		flowSaucedemoPageObjects.paginaInicial();
	}

	@Step
	public void realizarLogin() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		flowSaucedemoPageObjects.Login();
	}

	@Step
	public void agregarACarrito() {
		// TODO Auto-generated method stub
		flowSaucedemoPageObjects.agregaCarrito();
	}

	@Step
	public void validarCarrito() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		flowSaucedemoPageObjects.validaCarrito();
	}

	@Step
	public void completarFormulario() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		flowSaucedemoPageObjects.completaFormulario();
	}

	@Step
	public void finalizarProceso() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		flowSaucedemoPageObjects.finalizaProceso();
	}

	@Step
	public void validarFinalizacion() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		flowSaucedemoPageObjects.validaFinalizacion();
	}

}
