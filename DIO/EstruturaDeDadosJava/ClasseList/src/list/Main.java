package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Peugeot"));

        System.out.println(listaCarros);

        // Verifica se contém o elemento fornecido.
        System.out.println("Contains: " + listaCarros.contains(new Carro("Ford")));

        // Retorna o elemento do index fornecido.
        System.out.println("Get: " + listaCarros.get(2));

        // Retorna o index do elemento fornecido.
        System.out.println("IndexOf: " + listaCarros.indexOf(new Carro("Fiat")));

        // Remove o elemento fornecido da lista.
        System.out.println("Remove: " + listaCarros.remove(2));
        System.out.println(listaCarros);

        // Checa se a lista está vazia.
        System.out.println("isEmpty: " + listaCarros.isEmpty());
    }
}
