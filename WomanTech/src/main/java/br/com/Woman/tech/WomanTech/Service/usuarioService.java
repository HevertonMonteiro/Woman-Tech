package br.com.Woman.tech.WomanTech.Service;

import br.com.Woman.tech.WomanTech.Model.usuario;
//import br.com.Woman.tech.WomanTech.Model.usuarioCursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioService{

        @Autowired
        private usuarioRespository usuarioRespository;

        public usuario criarUsuario(usuario usuario) {
            return usuarioRespository.save(usuario);
        }

    }
