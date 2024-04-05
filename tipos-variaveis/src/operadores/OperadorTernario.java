package operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        //<Expressão Condicional (booleana> ? <Caso condição seja true> : <Caso condição seja false>

    // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    if(a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";

        System.out.println(resultado);

    //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
       resultado = (a!=b) ? "verdadeiro" : "falso";

        System.out.println(resultado);

       int resultadoInteiro = a!=b ? 1 : 0;

        System.out.println(resultadoInteiro);
    }
}
