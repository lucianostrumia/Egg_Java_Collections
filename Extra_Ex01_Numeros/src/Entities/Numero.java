package Entities;

import java.util.ArrayList;

public class Numero {

    private ArrayList<Integer> lista = new ArrayList<>();

    public Numero() {
    }

    public Numero(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }
}
