package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private HashSet<Juguete> juguetes;

    public Cliente(String nombre) throws EinvalidPropertyException {
        if (nombre == null) throw new EinvalidPropertyException("Nombre del cliente no valido");
        this.nombre = nombre;
        this.juguetes = new HashSet<Juguete>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && Objects.equals(juguetes, cliente.juguetes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, juguetes);
    }

    public void addJuguete(Juguete j){
        this.juguetes.add(j);
    }
    public int calcularGasto() {
        int precioFinal = 0;
        for(Juguete s : this.juguetes) {
          precioFinal += s.getPrecio();
        }
        return precioFinal;
    }
    public void listarJuguetes(){
        ArrayList<Juguete> e = new ArrayList<>(this.juguetes);

        e.sort(
                (Juguete1, Juguete2) -> {
                    return Juguete1.compareToPrecioBase(Juguete2);
                }
        );
        for (int i = 0; i < e.size(); i++) {
            System.out.println("Nombre juguete : "+e.get(i).nombre +"  Precio base :  "+ e.get(i).getPrecioBase());
        }
    }

    public void listarJuguetesByPrecioFinal(){
        ArrayList<Juguete> e = new ArrayList<>(this.juguetes);

        e.sort(
                (Juguete1, Juguete2) -> {
                    return Juguete1.compareToPrecioFinal(Juguete2);
                }
        );
        for (int i = 0; i < e.size(); i++) {
            System.out.println("Nombre juguete : "+e.get(i).nombre +"  Precio final :  "+ e.get(i).getPrecio());
        }
    }

}
