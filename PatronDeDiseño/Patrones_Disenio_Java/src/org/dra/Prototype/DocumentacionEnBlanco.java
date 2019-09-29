package org.dra.Prototype;

import java.util.*; 

public class DocumentacionEnBlanco extends Documentacion 
{ 
    private static DocumentacionEnBlanco instance = null; 
 
    private DocumentacionEnBlanco() 
    { 
        documentos = new ArrayList<Documento>(); 
    } 
 
    public static DocumentacionEnBlanco Instance() 
    { 
        if (instance == null) 
            instance = new DocumentacionEnBlanco(); 
        return instance; 
    } 
 
    public void incluye(Documento doc) 
    { 
        documentos.add(doc); 
    } 
 
    public void excluye(Documento doc) 
    { 
        documentos.remove(doc); 
    } 
}
