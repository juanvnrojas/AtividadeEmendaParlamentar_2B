import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {

        public static void main(String[] args) {
                List<Emenda> todasAsEmendas = new ArrayList<>();

                EmendaIndividual emendaIndividual1 = new EmendaIndividual(
                                2, // numero (EMENDA 2)
                                202539430002.0, // codigo
                                "Individual", // tipo
                                "ANDRE FERREIRA", // autoria
                                "PE", // ufAutoria
                                "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE", // objetivo
                                LocalDate.of(2025, 1, 1), // ano
                                "Transferências com Finalidade Definida" // tipoTransferencia
                );
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
                                14, // numero (EMENDA 14)
                                202471890014.0, // codigo
                                "De Bancada", // tipo
                                "BANCADA DE PERNAMBUCO", // autoria
                                "PE", // ufAutoria
                                "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ASSISTENCIA HOSPITALAR E AMBULATORIAL", // objetivo
                                LocalDate.of(2024, 1, 1), // ano
                                "http://site.gov.br/ata_bancada_pe_2024", // linkAta (exemplo)
                                "Deputado(a) Coordenador(a)" // parlamentarSugeriu (exemplo)
                );
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
                                1490, // numero (EMENDA 1490)
                                202081001490.0, // codigo
                                "De Relator", // tipo
                                "RELATOR GERAL", // autoria
                                "PE", // ufAutoria
                                "IMPLANTACAO DO PROJETO PUBLICO DE IRRIGACAO PONTAL", // objetivo
                                LocalDate.of(2020, 1, 1), // ano
                                "Parlamentar Indicador Exemplo", // parlamentarAutor (exemplo)
                                "Relator Geral Exemplo", // nomeRelator (exemplo)
                                "Associação de Produtores Rurais" // beneficiario (exemplo)
                );
                emendaRelator1.getDocumentosRelacionados().put("DOC1",
                                new Documento(LocalDate.of(2020, 3, 1), "Empenho", 8142957.79, "CODEVASF"));
                emendaRelator1.getDocumentosRelacionados().put("DOC2",
                                new Documento(LocalDate.of(2020, 7, 18), "Liquidação", 3974422.50, "CODEVASF"));
                emendaRelator1.getDocumentosRelacionados().put("DOC3",
                                new Documento(LocalDate.of(2020, 8, 10), "Pagamento", 3924658.67, "CODEVASF"));
                todasAsEmendas.add(emendaRelator1);

                System.out.println("\n\n============================================================");
                System.out.println("          RELATÓRIO GERAL DE EMENDAS CADASTRADAS");
                System.out.println("============================================================");

                for (Emenda emenda : todasAsEmendas) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println("Autoria: " + emenda.getAutoria() + " | Ano: " + emenda.getAno().getYear());
                        System.out.println("Tipo: " + emenda.getTipo());
                        System.out.println("Objetivo: " + emenda.getObjetivo());

                        if (emenda instanceof EmendaIndividual) {
                                EmendaIndividual ei = (EmendaIndividual) emenda;
                                System.out.println("Tipo de Transferência: " + ei.getTipoTransferencia());
                        } else if (emenda instanceof EmendaDeBancadas) {
                                EmendaDeBancadas eb = (EmendaDeBancadas) emenda;
                                System.out.println("Sugerida por: " + eb.getParlamentarSugeriu());
                                System.out.println("Assinaturas: " + eb.getAssinaturas().size());
                        } else if (emenda instanceof EmendaDeRelator) {
                                EmendaDeRelator er = (EmendaDeRelator) emenda;
                                System.out.println("Parlamentar Autor: " + er.getParlamentarAutor());
                                System.out.println("Nome do Relator: " + er.getNomeRelator());
                        } else if (emenda instanceof EmendaDeComissao) {
                                EmendaDeComissao ec = (EmendaDeComissao) emenda;
                                System.out.println("Sugerida por: " + ec.getParlamentarSugeriu());
                                System.out.println("Link da Comissão: " + ec.getLinkComissao());
                        }

                        System.out.printf("Valor Empenhado: R$ %,.2f\n", emenda.calcularValorPorFase("Empenho"));
                        System.out.printf("Valor Liquidado: R$ %,.2f\n", emenda.calcularValorPorFase("Liquidação"));
                        System.out.printf("Valor Pago: R$ %,.2f\n", emenda.calcularValorPorFase("Pagamento"));
                }
                System.out.println("\n------------------------------------------------------------");
                System.out.println("Total de emendas processadas: " + todasAsEmendas.size());
        }
}
