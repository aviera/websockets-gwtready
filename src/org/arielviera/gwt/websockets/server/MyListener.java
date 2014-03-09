package org.arielviera.gwt.websockets.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Logger;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
@WebListener
public class MyListener implements ServletContextListener {

    private static final Logger LOGGER = Logger.getLogger(MyListener.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LOGGER.info("context initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        LOGGER.info("context destroyed");
    }
}
