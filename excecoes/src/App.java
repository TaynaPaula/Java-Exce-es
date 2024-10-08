import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o valor do financiamento: R$ ");
            double valor = scanner.nextDouble();
            
            Financiamento financiamento = new Financiamento(valor);
            System.out.println("Financiamento aprovado com sucesso!");
            System.out.println(financiamento);
        } catch (ValorFinanciamento e) {
            System.out.println("Erro de financiamento: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            scanner.close();
        }
        
        }
}
