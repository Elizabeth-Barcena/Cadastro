
public class Telefone {
    int numero;
    int area;
    String descricao;

    public Telefone(int numero, int area, String descricao) {
        this.numero = numero;
        this.area = area;
        this.descricao = descricao;
    }
    

    public int getNumero() {
        return numero;
    }

    public int getArea() {
        return area;
    }

    public String getDescricao() {
        return descricao;
    }

   

    @Override
    public String toString() {
        return "Telefone{" + "numero=" + numero + ", area=" + area + ", descricao=" + descricao + '}';
    }
    
}
