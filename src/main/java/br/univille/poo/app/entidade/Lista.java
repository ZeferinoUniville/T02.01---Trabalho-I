package br.univille.poo.app.entidade;

import java.util.ArrayList;
import java.util.List;

public class Lista {


    private int Lista_id;
    private List<Tarefa> tarefas;

    public Lista() {
        tarefas = new ArrayList<>();
    }

    public int getLista_id() {
        return Lista_id;
    }    
    public void setLista_id(int lista_id) {
        Lista_id = lista_id;
    }

    @Override
    public String toString() {
        String result ="Lista_id=" + Lista_id + "\n";
        for(Tarefa t : tarefas){
            result =  result +  t.toString();
        }
        return result;
    }
}

