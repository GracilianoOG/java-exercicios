package listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");

        System.out.println("Tamanho: " + minhaListaEncadeada.size());

        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.get(3));

        minhaListaEncadeada.add(3, "d4");
        System.out.println("Adc d4: " + minhaListaEncadeada);
        System.out.println("Tamanho: " + minhaListaEncadeada.size());

        minhaListaEncadeada.remove(3);
        System.out.println("Tamanho: " + minhaListaEncadeada.size());

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.add(3, "d4");
        System.out.println("Tamanho: " + minhaListaEncadeada.size());

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.get(3));
    }
}
