package softwarea3;

public class Time {
    private int id;
    private String nome;
    private int saldoGols;
    private int golsSofridos;
    private int pontos;
    private int idGrupo;
    private int eliminatorias;

    public Time(int id, String nome, int saldoGols, int golsSofridos, int pontos, int idGrupo, int eliminatorias) {
        this.id = id;
        this.nome = nome;
        this.saldoGols = saldoGols;
        this.golsSofridos = golsSofridos;
        this.pontos = pontos;
        this.idGrupo = idGrupo;
        this.eliminatorias = eliminatorias;
    }
    //@Override
    //public String toString() {
      //  return nome;
    //}   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getEliminatorias() {
        return eliminatorias;
    }

    public void setEliminatorias(int eliminatorias) {
        this.eliminatorias = eliminatorias;
    }
}
