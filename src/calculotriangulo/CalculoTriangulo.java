package calculotriangulo;

import calculotriangulo.triangulo;
import perro.perro;

public class CalculoTriangulo {

    public static void main(String[] args) {

        //instancias de la clase triangulo y uso de metodos
        triangulo triangulo = new triangulo(5, 5);

        System.out.println(triangulo.calcular(2, 5));

        System.out.println(triangulo.tipoTriangulo(5, 5, 5));

        //instancia de la clase perro y uso de metodos y atributos
        perro perro = new perro("ringo", "aleman", 7, true);
        perro.ladrar();

        System.out.println(perro.getNombre());
        System.out.println(perro.getRaza());

    }

}
