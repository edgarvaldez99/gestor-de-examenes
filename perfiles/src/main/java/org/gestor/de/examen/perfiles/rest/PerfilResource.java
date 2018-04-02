package org.gestor.de.examen.perfiles.rest;

import org.gestor.de.examen.perfiles.model.entity.Perfil;
import org.gestor.de.examen.perfiles.service.PerfilService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("perfil")
public class PerfilResource {

    @Inject
    private PerfilService perfilService;

    @GET
    public List<Perfil> list() {
        return perfilService.list();
    }

    @GET
    @Path("/{id}")
    public Perfil get(@PathParam("id") Long id) {
        return perfilService.get(id);
    }
}
