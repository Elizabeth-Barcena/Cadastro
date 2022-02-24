
public class Email {
    String usuario;
    String dominio;
    String descricaoemail;

    public Email(String usuario, String dominio, String descricao) {
        this.usuario = usuario;
        this.dominio = dominio;
        this.descricaoemail = descricao;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getDominio() {
        return dominio;
    }

    public String getDescricao() {
        return descricaoemail;
    }

    
    @Override
    public String toString() {
        return "Email{" + "usuario=" + usuario + ", Dominio=" + dominio + ", descricao=" + descricaoemail + '}';
    }
    
}
