import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmendaDeBancadas extends Emenda {
    private List<AssinaturaP> assinaturas;
    private String linkAta;
    private String parlamentarSugeriu;

    public EmendaDeBancadas(int numero, double codigo, String tipo, String autoria, String ufAutoria, String objetivo,
            LocalDate ano, String linkAta, String parlamentarSugeriu) {
        super(numero, codigo, tipo, autoria, ufAutoria, objetivo, ano);

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
        AssinaturaP assinatura = new AssinaturaP(nomeParlamentar, afiliacao);
        this.assinaturas.add(assinatura);

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

}