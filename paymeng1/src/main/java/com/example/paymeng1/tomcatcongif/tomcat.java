package com.example.paymeng1.tomcatcongif;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class tomcat {
    public TomcatServletWebServerFactory webServerFactoryfactory(){
        TomcatServletWebServerFactory factory= new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers((Connector connector) -> {
            connector.setProperty("relaxedPathChars","\"#<>[\\]^`{|}");
            connector.setProperty("relaxedQueryChars","\"#<>[\\]^`{|}");
        });
        return factory;
    }
}
