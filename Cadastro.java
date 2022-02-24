
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        List<Contato> listacontato = new ArrayList<Contato>();

        Scanner input = new Scanner(System.in);

        int opcao;
        String busca;
        String buscaa;
        int tele;
        do {
            System.out.println("Digite sua opcao:\n 1. Cadastrar \n 2. Procurar pelo Nome \n 3. Procurar pelo telefone \n 4. Procurar pelo email \n 5. Remover contato \n 6. Mostrar todos contatos \n 0. Sair");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro nome: \n");
                    String primeiro = input.next();
                    System.out.println("Digite segundo nome:");
                    String meio = input.next();
                    System.out.println("Digite o ultimo nome:");
                    String ultimo = input.next();
                    Nome nome = new Nome(primeiro, meio, ultimo);

                    System.out.println("Quantos telefones deseja adicionar? \n");
                    int tel = input.nextInt();

                    List<Telefone> telefones = new ArrayList<Telefone>();
                    int numero;
                    int area;
                    String descricao;
                    for (int i = 0; i < tel; i++) {
                        System.out.println("Qual e o numero do telefone: \n");
                        numero = input.nextInt();//Aqui esta lendo a informacao
                        System.out.println("Digite a area: \n");
                        area = input.nextInt();
                        System.out.println("Descricao:\n");
                        descricao = input.next();
                        Telefone telefone = new Telefone(numero, area, descricao);
                        telefones.add(telefone);
                    }

                    System.out.println("Digite quantos emails deseja adicionar? \n");
                    int quant = input.nextInt();

                    List<Email> email = new ArrayList();

                    for (int i = 0; i < quant; i++) {
                        System.out.println("Digite o email: \n");
                        String usuario = input.next();
                        System.out.println("Dominio: ");
                        String dominio = input.next();
                        System.out.println(" Descricao ");
                        String descricaoemail = input.next();
                        Email emails = new Email(usuario, dominio, descricaoemail);
                        email.add(emails);
                    }

                    System.out.println("Digite o endereco:");
                    System.out.println(" Rua:   ");
                    String rua = input.next();
                    System.out.println(" numero: ");
                    int numeroende = input.nextInt();
                    System.out.println(" Bairro: ");
                    String bairro = input.next();
                    System.out.println(" Cidade: ");
                    String cidade = input.next();
                    System.out.println("Nacionalidade: ");
                    String nacionalidade = input.next();
                    System.out.println("Codigo postal: ");
                    String codigopostal = input.next();

                    Endereco endereco = new Endereco(rua, numeroende, bairro, cidade, nacionalidade, codigopostal);

                    System.out.println("Digite a descricao: ");
                    String des = input.next();
                    listacontato.add(new Contato(nome, email, endereco, telefones, des));

                    break;

                case 2:

                    System.out.println("Digite o nome para a busca: ");
                    busca = input.next();

                    for (int i = 0; i < listacontato.size(); i++) {
                        String Nomee = listacontato.get(i).getNome().firstnome;
                        if (Nomee.equals(busca)) {
                            System.out.print("Nome: " + listacontato.get(i).getNome().firstnome);
                            System.out.print(" " + listacontato.get(i).getNome().middlenome);
                            System.out.print(" " + listacontato.get(i).getNome().lastnome);
                            System.out.println("\nTelefone: " + listacontato.get(i).getTelefone().toString());
                            System.out.println("Email: " + listacontato.get(i).getEmail().toString());
                            System.out.println("Endereco: " + listacontato.get(i).getEndereco().toString());
                        } else {
                            System.out.println("Nao encontrado!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Procure o numero do telefone: ");
                    int b = input.nextInt();
                    for (Contato contato : listacontato) {
                        for (Telefone telefone : contato.getTelefone()) {
                            if (b == telefone.numero) {
                                System.out.print("Nome: " + contato.nome.getFirstnome());
                                System.out.print(" " + contato.nome.getMiddlenome());
                                System.out.print(" " + contato.nome.getLastnome());
                                for (Telefone telefone2 : contato.getTelefone()) {
                                    System.out.println("Telefone: " + telefone2.toString());
                                }
                                for (Email emails : contato.getEmail()) {
                                    System.out.println("Email: " + emails.toString());
                                }
                                System.out.println("Endereco: " + contato.getEndereco().toString());
                            } else {
                                System.out.println(" Nao encontrado! ");
                            }
                        }
                    }

                    break;
                case 4:
                    System.out.println("Digite o email que deseja procurar?");
                    String be = input.next();
                    for (Contato contato : listacontato) {
                        for (Email emails : contato.getEmail()) {
                            if (be == emails.getUsuario()) {
                                System.out.print("Nome: " + contato.nome.getFirstnome());
                                System.out.print(" " + contato.nome.getMiddlenome());
                                System.out.print(" " + contato.nome.getLastnome());
                                for (Telefone telefone : contato.getTelefone()) {
                                    System.out.println("Telefone: " + telefone.toString());
                                }
                                for (Email emails2 : contato.getEmail()) {
                                    System.out.println("Email: " + emails2.toString());
                                }
                                System.out.println("Endereco: " + contato.getEndereco().toString());
                            } else {
                                System.out.println(" Nao encontrado! ");
                            }
                        }
                    }

                    break;

                case 5:

                    System.out.println("Qual nome vc deseja remover? ");
                    buscaa = input.next();

                    for (int i = 0; i < listacontato.size(); i++) {
                        String e = listacontato.get(i).getNome().firstnome;
                        System.out.println("mostra aquii");
                        if (e.equals(buscaa)) {
                            listacontato.remove(i);
                        } else {
                            System.out.println("Nao encontrado!");
                        }
                    }
                    break;

                case 6:

                    for (int i = 0; i < listacontato.size(); i++) {

                        System.out.println("Nome: " + listacontato.get(i).getNome().firstnome);
                        System.out.print(" " + listacontato.get(i).getNome().middlenome);
                        System.out.print(" " + listacontato.get(i).getNome().lastnome);
                        System.out.println("Telefone: " + listacontato.get(i).getTelefone().toString());
                        System.out.println("Email: " + listacontato.get(i).getEmail().toString());
                        System.out.println("Endereco: " + listacontato.get(i).getEndereco().toString());

                    }

                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        } while (opcao != 0);
    }
}
