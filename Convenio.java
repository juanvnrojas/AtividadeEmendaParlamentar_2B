import java.time.LocalDate;

public class Convenio {
    private LocalDate dataC;
    private String convenente;
    private String objeto;
    private int numeroC;
    private double valorC;

    public LocalDate getDataC() {
        return dataC;
    }

    public void setDataC(LocalDate dataC) {
        this.dataC = dataC;
    }

    public String getConvenente() {
        return convenente;
    }

    public void setConvenente(String convenente) {
        this.convenente = convenente;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    public double getValorC() {
        return valorC;
    }

    public void setValorC(double valorC) {
        this.valorC = valorC;
    }
}
