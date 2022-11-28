package ar.edu.unlam.pb2.serviciomecanico;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class ServicioMecanicoTest {
	
	@Test
	public void queSePuedaAgregarUnCliente() {
		Cliente miCliente = new Cliente("Karina",123456789);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico servicio = new ServicioMecanico(listaClientes,0);
		servicio.nuevoCliente(miCliente);
		assertTrue(listaClientes.equals(servicio.getClientes()));
	}
	
	@Test (expected=NoHayClientesQueAtenderException.class)
	public void queSePuedaAtenderAunCliente() throws NoHayClientesQueAtenderException {
		Cliente otroCliente = new Cliente("Lorena",123456555);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico otroServicio = new ServicioMecanico(listaClientes,0);
		// servicio.nuevoCliente(otroCliente);
		assertTrue(listaClientes.equals(otroServicio.atenderCliente()));
	}
	
	@Test
	public void queSePuedaObtenerCantidadDeClientesAtendidos() throws NoHayClientesQueAtenderException {
		Integer valorEsperado=2;
		Cliente miCliente = new Cliente("Karina",123456789);
		Cliente otroCliente = new Cliente("Lorena",123456555);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico servicio = new ServicioMecanico(listaClientes,0);
		servicio.nuevoCliente(miCliente);
		servicio.nuevoCliente(otroCliente);
		try {
			servicio.atenderCliente();
			servicio.atenderCliente();
		}
		catch (NoHayClientesQueAtenderException e) {
			e.printStackTrace();
		}
		assertEquals(valorEsperado,servicio.obtenerCantidadClientesAtendidos());
	}

	@Test
	public void queSePuedaObtenertiempoDeEsperaDeAtendidos() throws NoHayClientesQueAtenderException {
		Cliente miCliente = new Cliente("Karina",123456789);
		Cliente otroCliente = new Cliente("Lorena",123456555);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico nuevoServicio = new ServicioMecanico(listaClientes,0);
		nuevoServicio.nuevoCliente(miCliente);
		nuevoServicio.nuevoCliente(otroCliente);
		try {
			nuevoServicio.atenderCliente();
			nuevoServicio.atenderCliente();
		}
		catch (NoHayClientesQueAtenderException e) {
			e.printStackTrace();
		}
		assertNotNull(nuevoServicio.tiempoDeEsperaAtendidos());
	}
	
	@Test
	public void queSePuedaObtenertiempoDeEsperaDeNoAtendidos() {
		Cliente miCliente = new Cliente("Karina",123456789);
		Cliente otroCliente = new Cliente("Lorena",123456555);
		Set<Cliente> listaClientes = new HashSet<Cliente>();
		ServicioMecanico nuevoServicio = new ServicioMecanico(listaClientes,0);
		nuevoServicio.nuevoCliente(miCliente);
		nuevoServicio.nuevoCliente(otroCliente);
		assertNotNull(nuevoServicio.tiempoDeEsperaNoAtendidos());
	}

}
