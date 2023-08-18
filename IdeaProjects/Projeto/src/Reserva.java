import java.util.ArrayList;

public abstract class Reserva implements Detalhes_da_viagem {
    private String nome_responsavel;
    private String email_responsavel;
    private ArrayList<Object> Lista_de_nomes_dos_passageiros;

    private int Numero_de_adultos;
    private int Numero_de_criancas;
    private int Numero_de_bebes;



    public Reserva(String nome_responsavel, String email_responsavel, int numero_de_adultos, int numero_de_criancas, int numero_de_bebes) {
        this.nome_responsavel = nome_responsavel;
        this.email_responsavel = email_responsavel;
        Numero_de_adultos = numero_de_adultos;
        Numero_de_criancas = numero_de_criancas;
        Numero_de_bebes = numero_de_bebes;


    }


    public int getNumero_de_adultos() {
        return Numero_de_adultos;
    }

    public int getNumero_de_criancas() {
        return Numero_de_criancas;
    }

    public int getNumero_de_bebes() {
        return Numero_de_bebes;
    }


    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public String getEmail_responsavel() {
        return email_responsavel;
    }

    public void setEmail_responsavel(String email_responsavel) {
        this.email_responsavel = email_responsavel;
    }




    @Override
    public abstract void ValorTotal();


    @Override
    public abstract void Duracao();

    private void Adicionapessoa(String Adicionapessoa) {
        Lista_de_nomes_dos_passageiros.add(Adicionapessoa);
        for (Object passegeiros:Lista_de_nomes_dos_passageiros)
            System.out.println("A lista dos passageiros são:" + passegeiros.toString());
    }
    

}
