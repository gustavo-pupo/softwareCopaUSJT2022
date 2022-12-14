/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwarea3;

/**
 *
 * @author Gustavo
 */
public class Partida {
    private int id;
    private int host;
    private int away;
    private int scoreHost;
    private int scoreAway;
    private int fase;

    public Partida(int host, int away, int scoreHost, int scoreAway) {
        this.host = host;
        this.away = away;
        this.scoreHost = scoreHost;
        this.scoreAway = scoreAway;
    }

    public Partida(int host, int away, int scoreHost, int scoreAway, int fase) {
        this.host = host;
        this.away = away;
        this.scoreHost = scoreHost;
        this.scoreAway = scoreAway;
        this.fase = fase;
    }
    
    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHost() {
        return host;
    }

    public void setHost(int host) {
        this.host = host;
    }

    public int getAway() {
        return away;
    }

    public void setAway(int away) {
        this.away = away;
    }

    public int getScoreHost() {
        return scoreHost;
    }

    public void setScoreHost(int scoreHost) {
        this.scoreHost = scoreHost;
    }

    public int getScoreAway() {
        return scoreAway;
    }

    public void setScoreAway(int scoreAway) {
        this.scoreAway = scoreAway;
    }    
    
    @Override
    public String toString(){
        try{
            DAO dao = new DAO();
            return "" + dao.getTime(host) + " - " + scoreHost + " X " + scoreAway + " - " + dao.getTime(away);
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
