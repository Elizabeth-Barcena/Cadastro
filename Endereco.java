
public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String nacionalidade;
    String codigopostal;

    public Endereco(String rua, int numero, String bairro, String cidade, String nacionalidade, String codigopostal) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.nacionalidade = nacionalidade;
        this.codigopostal = codigopostal;
    }

    
    @Override
    public String toString() {
        return "endereco{" + "rua= " + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", nacionalidade=" + nacionalidade + ", codigopostal=" + codigopostal + '}';
    }
    
}
