import java.time.LocalDate;
import java.util.HashMap;

public abstract class Emenda {
    private int numero;
    private double codigo;
    private String tipo;
    private String autoria;
    private String ufAutoria;
    private String objetivo;
    private LocalDate ano;
    private HashMap<String, Documento> documentosRelacionados;
    private HashMap<String, Convenio> conveniosPossuidos;

    public Emenda(int numero, double codigo, String tipo, String autoria, String ufAutoria, String objetivo,
            LocalDate ano) {
        this.numero = numero;
        this.codigo = codigo;
        this.tipo = tipo;
        this.autoria = autoria;
        this.ufAutoria = ufAutoria;
        this.objetivo = objetivo;
        this.ano = ano;
        this.documentosRelacionados = new HashMap<>();
        this.conveniosPossuidos = new HashMap<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutoria() {
        return autoria;
    }

    public void setAutoria(String autoria) {
        this.autoria = autoria;
    }

    public String getUfAutoria() {
        return ufAutoria;
    }

    public void setUfAutoria(String ufAutoria) {
        this.ufAutoria = ufAutoria;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public HashMap<String, Documento> getDocumentosRelacionados() {
        return documentosRelacionados;
    }

    public void setDocumentosRelacionados(HashMap<String, Documento> documentosRelacionados) {
        this.documentosRelacionados = documentosRelacionados;
    }

    public HashMap<String, Convenio> getConveniosPossuidos() {
        return conveniosPossuidos;
    }

    public void setConveniosPossuidos(HashMap<String, Convenio> conveniosPossuidos) {
        this.conveniosPossuidos = conveniosPossuidos;
    }

    public double calcularValorPorFase(String fase) {
        double valorTotal = 0.0;

        for (Documento doc : this.documentosRelacionados.values()) {
            if (doc.getFase().equalsIgnoreCase(fase)) {
                valorTotal += doc.getValor();
            }
        }
        return valorTotal;
    }
}