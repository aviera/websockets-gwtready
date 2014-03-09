package org.arielviera.gwt.websockets.client.websockets;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public class WebSocket {
    private final String location;
    private final SimpleEventBus eventBus = new SimpleEventBus();
    private WebSocketNative websocket;

    public WebSocket(String location){
        this.location = location;
    }

    public void init(){
        this.websocket = createWebsocket(location);
    }

    private native WebSocketNative createWebsocket(String location) /*-{
        var outer = this;
        var result = new WebSocket(location);
        result.onopen = function(){
            outer.@org.arielviera.gwt.websockets.client.websockets.WebSocket::open()();
        }
        result.onmessage = function(m){
            outer.@org.arielviera.gwt.websockets.client.websockets.WebSocket::onMessage(Lcom/mySampleApplication/client/websockets/Message;)(m);
        }
        result.onclose = function(){
            outer.@org.arielviera.gwt.websockets.client.websockets.WebSocket::close()();
        }
        return result;
    }-*/;

    protected void open(){
        WebSocketOpenEvent.fire(eventBus, this);
    }

    protected void close(){
        WebSocketClosedEvent.fire(eventBus, this);
    }

    protected void onMessage(Message message){
        WebSocketMessageEvent.fire(eventBus, this, message);
    }

    public HandlerRegistration addWebSocketOpenEventHandler(WebSocketOpenEventHandler handler){
        return this.eventBus.addHandler(WebSocketOpenEvent.TYPE, handler);
    }

    public HandlerRegistration addWebSocketClosedEventHandler(WebSocketClosedEventHandler handler){
        return this.eventBus.addHandler(WebSocketClosedEvent.TYPE, handler);
    }

    public HandlerRegistration addWebSocketMessageEventHandler(WebSocketMessageEventHandler handler){
        return this.eventBus.addHandler(WebSocketMessageEvent.TYPE, handler);
    }

    public final void send(String hi){
        this.websocket.send(hi);
    };
}
