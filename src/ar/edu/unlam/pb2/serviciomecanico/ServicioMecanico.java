package ar.edu.unlam.pb2.serviciomecanico;

import java.util.HashSet;
import java.util.Set;

public class ServicioMecanico {
	private Set<Cliente> clientes = new HashSet<Cliente>();
	private Integer cantclientesatendidos=0;
	
	
	public void nuevoCliente(Cliente nuevoCliente) {
		this.clientes.add(nuevoCliente);
	}
	
	
	public Cliente atenderCliente() throws NoHayClientesQueAtenderException {
		Cliente clienteAtendido=null;
		if(this.clientes.isEmpty()) {
			throw new NoHayClientesQueAtenderException("No hay clientes para atender");
		} 
		else {
			for (Cliente actual : this.clientes) {
				if (actual.getFueatendido().equals(false)) {
					actual.setFueatendido(true);
					actual.setFhatencion(Reloj.ahora());
					this.cantclientesatendidos++;
					clienteAtendido=actual;
					return clienteAtendido;
				}
			}	
		}
		return clienteAtendido;
	}
	
	public Long tiempoDeEsperaAtendidos() {
		Long tiempodeesperatotalatendidos=0L;
		Long cantidadClientesAtendidos=0L;
		for (Cliente actual : this.clientes) {
			if(actual.getFueatendido().equals(true)) {
				tiempodeesperatotalatendidos+=actual.getFhatencion() - actual.getFhllegada();
				cantidadClientesAtendidos++;
			}
		}
		return tiempodeesperatotalatendidos/(cantidadClientesAtendidos*60000);
	}
	
	public Long tiempoDeEsperaNoAtendidos() {
		Long tiempodeesperatotalnoatendidos=0L;
		Long cantidadClientesNoAtendidos=0L;
		for (Cliente actual : this.clientes) {
			if(actual.getFueatendido().equals(false)) {
				tiempodeesperatotalnoatendidos+=actual.getFhatencion() - actual.getFhllegada();
				cantidadClientesNoAtendidos++;
			}
		}
		return tiempodeesperatotalnoatendidos/(cantidadClientesNoAtendidos*60000);
	}
	
	public Integer obtenerCantidadClientesAtendidos() {
		Integer cantclientesatendidos=0;
		for (Cliente actual : this.clientes) {
			if (actual.getFueatendido().equals(true)) {
				cantclientesatendidos++;
			}
		}
		return cantclientesatendidos;	
	}
	
	
	public Integer obtenerCantidadClientesEnEspera() {
		Integer cantclientesenespera=0;
		for (Cliente actual : this.clientes) {
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
