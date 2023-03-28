package Principal;
import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona3;

public class Inicio3 {



public static void main(String[] args) {
        
     String tipoDoc;
     String Documento;
     String Nombre;
     String Apellido;
     double Peso;
     double Estatura=0;
     int Edad=0;
    String Sexo;    
    double pesoActual=0;
    String Cargo;
    String Departamento;
    double Valorhora=1000;
    double HorasTrabajadas=0;
    double Totalpagar=0;
    double Totalpagarr=0;
    double Reteica=0;



    // crear objeto
    Persona3 per=new Persona3();

    Scanner captura=new Scanner(System.in);
    System.out.println("por favor digite el tipo de documento que usted tiene");
    tipoDoc=captura.next();
    System.out.println("por favor digite su documento ");
    Documento=captura.next();
    System.out.println("por favor digite su Nombre");
    Nombre=captura.next();
    System.out.println("por favor digite su Apellido");
    Apellido=captura.next();
    System.out.println("por favor digite su Peso");
    Peso=captura.nextDouble();
    System.out.println("por favor digite Estatura");
    Estatura=captura.nextDouble();
    System.out.println("por favor digite su Edad");
    Edad=captura.nextInt();
    System.out.println("por favor digite su Sexo");
    Sexo=captura.next();

    System.out.println("por favor digite su Cargo");
    Cargo=captura.next();
    System.out.println("por favor digite su Departamento");
    Departamento=captura.next();
    System.out.println("por favor digite sus Horas trabajadas");
    HorasTrabajadas=captura.nextDouble();
    // incocando un metodo


    // per.pedirDatos();
    
    per.setTipoDoc(tipoDoc);
    per.setDocumento(Documento);
    per.setNombre(Nombre);
    per.setApellido(Apellido);
    per.setSexo(Sexo);
    per.setPeso(Peso);
    per.setEstatura(Estatura);
    per.setEdad(Edad);
    per.setSexo(Sexo);
    System.out.println("Su tipo de documento es : " +per.getTipoDoc()+ "\nSu Docuemnto es : " +per.getDocumento()+  "\nSu Nombre es : " +per.getNombre()+ "\nSu Apellido es : " +per.getApellido()+ "\nSu Peso es : " +per.getPeso()+ "\nSu Estaturaes : " +per.getEstatura()+ "\nSu Edad es: " +per.getEstatura()+ "\nSu Sexo es : " +per.getSexo());
    per.mostrarPersona(tipoDoc,Documento,Nombre,Apellido,Peso,Estatura,Edad,Sexo, pesoActual);
    per.mayorEdad();
    per.calcularIMc(0, 0);
    



    Empleado em=new Empleado(per.getTipoDoc(), per.getDocumento(), per.getNombre(), per.getApellido(),per.getPeso(),per.getEstatura(),per.getEdad(), per.getSexo(),per.getPesoActual(),Cargo, Departamento,HorasTrabajadas,Valorhora,Totalpagar);
    
    em.mostrarEmpleado();
    em.calcularHorarios(Valorhora,HorasTrabajadas,Reteica,Totalpagar);
    }
}
