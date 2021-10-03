
package modelo;

import exceptions.ValidadoCPF;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Cadastro {
    Scanner sc = new Scanner(System.in);
    
    char habilitacao;
    String nome, cpfs;
    int newValue = 0;
    
    Piloto piloto = new Piloto();
    Piloto[] pilotos1 = new Piloto[1];
    Piloto[] pilotos2 = new Piloto[newValue];

    
    
    public void Bem_vindo(){
        System.out.println("Bem vindo ao cadastro de pilotos ");
        
        System.out.println("Espaço de armazenamento de cadastro padrão é: " + pilotos1.length);
        
        
    }

    
    public void ListarPilotos(){
        try{
                for(int i =0; i < pilotos1.length; i++){
                System.out.println("----------------- " + " Piloto N°: " + (i+1));
                System.out.println("Nome: " + pilotos1[i].getNome());
                System.out.println("CPF: " + pilotos1[i].getCpf());
                System.out.println("Habilitação: " + pilotos1[i].getHabilitacao());
                System.out.println("-----------------");
            } 
        }catch(NullPointerException e){
            System.out.println("Por favor cadastre todos os pilotos que você definiu");
        }
    }
    
    
    public void AumentarVetor(){
            System.out.println("Digite o novo valor de armazenamento");
            newValue = sc.nextInt();
            try{
            
            pilotos2 = new Piloto[newValue];
            
            for(int i=0; i < pilotos1.length; i++){
                pilotos2[i] = pilotos1[i];
             }
            pilotos1 = pilotos2;
            
                System.out.println("Espaço de armazenamento de cadastro atual é: " + pilotos1.length);
            
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Erro!! Por favor digite um numero maior que o antigo valor definido!");
            }
                     
    }
    
    
        public void  Cadastrar(){
            for(int i =0; i < pilotos1.length;i++){ 
                if(pilotos1[i] == null){
                boolean cpfVerdade;
                Piloto piloto = new Piloto();
                pilotos1[i] = piloto;

                
                do{
                    
                sc.nextLine();
                System.out.println("Piloto N°: " + (i+1));
                System.out.println("Escreva o nome: ");
                piloto.setNome(sc.nextLine());
                nome = piloto.getNome();
                
                System.out.println("Escreva o cpf: ");
                piloto.setCpf(sc.nextLine());
                cpfs = piloto.getCpf();
                
                System.out.print("Tem habilitação para pilotar? s/n ");
                piloto.setHabilitacao(sc.next().charAt(0));
                habilitacao = piloto.getHabilitacao();
                sc.nextLine();

                System.out.println("---------------"); 
                
                if(ValidadoCPF.isCPF(cpfs)== true){
                    cpfVerdade = true;
                    break;
                }else{
                    System.out.printf("Erro, CPF invalido !!!\n");
                    cpfVerdade = false;
                }
                   
                }while(cpfVerdade != true); 
                }
                
                
            }
               
            
            
    }

        public void PodePilotar(){
            Aeronaves aeronave = new Aeronaves();
                    
                for(int i =0; i < pilotos1.length; i++){
                if(pilotos1[i].getHabilitacao() == 's'){
                System.out.println("----------------- " + " Piloto N°: " + (i+1));
                System.out.println("Nome: " + pilotos1[i].getNome());
                System.out.println("CPF: " + pilotos1[i].getCpf());
                System.out.println("Habilitação: " + pilotos1[i].getHabilitacao());
                
                aeronave.setId(i);
                System.out.println("ID da aeronave: " + aeronave.getId());
                System.out.println("-----------------");
                }
            }
        }
        
    public void LocalizarCpf(){
        try{
            System.out.println("informe o CPF para a busca");
            String cpf = sc.nextLine();
            boolean cpfTrue = false;
            
            for(int i =0; i < pilotos1.length;i++){
                
                if(pilotos1[i].getCpf().equals(cpf)){
                    System.out.println("Piloto n°: " + (i+1));
                    System.out.println("Nome do CPF informado é: " + pilotos1[i].getNome() + " CPF: " + pilotos1[i].getCpf() + " Tem habilitação: " + pilotos1[i].getHabilitacao());
                    cpfTrue = true;
                } 
        
            }
            

            if(cpfTrue != true){
                System.out.println("CPF INVALIDO!!");
            } 
        }catch(NullPointerException e){
            System.out.println("Sem pilotos para localizar!!");
        }
            
    }        
}
