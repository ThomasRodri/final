package challenge2.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import challenge2.model.Apolice;
import challenge2.model.AvaliacaoDeRiscos;
import challenge2.model.AvaliacaoSinistro;
import challenge2.model.Cliente;
import challenge2.model.CorretoraSeguro;
import challenge2.model.Funcionario;
import challenge2.model.GestorCliente;
import challenge2.model.PcdIdosoOutro;
import challenge2.model.Seguro;
import challenge2.model.Sinistro;

public class Inicializador {

	public static void main(String[] args) {

		Pattern novcpf = Pattern.compile(
				"[0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2}|[0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2}");
		Pattern novrg = Pattern.compile("(^\\d{1,2}).?(\\d{3}).?(\\d{3})-?(\\d{1}|X|x$)");
		Pattern novnumeroDeContato = Pattern.compile("^[0-9]{2}(\\s|-)?9?[0-9]{4}-?[0-9]{4}$");

		String novnome = null, nomecorre = null, aux, endereco = null, enderecocorre = null, desc = null, danos = null,
				saude = null, veiculoipcd = null, doc = null, act = null, portoSeguroTelefone = "0800-727-2766",
				planos = null, cobertura = null, planospcd = null, historico = null, exames = null, laudo = null;
		int opcao, codigo = 123456, novidade, clientepresente = 0, novos = 0, cliente = 0, contato = 0, numapo = 0,
				valor = 0;
		float preju = 0, riscovalor = 0;
		Boolean cpfBoo, rgBoo, telBoo, nonBoo, localizaBoo, pcd, decisao = false, reembo = false;
		LocalDate data = null, startapolice = null, fimapolice = null;
		String cpfUsuario = ""; // Variável para armazenar o CPF do usuário

		try {
			nonBoo = true;
			while (nonBoo) {
				novnome = JOptionPane.showInputDialog("Digite seu nome: ");
				if (novnome == null) {
					return;
				} else if (novnome.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Você precisa digitar seu nome.");
				} else {
					nonBoo = false;
				}
			}

			cpfBoo = true;
			while (cpfBoo) {
				aux = JOptionPane.showInputDialog("Digite seu CPF: ");
				if (aux == null) {
					return;
				} else if (novcpf.matcher(aux).matches()) {
					JOptionPane.showMessageDialog(null, "CPF válido");
					cpfUsuario = aux; // Armazena o CPF para validação futura
					cpfBoo = false;
				} else {
					JOptionPane.showMessageDialog(null, "CPF inválido");
				}
			}

			rgBoo = true;
			while (rgBoo) {
				aux = JOptionPane.showInputDialog("Digite seu RG: ");
				if (aux == null) {
					return;
				} else if (novrg.matcher(aux).matches()) {
					JOptionPane.showMessageDialog(null, "RG válido");
					rgBoo = false;
				} else {
					JOptionPane.showMessageDialog(null, "RG inválido");
				}
			}

			telBoo = true;
			while (telBoo) {
				aux = JOptionPane.showInputDialog("Digite seu número de telefone: ");
				if (aux == null) {
					return;
				} else if (novnumeroDeContato.matcher(aux).matches()) {
					JOptionPane.showMessageDialog(null, "Telefone válido");
					telBoo = false;
				} else {
					JOptionPane.showMessageDialog(null, "Telefone inválido");
				}
			}

			aux = JOptionPane.showInputDialog("Digite sua idade: ");
			if (aux == null) {
				return;
			}
			novidade = Integer.parseInt(aux);

			while (true) {
				aux = JOptionPane.showInputDialog("Você é PcD (Pessoa com Deficiência)?");
				if (aux == null) {
					return;
				} else if (aux.equalsIgnoreCase("Sim")) {
					pcd = true;
					localizaBoo = true;
					while (localizaBoo) {
						endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
						if (endereco == null) {
							return;
						} else if (endereco.trim().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Você precisa digitar seu endereço.");
						} else {
							localizaBoo = false;
						}
					}
					break;
				} else if (aux.equalsIgnoreCase("Não") || aux.equalsIgnoreCase("Nao")) {
					pcd = false;
					localizaBoo = true;
					while (localizaBoo) {
						endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
						if (endereco == null) {
							return;
						} else if (endereco.trim().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Você precisa digitar seu endereço.");
						} else {
							localizaBoo = false;
						}
					}
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Digite 'Sim' ou 'Não'.");
				}
			}
			clientepresente = 1;

			Cliente clientela = new Cliente();
			clientela.setNome(novnome);
			clientela.setCpf(novcpf);
			clientela.setRg(novrg);
			clientela.setNumeroDeContato(novnumeroDeContato);
			clientela.setIdade(novidade);

			Sinistro si = new Sinistro();
			si.setDataDoSinistro(data);
			si.setAvaliacaoDeDanos(danos);

			AvaliacaoSinistro avasini = new AvaliacaoSinistro();
			avasini.setDocumentacao(doc);
			avasini.setAcoesRecomendadas(act);
			avasini.setDecisaoDaCobertura(decisao);
			avasini.setValorDoPrejuizo(preju);
			avasini.setDescricaoDoSinistro(desc);

			AvaliacaoDeRiscos pcdIdoso = new AvaliacaoDeRiscos();
			pcdIdoso.setAnaliseSaude(saude);
			pcdIdoso.setAvaliacaoVeiculoClienteEsp(veiculoipcd);

			PcdIdosoOutro pi = new PcdIdosoOutro();
			pi.setconfirmaPcd(pcd);
			pi.setExames(exames);
			pi.setHistoricoMedico(historico);
			pi.setLaudoDeComprovacao(laudo);
			pi.setRiscoClienteValor(riscovalor);

			GestorCliente gstcli = new GestorCliente();
			gstcli.setClientePresente(clientepresente);
			gstcli.setCliente(cliente);
			gstcli.setClientesNovos(novos);

			CorretoraSeguro corretora = new CorretoraSeguro();
			corretora.setContatoCorretora(contato);
			corretora.setEnderecoCorretora(enderecocorre);
			corretora.setNomeCorretora(nomecorre);

			Seguro porto = new Seguro();
			porto.setNumeroDeContado(portoSeguroTelefone);
			porto.setCoberturasIncluidas(cobertura);
			porto.setPlanosParaClientesEspeciais(planospcd);
			porto.setTipoPlanosSeguro(planos);

			Apolice apo = new Apolice();
			apo.setDataDeInicio(startapolice);
			apo.setDataDeTermino(fimapolice);
			apo.setNumeroDaApolice(numapo);
			apo.setReembolso(reembo);
			apo.setValorDoSeguro(valor);

			Funcionario func = new Funcionario();
			func.setCodigo(codigo);

			while (true) {
				aux = JOptionPane.showInputDialog("Bem-vindo, " + novnome + ". Escolha uma das opções abaixo: "
						+ "\n1 - Avaliar Sinistro." + "\n2 - Avaliar Riscos (Apenas Idosos 60+ e/ou PcD)."
						+ "\n3 - Verificar Apólice." + "\n4 - Verificar Seguro." + "\n5 - Sair.\n"
						+ "\n6 - Gerir clientes (Apenas Funcionários).");
				if (aux == null) {
					JOptionPane.showMessageDialog(null, "Operação cancelada.");
					break;
				}
				try {
					opcao = Integer.parseInt(aux);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
					continue;
				}

				switch (opcao) {
				case 1:
					desc = JOptionPane.showInputDialog("Escreva o tipo de sinistro ocorrido: ");
					if (desc == null) {
						JOptionPane.showMessageDialog(null, "Operação cancelada.");
						break;
					}
					aux = JOptionPane.showInputDialog(
							"Tipo: " + desc + "\nEscreva em que dia, mês e ano ocorreu o sinistro: dd/MM/yyyy");
					if (aux == null) {
						JOptionPane.showMessageDialog(null, "Operação cancelada.");
						break;
					}
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					try {
						data = LocalDate.parse(aux, formatter);
					} catch (DateTimeParseException e) {
						JOptionPane.showMessageDialog(null,
								"Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
						continue;
					}
					danos = JOptionPane
							.showInputDialog("Tipo: " + desc + "\nData: " + data + "\nAvalie o dano do prejuízo:"
									+ "\n1 - Perda Total (Aniquilação do carro, Furtos ou Roubos)" + "\n2 - Grande"
									+ "\n3 - Média" + "\n4 - Pequena");
					if (danos == null) {
						JOptionPane.showMessageDialog(null, "Operação cancelada.");
						break;
					}
					switch (Integer.parseInt(danos)) {
					case 1:
						while (true) {
							aux = JOptionPane.showInputDialog("Deseja acionar a seguradora? (Sim/Não)");
							if (aux == null) {
								JOptionPane.showMessageDialog(null, "Operação cancelada.");
								break;
							} else if (aux.equalsIgnoreCase("Sim")) {
								decisao = true;
								while (true) {
									aux = JOptionPane.showInputDialog("Digite o valor do prejuízo: ");
									if (aux == null) {
										JOptionPane.showMessageDialog(null, "Operação cancelada.");
										break;
									}
									try {
										preju = Float.parseFloat(aux);
										doc = JOptionPane.showInputDialog(
												"A partir desse momento, dependendo da sua escolha entraremos em contato para a execução da documentação.\n"
														+ "\nDeseja continuar? (Sim/Não)");
										if (doc == null) {
											JOptionPane.showMessageDialog(null, "Operação cancelada.");
											break;
										} else if (doc.equalsIgnoreCase("Sim")) {
											JOptionPane.showMessageDialog(null,
													"Certo, entraremos em contato assim que pudermos.");
											break;
										} else if (doc.equalsIgnoreCase("Não") || doc.equalsIgnoreCase("Nao")) {
											JOptionPane.showMessageDialog(null, "Certo, encerraremos o processo.");
											break;
										} else {
											JOptionPane.showMessageDialog(null, "Por favor, digite 'Sim' ou 'Não'");
										}
									} catch (NumberFormatException e) {
										JOptionPane.showMessageDialog(null,
												"Valor inválido. Por favor, insira um número válido.");
									}
								}
								break;
							} else if (aux.equalsIgnoreCase("Não") || aux.equalsIgnoreCase("Nao")) {
								JOptionPane.showMessageDialog(null, "Ok! Tenha um ótimo dia.");
								break;
							} else {
								JOptionPane.showMessageDialog(null, "Por favor, digite 'Sim' ou 'Não'");
							}
						}
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida.");
						break;
					}
					break;
				case 2:
					if (novidade >= 60 || pcd == true) {
						while (true) {
							if (novidade >= 60) {
								while (true) {
									saude = JOptionPane.showInputDialog("Escreva como está sua saúde física: ");
									if (saude == null) {
										JOptionPane.showMessageDialog(null, "Operação cancelada.");
										break;
									} else if (saude.trim().isEmpty()) {
										JOptionPane.showMessageDialog(null, "Por favor, digite sua saúde.");
										continue;
									}
									veiculoipcd = JOptionPane.showInputDialog(
											"Insira de acordo com o número qual veiculo você tem: " + "\n 1 - Carro"
													+ "\n 2 - Moto" + "\n 3 - Caminhão" + "\n 4 - Outros.");
									if (veiculoipcd == null) {
										JOptionPane.showMessageDialog(null, "Operação cancelada.");
										break;
									} else if (veiculoipcd.trim().isEmpty()) {
										JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
										continue;
									}
									aux = JOptionPane.showInputDialog(
											"Deseja que entremos em contato para recomendarmos ações para fazer?");
									if (aux == null) {
										JOptionPane.showMessageDialog(null, "Operação cancelada.");
										break;
									} else if (aux.equalsIgnoreCase("Sim")) {
										JOptionPane.showMessageDialog(null, "Certo, obrigado pelas informações "
												+ novnome + ", Iremos avaliar sua situação e entraremos em contato.");
										break;
									} else if (aux.equalsIgnoreCase("Não") || aux.equalsIgnoreCase("Nao")) {
										JOptionPane.showMessageDialog(null,
												"Certo, validamos suas informações " + novnome + ", Obrigado!");
										break;
									} else {
										JOptionPane.showMessageDialog(null, "Por favor, digite 'Sim' ou 'Não'");
									}
								}
								break;
							} else if (pcd) {
								while (true) {
									saude = JOptionPane.showInputDialog("Escreva qual é sua doença portadora: ");
									if (saude == null) {
										JOptionPane.showMessageDialog(null, "Operação cancelada.");
										break;
									} else if (saude.trim().isEmpty()) {
										JOptionPane.showMessageDialog(null,
												"Não iremos te julgar, então por favor, digite sua doença portadora.");
										continue;
									}
									veiculoipcd = JOptionPane.showInputDialog(
											"Insira de acordo com o número qual veiculo você tem: " + "\n 1 - Carro"
													+ "\n 2 - Moto" + "\n 3 - Caminhão" + "\n 4 - Outros.");
									if (veiculoipcd == null) {
										JOptionPane.showMessageDialog(null, "Operação cancelada.");
										break;
									} else if (veiculoipcd.trim().isEmpty()) {
										JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
										continue;
									}
									aux = JOptionPane.showInputDialog(
											"Deseja que entremos em contato para recomendarmos ações para fazer?");
									if (aux == null) {
										JOptionPane.showMessageDialog(null, "Operação cancelada.");
										break;
									} else if (aux.equalsIgnoreCase("Sim")) {
										JOptionPane.showMessageDialog(null, "Certo, obrigado pelas informações "
												+ novnome + ", Iremos avaliar sua situação e entraremos em contato.");
										break;
									} else if (aux.equalsIgnoreCase("Não") || aux.equalsIgnoreCase("Nao")) {
										JOptionPane.showMessageDialog(null,
												"Certo, validamos suas informações " + novnome + ", Obrigado!");
										break;
									} else {
										JOptionPane.showMessageDialog(null, "Por favor, digite 'Sim' ou 'Não'");
									}
								}
								break;
							} else {
								JOptionPane.showMessageDialog(null, "Você não se encaixa nos filtros requisitados.");
								break;
							}
						}
					} else {
						JOptionPane.showMessageDialog(null, "Você não se encaixa nos filtros requisitados.");
					}
					break;
				case 3:
				case 4:
					String nomeValida = JOptionPane.showInputDialog("Digite seu nome para verificação:");
					if (nomeValida == null || !nomeValida.equals(novnome)) {
						JOptionPane.showMessageDialog(null, "Nome não confere. Operação cancelada.");
						break;
					}

					String cpfValida = JOptionPane.showInputDialog("Digite seu CPF para verificação:");
					if (cpfValida == null || !cpfValida.equals(cpfUsuario)) {
						JOptionPane.showMessageDialog(null, "CPF não confere. Operação cancelada.");
						break;
					}

					if (opcao == 3) {
						JOptionPane.showMessageDialog(null,
								"Iremos entrar em contato e marcaremos a data para realizar o preenchimento da Apólice.");
					} else {
						JOptionPane.showMessageDialog(null, "Status: Nenhum seguro feito."
								+ "\n Contate a porto por meio deste número de telefone: " + portoSeguroTelefone);
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Obrigado por usar nosso programa! Boa tarde.");
					return;
				case 6:
					aux = JOptionPane.showInputDialog("Coloque o código:");
					if (aux == null) {
						JOptionPane.showMessageDialog(null, "Operação cancelada.");
						break;
					} else if (aux.equals("123456")) {
						aux = JOptionPane.showInputDialog("Número de clientes: " + gstcli.ClientePresente() + "\n"
								+ "\nDeseja adicionar ou excluir cliente(s)?" + "\n 1 - Adicionar" + "\n 2 - Excluir");
						if (aux == null) {
							JOptionPane.showMessageDialog(null, "Operação cancelada.");
							break;
						}
						switch (Integer.parseInt(aux)) {
						case 1:
							JOptionPane.showMessageDialog(null,
									"Número de clientes: " + (gstcli.ClientePresente() + 1));
							break;
						case 2:
							JOptionPane.showMessageDialog(null,
									"Número de clientes: " + (gstcli.ClientePresente() - 1));
							break;
						default:
							JOptionPane.showMessageDialog(null, "Digite '1' ou '2'.");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Acesso negado.");
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
		}
	}
}
