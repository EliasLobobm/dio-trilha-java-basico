import java.util.Scanner;

public class CalculoSalarialJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=====Cálculo Salarial=====");
        try {            
            System.out.println("Qual o nome do funcionário");
            String func = entrada.nextLine();
            System.out.println("Entre com o valor do Salário");
            float valorSalario   = entrada.nextFloat();
            System.out.println("Entre com o valor do Benefício");
            float valorBeneficio = entrada.nextFloat();
           
            calcularImposto(valorSalario,valorBeneficio,func);

    } catch (Exception e) {
        System.out.println("Valor do Salário inválido");
    }

    }

    static void calcularImposto(float salario, float benef, String nome)throws ParametrosInvalidosException{
        float imposto = 0;
        if(salario >= 0 && salario <=1100){
            imposto = 0.05F * salario;
        }else if(salario >=1100.01 && salario <= 25000){
            imposto = 0.1F * salario;
        }else {
            imposto = 0.15F * salario;
        }
        float saida = salario - imposto + benef;
        System.out.println("O valor final do Salário do funcionário " + nome + " é: " + String.format("%.2f", saida));

    }
}
