package Figuras_geometricas;

public class Triangulo {
    
    double baset=0;
    double alturat=0;
    double areaTriangulo=0;


    
    public double getBaset() {
        return baset;
    }

    public void setBaset(double baset) {
        this.baset = baset;
    }

    public double getAlturat() {
        return alturat;
    }

    public void setAlturat(double alturat) {
        this.alturat = alturat;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(double areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

    public Triangulo(double baset, double alturat, double areaTriangulo) {
        this.baset = baset;
        this.alturat = alturat;
        this.areaTriangulo=areaTriangulo;
    }

    public void calcularArea() {
        areaTriangulo= (baset * alturat) / 2;
        System.out.println("esta es el area: " +areaTriangulo);
    }
}
