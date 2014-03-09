package org.arielviera.gwt.websockets.client.websockets;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public class WebSocketNative extends JavaScriptObject {
    protected WebSocketNative() {
    }

    public native final void send(String value) /*-{
        this.send(value);
    }-*/;
}
