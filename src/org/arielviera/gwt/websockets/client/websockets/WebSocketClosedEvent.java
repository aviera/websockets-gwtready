package org.arielviera.gwt.websockets.client.websockets;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public class WebSocketClosedEvent extends GwtEvent<WebSocketClosedEventHandler> {
    public static Type<WebSocketClosedEventHandler> TYPE = new Type<WebSocketClosedEventHandler>();
    private String who;

    private WebSocketClosedEvent(WebSocket who){
        this.setSource(who);
    }

    public Type<WebSocketClosedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(WebSocketClosedEventHandler handler) {
        handler.onWebSocketClosed(this);
    }

    public static WebSocketClosedEvent create(WebSocket who){
        return new WebSocketClosedEvent(who);
    }

    public static void fire(EventBus eventBus, WebSocket who){
        eventBus.fireEvent(WebSocketClosedEvent.create(who));
    }

    @Override
    public WebSocket getSource(){
        return (WebSocket)super.getSource();
    }
}
