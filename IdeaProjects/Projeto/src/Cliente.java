import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate Datanascimento;
    private int CPF;
    private String enderenco;
    private String pais_nascimento;
    private String genero;
    private String email;
    private String telefone;

    public Cliente(String nome, LocalDate datanascimento, int CPF, String enderenco, String pais_nascimento, String genero, String email, String telefone) {
        this.nome = nome;
        Datanascimento = datanascimento;
        this.CPF = CPF;
        this.enderenco = enderenco;
        this.pais_nascimento = pais_nascimento;
        this.genero = genero;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatanascimento() {
        return Datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        Datanascimento = datanascimento;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEnderenco() {
        return enderenco;
    }

    public void setEnderenco(String enderenco) {
        this.enderenco = enderenco;
    }

    public String getPais_nascimento() {
        return pais_nascimento;
    }

    public void setPais_nascimento(String pais_nascimento) {
        this.pais_nascimento = pais_nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
