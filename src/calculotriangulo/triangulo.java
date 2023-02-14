package calculotriangulo;

public class triangulo {

    public int calcular(int base, int area) {
        return base*area/2;
    }   
    
    public String tipoTriangulo(int primerlado, int segundolado, int tercerlado){
        
        if(primerlado == segundolado && primerlado== tercerlado && segundolado == primerlado && segundolado== tercerlado && tercerlado == primerlado && tercerlado== segundolado ){
            return "Equilatero";
        } 
        if(primerlado == segundolado || primerlado== tercerlado || segundolado == primerlado || segundolado== tercerlado || tercerlado == primerlado || tercerlado== segundolado){
            return "escanelo";
        }else{
            return "Escaleno";
        }
    }
    
}

