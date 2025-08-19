import java.time.LocalDate;

public class EmendaDeRelator extends Emenda {
    private String parlamentarAutor;
    private String nomeRelator;
    private String beneficiario;

    public EmendaDeRelator(int numero, double codigo, String tipo, String autoria, String estadoAutoria,
            String objetivo,
            LocalDate ano, String parlamentarAutor, String nomeRelator, String beneficiario) {
        super(numero, codigo, tipo, autoria, estadoAutoria, objetivo, ano);
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

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Parlamentar Autor: " + getParlamentarAutor());
        System.out.println("Nome do Relator: " + getNomeRelator());
        System.out.printf("Valor Empenhado: R$ %,.2f\n", calcularValorPorFase("Empenho"));
        System.out.printf("Valor Liquidado: R$ %,.2f\n", calcularValorPorFase("Liquidação"));
        System.out.printf("Valor Pago: R$ %,.2f\n", calcularValorPorFase("Pagamento"));
    }
}
