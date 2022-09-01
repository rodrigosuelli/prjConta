import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenu();
        int opc = receberOpcao("Escolha uma operacao:");

        switch (opc) {
            case 1:
                execCadastrar();
                break;
            case 2:
                execDepositar();
                break;
            case 3:
                execSacar();
                break;
            case 4:
                execConsultar();
                break;
            default:
                break;
        }
    }


    public static int receberOpcao(String message) {
        System.out.println(message);
        int opcao = Integer.parseInt(scan.nextLine());
        return opcao;
    }


    public static void exibirMenu() {
        System.out.println("MENU:");
        System.out.println("1. Cadastrar");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Consultar");
        System.out.println("0. Sair");
    }

    public static int execSacar() {
        return 1;
    }

    public static void execDepositar() {

    }

    public static void execConsultar() {

    }

    public static void execCadastrar() {

    }
}