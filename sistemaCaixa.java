import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sistemaCaixa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String esc = "";
        int codProduto = 0;
        Set<Integer> listCodProduto = new HashSet<>();

        
            
        while (!esc.equals("FIM")) {
            System.out.println("Digite o Código do produto: ");
            try {
                codProduto = s.nextInt();
                s.nextLine();
                System.out.println("Adicionando...");
                System.out.println("Produto Adicionado com sucesso");
                listCodProduto.add(codProduto);
            } catch (Exception e) {
                System.out.println("Ops, Algo Deu Errado!");
                System.out.println("Erro: " + e.getMessage());
                s.nextLine();
            }

            System.out.println("Para Sair Digite (FIM) caso queiro continuar aperte enter");
            esc = s.nextLine().toUpperCase();
        }

        System.out.println("CAIXA FECHADO ");
        System.out.println("Codigos Registrados: " + listCodProduto);

        s.close();
    }
}