/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.desafio.Controller;

import br.inatel.desafio.Model.Carta;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author burns
 */
public class Arquivo {
    //construtor que cria o arquivo pra ser escrito
    public Arquivo() {
        try {
            OutputStream os = new FileOutputStream("baralho.txt", true);
            os.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(),"Erro ao criar o arquivo",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void salvarArquivo(ArrayList<Carta> cartas){
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            fout = new FileOutputStream("baralho.txt", false);
            out = new ObjectOutputStream(fout);

            out.writeObject(cartas);

            out.close();
            fout.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public ArrayList<Carta> ler() {

        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Carta> c = new ArrayList<>();
        
        try {
            fin = new FileInputStream("baralho.txt");
            in = new ObjectInputStream(fin);

            c = (ArrayList<Carta>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return c;
    }
  
}
