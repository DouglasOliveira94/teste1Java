import java.util.Scanner;

public class TesteMenu {
    public static void main(String[] args) {
       int opcao;
        do{
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Sair");
            Scanner menu = new Scanner(System.in);
            System.out.print("Selecione uma opção: ");
            opcao = menu.nextInt();
        }while (opcao !=3);
        
    

        processar(opcao);
          
      
    }

public static void processar(int opcao){
    switch (opcao) {

        case 1:
        System.out.println("Opção 1 Selecionada");
        break;
        
        case 2:
        System.out.println("Opção 2 Selecionada");
        break;
        
        case 3:
        System.out.println("Voce Saiu do Programa");
        break;
        
        default:
        System.out.println("Seleção Inválida");
        break;
}  
}
}
