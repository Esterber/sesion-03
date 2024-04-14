/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_3;

/**
 *
 * @author Estudiante
 */
public class Persona2 {

    /**
     * @return the datab
     */
    public PersonaDatosBasico getDatab() {
        return datab;
    }

    /**
     * @param datab the datab to set
     */
    public void setDatab(PersonaDatosBasico datab) {
        this.datab = datab;
    }

    /**
     * @return the datac
     */
    public PersonaDatosContacto getDatac() {
        return datac;
    }

    /**
     * @param datac the datac to set
     */
    public void setDatac(PersonaDatosContacto datac) {
        this.datac = datac;
    }

    /**
     * @return the datar
     */
    public PersonaDatosRegistro getDatar() {
        return datar;
    }

    /**
     * @param datar the datar to set
     */
    public void setDatar(PersonaDatosRegistro datar) {
        this.datar = datar;
    }

    public Persona2(PersonaDatosBasico datab, PersonaDatosContacto datac, PersonaDatosRegistro datar) {
        this.datab = datab;
        this.datac = datac;
        this.datar = datar;
    }
    public Persona2(){}
    
    private PersonaDatosBasico datab;
    private PersonaDatosContacto datac;
    private PersonaDatosRegistro datar;
    
}
