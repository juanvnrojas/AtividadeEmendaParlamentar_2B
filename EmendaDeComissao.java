import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmendaDeComissao extends Emenda {

    private String linkComissao;
    private List<AssinaturaP> parlamentaresComissao;
    private String linkRelatorioAtividades;
    private String parlamentarSugeriu;

    public EmendaDeComissao(int numero, double codigo, String tipo, String autoria, String ufAutoria, String objetivo,
            LocalDate ano, String linkComissao, String linkRelatorioAtividades, String parlamentarSugeriu) {
        super(numero, codigo, tipo, autoria, ufAutoria, objetivo, ano);

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
        AssinaturaP parlamentar = new AssinaturaP(nomeParlamentar, afiliacao);
        this.parlamentaresComissao.add(parlamentar);
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
}
