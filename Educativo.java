package com.company;

public class Educativo extends Juguete{
    private int edadMaxima;
    private int bonPrecio;

    public Educativo(String nombre, int numeroJugadores, int edadMinima, int precioBase, int edadMaxima, int bonPrecio) throws EinvalidPropertyException {
        super(nombre, numeroJugadores, edadMinima, precioBase);
        if (edadMaxima < 0 ) throw new EinvalidPropertyException("Edad maxima en educativo no valido");
        if (edadMaxima <= edadMinima ) throw new EinvalidPropertyException("Edad maxima no puede ser mayor a edad minima en educativo");
        this.edadMaxima = edadMaxima;
        if (bonPrecio < 0 ) throw new EinvalidPropertyException("Bonificacion del precio en educativo no valido");
        if (bonPrecio > precioBase ) throw new EinvalidPropertyException("Bonificacion del precio no puede ser mayor al precio base");
        this.bonPrecio = bonPrecio;
    }

    public Educativo(String nombre, int edadMinima, int precioBase, int edadMaxima, int bonPrecio) throws EinvalidPropertyException {
        super(nombre, edadMinima, precioBase);
        if (edadMaxima < 0 ) throw new EinvalidPropertyException("Edad maxima en educativo no valido");
        if (edadMaxima <= edadMinima ) throw new EinvalidPropertyException("Edad maxima no puede ser mayor a edad minima en educativo");
        this.edadMaxima = edadMaxima;
        if (bonPrecio < 0 ) throw new EinvalidPropertyException("Bonificacion del precio en educativo no valido");
        if (bonPrecio > precioBase ) throw new EinvalidPropertyException("Bonificacion del precio no puede ser mayor al precio base");
        this.bonPrecio = bonPrecio;
    }

    @Override
    public int getPrecio() {
        return (this.bonPrecio + this.precioBase);
    }
}
