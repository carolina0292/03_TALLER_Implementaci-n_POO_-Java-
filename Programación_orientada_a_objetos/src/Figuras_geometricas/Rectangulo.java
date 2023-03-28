package Figuras_geometricas;

public class Rectangulo extends Figura {
    //atributos
    float baser, alturar;
    //constructor

    public Rectangulo(double baser2, double alturar2) {
        this.baser = baser;
        this.alturar = alturar;
    }
//métodos accesores
    public float getBase() {
        return baser;
    }

    public void setBase(float base) {
        this.baser = base;
    }

    public float getAltura() {
        return alturar;
    }

    public void setAltura(float altura) {
        this.alturar = altura;
    }
// métodos propios
public void calcularArea(){
    float arear;
    arear=baser*alturar;
    System.out.println("la altura del rectangulo es: "+alturar+" su base es: "+baser+" y su área es: "+arear);
    }
    
    
    
}

    
