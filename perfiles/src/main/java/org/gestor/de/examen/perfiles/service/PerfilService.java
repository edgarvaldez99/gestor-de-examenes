package org.gestor.de.examen.perfiles.service;

import org.gestor.de.examen.perfiles.model.dao.PerfilDao;
import org.gestor.de.examen.perfiles.model.entity.Perfil;

import javax.inject.Inject;
import java.util.List;

public class PerfilService {

    @Inject
    private PerfilDao perfilDao;


    public List<Perfil> list() {
        return perfilDao.list();
    }

    public Perfil get(Long id) {
        return perfilDao.read(id);
    }
}
