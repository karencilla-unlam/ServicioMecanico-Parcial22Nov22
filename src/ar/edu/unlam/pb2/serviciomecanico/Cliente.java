package ar.edu.unlam.pb2.serviciomecanico;

public class Cliente {
	private String nombre;
	private Integer nromovil;
	private Reloj fhllegada;
	private Reloj fhatencion;
	private Boolean fueatendido;
	
	// Constructores
	
	public Cliente(String nombre, Integer nromovil) {
		this.nombre = nombre;
		this.nromovil = nromovil;
		this.fhllegada = 0;
		this.fhatencion = 0;
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


	public Reloj getFhllegada() {
		return fhllegada;
	}


	public void setFhllegada(Reloj fhllegada) {
		this.fhllegada = fhllegada;
	}


	public Reloj getFhatencion() {
		return fhatencion;
	}


	public void setFhatencion(Reloj fhatencion) {
		this.fhatencion = fhatencion;
	}


	public Boolean getFueatendido() {
		return fueatendido;
	}


	public void setFueatendido(Boolean fueatendido) {
		this.fueatendido = fueatendido;
	}
	

}
