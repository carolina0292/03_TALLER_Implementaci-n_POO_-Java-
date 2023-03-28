package Figuras_geometricas;

public class Circulo {

    //atributos 
     double pi =3.1416;
     double radioc=0;
     double areac=0;


     
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadioc() {
        return radioc;
    }

    public void setRadioc(double radioc) {
        this.radioc = radioc;
    }

    public double getAreac() {
        return areac;
    }

    public void setAreac(double areac) {
        this.areac = areac;
    }

    //metodo contrustor 
    public Circulo(double pi, double radioc, Double areac) {
        this.pi = pi;
        this.radioc = radioc;
        this.areac = areac;
    }

    //metodo propio 
    public void calcularArea(){
        areac=(pi*radioc*radioc);
        System.out.println("el radio es: " +radioc+ "el area del circulo es:" + areac );
    }
    


}
