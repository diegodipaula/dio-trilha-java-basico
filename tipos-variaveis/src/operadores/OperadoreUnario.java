package operadores;

public class OperadoreUnario {
    public static void main(String[] args) {
        //classe Operadores.java
        int numero = 5;

        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo, isso ocorre porque primeiro vai imprimir o resultado e depois vai incrementar o mesmo vale para decrementar

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);


        int numeroIterado = 5;
        //x repetição
        numeroIterado = numeroIterado + 2;

        System.out.println("Incremento: " + numeroIterado);


        //incremento de 1
        numeroIterado++;
        //é o mesmo que numeroIterado = numeroIterado +1;
        System.out.println("Incremento: " + numeroIterado);

    }
}
