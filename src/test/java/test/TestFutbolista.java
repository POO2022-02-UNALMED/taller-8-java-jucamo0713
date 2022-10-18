package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import futbol.Futbolista;
import futbol.Jugador;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestFutbolista {
	
	@Test
   	public void testConstructor(){
		Futbolista f = new Futbolista("Alejo", 20, "Delantero") {
			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		boolean ok = false;
		if (f.getEdad() == 20 && f.getNombre().equals("Alejo") 
				&& f.getPosicion().equals("Delantero")) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el constructor de la clase Futbolista");
    }
	
	@Test
   	public void testConstructorVacio(){
		Futbolista f = new Futbolista() {
			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		boolean ok = false;
		if (f.getEdad() == 30 && f.getNombre().equals("Maradona") 
				&& f.getPosicion().equals("delantero")) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el constructor de la clase Futbolista");
    }
	
	@Test
   	public void testToString(){
		Futbolista f = new Futbolista() {
			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		String  comp = "El futbolista Maradona tiene 30, y juega de delantero";
		boolean ok = false;
		if (f.toString().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo toString de la clase Futbolista");
    }
	
	@Test
   	public void testEquals(){
		Futbolista f2 = new Futbolista() {
			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		Futbolista f1 = new Futbolista() {
			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Futbolista f3 = f1;
		boolean ok = false;
		if (!f1.equals(f2) && f1.equals(f3)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo equals de la clase Futbolista");
    }
	
	@Test
   	public void testJugarManos(){
		Futbolista f = new Futbolista() {
			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				return true;
			}
		};
		
		boolean ok = false;
		if (f.jugarConLasManos()) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo jugarConLasManos de la clase Futbolista");
    }
}
