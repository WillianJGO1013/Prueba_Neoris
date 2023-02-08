@Saucedemo
Feature: Validar la aplicación Saucedemo

	@Flow_Saucedemo
	Scenario: Validar el flujo de compra en la aplicación Saucedemo
		Given El usuario ingresa a la url de Saucedemo
		When Abre la página inicial
		And Realiza el proceso de logueo
		And Agrega productos al carrito
		And Visualiza los productos en el carrito
		And Completa el formulario de compra
		And Finaliza el proceso de compra
		Then Valida finalización del proceso