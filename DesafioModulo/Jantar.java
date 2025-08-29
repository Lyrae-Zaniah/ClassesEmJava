package Classe.DesafioModulo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Guilherme", 120.0);
        Comida c1 = new Comida("Feijao", 12.5);
        var c2 = new Comida("Arroz", 5.5);

        System.out.println(p1.nome + " antes de ir comer tinha o peso de: " + p1.peso);

        p1.comer(c1);

        System.out.println(p1.nome + " peso após comer Feijao: " + p1.peso);

        p1.comer(c2);

        System.out.println(p1.nome + " peso após comer Arroz: " + p1.peso);
    }
}
