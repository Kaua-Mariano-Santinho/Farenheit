import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        

// Declaração de Variáveis
        double c, f;
        int op;

// Scanner
        Scanner entrada = new Scanner(System.in);
  
// Home
    do{
        System.out.println("\n\t\t\t Conversor \n");
        System.out.println("-- Bem vindo ao melhor Conversor da história! --");
        
        System.out.println("\n\n1. Celcius (°C) para Fahrenheit (°F)");
        System.out.println("2. Fahrenheit (°F) para Celcius (°C)");
        System.out.println("3. Sair");

        System.out.print("\nOpção:");
        op = entrada.nextInt();


        // Entrada
        switch (op) {
            case 1:
                System.out.print("\n\n Informe uma teperatura específica em graus Celcius (°C):\n");
                c = entrada.nextDouble();

                // Processamento
                f = 1.8 * c + 32;
                // Saída
                System.out.println("\n" + c + "°C em Fahrenheit (°F) é:" + f + "°F.");       
                break;

            case 2:
                System.out.print("\n\n Informe uma teperatura específica em graus Fahrenheit (°F):\n");
                f = entrada.nextDouble();

                // Processamento
                c = (f - 32) * 5/9;
                // Saída
                System.out.println("\n" + f + "°F em Celcius (°C) é:" + c + "°C.");    
                break;
            case 3:
                System.out.println("\n Arrivederci!");
                break;

            default:
                System.out.println("Escolha uma opção correta...");

        }


        }while (op != 3);
    }
} 