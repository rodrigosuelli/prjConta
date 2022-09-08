import java.util.Scanner;

public class ContaTeste {
    public static Conta cc = new Conta();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opc = 0;

        while (opc != 5) {
            exibirMenu();
            opc = receberOpcao("Escolha uma operacao:");
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
            System.out.println("======================");
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
        System.out.println("5. Sair");
    }

    public static void execSacar() {
        System.out.println("Insira o valor a ser sacado: ");
        double valor = Double.parseDouble(scan.nextLine());
        int saqueRealizado = cc.sacar(valor);
        if (saqueRealizado == 1) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque não realizado");
        }
    }

    public static void execDepositar() {
        System.out.println("Insira o valor a ser depositado: ");
        double valor = Double.parseDouble(scan.nextLine());
        cc.depositar(valor);
    }

    public static void execConsultar() {
        System.out.println(cc);
    }

    public static void execCadastrar() {
        System.out.println("Insira o nome do cliente: ");
        cc.setNomeCliente(scan.nextLine());
        System.out.println("Insira a conta: ");
        cc.setConta(scan.nextLine());
        System.out.println("Insira a agencia: ");
        cc.setAgencia(scan.nextLine());
    }
}
