import java.time.LocalDate;

public class Documento {
    private LocalDate dataD;
    private String fase;
    private double valor;
    private String beneficiario;

    public Documento(LocalDate dataD, String fase, double valor, String beneficiario) {
        this.dataD = dataD;
        this.fase = fase;
        this.valor = valor;
        this.beneficiario = beneficiario;
    }

    public LocalDate getDataD() {
        return dataD;
    }

    public void setDataD(LocalDate dataD) {
        this.dataD = dataD;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
}
