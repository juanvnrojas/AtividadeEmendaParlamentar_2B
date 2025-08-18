import java.time.LocalDate;

public class EmendaIndividual extends Emenda {
    private String tipoTransferencia;

    public EmendaIndividual(int numero, double codigo, String tipo, String autoria, String ufAutoria, String objetivo,
            LocalDate ano, String tipoTransferencia) {
        super(numero, codigo, tipo, autoria, ufAutoria, objetivo, ano);
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }
}
