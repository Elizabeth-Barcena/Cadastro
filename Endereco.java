package semi2;


public class Endereco {
    private String enderecocompleto;
    private String cidade;
    private String estado;
    private String cep;

    public String getEnderecocompleto() {
        return enderecocompleto;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public void setEnderecocompleto(String enderecocompleto) {
        this.enderecocompleto = enderecocompleto;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "enderecocompleto=" + enderecocompleto + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + '}';
    }

    public Endereco(String enderecocompleto, String cidade, String estado, String cep) {
        this.enderecocompleto = enderecocompleto;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    
    
}
