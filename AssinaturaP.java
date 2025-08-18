public class AssinaturaP {
    private String parlamentar;
    private String afiliacao;

    public AssinaturaP(String parlamentar, String afiliacao) {
        this.parlamentar = parlamentar;
        this.afiliacao = afiliacao;
    }

    public String getParlamentar() {
        return parlamentar;
    }

    public void setParlamentar(String parlamentar) {
        this.parlamentar = parlamentar;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    @Override
    public String toString() {
        return "Parlamentar: " + parlamentar + " (" + afiliacao + ")";
    }

}
