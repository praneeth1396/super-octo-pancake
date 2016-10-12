/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prane
 */
public class ServertoAndroid {
    public static void main(String[] args){
        try {
            ServerSocket ss=new ServerSocket();
            InetSocketAddress myso=new InetSocketAddress("192.168.0.4",8089);
            ss.bind(myso);
            System.out.println(ss);
            Socket cs=ss.accept();
            
            System.out.println(cs);
            PrintWriter p=new PrintWriter(cs.getOutputStream(),true);
            BufferedReader br=new BufferedReader(new InputStreamReader(cs.getInputStream()));
            
            System.out.println(br.readLine());
            
            
        } 
        catch (IOException ex) {
            Logger.getLogger(ServertoAndroid.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
