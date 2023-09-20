
import java.util.Scanner;
public class Salario {
    public static void main(String[] args){
       salario();

    }
    static void salario(){
        Scanner t = new Scanner (System.in);
        System.out.println("Digite o salario bruto (sem abatimentos nem adicionais):");
        float salarioBruto = t.nextFloat();
        System.out.println("Digite o valor dos beneficios:");
        float beneficios = t.nextFloat();
        float salarioFinal = 0;
        float salarioEnviado = 0;
        float percentualImposto = 0;
        if(salarioBruto < 1100.00f){
            percentualImposto = 0.05f;
            salarioFinal = salarioBruto-(salarioBruto*percentualImposto);
            salarioEnviado = salarioFinal + beneficios;
        }
        else if(salarioBruto > 1100.00f && salarioBruto < 2500.00f){
            percentualImposto = 0.10f;
            salarioFinal = salarioBruto-(salarioBruto * percentualImposto);
            salarioEnviado = salarioFinal + beneficios;
        }
        else{
            percentualImposto = 0.15f;
            salarioFinal = salarioBruto-(salarioBruto * percentualImposto);
            salarioEnviado = salarioFinal + beneficios;

        }
        System.out.printf("O salario final do funcionario sera de %.2f", salarioEnviado);
    } 
}
