package com.company;



public class Main {

    public static void main(String[] args){
        try {
            Juguete e1 = new Electronico("J1", 5, 12, 5);
            Juguete ed1 = new Educativo("J2", 5, 7, 10, 9, 2);
            Juguete ed2 = new Educativo("J3", 5, 7, 8, 9, 5);
            Juguete ed3 = new Juguete("J4",4,5,6);

            Cliente c = new Cliente("Paco");
            Cliente c2 = new Cliente("Jose");
            c2.addJuguete(e1);
            c2.addJuguete(ed1);
            c2.addJuguete(ed2);
            c2.calcularGasto();

            e1.equals(ed2);

            System.out.println(c2.calcularGasto());
            c2.listarJuguetes();
            System.out.println("----------------------------------------");
            c2.listarJuguetesByPrecioFinal();

            Jugueteria ToysRUs = new Jugueteria();

            ToysRUs.addCliente(c2);
            ToysRUs.addCliente(c);
            ToysRUs.listarCliente();
            ToysRUs.listarJuguetesPorCliente("Jose");
        }
        catch (EinvalidPropertyException ex){
            System.out.println(ex);
        }
    }
}
