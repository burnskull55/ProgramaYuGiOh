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
import java.util.Collections;
import javax.swing.JOptionPane;

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
   public void removeCarta(Arquivo a,String nome){
       ArrayList<Carta> aux = new ArrayList();
       aux = a.ler();
       int index;
      
       for (Carta carta : aux) {
           if(carta.getNome().equals(nome)){
               index = aux.indexOf(carta);
               aux.remove(index);
               a.salvarArquivo(aux);
               index = 0;
               System.out.println("carta: " + nome +" removida com sucesso");
               break;
           }
       }
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
   public void editarCarta(Arquivo a,String nome){
       //arrayAux
      ArrayList<Carta> aux = new ArrayList();
      aux = a.ler();
      int index;
      
       for (Carta carta : aux) {
           if(carta.getNome().equals(nome)){
               
               index = aux.indexOf(carta);
               
               if(aux.get(index).getIsIsMonster()){
                   Monstro monstro = new Monstro();
                   //casting em uma variavel virgem
                   monstro = (Monstro)aux.get(index);
                   
                   String name = JOptionPane.showInputDialog("entre com o novo nome da carta");
                   String level = JOptionPane.showInputDialog("entre com o nivel da carta");
                   String tipo = JOptionPane.showInputDialog("entre com o tipo da carta");
                   String atk = JOptionPane.showInputDialog("entre com o atk do monstro");
                   String def = JOptionPane.showInputDialog("entre com a def do monstro");
                   monstro.setNome(name);
                   monstro.setAtk(Integer.parseInt(atk));
                   monstro.setDef(Integer.parseInt(def));
                   monstro.setLvl(Integer.parseInt(level));
                   monstro.setTipo(tipo);
                   //sobreescreve o objeto anterior
                   aux.set(index, monstro);
                 
               }
               else if(!aux.get(index).getIsIsMonster()){
                   Magica magica = new Magica();
                   magica = (Magica) aux.get(index);
                   
                   String name = JOptionPane.showInputDialog("entre com o novo nome da carta");
                   String tipo = JOptionPane.showInputDialog("entre com o tipo da carta");
                   String efeito = JOptionPane.showInputDialog("entre com o efeito da carta");
                   magica.setNome(name);
                   magica.setTipo(tipo);
                   magica.setEfeito(efeito);
                   
                   aux.set(index, carta);
                           
                   
               }
               
               
               a.salvarArquivo(aux);
               index = 0;
               System.out.println("carta: " + nome +"editada com sucesso");
               break;
           }
       }
      
      
   }
   public int numCartas(Arquivo a){
       ArrayList<Carta> aux = new ArrayList();
       aux = a.ler();
       
       return aux.size();
   }
   public void ordenarCartas(Arquivo a){
       ArrayList<Carta> aux = new ArrayList();
       aux = a.ler();
       Collections.sort(aux);
       a.salvarArquivo(aux);
   }
}
