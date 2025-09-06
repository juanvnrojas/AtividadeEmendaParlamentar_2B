import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Emenda> todasAsEmendas = new ArrayList<>();

        EmendaIndividual emendaIndividual = new EmendaIndividual(
                6,
                202527180006.0,
                "Emenda Individual",
                "AUGUSTO COUTINHO",
                "PE",
                "PROMOCAO E DESENVOLVIMENTO DO PARADESPORTO NACIONAL",
                LocalDate.of(2025, 1, 1),
                "Transferências com Finalidade Definida"
        );
        emendaIndividual.getDocumentosRelacionados().put("2025NE000027",
                new Documento(LocalDate.of(2025, 7, 21), "EMPENHO", 98000.00, "ASSOCIACAO BEZERRENSE DE FUTSAL")
        );
        todasAsEmendas.add(emendaIndividual);

        EmendaDeBancadas emendaDeBancada = new EmendaDeBancadas(
                1,
                202171180001.0,
                "Emenda de Bancada",
                "BANCADA DE PERNAMBUCO",
                "PE",
                "APOIO A EXECUCAO DE ESTUDOS, PLANOS, PROJETOS E OBRAS DE PREVENCAO E PROTECAO A EROSAO COSTEIRA EM AREAS URBANIZADAS",
                LocalDate.of(2021, 1, 1),
                "https://www.congressonacional.leg.br/materias/atas",
                "Não se aplica (anterior a 2025)"
        );
        emendaDeBancada.adicionarAssinatura("Dep. Augusto Coutinho", "SOLIDARI/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Carlos Veras", "PT/PE");
        emendaDeBancada.adicionarAssinatura("Dep. André Ferreira", "PSC/PE");
        emendaDeBancada.adicionarAssinatura("Dep. André de Paula", "PSD/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Luciano Bivar", "PSL/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Sebastião Oliveira", "AVANTE/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Wolney Queiroz", "PDT/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Renildo Calheiros", "PCdoB/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Danilo Cabral", "PSB/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Pastor Eurico", "PATRIOTA/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Ossesio Silva", "REPUBLIC/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Marília Arraes", "PT/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Raul Henry", "MDB/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Eduardo da Fonte", "PP/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Felipe Carreras", "PSB/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Túlio Gadêlha", "PDT/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Gonzaga Patriota", "PSB/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Silvio Costa Filho", "REPUBLIC/PE");
        emendaDeBancada.adicionarAssinatura("Dep. Daniel Coelho", "CIDADANIA/PE");
        emendaDeBancada.getDocumentosRelacionados().put("2021NE000026",
                new Documento(LocalDate.of(2021, 7, 1), "EMPENHO", 1609495.00, "ESTADO DE PERNAMBUCO")
        );
        emendaDeBancada.getDocumentosRelacionados().put("2021NE000025",
                new Documento(LocalDate.of(2021, 7, 1), "EMPENHO", 18058526.00, "ESTADO DE PERNAMBUCO")
        );
        emendaDeBancada.getDocumentosRelacionados().put("2021NE000140",
                new Documento(LocalDate.of(2021, 12, 31), "EMPENHO", 557913.00, "ESTADO DE PERNAMBUCO")
        );
        emendaDeBancada.getDocumentosRelacionados().put("2025OB000212",
                new Documento(LocalDate.of(2025, 2, 17), "PAGAMENTO", 12525907.77, "ESTADO DE PERNAMBUCO")
        );
        todasAsEmendas.add(emendaDeBancada);
        
        EmendaDeRelator emendaDeRelator = new EmendaDeRelator(
                1490,
                202081001490.0,
                "Emenda de Relator",
                "RELATOR GERAL",
                "PE",
                "IMPLANTACAO DO PROJETO PUBLICO DE IRRIGACAO PONTAL",
                LocalDate.of(2020, 1, 1),
                "Não se aplica (anterior a 2025)",
                "Relator Geral",
                "Diverso - Ver documentos"
        );
        emendaDeRelator.getDocumentosRelacionados().put("2020NE440073",
                new Documento(LocalDate.of(2020, 7, 3), "EMPENHO", 8160149.00, "CONSTRUTORA CASSI LTDA")
        );
        emendaDeRelator.getDocumentosRelacionados().put("2020NE440107",
                new Documento(LocalDate.of(2020, 7, 30), "EMPENHO", 300000.00, "CONSTRUTORA CASSI LTDA")
        );
        emendaDeRelator.getDocumentosRelacionados().put("202008801457",
                new Documento(LocalDate.of(2020, 8, 28), "PAGAMENTO", 151564.00, "BANCO DO BRASIL SA")
        );
        emendaDeRelator.getDocumentosRelacionados().put("20200B801464",
                new Documento(LocalDate.of(2020, 8, 31), "PAGAMENTO", 6076.74, "BANCO DO BRASIL SA")
        );
        todasAsEmendas.add(emendaDeRelator);

        System.out.println("\n\n============================================================");
        System.out.println("                      RELATÓRIO GERAL DE EMENDAS CADASTRADAS");
        System.out.println("============================================================");

        for (Emenda emenda : todasAsEmendas) {
            emenda.imprimir();
        }
        
        System.out.println("\n------------------------------------------------------------");
        System.out.println("Total de emendas processadas: " + todasAsEmendas.size());
    }
}
