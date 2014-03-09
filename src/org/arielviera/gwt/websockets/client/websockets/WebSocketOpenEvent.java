package org.arielviera.gwt.websockets.client.websockets;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public class WebSocketOpenEvent extends GwtEvent<WebSocketOpenEventHandler> {
    public static Type<WebSocketOpenEventHandler> TYPE = new Type<WebSocketOpenEventHandler>();

    private WebSocketOpenEvent(WebSocket who){
        this.setSource(who);
    }

    public Type<WebSocketOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(WebSocketOpenEventHandler handler) {
        handler.onWebSocketOpen(this);
    }

    public static WebSocketOpenEvent create(WebSocket who){
        return new WebSocketOpenEvent(who);
    }

    public static void fire(EventBus eventBus, WebSocket who){
        eventBus.fireEvent(WebSocketOpenEvent.create(who));
    }

    @Override
    public WebSocket getSource(){
        return (WebSocket)super.getSource();
    }
}
