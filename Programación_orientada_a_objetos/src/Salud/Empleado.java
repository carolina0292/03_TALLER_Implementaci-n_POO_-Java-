package Salud;

public class Empleado extends Persona3{

    private String Cargo;
    private String Departamento;
    private double Valorhora=0;
    private double HorasTrabajadas=0;
    public  double Totalpagar=0;
    public  double Totalpagarr=0;
    private double Reteica;


    
    public Empleado() {
    }
   public Empleado(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, double pesoActual, String Cargo,String Departamento, double horasTrabajadas , double Valorhora, double Totalpagar ) {
    super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, pesoActual);
          this.Cargo=Cargo;
          this.Departamento=Departamento;
          this.Valorhora=Valorhora;
          this.HorasTrabajadas=horasTrabajadas;
          this.Totalpagar=Totalpagar;
            }




    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
    public double getValorhora() {
        return Valorhora;
    }
    public void setValorhora(double valorhora) {
        Valorhora = valorhora;
    }
    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        HorasTrabajadas = horasTrabajadas;
    }
    

    public double getTotalpagar() {
        return Totalpagar;
    }


    public void setTotalpagar(double totalpagar) {
        Totalpagar = totalpagar;
    }
        
  

    public void mostrarEmpleado(){
        System.out.println("Su tipo de documento es : " +getTipoDoc()+ "\nSu Docuemnto es : " +getDocumento()+  "\nSu Nombre es : " +getNombre() + "\nSu Apellido es : " +getApellido()+ "\nSu cargo es: " +Cargo+ "\nSus Horas trabajadas son : " +HorasTrabajadas+ "\nSu Valor por hora es: " +Valorhora);

}
    public int calcularHorarios(double valorhora, double HorasTrabajadas, double Reteica, double Totalpagarr){
        Totalpagarr= Valorhora * HorasTrabajadas;
        Reteica = Totalpagarr * 0.00966;
        Totalpagar = Totalpagarr - Reteica;
        System.out.println("El valor a pagar es: "+Totalpagar);
    return (int) Totalpagar;
        
    }  
}