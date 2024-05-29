package Main;

import ApiRequest.ConvertedValue;
import ApiRequest.RequestExchange;

import java.io.IOException;
import java.net.ConnectException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Double parity = 0.0;

        RequestExchange requestExchange = new RequestExchange();
        ConvertedValue convertedValue = new ConvertedValue();

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        do {
            Menu.showMenu();
            try {
                var op = scanner.nextLine();
                switch (op) {
                    case "1":
                        parity = requestExchange.ReceiveValue("USD", "EUR");
                        convertedValue.ParityCalculator("USD", "EUR", parity);
                        break;
                    case "2":
                        parity = requestExchange.ReceiveValue("EUR", "USD");
                        convertedValue.ParityCalculator("EUR", "USD", parity);
                        break;
                    case "3":
                        parity = requestExchange.ReceiveValue("BRL", "USD");
                        convertedValue.ParityCalculator("BRL", "USD", parity);
                        break;
                    case "4":
                        parity = requestExchange.ReceiveValue("USD", "BRL");
                        convertedValue.ParityCalculator("USD", "BRL", parity);
                        break;
                    case "5":
                        parity = requestExchange.ReceiveValue("EUR", "BRL");
                        convertedValue.ParityCalculator("EUR", "BRL", parity);
                        break;
                    case "6":
                        parity = requestExchange.ReceiveValue("BRL", "EUR");
                        convertedValue.ParityCalculator("BRL", "EUR", parity);
                        break;
                    case "0": System.out.println("Saindo do programa....");
                    quit = true;
                    break;
                    default:
                        System.out.println("Opção inválida! Por favor, selecione uma opção válida.");
                        System.out.println("Pressione Enter para continuar...");
                        scanner.nextLine();
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Erro: Por favor, insira um valor numérico válido(Se estiver usando \"ponto\" como casa decima troque pela vírgula!).");
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
            }catch (ConnectException e ){
                System.out.println("Erro de conexão, conecte a internet");
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
            }
        } while (!quit == true);
    }
}



