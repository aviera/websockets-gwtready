package org.arielviera.gwt.websockets.client.websockets;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public class Message extends JavaScriptObject {

    protected Message() {
    }

    public native final String getData()/*-{
        return this.data;
    }-*/;
}
