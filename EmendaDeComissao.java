import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmendaDeComissao extends Emenda {

    private String linkComissao;
    private List<AssinaturaP> parlamentaresComissao;
    private String linkRelatorioAtividades;
    private String parlamentarSugeriu;

    public EmendaDeComissao(int numero, double codigo, String tipo, String autoria, String estadoAutoria,
            String objetivo,
            LocalDate ano, String linkComissao, String linkRelatorioAtividades, String parlamentarSugeriu) {
        super(numero, codigo, tipo, autoria, estadoAutoria, objetivo, ano);
        this.linkComissao = linkComissao;
        this.linkRelatorioAtividades = linkRelatorioAtividades;
        this.parlamentarSugeriu = parlamentarSugeriu;
        this.parlamentaresComissao = new ArrayList<>();
    }

    public List<AssinaturaP> getParlamentaresComissao() {
        return parlamentaresComissao;
    }

    public void setParlamentaresComissao(List<AssinaturaP> parlamentaresComissao) {
        this.parlamentaresComissao = parlamentaresComissao;
    }

    public void adicionarParlamentar(String nomeParlamentar, String afiliacao) {
        this.parlamentaresComissao.add(new AssinaturaP(nomeParlamentar, afiliacao));
    }

    public String getLinkComissao() {
        return linkComissao;
    }

    public void setLinkComissao(String linkComissao) {
        this.linkComissao = linkComissao;
    }

    public String getLinkRelatorioAtividades() {
        return linkRelatorioAtividades;
    }

    public void setLinkRelatorioAtividades(String linkRelatorioAtividades) {
        this.linkRelatorioAtividades = linkRelatorioAtividades;
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
        System.out.println("Link da Comissão: " + getLinkComissao());
        System.out.printf("Valor Empenhado: R$ %,.2f\n", calcularValorPorFase("Empenho"));
        System.out.printf("Valor Liquidado: R$ %,.2f\n", calcularValorPorFase("Liquidação"));
        System.out.printf("Valor Pago: R$ %,.2f\n", calcularValorPorFase("Pagamento"));
    }
}
