
package sistemabancario;

import java.util.Objects;

public class Correntista {
   
    private String nome;
    private int senhaNumerica;

    public Correntista(String nome, int senhaNumerica) {
        this.nome = nome;
        this.senhaNumerica = senhaNumerica;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correntista that = (Correntista) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome);
    }
    
    public String getNome() {
        return nome;
    }
}
