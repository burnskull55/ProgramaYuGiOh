/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.desafio.Controller;

import br.inatel.desafio.Model.Magica;
import br.inatel.desafio.Model.Monstro;

/**
 *
 * @author burns
 */
public class YugiohJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciando os controladores 
        Arquivo arquivo = new Arquivo();
        GerenciadorBaralho deck = new GerenciadorBaralho();
        //criando cartas
        Magica c1 = new Magica();
        Magica c2 = new Magica();
        Monstro c3 = new Monstro();
        Monstro c4 = new Monstro();
        //inicializando as cartas
        c1.setNome("chamado dos assombrados");
        c1.setEfeito("Ative este card ao escolher 1 monstro no seu Cemitério;"
                + " Invoque o alvo por Invocação-Especial em Posição de Ataque. "
                + "Quando este card deixar o campo, destrua o alvo. Quando o alvo for destruído, destrua este card.");
        c1.setTipo("card de armadilha");
        c1.setId("1");
        
        c2.setNome("Moviento solitario");
        c2.setEfeito("Se você não controlar nenhum monstro: Invoque por Invocação-Especial 1 monstro \"Melodiosa(o)\" de Nível 4 ou menos da sua mão ou Deck. "
                + "Você só pode ativar 1 \"1º Movimento Solitário\" por turno. "
                + "Você não pode Invocar monstros por Invocação-Especial durante o turno em que ativar este card, "
                + "exceto monstros \"Melodiosa(o)\".");
        c2.setId("2");
        
        c3.setNome("dragao branco de olhos azuis");
        c3.setAtk(3000);
        c3.setDef(2500);
        c3.setLvl(8);
        c3.setAtributo("luz");
        c3.setTipo("dragao/normal");
        c3.setId("3");
        
        c3.setNome("obelisco atormentador");
        c3.setAtk(4000);
        c3.setDef(4000);
        c3.setLvl(10);
        c3.setAtributo("divino");
        c3.setTipo("besta divina/efeito");
        c3.setId("4");
        
        
    }
    
}
