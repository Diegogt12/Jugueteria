package com.company;

public class Electronico  extends  Juguete{
    private int recargoPrecio;

    public Electronico(String nombre, int numeroJugadores, int edadMinima, int precioBase, int recargoPrecio) throws EinvalidPropertyException {
        super(nombre, numeroJugadores, edadMinima, precioBase);
        if (recargoPrecio < 0 ) throw new EinvalidPropertyException("Recargo del precio en electronico no valido");
        this.recargoPrecio = recargoPrecio;
    }
    public Electronico(String nombre,  int edadMinima, int precioBase, int recargoPrecio) throws EinvalidPropertyException {
        super(nombre, edadMinima, precioBase);
        if (recargoPrecio < 0 ) throw new EinvalidPropertyException("Recargo del precio en electronico no valido");
        if (recargoPrecio > precioBase ) throw new EinvalidPropertyException("Recargo del precio no puede ser mayor al precio base");
        this.recargoPrecio = recargoPrecio;
    }

    @Override
    public int getPrecio() {
        return this.precioBase + this.recargoPrecio;
    }

}
