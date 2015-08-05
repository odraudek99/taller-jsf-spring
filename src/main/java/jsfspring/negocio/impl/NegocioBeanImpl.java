package jsfspring.negocio.impl;

import java.io.Serializable;

import jsfspring.negocio.NegocioBean;

public class NegocioBeanImpl implements NegocioBean, Serializable {

	private static final long serialVersionUID = 1L;

	public String saluda(String nombre) {
		if (nombre != null) {
			return "Hola " + nombre;
		}
		return "hola tú";
	}

}
