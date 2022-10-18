package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import futbol.Jugador;
import futbol.Portero;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestPortero {
	@Test
   	public void testConstructor(){
		Portero f = new Portero("Santiago", 23, (short) 6, (byte) 8);
		boolean ok = false;
		if (f.getEdad() == 23 && f.getNombre().equals("Santiago") 
				&& f.getPosicion().equals("Portero") && f.golesRecibidos == 6
				&& f.dorsal == 8) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el constructor de la clase Portero");
    }
	
	@Test
   	public void testComparable(){
		Portero f1 = new Portero("Antonio", 23, (short) 6, (byte) 1);
		Portero f2 = new Portero("Santiago", 23, (short) 15, (byte) 8);
		boolean ok = false;
		if (f1.compareTo(f2) == 9) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con la implementacion de la interface en la clase Portero");
    }
	
	@Test
   	public void testToString(){
		Portero f = new Portero("Santiago", 23, (short) 6, (byte) 8);
		String  comp = "El futbolista Santiago tiene 23, y juega de Portero con el dorsal 8. Le han marcado 6";
		boolean ok = false;
		if (f.toString().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo toString de la clase Portero");
    }
	
	@Test
   	public void testJugarManos(){
		Portero f = new Portero("Santiago", 23, (short) 6, (byte) 8);
		
		boolean ok = false;
		if (f.jugarConLasManos()) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo jugarConLasManos de la clase Portero");
    }
}