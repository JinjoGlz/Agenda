/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Jinjo
 */
public class Contacto {
    private String nombre;
    private ListaSimple<String> telefonos= new ListaSimple<String>();
    private ListaSimple<String> emails= new ListaSimple<String>();
    
    public Contacto(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaSimple<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ListaSimple<String> telefonos) {
        this.telefonos = telefonos;
    }

    public ListaSimple<String> getEmails() {
        return emails;
    }

    public void setEmails(ListaSimple<String> emails) {
        this.emails = emails;
    }
    
    
}
