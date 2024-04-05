package operadores;

public class OperadorRelacional {
    public static void main(String[] args) {
        //classe Operadores.java

        String nomeUm = "Diego";
        //String nomeDois = "Diego";
        String nomeDois = new String("Diego");

        //System.out.println(nomeUm == nomeDois);
        // para o resultado ser true é necessário usar o método equals() no lugar do operador ==, uma vez que compara conteúdo independente se é string simples ou objetos.
        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2) {
            System.out.println("Numero 1 é igual ao numero 2: " + simNao);
        }else {
            System.out.println("FALSO! Numero 1 não é igual ao numero 2");
        }

        simNao = numero1 > numero2;

        if(numero1 > numero2){
            System.out.println("Numero 1 maior que numero 2: " + simNao);
        }else {
            System.out.println("FALSO! Numero 1 não é maior ao numero 2");
        }

        simNao = numero1 < numero2;

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2: " + simNao);

        simNao = numero1 >= numero2;

        if(numero1 >= numero2){
            System.out.println("Numero 1 maior ou igual que numero 2: " + simNao);
        }else {
            System.out.println("FALSO! Numero 1 não é maior ou igual ao numero 2");
        }

        simNao = numero1 <= numero2;

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2: " + simNao);

        simNao = numero1 != numero2;

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2: " + simNao);


        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true

        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??
    }
}
