package com.practica1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practica1.componente.Componente_dependencia;

@SpringBootApplication
public class Practica1Application implements CommandLineRunner {

	Componente_dependencia componente_dependencia;

	public Practica1Application(Componente_dependencia comp) {
		this.componente_dependencia = comp;
	}

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String nombre = this.componente_dependencia.leerMensaje();
		this.componente_dependencia.salida_mensaje(nombre);
	}

}
