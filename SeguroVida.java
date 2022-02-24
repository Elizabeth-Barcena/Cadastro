package semi2;


public class SeguroVida extends Seguro{
    String beneficiario;
    Data data;

    public String getBeneficiario() {
        return beneficiario;
    }

    public Data getData() {
        return data;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public SeguroVida(String beneficiario, Data data, int numApolice, String nome, Endereco endereco, float valor, float premio) {
        super(numApolice, nome, endereco, valor, premio);
        this.beneficiario = beneficiario;
        this.data = data;
    }

    
    @Override
    public String toString() {
        return "SeguroVida{" + "beneficiario=" + beneficiario + ", data=" + data + '}';
    }
    
    
}
