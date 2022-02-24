package semi2;



public abstract class Seguro {
    private int numApolice;
    private String nome;
    private Endereco endereco;
    private float valor;
    private float premio;

    public int getNumApolice() {
        return numApolice;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public float getValor() {
        return valor;
    }

    public float getPremio() {
        return premio;
    }

    public void setNumApolice(int numApolice) {
        this.numApolice = numApolice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setPremio(float premio) {
        this.premio = premio;
    }

    public Seguro(int numApolice, String nome, Endereco endereco, float valor, float premio) {
        this.numApolice = numApolice;
        this.nome = nome;
        this.endereco = endereco;
        this.valor = valor;
        this.premio = premio;
    }
    
    
    
    
}
