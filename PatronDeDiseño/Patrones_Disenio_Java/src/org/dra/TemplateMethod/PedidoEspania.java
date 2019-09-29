package org.dra.TemplateMethod;

public class PedidoEspania extends Pedido 
{ 
    protected void calculaIVA() 
    { 
        importeIVA = importeSinIVA * 0.21; 
    } 
}
