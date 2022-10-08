public class Jogador{

    private String nome;
    private int hp = 100;
    private int xp = 0;
    private boolean envenenado;

    public Jogador(){
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public int getHp(){
        return this.hp;
    }

    public int getXp(){
        return this.xp;
    }

    public boolean isEnvenenado(){
        return envenenado;
    }

    public void receberDano(int pontos){
        hp -= pontos;
    }

    public void receberCura(int pontos){
        hp += pontos;
    }

    public void ganharXp(int pontos){
        xp += pontos;
    }

    public void receberAntidoto(){
        envenenado = !envenenado;
    }


}


