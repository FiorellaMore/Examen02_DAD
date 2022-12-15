package com.more.examen02.validators;

import com.more.examen02.entity.Pagos;
import com.more.examen02.exceptions.ValidateServiceException;

public class PagoValidator {
	public static void save(Pagos pago) {
		if (pago.getMonto() == null ) {
			throw new ValidateServiceException("El precio es requirido");
		}
		if (pago.getMonto() < 0 ) {
			throw new ValidateServiceException("El precio es incorrecto");
		}
	}
}
