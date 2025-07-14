import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int parameter1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int parameter2 = scanner.nextInt();

        try{
            contar(parameter1, parameter2);
        }catch(ParametrosInvalidosException ex){
            System.out.println(ex.getMessage());
        }
    }

    static void contar(int parameter1, int parameter2) throws ParametrosInvalidosException {
//        Valida se o parameter1 é maior ou igual ao parameter2 e se for lança a exceção
        if(parameter1 >= parameter2){
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
        }

        int contagem = parameter2 - parameter1;

        for(int i=1; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }

}
