package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Crevrolet"));
        queueCarros.add(new Carro("Fiat"));

        // Adiciona um novo elemento. Se não der, retorna um erro.
        System.out.println("Add: " + queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        // Parece o add, mas se não der, retorna falso.
        System.out.println("Offer: " + queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        // Pega o primeiro elemento da fila mas não remove.
        System.out.println("Peek: " + queueCarros.peek());
        System.out.println(queueCarros);

        // Pega o primeiro elemento e remove.
        System.out.println("Poll: " + queueCarros.poll());
        System.out.println(queueCarros);

        // Checa se está vazio.
        System.out.println("isEmpty: " + queueCarros.isEmpty());

        // Checa o tamanho da fila.
        System.out.println("Size: " + queueCarros.size());
    }
}
