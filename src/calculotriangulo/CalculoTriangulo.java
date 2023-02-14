package calculotriangulo;

import calculotriangulo.triangulo;
import perro.perro;

public class CalculoTriangulo {

    public static void main(String[] args) {
        
       perro perro = new perro("ringo", "aleman", 7, true);
       
       perro.ladrar();
       
        System.out.println(perro.getNombre());
        System.out.println(perro.getRaza());
       
    }

}
