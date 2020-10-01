package br.org.spcbrasil.prova.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GrafoNotFoundException extends SPCException {
	public GrafoNotFoundException(String message) {
		super(message);
	}
}
