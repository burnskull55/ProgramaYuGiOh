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
public final class Magica extends Carta implements Comparable<Carta>{
    private String efeito;
    private String tipo;
    
    
    @Override
    public void infoCarta(){
        System.out.println("nome:" + this.nome);
        System.out.println("tipo: " + this.tipo);
        System.out.println("efeito: " + this.efeito);
        System.out.println("______________________________");
    }
    @Override
    public int compareTo(Carta o) {
        return this.getNome().compareTo(o.nome);
    }
    
    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
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
