package com.company;

public class Juguete {
    protected String nombre;
    protected int numeroJugadores;
    protected int edadMinima;
    protected int precioBase;

    public int getPrecioBase() {
        return precioBase;
    }



    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public Juguete(String nombre, int numeroJugadores, int edadMinima, int precioBase) throws EinvalidPropertyException {
        if (nombre == null ) throw new EinvalidPropertyException("Nombre del juguete no valido");
        this.nombre = nombre;
        if (numeroJugadores <= 0 ) throw new EinvalidPropertyException("Numero de jugadores del juguete no valido");
        this.numeroJugadores = numeroJugadores;
        if (edadMinima < 0 ) throw new EinvalidPropertyException("Edad minima del juguete no valido");
        this.edadMinima = edadMinima;
        if (precioBase <= 0 ) throw new EinvalidPropertyException("Precio base del juguete no valido");
        this.precioBase = precioBase;
    }
    public Juguete(String nombre, int edadMinima, int precioBase) throws EinvalidPropertyException {
        if (nombre == null ) throw new EinvalidPropertyException("Nombre del juguete no valido");
        this.nombre = nombre;
        if (edadMinima < 0 ) throw new EinvalidPropertyException("Edad minima del juguete no valido");
        this.edadMinima = edadMinima;
        if (precioBase <= 0 ) throw new EinvalidPropertyException("Precio base del juguete no valido");
        this.precioBase = precioBase;
    }

    public int getPrecio(){
        return this.precioBase;
    }

    @Override
    public boolean equals(Object obj) {
        Juguete o = (Juguete) obj;
        if(this.nombre.equals(o.nombre))return true;
        else return false;

    }
    public boolean equals (Juguete o){
        if(this.nombre.equals(o.nombre))return true;
        else return false;
    }
    public int compareToPrecioBase(Juguete other) {
        if (this.precioBase > other.getPrecioBase()) return 1;
        if (this.precioBase < other.getPrecioBase()) return -1;
        return 0;
    }
    public int compareToPrecioFinal(Juguete other) {
        if (this.getPrecio() > other.getPrecio()) return 1;
        if (this.getPrecio() < other.getPrecio()) return -1;
        return 0;
    }
}
