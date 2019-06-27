/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sajid.mousedroid.server;

import com.sajid.mousedroid.server.Server;

/**
 *
 * Created by sajid qureshi
 */
public class Start {
   // static Thread thread;

    public static void main(String argv[]) {
        int port = 6000;
        if(argv.length > 0){
           try{
               port = Integer.parseInt(argv[0]);
           }catch(NumberFormatException nfe){
               System.out.println("Default port 6000");
           }
        }
        Server server = new Server(port);
        server.startServer();

    }

}
