package semi2;


public class SeguroAuto extends Seguro {
    private int deducaoautomovel;
    private int numlicenca;
    private String estado;
    private String modelo;
    private int ano;

    public int getDeducaoautomovel() {
        return deducaoautomovel;
    }

    public int getNumlicenca() {
        return numlicenca;
    }

    public String getEstado() {
        return estado;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setDeducaoautomovel(int deducaoautomovel) {
        this.deducaoautomovel = deducaoautomovel;
    }

    public void setNumlicenca(int numlicenca) {
        this.numlicenca = numlicenca;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public SeguroAuto(int deducaoautomovel, int numlicenca, String estado, String modelo, int ano, int numApolice, String nome, Endereco endereco, float valor, float premio) {
        super(numApolice, nome, endereco, valor, premio);
        this.deducaoautomovel = deducaoautomovel;
        this.numlicenca = numlicenca;
        this.estado = estado;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "SeguroAuto{" + "deducaoautomovel=" + deducaoautomovel + ", numlicenca=" + numlicenca + ", estado=" + estado + ", modelo=" + modelo + ", ano=" + ano + '}';
    }

    
    
   
    
    
}
