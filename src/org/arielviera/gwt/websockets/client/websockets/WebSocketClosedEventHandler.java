package org.arielviera.gwt.websockets.client.websockets;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public interface WebSocketClosedEventHandler extends EventHandler {
    void onWebSocketClosed(WebSocketClosedEvent event);
}
