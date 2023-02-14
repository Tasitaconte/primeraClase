package perro;

public class perro {

    private String nombre;
    private String raza;
    private int edad;
    private boolean tieneVacunas;

    public void ladrar() {
        System.out.println("¡Guau, guau!");
    }

    public void correr(int distancia) {
        System.out.println(nombre + " corre " + distancia + " metros.");
    }

    public void vacunarse() {
        tieneVacunas = true;
        System.out.println(nombre + " ha sido vacunado.");
    }

    public perro(String nombre, String raza, int edad, boolean tieneVacunas) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tieneVacunas = tieneVacunas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTieneVacunas() {
        return tieneVacunas;
    }

    public void setTieneVacunas(boolean tieneVacunas) {
        this.tieneVacunas = tieneVacunas;
    }
    
    

}
