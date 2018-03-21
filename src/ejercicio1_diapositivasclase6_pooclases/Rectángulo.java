
package ejercicio1_diapositivasclase6_pooclases;

public class Rectángulo {
    private float base;
    private float altura;

    public Rectángulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcularArea(){
        return base*altura;
    }
    
    public float calcularPerimetro(){
        return 2*base+2*altura;
    }
    

    
    
}
