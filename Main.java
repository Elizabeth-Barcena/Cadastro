package semi2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection; 
import java.util.List;

public class Main {
    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
    List<SeguroVida> vidaSegList = new ArrayList();
    List<SeguroCasa> casaSegList = new ArrayList();
    List<SeguroAuto> autoSegList = new ArrayList();
    int opcao;
    
    do {
            System.out.println("Digite sua opcao:\n 1. Cadastrar \n 2. Mostrar todos os cadastrados \n 3. Buscar pelo numero do apolice \n 0. Sair");

            opcao = input.nextInt();

            switch (opcao) {
                case 1: 
                    
                    System.out.println(" Digite o numero do Apolice:\n 1-> Seguro Vida \n 2->Seguro Casa 3-> Seguro Automovel ");
                    int apol = input.nextInt();
                    if(apol==1){
                    System.out.println("Digite o beneficiario");
                    String benef = input.next();
                    
                    System.out.println("Digite a data");
                    System.out.println("Dia:");
                    int dia = input.nextInt();
                    System.out.println("Mes:");
                    int mes = input.nextInt();
                    System.out.println("Ano:");
                    int ano = input.nextInt();
                    Data data = new Data(dia, mes, ano);
                    
                    System.out.println("Digite o nome: ");
                    String nome = input.next();
                   
                    System.out.println("Digite o endereco completo:");
                    String endcompleto = input.next();
                    System.out.println(" Cidade: ");
                    String cidade = input.next();
                    System.out.println("Digite o estado");
                    String estado= input.next();
                    System.out.println("Cep");
                    String cep = input.next();
                    Endereco end = new Endereco(endcompleto, cidade, estado,cep); 
                    
                    System.out.println("Digite o valor: ");
                    float valor = input.nextInt();
                    System.out.println("Digite o premio: ");
                    float premio= input.nextFloat();
                    
                    vidaSegList.add(new SeguroVida(benef,data,apol, nome, end, valor, premio));
                    
                    }if(apol==2){
                    System.out.println("Digite deducao casa:");
                    int ded= input.nextInt();
                    System.out.println("Digite o ano da construcao:");
                    int anoconst= input.nextInt();
                    
                    System.out.println("Digite o nome: ");
                    String nome = input.next();
                   
                    System.out.println("Digite o endereco completo:");
                    String endcompleto = input.next();
                    System.out.println(" Cidade: ");
                    String cidade = input.next();
                    System.out.println("Digite o estado");
                    String estado= input.next();
                    System.out.println("Cep");
                    String cep = input.next();
                    Endereco end = new Endereco(endcompleto, cidade, estado,cep); 
                    
                    System.out.println("Digite o valor: ");
                    float valor = input.nextInt();
                    System.out.println("Digite o premio: ");
                    float premio= input.nextFloat();
                    
                    casaSegList.add(new SeguroCasa(ded, anoconst,apol, nome, end, valor, premio));}
                    if(apol== 3){
                        
                    System.out.println("Digite a deducao do automovel:");
                    int dedauto= input.nextInt();
                    System.out.println("Digite o numero da licença: ");
                    int numlicenca= input.nextInt();
                    System.out.println("Digite o estado do automovel:");
                    String estadoauto = input.next();
                    System.out.println("Digite o modelo do automovel:");
                    String modelo = input.next();
                    System.out.println("Digite o ano do automovel");
                    int anoauto= input.nextInt();
                    
                    System.out.println("Digite o nome: ");
                    String nome = input.next();
                   
                    System.out.println("Digite o endereco completo:");
                    String endcompleto = input.next();
                    System.out.println(" Cidade: ");
                    String cidade = input.next();
                    System.out.println("Digite o estado");
                    String estado= input.next();
                    System.out.println("Cep");
                    String cep = input.next();
                    Endereco end = new Endereco(endcompleto, cidade, estado,cep); 
                    
                    System.out.println("Digite o valor: ");
                    float valor = input.nextInt();
                    System.out.println("Digite o premio: ");
                    float premio= input.nextFloat();
                    autoSegList.add(new SeguroAuto(dedauto, numlicenca , estadoauto,modelo,anoauto, apol, nome, end, valor, premio));
                    
                    }else{
                        System.out.println("Seguro nao cadastrado!");
                    }
                    break;
                case 2:
                    for (SeguroVida vida: vidaSegList) {
                       System.out.println(vida.toString());
                    }
                    for (SeguroAuto auto: autoSegList) {
                       System.out.println(auto.toString());
                    }
                    for (SeguroCasa casa: casaSegList) {
                       System.out.println(casa.toString());
                    }
                    
                    break;
            }
    }while(opcao != 0);
    }
}