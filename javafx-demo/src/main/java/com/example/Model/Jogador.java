package com.example.Model;

public class Jogador {

    private String nome;
    private int xp;
    private int hp;
    private boolean envenenado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    public Jogador(String nome, int xp, int hp, boolean envenenado) {
        this.nome = nome;
        this.xp = xp;
        this.hp = hp;
        this.envenenado = envenenado;
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", xp=" + xp + ", hp=" + hp + ", envenenado=" + envenenado + "]";
    }

    
}
