import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReservaHospedagem extends Reserva{

    private String telefone_contato_hospede_responsavel;
    private int precoDiaria;
    private int numQuarto;
    private String endereco;
    private String nome_do_estabelecimento_da_hospedagem;
    private int numero_de_noites;
    private int numeros_de_quartos_reservados;
    private String cidade;
    private String pais;

    private LocalDate checkin;
    private LocalDate checkout;
    // classe responsável por formatar um padrão diferente do formato ISO
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private ArrayList<String> refeiçoes_inclusas;
    private ArrayList<String> aereas_da_lazer;
    private int valor_diaria_estacionamento;

    public ReservaHospedagem(String nome_responsavel, String email_responsavel, int numero_de_adultos, int numero_de_criancas, int numero_de_bebes, String telefone_contato_hospede_responsavel, int precoDiaria, int numQuarto, String endereco, String nome_do_estabelecimento_da_hospedagem, int numero_de_noites, String cidade, String pais, CharSequence checkin, CharSequence checkout) {
        super(nome_responsavel, email_responsavel, numero_de_adultos, numero_de_criancas, numero_de_bebes);
        this.telefone_contato_hospede_responsavel = telefone_contato_hospede_responsavel;
        this.precoDiaria = precoDiaria;
        this.numQuarto = numQuarto;
        this.endereco = endereco;
        this.nome_do_estabelecimento_da_hospedagem = nome_do_estabelecimento_da_hospedagem;
        this.numero_de_noites = numero_de_noites;
        this.cidade = cidade;
        this.pais = pais;
        this.checkin = LocalDate.parse(checkin, formatter);
        this.checkout = LocalDate.parse(checkout, formatter);

    }

    public void adicionando_refeicao(String refeicao) {
        refeiçoes_inclusas.add(refeicao);
    }
    public void imprimindo_refeicoes(){

        System.out.println("As refeicoes disponíveis para o hospede são:"+refeiçoes_inclusas.toString());

    }
    public void adicionando_areas_lazer(String area_lazer){
        aereas_da_lazer.add(aereas_da_lazer);
    }

   public void imprimindo_aereas_lazer(){
       System.out.println("Aereas de lazer disponivel ao hospede são:"+aereas_da_lazer.toString());
   }



    @Override
    public void Duracao() {
        long duracao = checkout.toEpochDay() - checkin.toEpochDay();
        System.out.println("A duração da hospedagem em dias é: " + duracao);


    }
    //preço da diaria vezes a duração da viagem
    @Override
    public void ValorTotal() {
        int calculo_inicial=getNumero_de_bebes()+getNumero_de_adultos()+getNumero_de_criancas()*precoDiaria;
        int calculo_final=calculo_inicial*numero_de_noites;
        System.out.println("O valor total da reserva:"+ calculo_final);


    }

    public String getTelefone_contato_hospede_responsavel() {
        return telefone_contato_hospede_responsavel;
    }

    public void setTelefone_contato_hospede_responsavel(String telefone_contato_hospede_responsavel) {
        this.telefone_contato_hospede_responsavel = telefone_contato_hospede_responsavel;
    }

    public int getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(int precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome_do_estabelecimento_da_hospedagem() {
        return nome_do_estabelecimento_da_hospedagem;
    }

    public void setNome_do_estabelecimento_da_hospedagem(String nome_do_estabelecimento_da_hospedagem) {
        this.nome_do_estabelecimento_da_hospedagem = nome_do_estabelecimento_da_hospedagem;
    }

    public int getNumero_de_noites() {
        return numero_de_noites;
    }

    public void setNumero_de_noites(int numero_de_noites) {
        this.numero_de_noites = numero_de_noites;
    }

    public int getNumeros_de_quartos_reservados() {
        return numeros_de_quartos_reservados;
    }

    public void setNumeros_de_quartos_reservados(int numeros_de_quartos_reservados) {
        this.numeros_de_quartos_reservados = numeros_de_quartos_reservados;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }


    public ArrayList<String> getRefeiçoes_inclusas() {
        return refeiçoes_inclusas;
    }

    public void setRefeiçoes_inclusas(ArrayList<String> refeiçoes_inclusas) {
        this.refeiçoes_inclusas = refeiçoes_inclusas;
    }

    public ArrayList<String> getAereas_da_lazer() {
        return aereas_da_lazer;
    }

    public void setAereas_da_lazer(ArrayList<Object> aereas_da_lazer) {
        this.aereas_da_lazer = aereas_da_lazer;
    }

    public int getValor_diaria_estacionamento() {
        return valor_diaria_estacionamento;
    }

    public void setValor_diaria_estacionamento(int valor_diaria_estacionamento) {
        this.valor_diaria_estacionamento = valor_diaria_estacionamento;
    }
    public void Uso_do_estacionamento(int numero_de_noites){
        this.valor_diaria_estacionamento=40;
        int valor_do_parking=valor_diaria_estacionamento*numero_de_noites;
        System.out.println("O valor total do estacionamento foi de:"+valor_do_parking);

    }

}

