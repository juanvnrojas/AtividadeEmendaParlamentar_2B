import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmendaDeBancadas extends Emenda {
    private List<AssinaturaP> assinaturas;
    private String linkAta;
    private String parlamentarSugeriu;

    public EmendaDeBancadas(int numero, double codigo, String tipo, String autoria, String estadoAutoria,
            String objetivo,
            LocalDate ano, String linkAta, String parlamentarSugeriu) {
        super(numero, codigo, tipo, autoria, estadoAutoria, objetivo, ano);
        this.assinaturas = new ArrayList<>();
        this.linkAta = linkAta;
        this.parlamentarSugeriu = parlamentarSugeriu;
    }

    public List<AssinaturaP> getAssinaturas() {
        return assinaturas;
    }

    public void setAssinaturas(List<AssinaturaP> assinaturas) {
        this.assinaturas = assinaturas;
    }

    public void adicionarAssinatura(String nomeParlamentar, String afiliacao) {
        this.assinaturas.add(new AssinaturaP(nomeParlamentar, afiliacao));
    }

    public String getLinkAta() {
        return linkAta;
    }

    public void setLinkAta(String linkAta) {
        this.linkAta = linkAta;
    }

    public String getParlamentarSugeriu() {
        return parlamentarSugeriu;
    }

    public void setParlamentarSugeriu(String parlamentarSugeriu) {
        this.parlamentarSugeriu = parlamentarSugeriu;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Sugerida por: " + getParlamentarSugeriu());
        System.out.println("Assinaturas: " + getAssinaturas().size());
        System.out.printf("Valor Empenhado: R$ %,.2f\n", calcularValorPorFase("Empenho"));
        System.out.printf("Valor Liquidado: R$ %,.2f\n", calcularValorPorFase("Liquidação"));
        System.out.printf("Valor Pago: R$ %,.2f\n", calcularValorPorFase("Pagamento"));
    }
}
