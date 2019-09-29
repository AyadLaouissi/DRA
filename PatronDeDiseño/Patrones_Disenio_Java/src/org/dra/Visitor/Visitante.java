package org.dra.Visitor;

public interface Visitante 
{ 
    void visita(EmpresaSinFilial empresa); 
    void visita(EmpresaMadre empresa); 
}
