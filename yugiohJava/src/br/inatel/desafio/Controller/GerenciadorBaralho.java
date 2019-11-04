/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.desafio.Controller;
import br.inatel.desafio.Model.Carta;
import br.inatel.desafio.Model.Magica;
import br.inatel.desafio.Model.Monstro;
import java.util.ArrayList;

/**
 *
 * @author burns
 */
public class GerenciadorBaralho {
    private ArrayList<Carta> deck = new ArrayList();
    
   public void addCarta(Arquivo a,Carta c){
        deck.add(c);
        a.salvarArquivo(deck);
   }
   public void removeCarta(Arquivo a,Carta c){
       ArrayList<Carta> aux = new ArrayList();
       aux = a.ler();
       aux.remove(c);
       a.salvarArquivo(aux);
   }
   public void listarDeckCompleto(Arquivo a){
       ArrayList<Carta> aux = new ArrayList();
       aux = a.ler();
       for (Carta carta : aux) {
           if(carta instanceof Monstro){
               carta = (Monstro) carta;
               carta.infoCarta();
           }
           else if(carta instanceof Magica){
               carta = (Magica) carta;
               carta.infoCarta();
           }         
       }
   }
   public void listarDeckPosicoes(Arquivo a){
       ArrayList<Carta> aux = new ArrayList();
       aux = a.ler();
       for (int i = 0; i < aux.size(); i++) {
           System.out.println(i);
           System.out.println(aux.get(i).getNome());
       }
   }
   public void editarCarta(Arquivo a,Carta c){
      ArrayList<Carta> aux = new ArrayList();
       aux = a.ler();
       
   }
   public int numCartas(Arquivo a){
       ArrayList<Carta> aux = new ArrayList();
       aux = a.ler();
       
       return aux.size();
   }
   public void ordenarCartas(){
       //TODO
   }
}
