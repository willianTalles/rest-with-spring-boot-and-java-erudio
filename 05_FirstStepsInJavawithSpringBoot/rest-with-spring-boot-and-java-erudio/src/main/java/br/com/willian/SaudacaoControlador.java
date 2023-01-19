package br.com.willian;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoControlador {
	private static final String template = "Olá, %s!";
	private final AtomicLong contadorId = new AtomicLong();
	
	@RequestMapping("/sau")
	public Saudaca saudacao( @RequestParam( value = "name", defaultValue = "Mundo" ) String name ) {
		return new Saudaca( contadorId.incrementAndGet(), String.format( template, name ) );
	}
}
