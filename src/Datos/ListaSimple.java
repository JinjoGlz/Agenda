/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Jinjo
 */
public class ListaSimple<T> {

    private Nodo<T> inicio;

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public void insertar(T dato) {
        Nodo<T> nuevo;
        nuevo = new Nodo<T>(dato);
        Nodo<T> aux = inicio;
        if (inicio == null) {
            inicio = nuevo;
        } else {
            while (aux.getLiga() != null) {
                aux = aux.getLiga();
            }
            aux.setLiga(nuevo);
            }
    }
    
    public void borrar(int index){
        Nodo<T> aux=inicio;
        Nodo<T> aux2=inicio.getLiga().getLiga();
        int cont=1;
        while(cont !=index){
                aux=aux.getLiga();
                aux2=aux2.getLiga();
                cont++;
            }
        aux.setLiga(aux2);
    }
    
    public void borrarInicio(){
         
            inicio = inicio.getLiga();
    }
    
    public void borrarFinal(){
         Nodo<T> aux = inicio;
        Nodo<T> anterior = null;
        while (aux.getLiga() != null) {
                anterior = aux;
                aux = aux.getLiga();
            }
            anterior.setLiga(null);
    }
}
