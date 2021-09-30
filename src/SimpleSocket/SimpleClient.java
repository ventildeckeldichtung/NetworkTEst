package SimpleSocket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {
	
	public static void main(String[] args) throws IOException{
		Socket rx = new Socket("192.168.0.149",6666);
		BufferedReader bf = new BufferedReader(new InputStreamReader(rx.getInputStream()));
		Scanner sc1 = new Scanner(new InputStreamReader(rx.getInputStream()));
		System.out.println(sc1.nextLine());
		//System.out.println(bf.readLine());
		rx.close();
		bf.close();
	}

}
