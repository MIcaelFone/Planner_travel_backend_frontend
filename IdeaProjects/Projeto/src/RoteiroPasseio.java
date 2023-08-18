import java.util.Arrays;

public class RoteiroPasseio {
    private String nomeRoteiro;
    private String Descricao;
    private String[] pontosTuristicos;
    private String[] Atividades;
    private double Preco;
    private Integer StringDuracao;
    private boolean transporteincluso;
    private String tipoTransporte;
    private Boolean GuiaTuristico;
    private String PaisDoPasseio;

    public String getNomeRoteiro() {
        return this.nomeRoteiro;
    }

    public void setNomeRoteiro(String nomeRoteiro) {
        this.nomeRoteiro = nomeRoteiro;
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String[] getPontosTuristicos() {
        return this.pontosTuristicos;
    }

    public void setPontosTuristicos(String[] pontosTuristicos) {
        this.pontosTuristicos = pontosTuristicos;
    }

    public String[] getAtividades() {
        return this.Atividades;
    }

    public void setAtividades(String[] Atividades) {
        this.Atividades = Atividades;
    }

    public double getPreco() {
        return this.Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public Integer getStringDuracao() {
        return this.StringDuracao;
    }

    public void setStringDuracao(Integer StringDuracao) {
        this.StringDuracao = StringDuracao;
    }

    public boolean isTransporteincluso() {
        return this.transporteincluso;
    }

    public boolean getTransporteincluso() {
        return this.transporteincluso;
    }

    public void setTransporteincluso(boolean transporteincluso) {
        this.transporteincluso = transporteincluso;
    }

    public String getTipoTransporte() {
        return this.tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public Boolean isGuiaTuristico() {
        return this.GuiaTuristico;
    }

    public Boolean getGuiaTuristico() {
        return this.GuiaTuristico;
    }

    public void setGuiaTuristico(Boolean GuiaTuristico) {
        this.GuiaTuristico = GuiaTuristico;
    }

    public String getPaisDoPasseio() {
        return this.PaisDoPasseio;
    }

    public void setPaisDoPasseio(String PaisDoPasseio) {
        this.PaisDoPasseio = PaisDoPasseio;
    }



}
