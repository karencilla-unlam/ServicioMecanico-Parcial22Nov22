package ar.edu.unlam.pb2.serviciomecanico;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ServicioMecanicoTest {
	
	@Test
	public void queSePuedaAgregarUnCliente() {
		Cliente miCliente = new cliente("Karina",123456789);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico servicio = new ServicioMecanico(listaClientes,0);
		servicio.nuevoCliente(miCliente);
		assertTrue(listaClientes.equals(servicio.getClientes()));
	}
	
	@Test
	public void queSePuedaAtenderAunCliente() {
		Cliente otroCliente = new cliente("Lorena",123456555);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico otroServicio = new ServicioMecanico(listaClientes,0);
		servicio.nuevoCliente(otroCliente);
		assertTrue(listaClientes.equals(otroServicio.atenderCliente(otroCliente)));
	}
	
	@Test
	public void queSePuedaObtenerCantidadDeClientesAtendidos() {
		Integer valorEsperado=2;
		Cliente miCliente = new cliente("Karina",123456789);
		Cliente otroCliente = new cliente("Lorena",123456555);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico nuevoServicio = new ServicioMecanico(listaClientes,0);
		servicio.nuevoCliente(miCliente);
		servicio.nuevoCliente(otroCliente);
		servicio.atenderCliente();
		servicio.atenderCliente();
		assertTrue(nuevoServicio.obtenerCantidadClientesAtendidos()).equals(valorEsperado));
	}
	
	@Test
	public void queSePuedaObtenertiempoDeEsperaDeAtendidos() {
		Cliente miCliente = new cliente("Karina",123456789);
		Cliente otroCliente = new cliente("Lorena",123456555);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico nuevoServicio = new ServicioMecanico(listaClientes,0);
		servicio.nuevoCliente(miCliente);
		servicio.nuevoCliente(otroCliente);
		servicio.atenderCliente();
		servicio.atenderCliente();
		assertTrue((nuevoServicio.tiempoDeEsperaAtendidos()).equals(0));
	}
	
	@Test
	public void queSePuedaObtenertiempoDeEsperaDeNoAtendidos() {
		Cliente miCliente = new cliente("Karina",123456789);
		Cliente otroCliente = new cliente("Lorena",123456555);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico nuevoServicio = new ServicioMecanico(listaClientes,0);
		servicio.nuevoCliente(miCliente);
		servicio.nuevoCliente(otroCliente);
		assertTrue((nuevoServicio.tiempoDeEsperaNoAtendidos()).equals(0));
	}

}
