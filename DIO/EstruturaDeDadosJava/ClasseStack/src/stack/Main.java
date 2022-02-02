package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarro = new Stack<>();

        stackCarro.push(new Carro("Ford"));
        stackCarro.push(new Carro("Chevrolet"));
        stackCarro.push(new Carro("Fiat"));

        // Remove o último item da pilha.
        System.out.println(stackCarro);
        System.out.println(stackCarro.pop());

        // Retorna o último item da pilha, sem deletar.
        System.out.println(stackCarro);
        System.out.println(stackCarro.peek());
        System.out.println(stackCarro);

        // Verifica se a pilha está vazia.
        System.out.println(stackCarro.empty());
        System.out.println(stackCarro.isEmpty());
    }
}
