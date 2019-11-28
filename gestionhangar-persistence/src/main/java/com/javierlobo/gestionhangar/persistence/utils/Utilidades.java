/**
 * 
 */
package com.javierlobo.gestionhangar.persistence.utils;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.TimeZone;

/**
 * @author franc
 *
 */
public class Utilidades {
	
	public static Long pasarDeFechaAMilisegundos (LocalDateTime ldt) throws DateTimeException {
		return ldt.toInstant(ZoneOffset.ofTotalSeconds(0)).toEpochMilli();
	}
	
	public static LocalDateTime pasarDeMilisegundosAFecha(Long milisegundos) throws DateTimeException {
		return LocalDateTime.ofInstant(Instant.ofEpochSecond(milisegundos), TimeZone.getDefault().toZoneId());
	}
	
}
