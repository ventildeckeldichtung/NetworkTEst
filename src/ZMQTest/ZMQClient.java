package ZMQTest;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

public class ZMQClient {
	public static void main(String[] args) {
		try(ZContext context = new ZContext()){
			ZMQ.Socket clientSocket = context.createSocket(SocketType.REQ);
			clientSocket.connect("tcp://172.20.10.8:6666");
			while(!Thread.currentThread().isInterrupted()) {	
				clientSocket.send("Hello".getBytes(ZMQ.CHARSET),0);
				byte[] rec = clientSocket.recv(0);
				System.out.println(new String(rec,ZMQ.CHARSET));
			}

		}
	}
}
