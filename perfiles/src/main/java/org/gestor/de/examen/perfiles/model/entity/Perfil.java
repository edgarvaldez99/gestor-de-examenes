package org.gestor.de.examen.perfiles.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(of={"idPerfil"})
public class Perfil implements Serializable{

    @Id
    @SequenceGenerator(name = "perfilSequence", sequenceName = "perfilSequence", allocationSize = 1)
    @GeneratedValue(generator = "perfilSequence")
    private Long idPerfil;
    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String email;
    private String rol;
}
