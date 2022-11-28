package ar.edu.unlam.pb2.serviciomecanico;

import java.util.Objects;

public class Cliente {
	private String nombre;
	private Integer nromovil;
	private Long fhllegada;
	private Long fhatencion;
	private Boolean fueatendido;
	
	// Constructores
	
	public Cliente(String nombre, Integer nromovil) {
		this.nombre = nombre;
		this.nromovil = nromovil;
		this.fhllegada = 0L;
		this.fhatencion = 0L;
		this.fueatendido = false;
	}

	
	// Getters y setters

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getNromovil() {
		return nromovil;
	}


	public void setNromovil(Integer nromovil) {
		this.nromovil = nromovil;
	}


	public long getFhllegada() {
		return fhllegada;
	}


	public void setFhllegada(Long fhllegada) {
		this.fhllegada = fhllegada;
	}


	public long getFhatencion() {
		return fhatencion;
	}


	public void setFhatencion(Long fhatencion) {
		this.fhatencion = fhatencion;
	}


	public Boolean getFueatendido() {
		return fueatendido;
	}


	public void setFueatendido(Boolean fueatendido) {
		this.fueatendido = fueatendido;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre, nromovil);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(nromovil, other.nromovil);
	}

}
