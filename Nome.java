
public class Nome {
    String firstnome;
    String lastnome;
    String middlenome;

    public String getFirstnome() {
        return firstnome;
    }
    public String getMiddlenome() {
        return middlenome;
    }
    public String getLastnome() {
        return lastnome;
    }

    

    public Nome(String firstnome, String middlenome, String lastnome) {
        this.firstnome = firstnome;
        this.middlenome = middlenome;
        this.lastnome = lastnome;
        
    }
    

    @Override
    public String toString() {
        //return "Nome{" + "firstnome=" + firstnome + ", lastnome=" + lastnome + ", middlenome=" + middlenome + '}';
        return firstnome + " " + middlenome + " " + lastnome;
    }
    
}
