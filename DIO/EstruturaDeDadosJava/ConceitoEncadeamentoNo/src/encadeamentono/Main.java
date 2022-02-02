// Exemplo da aula de introdução a estrutura de dados da DIO
package encadeamentono;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteúdo nó1");
        No no2 = new No("Conteúdo nó2");
        No no3 = new No("Conteúdo nó3");
        No no4 = new No("Conteúdo nó4");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        // Nó 1 ao 4 + null (não existe o quinto nó)
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
