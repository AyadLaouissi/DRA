package org.dra.Facade;

public class ComponenteGestionDocumento implements GestionDocumento 
{ 
 
    public String documento(int indice) 
    { 
        return "Documento n�mero " + indice; 
    } 
}
