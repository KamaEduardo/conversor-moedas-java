package ao.alurachallenge;

import java.util.Scanner;

public class Main {

    static void menuPrincipal(){
        System.out.println("1) Dólar =>> Peso Argentino");
        System.out.println("2) Peso aergentino =>> Dólar");
        System.out.println("3) Dólar =>> Real  Brasileiro");
        System.out.println("4) Real Brasileiro =>> Dólar");
        System.out.println("5) Dólar =>> Kwanza Angolano");
        System.out.println("6) Kwanza Angolano =>> Dólar");
        System.out.println("7) Real Brasileiro =>> Kwanza Angolano");
        System.out.println("8) Kwanza Angolano =>> Real Brasileiro");
        System.out.println("9) Sair");
    }


    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
        int opcao;

        ConversorService conversorService=new ConversorService();

       

        do{

            menuPrincipal();
            System.out.println("Escolha uma opção: ");
            opcao=ler.nextInt();

            switch (opcao) {
                case 1:
                     System.out.println("******************************\n");
                    System.out.print("Digite o valor: ");
                    double valor = ler.nextDouble();
                    double resultado = conversorService.converter("USD", "ARS", valor);
                    System.out.printf("Resultado: %.2f%n", resultado);
                    System.out.println("******************************\n");
                    break;
                case 2:
                    System.out.println("******************************\n");
                    System.out.print("Digite o valor: ");
                    double valor2 = ler.nextDouble();
                    double resultado2 = conversorService.converter("ARS", "USD", valor2);
                    System.out.printf("Resultado: %.2f%n", resultado2);
                    System.out.println("******************************\n");
                    break;
                case 3:
                     System.out.println("******************************\n");
                    System.out.print("Digite o valor: ");
                    double valor3 = ler.nextDouble();
                    double resultado3 = conversorService.converter("USD", "BRL", valor3);
                    System.out.printf("Resultado: %.2f%n", resultado3);
                    System.out.println("******************************\n");
                    break; 
                case 4:
                     System.out.println("******************************\n");
                    System.out.print("Digite o valor: ");
                    double valor4 = ler.nextDouble();
                    double resultado4= conversorService.converter("BRL", "USD", valor4);
                    System.out.printf("Resultado: %.2f%n", resultado4);
                    System.out.println("******************************\n");
                    break;
                case 5:
                     System.out.println("******************************\n");
                    System.out.print("Digite o valor: ");
                    double valor5 = ler.nextDouble();
                    double resultado5 = conversorService.converter("USD", "AOA", valor5);
                    System.out.printf("Resultado: %.2f%n", resultado5);
                    System.out.println("******************************\n");
                    break;
                case 6:
                     System.out.println("******************************\n");
                    System.out.print("Digite o valor: ");
                    double valor6 = ler.nextDouble();
                    double resultado6 = conversorService.converter("AOA", "USD", valor6);
                    System.out.printf("Resultado: %.2f%n", resultado6);
                    System.out.println("******************************\n");
                    break; 
                case 7:
                     System.out.println("******************************\n");
                    System.out.print("Digite o valor: ");
                    double valor7 = ler.nextDouble();
                    double resultado7 = conversorService.converter("BRL", "AOA", valor7);
                    System.out.printf("Resultado: %.2f%n", resultado7);
                    System.out.println("******************************\n");
                    break; 
                    
                case 8:
                     System.out.println("******************************\n");
                    System.out.print("Digite o valor: ");
                    double valor8 = ler.nextDouble();
                    double resultado8 = conversorService.converter("AOA", "BRL", valor8);
                    System.out.printf("Resultado: %.2f%n", resultado8);
                    System.out.println("******************************\n");
                    break;
                case 9:
                    System.out.println("Escolheste a opcao 9: Saindo...");
                    break;
            
                default:
                    
                    System.out.println("Escolha  opcao 1-8");
                    
                    break;
            }


        }while(opcao!=9);

        


        ler.close();
    }
}