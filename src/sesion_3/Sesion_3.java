/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_3;

/**
 *
 * @author Estudiante
 */
public class Sesion_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per=new Persona();
        per.setNombre("Juan");
        per.setApellido("Diaz");
        per.setDni("0000069");
        per.setDireccion("Av Manzana 69");
        per.setTelefono("99992312");
        per.setCorreo("Adriancitoeldestructordemundos@upn.pe");
        per.setUsuario("iooooo");
        per.setContraseña("1234567");
        per.setEmail("juan.diaz@gmail.com");
        
        
        
        PersonaDatosBasico dataB = new PersonaDatosBasico("juan","Diaz","049392");
        PersonaDatosContacto dataC=new PersonaDatosContacto("Av Manzana 69","99992312","Adriancitoeldestructordemundos@upn.pe");
        PersonaDatosRegistro dataR= new PersonaDatosRegistro("ioooooo","1234567","juan.diaz@gmail.com");
        Persona2 per2 = new Persona2(dataB,dataC,dataR);
        
        Persona Carlos= Persona.Carlos();
        Persona Marcos= Persona.Marcos();
        Persona Juanita= Persona.Juanita();
        
    }
    
}
