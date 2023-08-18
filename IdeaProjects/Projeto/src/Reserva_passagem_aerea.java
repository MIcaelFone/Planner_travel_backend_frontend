import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Reserva_passagem_aerea extends Reserva {
    private int numero_voo;
    private String classe;
    private int numero_assento;
    private ArrayList<Object> escala;

    private String companhia;
    private String aeroporto_embarque;
    private String aeroporto_desembarque;
    private int valor_ticket_bebe;
    private int valor_ticket_adulto;
    private int duracao_voo_ida;
    private int duracao_voo_volta;
    private String Local_desembarque;
    private String local_embarque;
    private LocalDate data_de_embarque;
    private LocalDate data_de_desembarque;
    private LocalDate data_de_desembarque_volta;
    private LocalDate data_de_esembarque_volta;



    // classe responsável por formatar um padrão diferente do formato ISO
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate data_de_retorno;
    private String  cidade_do_desembarque_da_viagem;
    private String  cidade_do_embarque_da_viagem;

    public String getCidade_do_desembarque_da_viagem() {
        return cidade_do_desembarque_da_viagem;
    }

    public void setCidade_do_desembarque_da_viagem(String cidade_do_desembarque_da_viagem) {
        this.cidade_do_desembarque_da_viagem = cidade_do_desembarque_da_viagem;
    }

    public String getCidade_do_embarque_da_viagem() {
        return cidade_do_embarque_da_viagem;
    }

    public void setCidade_do_embarque_da_viagem(String cidade_do_embarque_da_viagem) {
        this.cidade_do_embarque_da_viagem = cidade_do_embarque_da_viagem;
    }



    public Reserva_passagem_aerea(String nome_responsavel, String email_responsavel, int numero_de_adultos, int numero_de_criancas, int numero_de_bebes, int numero_voo, String classe, int numero_assento, String companhia, String aeroporto_embarque, String aeroporto_desembarque, int valor_ticket_bebe, int valor_ticket_adulto, int duracao_voo_ida, int duracao_voo_volta, String local_desembarque, String local_embarque, String cidade_do_desembarque_da_viagem, String cidade_do_embarque_da_viagem,CharSequence data_de_embarque,CharSequence data_de_desembarque,CharSequence data_de_embarque_volta,CharSequence data_de_desembarque_volta) {
        super(nome_responsavel, email_responsavel, numero_de_adultos, numero_de_criancas, numero_de_bebes);
        this.numero_voo = numero_voo;
        this.classe = classe;
        this.numero_assento = numero_assento;

        this.companhia = companhia;
        this.aeroporto_embarque = aeroporto_embarque;
        this.aeroporto_desembarque = aeroporto_desembarque;
        this.valor_ticket_bebe = valor_ticket_bebe;
        this.valor_ticket_adulto = valor_ticket_adulto;
        this.duracao_voo_ida = duracao_voo_ida;
        this.duracao_voo_volta = duracao_voo_volta;
        Local_desembarque = local_desembarque;
        this.local_embarque = local_embarque;
        this.data_de_embarque =LocalDate.parse(data_de_embarque, formatter);
        this.data_de_desembarque =LocalDate.parse(data_de_desembarque, formatter);
        this.data_de_esembarque_volta=LocalDate.parse(data_de_embarque_volta, formatter);
        this.data_de_desembarque_volta=LocalDate.parse(data_de_desembarque_volta, formatter);

        this.cidade_do_desembarque_da_viagem = cidade_do_desembarque_da_viagem;
        this.cidade_do_embarque_da_viagem = cidade_do_embarque_da_viagem;
    }

    public int getDuracao_voo_ida() {
        return duracao_voo_ida;
    }

    public void setDuracao_voo_ida(int duracao_voo_ida) {
        this.duracao_voo_ida = duracao_voo_ida;
    }

    public int getDuracao_voo_volta() {
        return duracao_voo_volta;
    }

    public void setDuracao_voo_volta(int duracao_voo_volta) {
        this.duracao_voo_volta = duracao_voo_volta;
    }

    public String getLocal_desembarque() {
        return Local_desembarque;
    }

    public void setLocal_desembarque(String local_desembarque) {
        Local_desembarque = local_desembarque;
    }

    public String getLocal_embarque() {
        return local_embarque;
    }

    public void setLocal_embarque(String local_embarque) {
        this.local_embarque = local_embarque;
    }



    @Override
    public void ValorTotal() {
        int i = getValor_ticket_adulto() * getNumero_de_adultos() + getValor_ticket_bebe() * getNumero_de_bebes();
        double total_valor = i;
        System.out.println("O valor total dos tickets:" + i);
    }



    public String isInternacional() {
        return "Voo internacional da companhia:" + getCompanhia();
    }

    public String isDomestico() {
        return "Voo internacional da companhia:" + getCompanhia();
    }

    public String isComrefeicao() {
        return ("O voo possui refeição");
    }

    public String isSemrefeicao() {
        return "O voo não possui refeição";
    }

    public String isSemBagagem() {
        return "Os passageiros não possuem bagagem.";
    }

    public String isCombagagem(int kg) {
        return "Os passageiros possuem no total bagagem de:"+kg ;
    }

    public void isIda() {
        System.out.println("Voo de ida sai da cidade de:" + cidade_do_embarque_da_viagem + " Com destino para a cidade na : " + cidade_do_desembarque_da_viagem);

    }

    public void isVolta() {
        System.out.println("Voo de volta sai da cidade de:" + cidade_do_embarque_da_viagem + " Com destino para a cidade na : " + cidade_do_desembarque_da_viagem);
    }



    @Override
    public void Duracao() {
        System.out.println("A duração da voo de ida:"+duracao_voo_ida);
        System.out.println("A duração da voo de volta:"+duracao_voo_volta);

    }

    public void Horariocomescala() {
        for (int i = 0; i < this.escala.size(); i++) {
            String Escala = (String) this.escala.get(i);
            String[] partes = Escala.split(" - ");
            if (partes.length == 2) {
                String horario = partes[0];
                String aeroporto = partes[1];
                System.out.println("No Horário: " + horario + " será realizado uma escala no Aeroporto: " + aeroporto);

            }

            // Now you can use 'partes' array as needed
        }


    }

    public int getNumero_voo() {
        return numero_voo;
    }

    public void setNumero_voo(int numero_voo) {
        this.numero_voo = numero_voo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNumero_assento() {
        return numero_assento;
    }

    public void setNumero_assento(int numero_assento) {
        this.numero_assento = numero_assento;
    }


    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }



    public String getAeroporto_embarque() {
        return aeroporto_embarque;
    }

    public void setAeroporto_embarque(String aeroporto_embarque) {
        this.aeroporto_embarque = aeroporto_embarque;
    }

    public String getAeroporto_desembarque() {
        return aeroporto_desembarque;
    }

    public void setAeroporto_desembarque(String aeroporto_desembarque) {
        this.aeroporto_desembarque = aeroporto_desembarque;
    }

    public int getValor_ticket_bebe() {
        return valor_ticket_bebe;
    }

    public void setValor_ticket_bebe(int valor_ticket_bebe) {
        this.valor_ticket_bebe = valor_ticket_bebe;
    }

    public int getValor_ticket_adulto() {
        return valor_ticket_adulto;
    }

    public void setValor_ticket_adulto(int valor_ticket_adulto) {
        this.valor_ticket_adulto = valor_ticket_adulto;
    }

    public void Adiciona_escala(String local_e_data_da_escala){
        escala.add(local_e_data_da_escala);

    }

    public LocalDate getData_de_embarque() {
        return data_de_embarque;
    }

    public void setData_de_embarque(LocalDate data_de_embarque) {
        this.data_de_embarque = data_de_embarque;
    }

    public LocalDate getData_de_desembarque() {
        return data_de_desembarque;
    }

    public void setData_de_desembarque(LocalDate data_de_desembarque) {
        this.data_de_desembarque = data_de_desembarque;
    }

    public LocalDate getData_de_desembarque_volta() {
        return data_de_desembarque_volta;
    }

    public void setData_de_desembarque_volta(LocalDate data_de_desembarque_volta) {
        this.data_de_desembarque_volta = data_de_desembarque_volta;
    }

    public LocalDate getData_de_esembarque_volta() {
        return data_de_esembarque_volta;
    }

    public void setData_de_esembarque_volta(LocalDate data_de_esembarque_volta) {
        this.data_de_esembarque_volta = data_de_esembarque_volta;
    }

    public LocalDate getData_de_retorno() {
        return data_de_retorno;
    }

    public void setData_de_retorno(LocalDate data_de_retorno) {
        this.data_de_retorno = data_de_retorno;
    }
}