package org.gestor.de.examen.perfiles.rest;

import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class ApplicationResource extends Application {

    public ApplicationResource() {
        /* This enable swagger to detect resources automatically */
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/gestorexamen/");
        beanConfig.setResourcePackage("org.gestor.de.examen.perfiles.rest");
        beanConfig.setTitle("Gestor de Examen Resource");
        beanConfig.setDescription("Aplicación que expone los recursos para el sistema de Gestor de Examen");
        beanConfig.setScan(true);
    }
}
