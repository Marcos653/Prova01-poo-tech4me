
package cadastroteste;

import java.util.Scanner;
import modelo.Cadastro;

/**
 *
 * @author Marcos
 */
public class CadastroTeste {


    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(); 
        Scanner sc = new Scanner(System.in);
        int opcion;
      
        
        
        cadastro.Bem_vindo();
        
        do{

            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Listar pilotos cadastrados");
            System.out.println("3 - Localizar piloto pelo CPF");
            System.out.println("4 - Aumentar espaço de armazenamento");
            System.out.println("5 - Pilotos qualificados e suas aeronaves");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcion = sc.nextInt();
        
            switch(opcion){
              case 0:
                System.out.println("Fim do programa!");
                break;
               
              case 1:
                    cadastro.Cadastrar();
                 break;
                 
              case 2:
                    cadastro.ListarPilotos();                  
                  break;   
                  
              case 3:
                    cadastro.LocalizarCpf();
                  break;
                  
              case 4:
                  cadastro.AumentarVetor(); 
                  break;
                  
 
              case 5:
                  cadastro.PodePilotar();
                  break;

              default:
                  System.out.println("Opção invalida. Tente novamente");
            }
        }while(opcion !=0);   
            
        sc.close(); 
    }
    
}
