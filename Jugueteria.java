package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Jugueteria {
    private HashSet<Cliente> clientes;

    public Jugueteria() {
        this.clientes =  new HashSet<Cliente>();
    }

    public void addCliente(Cliente c){
        ArrayList<Cliente> e = new ArrayList<Cliente>(this.clientes);
        int i;
        if(e.contains(c)){
            i = e.indexOf(c);
            e.set(i, c);
        } else this.clientes.add(c);

    }

    public void listarJuguetesPorCliente(String nombre){
        ArrayList<Cliente> e = new ArrayList<Cliente>(this.clientes);
        Cliente c;
        for(int i =0; i < e.size(); i++) {
            c = e.get(i);
            if (c.getNombre().equals(nombre)) {
                c.listarJuguetes();
                i = e.size();
            }
        }
    }

    public void listarCliente(){
        ArrayList<Cliente> e = new ArrayList<Cliente>(this.clientes);
        for( int i = 0; i < e.size(); i++) {
            System.out.println("Cliente " + (i+1) +" : " + e.get(i).getNombre());
        }
    }
}
