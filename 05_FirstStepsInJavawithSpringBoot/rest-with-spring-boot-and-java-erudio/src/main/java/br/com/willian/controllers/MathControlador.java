package br.com.willian.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.willian.converters.NumberConverter;
import br.com.willian.exceptions.UnsupportedMathOperationException;
import br.com.willian.math.SimpleMath;

@RestController
public class MathControlador {
	private static final String template = "Olá, %s!";
	private final AtomicLong contadorId = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping( value = "/soma/{numeroUm}/{numeroDois}", method = RequestMethod.GET)
	public double soma( @PathVariable( value = "numeroUm" ) String numeroUm, @PathVariable( value = "numeroDois" ) String numeroDois ) throws Exception {
		
		if ( !NumberConverter.enumerico(numeroUm) || !NumberConverter.enumerico(numeroDois) ) {
			throw new UnsupportedMathOperationException("Por gentileza, inseria um valor numérico");
		}
		
		double numeroUmConvertido = NumberConverter.converterParaDouble(numeroUm);
		double numeroDoisConvertido = NumberConverter.converterParaDouble(numeroDois);
		double resultadoDaSoma = math.soma(numeroUmConvertido, numeroDoisConvertido);
		
		return resultadoDaSoma;
	} 
	
	@RequestMapping( value = "/subtracao/{numeroUm}/{numeroDois}", method = RequestMethod.GET)
	public double subtracao( @PathVariable( value = "numeroUm" ) String numeroUm, @PathVariable( value = "numeroDois" ) String numeroDois ) throws Exception {
		
		if ( !NumberConverter.enumerico(numeroUm) || !NumberConverter.enumerico(numeroDois) ) {
			throw new UnsupportedMathOperationException("Por gentileza, inseria um valor numérico");
		}
		
		double numeroUmConvertido = NumberConverter.converterParaDouble(numeroUm);
		double numeroDoisConvertido = NumberConverter.converterParaDouble(numeroDois);
		double resultadoDaSubtracao = math.subtracao(numeroUmConvertido, numeroDoisConvertido);
		
		return resultadoDaSubtracao;
	}
	
	@RequestMapping( value = "/multiplicacao/{numeroUm}/{numeroDois}", method = RequestMethod.GET)
	public double multiplicacao( @PathVariable( value = "numeroUm" ) String numeroUm, @PathVariable( value = "numeroDois" ) String numeroDois ) throws Exception {
		
		if ( !NumberConverter.enumerico(numeroUm) || !NumberConverter.enumerico(numeroDois) ) {
			throw new UnsupportedMathOperationException("Por gentileza, inseria um valor numérico");
		}
		
		double numeroUmConvertido = NumberConverter.converterParaDouble(numeroUm);
		double numeroDoisConvertido = NumberConverter.converterParaDouble(numeroDois);
		double resultadoDaMultiplicacao = math.multiplicacao(numeroUmConvertido, numeroDoisConvertido);
		
		return resultadoDaMultiplicacao;
	}
	
	@RequestMapping( value = "/divisao/{numeroUm}/{numeroDois}", method = RequestMethod.GET)
	public double divisao( @PathVariable( value = "numeroUm" ) String numeroUm, @PathVariable( value = "numeroDois" ) String numeroDois ) throws Exception {
		
		if ( !NumberConverter.enumerico(numeroUm) || !NumberConverter.enumerico(numeroDois) ) {
			throw new UnsupportedMathOperationException("Por gentileza, inseria um valor numérico");
		}
		
		double numeroUmConvertido = NumberConverter.converterParaDouble(numeroUm);
		double numeroDoisConvertido = NumberConverter.converterParaDouble(numeroDois);
		double resultadoDaDivisao = math.divisao(numeroUmConvertido, numeroDoisConvertido);
		
		return resultadoDaDivisao;
	}
	
	@RequestMapping( value = "/media/{numeroUm}/{numeroDois}", method = RequestMethod.GET)
	public double media( @PathVariable( value = "numeroUm" ) String numeroUm, @PathVariable( value = "numeroDois" ) String numeroDois ) throws Exception {
		
		if ( !NumberConverter.enumerico(numeroUm) || !NumberConverter.enumerico(numeroDois) ) {
			throw new UnsupportedMathOperationException("Por gentileza, inseria um valor numérico");
		}
		
		double numeroUmConvertido = NumberConverter.converterParaDouble(numeroUm);
		double numeroDoisConvertido = NumberConverter.converterParaDouble(numeroDois);
		double resultadoDaMedia = math.media(numeroUmConvertido, numeroDoisConvertido);
		
		return resultadoDaMedia;
	}
	
	@RequestMapping( value = "/raiz/{numero}", method = RequestMethod.GET)
	public double raiz( @PathVariable( value = "numero" ) String numeroUm ) throws Exception {
		
		if ( !NumberConverter.enumerico(numeroUm) ) {
			throw new UnsupportedMathOperationException("Por gentileza, inseria um valor numérico");
		}
		
		double numeroUmConvertido = NumberConverter.converterParaDouble(numeroUm);
		double resultadoDaRaiz = math.raiz(numeroUmConvertido);
		
		return resultadoDaRaiz;
	}
}
