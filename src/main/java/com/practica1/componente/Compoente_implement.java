package com.practica1.componente;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Compoente_implement implements Componente_dependencia {

	@Override
	public void salida_mensaje(String mensaje) {
		System.out.println("Su nombre es: " + mensaje);

	}

	@Override
	public String leerMensaje() {

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String nombre = leer.nextLine();
		return nombre;
	}

}
