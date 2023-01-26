package br.com.willian.converters;

public class NumberConverter {
	
	public static double converterParaDouble(String numero) {
		double numeroConvertido = 0D;
		
		if (numero == null) {
			return 0D;
		}
		
		String numeroCorrigido = numero.replaceAll(",", ".");
		
		if ( enumerico( numeroCorrigido ) ) {
			numeroConvertido = Double.parseDouble(numeroCorrigido);
		}
		return numeroConvertido;
	}

	public static boolean enumerico(String numero) {
		if (numero == null) {
			return false;
		}
		
		String numeroCorrigido = numero.replaceAll(",", ".");
		
		return numeroCorrigido.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
