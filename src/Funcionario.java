import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número do funcionário:");
        int numeroFuncionario = teclado.nextInt();
        System.out.println("Digite o número de horas trabalhadas pelo funcionário "+numeroFuncionario+":");
        int numeroDeHorasTrabalhadasPeloFuncionario = teclado.nextInt();
        System.out.println("Agora, digite quanto o funcionário "+numeroFuncionario+" recebe por hora:");
        double precoDaHora = teclado.nextDouble();
        double salarioDoFuncionario = (double) numeroDeHorasTrabalhadasPeloFuncionario*precoDaHora;
        System.out.printf("O salário do funcionário %d é de %.2f", numeroFuncionario, salarioDoFuncionario);
    }

}