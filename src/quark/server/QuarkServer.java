/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quark.server;

/**
 *
 * @author Miguel Dinis
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuarkServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            ServerSocket sock = new ServerSocket(80);
        } catch (IOException ex) {
            Logger.getLogger(QuarkServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Alterações do miguel");
    }
    
}
