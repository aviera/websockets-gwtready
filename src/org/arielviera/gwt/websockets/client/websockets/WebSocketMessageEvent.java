package org.arielviera.gwt.websockets.client.websockets;

import com.google.gwt.event.shared.GwtEvent;
import com.google.web.bindery.event.shared.EventBus;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public class WebSocketMessageEvent extends GwtEvent<WebSocketMessageEventHandler> {
    public static Type<WebSocketMessageEventHandler> TYPE = new Type<WebSocketMessageEventHandler>();
    private final Message what;

    private WebSocketMessageEvent(WebSocket who, Message what) {
        this.what = what;
        this.setSource(who);
    }

    public static WebSocketMessageEvent create(WebSocket who, Message what) {
        return new WebSocketMessageEvent(who, what);
    }

    public Type<WebSocketMessageEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(WebSocketMessageEventHandler handler) {
        handler.onWebSocketMessage(this);
    }

    public static void fire(EventBus eventBus, WebSocket who, Message what){
        eventBus.fireEvent(WebSocketMessageEvent.create(who, what));
    }

    @Override
    public WebSocket getSource(){
        return (WebSocket)super.getSource();
    }

    public Message getMessage(){
        return this.what;
    }
}
