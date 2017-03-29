// Contacto simple (nombre, tel�fono)
public class Contacto {
    private String nombre;
    private int numero;

    // Constructor
    public Contacto(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
    	this.numero = numero;
    }
    
    // Comparaci�n
    public boolean esIgual(Contacto otro) {
        return this.nombre.equals(otro.nombre) &&
               this.numero == otro.numero;
    }
    public boolean igualNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
    public boolean igualNumero(int numero) {
        return this.numero == numero;
    }

    // Presentar con formato
    public String toString() {
        return nombre + ": " + numero;
    }
}
