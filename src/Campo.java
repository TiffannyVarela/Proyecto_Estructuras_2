/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author tiffa
 */
public class Campo implements Serializable{
    String Nombre;
    String contenido;
    int longitud;
    boolean pri = false;
    
    public Campo() {
        pri = false;
    }

    public Campo(String Nombre, String contenido, int longitud) {
        this.Nombre = Nombre;
        this.contenido = contenido;
        this.longitud = longitud;
    }
    
    ArrayList <String> contenidos = new ArrayList();
    public Campo(String Nombre, String Contenido) {
        this.Nombre = Nombre;
        this.contenido = Contenido;
    }
    public ArrayList<String> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<String> contenidos) {
        this.contenidos = contenidos;
    }
    
    public String getContenidoA(int n) {
        return contenidos.get(n);
    }

    public void setContenidoA(String a) {
        contenidos.add(a);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean getPri() {
        return pri;
    }

    public void setPri(boolean pri) {
        this.pri = pri;
    }

    @Override
    public String toString() {
        return "Campo{" + "Nombre=" + Nombre + ", contenido=" + contenido + ", longitud=" + longitud + ", pri=" + pri + '}';
    }
    
    public int getTamano() {
        return getNombre().length()*2 + 1;
    }
    
    
    
}
