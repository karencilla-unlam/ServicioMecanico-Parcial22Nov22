package ar.edu.unlam.pb2.serviciomecanico;

import java.util.HashSet;
import java.util.Set;

public class ServicioMecanico {
	private Set<Cliente> clientes = new HashSet<Cliente>();
	private Integer cantclientesatendidos;
	
	
	public void nuevoCliente(Cliente nuevoCliente) {
		this.clientes.add(nuevoCliente);
	}
	
	
	public Cliente atenderCliente() throws ClienteNoAtendidoException {
		for (Cliente actual : this.Clientes) {
			if (actual.getFueatendido().equals(false)) {
				this.actual.setFueatendido(true));
				this.cantclientesatendidos++;
				return actual;
			}
			else {
			throw new ClienteNoAtendidoException("No hay clientes para atender");
			}
		}		
	}
	
	public Double tiempoDeEsperaAtendidos() {
		Double tiempodeesperatotalatendidos=0;
		for (Cliente actual : this.Clientes) {
			if(actual.getFueatendido().equals(true))
				tiempodeesperatotalnoatendidos+=(Double)(actual.getFhllegada())-(actual.getFhatencion());
		}
		return (Double)tiempodeesperatotalatendidos/60000;
	}
	
	public Double tiempoDeEsperaNoAtendidos() {
		Double tiempodeesperatotalnoatendidos=0;
		for (Cliente actual : this.Clientes) {
			if(actual.getFueatendido().equals(false))
				tiempodeesperatotalnoatendidos+=Double)(actual.getFhllegada())-(actual.getFhatencion());
		}
		return (Double)tiempodeesperatotalnoatendidos/60000;
	}
	
	public Integer obtenerCantidadClientesAtendidos() {
		Integer cantclientesatendidos=0;
		for (Cliente actual : this.Clientes) {
			if (actual.getFueatendido().equals(true)) {
				cantclientesatendidos++;
			}
		}
		return cantclientesatendidos;	
	}
	
	
	public Integer obtenerCantidadClientesEnEspera() {
		Integer cantclientesenespera=0;
		for (Cliente actual : this.Clientes) {
			if (actual.getFueatendido().equals(false)) {
				cantclientesenespera++;
			}
		}
		return cantclientesenespera;
	}

	
	// Getters y setters
	
	public Set<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}


	public Integer getCantclientesatendidos() {
		return cantclientesatendidos;
	}


	public void setCantclientesatendidos(Integer cantclientesatendidos) {
		this.cantclientesatendidos = cantclientesatendidos;
	}

	// Constructor
	
	public ServicioMecanico(Set<Cliente> clientes, Integer cantclientesatendidos) {
		this.clientes = clientes;
		this.cantclientesatendidos = cantclientesatendidos;
	}
	
	
}
