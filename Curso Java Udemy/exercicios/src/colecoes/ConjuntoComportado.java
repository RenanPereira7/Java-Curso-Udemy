package colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;

public class ConjuntoComportado {

    public static void main(String[] args) {

        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String canditado: listaAprovados) {
            System.out.println(canditado);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n: nums) {
            System.out.println(n);
        }
    }
}
