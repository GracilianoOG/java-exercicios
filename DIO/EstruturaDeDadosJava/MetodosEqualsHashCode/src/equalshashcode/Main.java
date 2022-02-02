package equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro car1 = new Carro("A");
        Carro car2 = new Carro("A");
        Carro car3 = new Carro("B");

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
    }
}
