package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Aluno 1
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Média", "8.5");
        aluno.put("Turma", "3A");

        // Aluno 2
        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Média", "8.9");
        aluno2.put("Turma", "3B");

        // Prints de aluno 1
        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        System.out.println(aluno.containsKey("Nome"));
        System.out.println(aluno.containsValue("Jorge"));

        // Lista de alunos
        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
    }
}
