package semi2;


public class SeguroCasa extends Seguro {
   private int deducaocasa;
   private int anoconstrucao;

    public int getDeducaocasa() {
        return deducaocasa;
    }

    public int getAnoconstrucao() {
        return anoconstrucao;
    }

    public void setDeducaocasa(int deducaocasa) {
        this.deducaocasa = deducaocasa;
    }

    public void setAnoconstrucao(int anoconstrucao) {
        this.anoconstrucao = anoconstrucao;
    }

    public SeguroCasa(int deducaocasa, int anoconstrucao, int numApolice, String nome, Endereco endereco, float valor, float premio) {
        super(numApolice, nome, endereco, valor, premio);
        this.deducaocasa = deducaocasa;
        this.anoconstrucao = anoconstrucao;
    }

    
    @Override
    public String toString() {
        return "SeguroCasa{" + "deducaocasa=" + deducaocasa + ", anoconstrucao=" + anoconstrucao + '}';
    }
    
    
    
}
