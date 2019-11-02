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
public abstract class Carta implements Comparable<Carta>{
    protected String nome;
    protected String atributo;
    protected String id;
    
    public void infoCarta(){
        //TODO
    }

    @Override
    public String toString() {
        return "Carta{" + "nome=" + nome + ", atributo=" + atributo + ", id=" + id + '}';
    }//TODO override tostring
    
    
          
}
