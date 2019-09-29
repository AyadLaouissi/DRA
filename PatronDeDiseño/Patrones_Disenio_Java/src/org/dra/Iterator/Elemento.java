package org.dra.Iterator;

public class Elemento 
{ 
    protected String descripcion; 

    public Elemento() 
    { 
        this.descripcion = ""; 
    } 

    public Elemento(String descripcion) 
    { 
        this.descripcion = descripcion; 
    } 
 
    public boolean palabraClaveValida(String palabraClave) 
    { 
        return descripcion.indexOf(palabraClave) != -1; 
    } 
}
