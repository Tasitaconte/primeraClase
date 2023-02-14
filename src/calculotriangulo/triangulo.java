package calculotriangulo;

public class triangulo {
    
    float tBase;
    float altura;

    
    public float calcular(double base, double altura) {
        return (float) (base*altura/2);
    }   
    
    
    
    
    public String tipoTriangulo(int primerlado, int segundolado, int tercerlado){
        
        if(primerlado == segundolado && primerlado== tercerlado && segundolado == primerlado && segundolado== tercerlado && tercerlado == primerlado && tercerlado== segundolado ){
            return "Equilatero";
        } 
        if(primerlado == segundolado || primerlado== tercerlado || segundolado == primerlado || segundolado== tercerlado || tercerlado == primerlado || tercerlado== segundolado){
            return "isosceles";
        }else{
            return "Escaleno";
        }
    }

    public triangulo(float tBase, float altura) {
        this.tBase = tBase;
        this.altura = altura;
    }

    public float gettBase() {
        return tBase;
    }

    public void settBase(float tBase) {
        this.tBase = tBase;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}

