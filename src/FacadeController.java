/**
 * 
 * @author Thúlio Carvalho
 *
 */
public class FacadeController {
	
	private GeneralController gc;

	/** 1: Inicializar Sistema **/
	/**
	 * Inicializar o sistema com um valor e taxa (exemplo: 100000 e 0.01)
	 * 
	 * @param caixa
	 *            quantidade atual de dinheiro em centavos
	 * @param taxa
	 *            porcentagem a ser retirada de cada aposta perdedora
	 */
	public void inicializa(int caixa, double taxa) {
		gc = new GeneralController(caixa, taxa);
	}

	/**
	 * Recuperar o valor em caixa do sistema (em centavos).
	 * 
	 * @return valor em caixa
	 */
	public int getCaixa() {
		return gc.getCaixa();
	}

	/** 2: Cadastrar e Listar Cenários **/
	/**
	 * Cadastrar cenários e retornar a numeração do cenário cadastrado
	 * 
	 * @param descricao
	 *            descricao do cenário cadastrado
	 * @return numeração do cenário cadastrado
	 */
	public int cadastrarCenario(String descricao) {
		return 0;
	}

	/**
	 * Retornar a representação textual de um cenário (a partir da numeração)
	 * 
	 * @param cenario
	 *            numeração do cenário a ser analisado
	 * @return String da representação textual do cenário
	 */
	public String exibirCenario(int cenario) {
		return "";
	}

	/**
	 * Retornar a representação textual de todos os cenários cadastrados no sistema
	 * (um por linha, em ordem de cadastro).
	 * 
	 * @return String da representação textual de todos os cenários
	 */
	public String exibirCenarios() {
		return "";
	}

	/** 3: Cadastrar e Listar Apostas **/
	/**
	 * Cadastrar a aposta com nome do apostador, quantia apostada e previsão em um
	 * cenário através do número do cenário.
	 * 
	 * @param cenario
	 *            numeração do cenário
	 * @param apostador
	 *            nome do apostador
	 * @param valor
	 *            valor da aposta em centavos
	 * @param previsao
	 *            previsão da aposta: "VAI ACONTECER" ou "N VAI ACONTECER"
	 */
	public void cadastrarAposta(int cenario, String apostador, int valor, String previsao) {

	}

	/**
	 * Retornar o valor total das apostas feitas em um cenário.
	 * 
	 * @param cenario
	 *            numeração do cenário
	 * @return valor total das apostas no cenário
	 */
	public int valorTotalDeApostas(int cenario) {
		return 0;
	}

	/**
	 * Retornar o número de apostas feitas em um cenário.
	 * 
	 * @param cenario
	 *            numeração do cenário
	 * @return número total de apostas no cenário
	 */
	public int totalDeApostas(int cenario) {
		return 0;
	}

	/**
	 * Gerar a representação textual das apostas de um cenário (uma aposta por
	 * linha).
	 * 
	 * @param cenario
	 *            numeração do cenário
	 * @return String com a representação textual das apostas
	 */
	public String exibeApostas(int cenario) {
		return "";
	}

	/** 4: Fechar Apostas (Concretizar Cenário) **/
	/**
	 * Encerrar um cenário (indicando se ocorreu ou não).
	 * 
	 * @param cenario
	 *            numeração do cenário
	 * @param ocorreu
	 *            boolean que indica se ocorreu ou não: 1 para ocorreu, 0 para não
	 *            ocorreu.
	 * 
	 */
	public void fecharApostas(int cenario, boolean ocorreu) {

	}

	/**
	 * Retornar o valor total de um cenário encerrado que será destinado ao caixa.
	 * 
	 * @param cenario
	 *            numeração do cenário
	 * @return valor total do cenário que irá para o caixa
	 */
	public int getCaixaCenario(int cenario) {
		return 0;
	}

	/**
	 * Retornar o valor total de um cenário encerrado que será destinado a
	 * distribuição entre as apostas vencedoras
	 * 
	 * @param cenario
	 *            numeração do cenário
	 * @return valor total do cenário que irá para os vencedores
	 */
	public int getTotalRateioCenario(int cenario) {
		return 0;
	}
}
