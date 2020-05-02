package com.example.soapdemo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

@Configuration
//extend from WsConfigurerAdapter provides support for web services , also enablews
@EnableWs
public class AppConfig extends WsConfigurerAdapter {

    //for wsdl location and detect ws enmdpoints beans.
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    //define DefaultWsdl11Definition for load wsdl
    @Bean(name = "example")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchemaCollection schema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("examplePort");
        definition.setTargetNamespace("http://localhost:8080/services/example/v1");
        definition.setLocationUri("/ws");
        definition.setSchemaCollection(schema);
        return definition;
    }

    //xsd for display on wsdl
    @Bean
    public XsdSchemaCollection xsdSchemaCollection() throws Exception {
        CommonsXsdSchemaCollection xsds = new CommonsXsdSchemaCollection(new ClassPathResource("xsd/doExample.xsd"));
        xsds.setInline(true);
        return xsds;
    }
}
