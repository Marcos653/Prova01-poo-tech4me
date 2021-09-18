/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Cadastro {
    Scanner sc = new Scanner(System.in);
    Piloto[] pilotos = new Piloto[Quantid()];
    String nome, cpfs;
    
    //metodos  
    public int Quantid(){
        System.out.println("Bem vindo ao cadastro de pilotos ");
        
        System.out.println("Por favor informe a quantidade de pilotos ");
        int quantidade = sc.nextInt();
        return quantidade;
        
    }

 
    public void Cadastrar(){
            for(int i =0; i < pilotos.length;i++){ 
                boolean cpfVerdade;
                Piloto piloto = new Piloto();
                pilotos[i] = piloto;

                
                do{
                    
                sc.nextLine();
                System.out.println("Piloto N°: " + (i+1));
                System.out.println("Escreva o nome: ");
                piloto.setNome(sc.nextLine());
                nome = piloto.getNome();
                
                System.out.println("Escreva o cpf: ");
                piloto.setCpf(sc.nextLine());
                cpfs = piloto.getCpf();
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
    
    
    public void LocalizarCpf(){
            System.out.println("informe o CPF para a busca");    
            String cpfs = sc.nextLine();
            boolean cpfTrue = false;
            
            for(int i =0; i < pilotos.length;i++){
                
   
                if(pilotos[i].getCpf().equals(cpfs)){
                    System.out.println("Piloto n°: " + (i+1));
                    System.out.println("Nome do CPF informado é: " + pilotos[i].getNome() + " CPF: " + pilotos[i].getCpf());
                    cpfTrue = true;
                }
        
            }
            if(cpfTrue != true){
                System.out.println("CPF INVALIDO!!");
            }
            
    }
    
    public void ListarPilotos(){
            for(int i =0; i < pilotos.length; i++){
                System.out.println("----------------- " + " Piloto N°: " + (i+1));
                System.out.println("Nome: " + pilotos[i].getNome());
                System.out.println("CPF: " + pilotos[i].getCpf());
                System.out.println("-----------------");
            }        
    }

}
