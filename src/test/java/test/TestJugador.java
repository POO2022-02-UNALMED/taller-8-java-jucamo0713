package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import futbol.Futbolista;
import futbol.Jugador;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestJugador {
	@Test
   	public void testConstructor(){
		Jugador f = new Jugador("Valeria", 21, "defensa", (short) 4, (byte) 8);
		boolean ok = false;
		if (f.getEdad() == 21 && f.getNombre().equals("Valeria") 
				&& f.getPosicion().equals("defensa") && f.golesMarcados == 4 
				&& f.dorsal == 8) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el constructor de la clase Jugador");
    }
	
	@Test
   	public void testConstructorVacio(){
		Jugador f = new Jugador();
		boolean ok = false;
		if (f.getEdad() == 30 && f.getNombre().equals("Maradona") 
				&& f.getPosicion().equals("delantero") && f.golesMarcados == 289
				&& f.dorsal == 7) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el constructor de la clase Jugador");
    }
	
	@Test
   	public void testComparable(){
		Jugador f1 = new Jugador();
		Jugador f2 = new Jugador("Valeria", 21, "defensa", (short) 4, (byte) 8);
		boolean ok = false;
		if (f1.compareTo(f2) == 9) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con la implementacion de la interface en la clase Jugador");
    }
	
	@Test
   	public void testToString(){
		Jugador f = new Jugador();
		String  comp = "El futbolista Maradona tiene 30, y juega de delantero con el dorsal 7. Ha marcado 289";
		boolean ok = false;
		if (f.toString().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo toString de la clase Jugador");
    }
	
	@Test
   	public void testJugarManos(){
		Jugador f = new Jugador();
		
		boolean ok = false;
		if (!f.jugarConLasManos()) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo jugarConLasManos de la clase Jugador");
    }
}
