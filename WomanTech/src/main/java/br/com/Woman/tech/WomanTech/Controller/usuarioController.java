package br.com.Woman.tech.WomanTech.Controller;

import br.com.Woman.tech.WomanTech.Model.usuario;
import br.com.Woman.tech.WomanTech.Service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  nunca colocar ';' em anotation
@RequestMapping("/api/usuario") // SEMPRE anotation ficar colado com o metodo da classe
public class usuarioController {

    @Autowired //@ = annotation
    private usuarioService usuarioService;   // importando a classe do service

    @PostMapping // metodo do tipo post
    public String criarUsuario(@RequestBody usuario usuario) {
        usuario novoUsuario = usuarioService.criarUsuario(usuario);
        //return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
        return "Usuario Criado";
    }

}
