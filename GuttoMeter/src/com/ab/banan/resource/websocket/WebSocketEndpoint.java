package com.ab.banan.resource.websocket;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint("/status")
public class WebSocketEndpoint {

	@OnOpen
	public void open(Session session) {
	    System.out.println("Open Connection ...");
	}

	@OnClose
	public void close(Session session) {
	    System.out.println("Close Connection ...");
	}

	@OnError
	public void onError(Throwable error) {
	    error.printStackTrace();
	}

	@OnMessage
	public String handleMessage(String message, Session session) {
		System.out.println("Message from the client: " + message);
		String echoMsg = "Echo from the server : " + message;
	    return echoMsg;
	}	

}


