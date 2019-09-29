package org.dra.Iterator;

import java.util.List; 

public abstract class Iterador <TElemento> extends Elemento 
{ 

	protected String palabraClaveConsulta; 
    protected int indice; 
    protected List<TElemento> contenido; 

    public Iterador() {
		super();
		// TODO Auto-generated constructor stub
	}

    public void setPalabraClaveConsulta(String palabraClaveConsulta, List<TElemento> contenido) 
    {
        this.palabraClaveConsulta = palabraClaveConsulta;
        this.contenido = contenido;
    }
 
    public void inicio() 
    { 
        indice = 0; 
        int tamanio = contenido.size(); 
        while ((indice < tamanio) && (!((Elemento)contenido.get(indice)).palabraClaveValida(palabraClaveConsulta))) 
            indice++; 
    } 
 
    public void siguiente() 
    {
        int tamanio = contenido.size(); 
        indice++; 
        while ((indice < tamanio) && (!((Elemento)contenido.get(indice)).palabraClaveValida (palabraClaveConsulta))) 
          indice++; 
    } 
 
    public TElemento item() 
    { 
        if (indice < contenido.size()) 
            return contenido.get(indice); 
        else 
            return null; 
    } 
}
