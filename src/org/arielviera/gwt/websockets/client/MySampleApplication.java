package org.arielviera.gwt.websockets.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import org.arielviera.gwt.websockets.client.websockets.*;

import java.util.logging.Logger;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MySampleApplication implements EntryPoint {
    private final Logger LOGGER = Logger.getLogger(MySampleApplication.class.getName());
    private WebSocket ws;

    public void onModuleLoad() {

        this.ws = new WebSocket("ws://127.0.0.1:8080/echo");
        Window.alert("qwer");
        this.ws.addWebSocketOpenEventHandler(new WebSocketOpenEventHandler() {
            @Override
            public void onWebSocketOpen(WebSocketOpenEvent event) {
                LOGGER.info("websocket open");
                ws.send("hi");
            }
        });
        this.ws.addWebSocketClosedEventHandler(new WebSocketClosedEventHandler() {
            @Override
            public void onWebSocketClosed(WebSocketClosedEvent event) {
                LOGGER.info("websocket closed");
            }
        });
        this.ws.addWebSocketMessageEventHandler(new WebSocketMessageEventHandler() {
            @Override
            public void onWebSocketMessage(WebSocketMessageEvent event) {
                LOGGER.info(event.getMessage().getData());
            }
        });
        this.ws.init();
    }


}
