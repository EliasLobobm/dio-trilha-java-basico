import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("==========Desafio Contador==========");
        Scanner terminal = new Scanner(System.in);
        System.out.println("Primeiro Parâmetro");
        int parametroUm   = terminal.nextInt();
        System.out.println("Segundo Parâmetro");
        int parametroDois = terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
           // if(e == )
            System.out.println("Parâmetro inicial não pode ser maior que parâmetro final");
        }

    }

    static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException{
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
           // System.out.println("Parâmetro inicial não pode ser maior que parâmetro final e precida ser um número inteiro");
        
        for(int conta = parametroUm;conta <=parametroDois;conta++){
            System.out.println("contando "+ conta);
        }
    }
}