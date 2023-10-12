package ServerPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(1234);
			System.out.println("Je suis un serveur en attente la connexion d'un client ");
		    Socket s=ss.accept();
		    System.out.println("Un client connecté ");
	   
			//La derniére étape: Fermer socket
			s.close();
		  
		  }catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
