package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	
	private Persona p = new Persona("123456789", "Miguel", "San Juan");

	@Test
	void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDni() {
		String valorEsperado="123456789";
		String valorDevuelto= p.getDni();
		
		assertEquals(valorEsperado, valorDevuelto);
	}

	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		String valorEsperado="Miguel";
		String valorDevuelto= p.getNombre();
		
		assertEquals(valorEsperado, valorDevuelto);

	}

	@Test
	void testSetNombre() {
		p.setNombre("Migu");
		String valorEsperado="Migu";
		String valorDevuelto= p.getNombre();
		
		assertEquals(valorEsperado, valorDevuelto);
	}

	@Test
	void testGetApellido1() {
		String valorEsperado="San Juan";
		String valorDevuelto= p.getApellido1();
		
		assertEquals(valorEsperado, valorDevuelto);
		
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
