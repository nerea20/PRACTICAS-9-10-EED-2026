package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	void calcularValoresConDatosPositivos() {
	    Rectangle r = new Rectangle(3, 4);

	    assertAll(
	        () -> assertEquals(12, r.surface()),
	        () -> assertEquals(14, r.perimeter())
	    );
	}

	@Test
	void devolverCeroSiAlgunoEsCero() {
	    Rectangle r1 = new Rectangle(0, 5);
	    Rectangle r2 = new Rectangle(3, 0);

	    assertAll(
	        () -> assertEquals(0, r1.surface()),
	        () -> assertEquals(0, r1.perimeter()),
	        () -> assertEquals(0, r2.surface()),
	        () -> assertEquals(0, r2.perimeter())
	    );
	}

	@Test
	void devolverNegativoSiHayValoresNegativos() {
	    Rectangle r1 = new Rectangle(-3, 4);
	    Rectangle r2 = new Rectangle(3, -4);

	    assertAll(
	        () -> assertEquals(-1, r1.surface()),
	        () -> assertEquals(-1, r1.perimeter()),
	        () -> assertEquals(-1, r2.surface()),
	        () -> assertEquals(-1, r2.perimeter())
	    );
	}
	
	@Test
	void ErroresIntencionados() {
	    Rectangle r = new Rectangle(3, 4);

	    assertAll(
	        () -> assertEquals(10, r.surface()),      
	        () -> assertEquals(20, r.perimeter()) 
	    );
	}

}
