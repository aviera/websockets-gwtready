package org.arielviera.gwt.websockets.server;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
@ServerEndpoint("/echo")
public class EchoEndpoint {
    @OnMessage
    public void onMessage(Session session, String msg){
        try{
            session.getBasicRemote().sendText("echo "+msg);
        } catch (IOException ex){

        }
    }
}
