/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.desafio.Model;

import java.io.Serializable;

/**
 *
 * @author burns
 */
public abstract class Carta implements Serializable,Comparable<Carta>{
    protected String nome;
    protected String atributo;
    protected String id;
    protected boolean isMonster;
    
    public void infoCarta(){
        //TODO
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIsIsMonster() {
        return isMonster;
    }

    public void setIsMonster(boolean isMonster) {
        this.isMonster = isMonster;
    }
    
    
    @Override
    public String toString() {
        return "Carta{" + "nome=" + nome + ", atributo=" + atributo + ", id=" + id + '}';
    }//TODO override tostring

    
    
          
}
