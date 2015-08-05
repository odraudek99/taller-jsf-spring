package jsfspring;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import jsfspring.negocio.NegocioBean;

@ManagedBean(name = "miControlador")
@SessionScoped
public class MiControlador implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String saludo;

	@ManagedProperty(value = "#{negocioBean}")
	private NegocioBean negocioBean;

	public void saluda() {
		System.out.println("saluda: " + nombre);
		System.out.println("negocioBean: " + negocioBean);
		saludo = negocioBean.saluda(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public NegocioBean getNegocioBean() {
		return negocioBean;
	}

	public void setNegocioBean(NegocioBean negocioBean) {
		this.negocioBean = negocioBean;
	}



}
