package org.dra.Iterator;

public class CatalogoVehiculo extends Catalogo<Vehiculo, IteradorVehiculo> 
{ 
    public CatalogoVehiculo() 
    { 
       contenido.add(new Vehiculo("vehiculo economico")); 
       contenido.add(new Vehiculo("pequenio vehiculo economico"));
       contenido.add(new Vehiculo("vehiculo de gran calidad"));
       contenido.add(new Vehiculo("vehiculo de calidad economico")); 
    } 
 
    protected IteradorVehiculo creaIterador() 
    { 
        return new IteradorVehiculo(); 
    } 
}
