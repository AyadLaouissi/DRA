package org.dra.TemplateMethod;

public class Usuario 
{ 
    public static void main(String[] args) 
    { 
        Pedido pedidoEspania = new PedidoEspania(); 
        pedidoEspania.setImporteSinIVA(10000); 
        pedidoEspania.calculaPrecioConIVA(); 
        pedidoEspania.visualiza(); 
 
 
        Pedido pedidoLuxemburgo = new PedidoLuxemburgo(); 
        pedidoLuxemburgo.setImporteSinIVA(10000); 
        pedidoLuxemburgo.calculaPrecioConIVA(); 
        pedidoLuxemburgo.visualiza(); 
    } 
}

