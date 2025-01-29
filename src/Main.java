import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Heroi heroi = new Heroi();
        boolean acesso = true;

        while (acesso){
            System.out.println("====MENU PRINCIPAL=====");
            System.out.println("Digite o nome do tipo de Heroi:\nmago\nguerreiro\nmonge\nninja\nsair - para encerrar o sistema\n");
            heroi.setTipoHeroi(sc.nextLine().toLowerCase());

            if (heroi.getTipoHeroi().contains("mago") || heroi.getTipoHeroi().contains("guerreiro") || heroi.getTipoHeroi().contains("monge") || heroi.getTipoHeroi().contains("ninja")) {
                heroi.atacar();
            }
            else if(heroi.getTipoHeroi().contains("sair")){
                acesso = false;
            } else{
                System.err.println("Opção inválido");
            }
        }
        sc.close();
    }
}