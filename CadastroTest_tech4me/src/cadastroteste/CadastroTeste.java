/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroteste;

import java.util.Scanner;
import modelo.Cadastro;
import modelo.Piloto;

/**
 *
 * @author Marcos
 */
public class CadastroTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Piloto piloto = new Piloto();
        Cadastro cadastro = new Cadastro();  
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("Cadastre o piloto informando o nome e CPF ");
        cadastro.Cadastrar();
        
    
        do{
            
        System.out.println("Caso queira localizar um piloto pelo CPF digite 1. Caso queira listar todos pilotos digite 2. Para finalizar digite 0");
        opcion = sc.nextInt();
        
            switch(opcion){
              case 0:
                System.out.println("Fim do programa!");
                break;    
              case 1:
                  for(int i = 0; i < 1; i++){
                    cadastro.LocalizarCpf();
                  }                  

                  break;    
              case 2:
                  for(int i = 0; i < 1; i++){
                      cadastro.ListarPilotos();
                  }
                  
                  break;
              default:
                  System.out.println("Opção invalida. Tente novamente");
            }
        }while(opcion !=0);   
            
        sc.close(); 
    }
    
}
