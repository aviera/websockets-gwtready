package org.arielviera.gwt.websockets.client.websockets;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public interface WebSocketMessageEventHandler extends EventHandler {
    void onWebSocketMessage(WebSocketMessageEvent event);
}
