package saucedemo.definitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import saucedemo.steps.flowSaucedemoSteps;

public class flowSaucedemoDefinition {
	
	@Steps
	flowSaucedemoSteps flowSaucedemoSteps;
	
	@Given("El usuario ingresa a la url de Saucedemo")
	public void el_usuario_ingresa_a_la_url_de_Saucedemo() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new cucumber.api.PendingException();
		flowSaucedemoSteps.abrirUrlSaucedemo();
	}

	@When("Abre la página inicial")
	public void abre_la_pagina_inicial() throws FileNotFoundException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		flowSaucedemoSteps.abrirPaginaInicial();
	}

	@When("Realiza el proceso de logueo")
	public void realiza_el_proceso_de_logueo() throws FileNotFoundException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		flowSaucedemoSteps.realizarLogin();
	}

	@When("Agrega productos al carrito")
	public void agrega_productos_al_carrito() {
	    // Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		flowSaucedemoSteps.agregarACarrito();
	}

	@When("Visualiza los productos en el carrito")
	public void visualiza_los_productos_en_el_carrito() throws FileNotFoundException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		flowSaucedemoSteps.validarCarrito();
	}

	@When("Completa el formulario de compra")
	public void completa_el_formulario_de_compra() throws FileNotFoundException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		flowSaucedemoSteps.completarFormulario();
	}

	@When("Finaliza el proceso de compra")
	public void finaliza_el_proceso_de_compra() throws FileNotFoundException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		flowSaucedemoSteps.finalizarProceso();
	}

	@Then("Valida finalización del proceso")
	public void valida_finalización_del_proceso() throws FileNotFoundException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		flowSaucedemoSteps.validarFinalizacion();
	}

}
