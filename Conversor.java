import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int op;
        double c, f, k;

        do {
            System.out.println("\n\t\t\t Conversor \n");
            System.out.println("-- Bem-vindo ao melhor Conversor da história! by:Sans_ --");

            System.out.println("\n1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Sair");

            System.out.print("\nOpção: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Você escolheu Celsius (°C).");
                    System.out.println("1. Converter para Fahrenheit (°F)");
                    System.out.println("2. Converter para Kelvin (K)");
                    System.out.println("3. Voltar");

                    System.out.print("\nOpção: ");
                    int opc = entrada.nextInt();

                    switch (opc) {
                        case 1:
                            System.out.print("Informe a temperatura em Celsius: ");
                            c = entrada.nextDouble();
                            f = 1.8 * c + 32;
                            System.out.println(c + "°C em Fahrenheit é: " + f + "°F");
                            break;
                        case 2:
                            System.out.print("Informe a temperatura em Celsius: ");
                            c = entrada.nextDouble();
                            k = c + 273.15;
                            System.out.println(c + "°C em Kelvin é: " + k + "K");
                            break;
                        case 3:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Você escolheu Fahrenheit (°F).");
                    System.out.println("1. Converter para Celsius (°C)");
                    System.out.println("2. Converter para Kelvin (K)");
                    System.out.println("3. Voltar");

                    System.out.print("\nOpção: ");
                    int opf = entrada.nextInt();

                    switch (opf) {
                        case 1:
                            System.out.print("Informe a temperatura em Fahrenheit: ");
                            f = entrada.nextDouble();
                            c = (f - 32) / 1.8;
                            System.out.println(f + "°F em Celsius é: " + c + "°C");
                            break;
                        case 2:
                            System.out.print("Informe a temperatura em Fahrenheit: ");
                            f = entrada.nextDouble();
                            k = (f - 32) * 5 / 9 + 273.15;
                            System.out.println(f + "°F em Kelvin é: " + k + "K");
                            break;
                        case 3:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Você escolheu Kelvin (K).");
                    System.out.println("1. Converter para Celsius (°C)");
                    System.out.println("2. Converter para Fahrenheit (°F)");
                    System.out.println("3. Voltar");

                    System.out.print("\nOpção: ");
                    int opk = entrada.nextInt();

                    switch (opk) {
                        case 1:
                            System.out.print("Informe a temperatura em Kelvin: ");
                            k = entrada.nextDouble();
                            c = k - 273.15;
                            System.out.println(k + "K em Celsius é: " + c + "°C");
                            break;
                        case 2:
                            System.out.print("Informe a temperatura em Kelvin: ");
                            k = entrada.nextDouble();
                            f = (k - 273.15) * 1.8 + 32;
                            System.out.println(k + "K em Fahrenheit é: " + f + "°F");
                            break;
                        case 3:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo... Arrivederci!");
                    break;

                default:
                    System.out.println("Escolha uma opção correta...");
            }

        } while (op != 4);

        entrada.close();
    }
}
