import java.time.LocalDate;

public class EmendaDeRelator extends Emenda {
    private String parlamentarAutor;
    private String nomeRelator;
    private String beneficiario;

    public EmendaDeRelator(int numero, double codigo, String tipo, String autoria, String ufAutoria, String objetivo,
            LocalDate ano, String parlamentarAutor, String nomeRelator, String beneficiario) {
        super(numero, codigo, tipo, autoria, ufAutoria, objetivo, ano);

        this.parlamentarAutor = parlamentarAutor;
        this.nomeRelator = nomeRelator;
        this.beneficiario = beneficiario;
    }

    public String getParlamentarAutor() {
        return parlamentarAutor;
    }

    public void setParlamentarAutor(String parlamentarAutor) {
        this.parlamentarAutor = parlamentarAutor;
    }

    public String getNomeRelator() {
        return nomeRelator;
    }

    public void setNomeRelator(String nomeRelator) {
        this.nomeRelator = nomeRelator;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
}
