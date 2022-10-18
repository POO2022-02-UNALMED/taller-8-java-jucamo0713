package futbol;

public abstract class Futbolista implements Comparable {
    private String nombre;
    private int edad;
    private String posicion;

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    protected Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public abstract boolean jugarConLasManos();

    public boolean equals(Object o) {
        return this == o;
    }

    public String toString() {
        return "El futbolista " + nombre +
                " tiene " + edad +
                ", y juega de " + posicion;
    }
}
