import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {

        public static void main(String[] args) {
                List<Emenda> todasAsEmendas = new ArrayList<>();

                EmendaIndividual emendaIndividual1 = new EmendaIndividual(
                                2, 202539430002.0, "Individual", "ANDRE FERREIRA", "PE",
                                "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE",
                                LocalDate.of(2025, 1, 1), "Transferências com Finalidade Definida");
                emendaIndividual1.getDocumentosRelacionados().put("DOC1",
                                new Documento(LocalDate.of(2025, 3, 15), "Empenho", 18063994.00,
                                                "Fundo Municipal de Saúde"));
                emendaIndividual1.getDocumentosRelacionados().put("DOC2",
                                new Documento(LocalDate.of(2025, 6, 20), "Liquidação", 16123000.00,
                                                "Fundo Municipal de Saúde"));
                emendaIndividual1.getDocumentosRelacionados().put("DOC3",
                                new Documento(LocalDate.of(2025, 7, 5), "Pagamento", 16123000.00,
                                                "Fundo Municipal de Saúde"));
                todasAsEmendas.add(emendaIndividual1);

                EmendaDeBancadas emendaBancada1 = new EmendaDeBancadas(
                                14, 202471890014.0, "De Bancada", "BANCADA DE PERNAMBUCO", "PE",
                                "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ASSISTENCIA HOSPITALAR E AMBULATORIAL",
                                LocalDate.of(2024, 1, 1), "http://site.gov.br/ata_bancada_pe_2024",
                                "Deputado(a) Coordenador(a)");
                emendaBancada1.adicionarAssinatura("Deputado Fictício A", "Partido X");
                emendaBancada1.adicionarAssinatura("Senadora Fictícia B", "Partido Y");
                emendaBancada1.adicionarAssinatura("Deputada Fictícia C", "Partido Z");
                emendaBancada1.getDocumentosRelacionados().put("DOC1",
                                new Documento(LocalDate.of(2024, 2, 10), "Empenho", 5120000.00,
                                                "Secretaria Estadual de Saúde"));
                emendaBancada1.getDocumentosRelacionados().put("DOC2",
                                new Documento(LocalDate.of(2024, 5, 15), "Liquidação", 4940000.00,
                                                "Secretaria Estadual de Saúde"));
                emendaBancada1.getDocumentosRelacionados().put("DOC3",
                                new Documento(LocalDate.of(2024, 6, 1), "Pagamento", 4940000.00,
                                                "Secretaria Estadual de Saúde"));
                todasAsEmendas.add(emendaBancada1);

                EmendaDeRelator emendaRelator1 = new EmendaDeRelator(
                                1490, 202081001490.0, "De Relator", "RELATOR GERAL", "PE",
                                "IMPLANTACAO DO PROJETO PUBLICO DE IRRIGACAO PONTAL", LocalDate.of(2020, 1, 1),
                                "Parlamentar Indicador Exemplo", "Relator Geral Exemplo",
                                "Associação de Produtores Rurais");
                emendaRelator1.getDocumentosRelacionados().put("DOC1",
                                new Documento(LocalDate.of(2020, 3, 1), "Empenho", 8142957.79, "CODEVASF"));
                emendaRelator1.getDocumentosRelacionados().put("DOC2",
                                new Documento(LocalDate.of(2020, 7, 18), "Liquidação", 3974422.50, "CODEVASF"));
                emendaRelator1.getDocumentosRelacionados().put("DOC3",
                                new Documento(LocalDate.of(2020, 8, 10), "Pagamento", 3924658.67, "CODEVASF"));
                todasAsEmendas.add(emendaRelator1);

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
