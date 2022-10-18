package futbol;

public class Jugador extends Futbolista{

    public short golesMarcados;
    public byte dorsal;

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre, int edad, String pocicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, pocicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos() {
        return false;
    }


    public int compareTo(Object o) {
        if (!(o instanceof Futbolista)) return 0;
        return Math.abs(((Futbolista) o).getEdad()-this.getEdad());
    }


    public String toString() {
        return super.toString()+
                " con el dorsal " + dorsal +
                ". Ha marcado " + golesMarcados;
    }
}
