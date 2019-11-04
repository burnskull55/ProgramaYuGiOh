/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.desafio.Model;

/**
 *
 * @author burns
 */
public final class Monstro extends Carta implements Comparable<Carta>{
    private int atk;
    private int def;
    private int lvl;
    private String tipo;
    
    
    @Override
    public void infoCarta(){
        System.out.println("nome:" + this.nome);
        System.out.println("lvl: " + this.lvl);
        System.out.println("tipo: " + this.tipo);
        System.out.println("atk: " + this.atk);
        System.out.println("def: " + this.def);
        System.out.println("______________________________");
    }

    @Override
    public int compareTo(Carta o) {
        return this.getNome().compareTo(o.nome);
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getAtributo() {
        return atributo;
    }

    @Override
    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
}
