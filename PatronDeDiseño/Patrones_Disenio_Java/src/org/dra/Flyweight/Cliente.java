package org.dra.Flyweight;

public class Cliente
{ 
    public static void main(String[] args) 
    { 
        FabricaOpcion fabrica = new FabricaOpcion(); 
        VehiculoSolicitado vehiculo = new VehiculoSolicitado(); 
        vehiculo.agregaOpciones("air bag", 80, fabrica); 
        vehiculo.agregaOpciones("direccion asistida", 90, fabrica); 
        vehiculo.agregaOpciones("elevalunas electricos", 85, fabrica); 
        vehiculo.muestraOpciones(); 
    } 
}
