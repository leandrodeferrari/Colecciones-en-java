
package ejercicioextra3.Entidades;

import java.util.HashSet;
import java.util.Objects;


public class Libreria {

    HashSet<Libro> coleccionDeLibros;

    public Libreria() {
        coleccionDeLibros = new HashSet();
    }

    public Libreria(HashSet<Libro> coleccionDeLibros) {
        this.coleccionDeLibros = coleccionDeLibros;
    }

    public HashSet<Libro> getColeccionDeLibros() {
        return coleccionDeLibros;
    }

    public void setColeccionDeLibros(HashSet<Libro> coleccionDeLibros) {
        this.coleccionDeLibros = coleccionDeLibros;
    }

    @Override
    public String toString() {
        return "Libreria{" + "coleccionDeLibros=" + coleccionDeLibros + '}';
    }
    
}