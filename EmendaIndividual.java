import java.time.LocalDate;

public class EmendaIndividual extends Emenda {
    private String tipoTransferencia;

    public EmendaIndividual(int numero, double codigo, String tipo, String autoria, String estadoAutoria,
            String objetivo,
            LocalDate ano, String tipoTransferencia) {
        super(numero, codigo, tipo, autoria, estadoAutoria, objetivo, ano);
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de Transferência: " + getTipoTransferencia());
        System.out.printf("Valor Empenhado: R$ %,.2f\n", calcularValorPorFase("Empenho"));
        System.out.printf("Valor Liquidado: R$ %,.2f\n", calcularValorPorFase("Liquidação"));
        System.out.printf("Valor Pago: R$ %,.2f\n", calcularValorPorFase("Pagamento"));
    }
}
