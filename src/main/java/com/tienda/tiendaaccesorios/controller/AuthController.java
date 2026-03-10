package com.tienda.tiendaaccesorios.controller;

import com.tienda.tiendaaccesorios.model.Usuario;
import com.tienda.tiendaaccesorios.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    private final UsuarioRepository usuarioRepository;

    public AuthController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Servicio web para registro
    @PostMapping("/registro")
    public String registro(@RequestBody Usuario usuario){

        usuarioRepository.save(usuario);

        return "Usuario registrado correctamente";
    }

    // Servicio web para login
    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario){

        Usuario user = usuarioRepository.findByUsuarioAndPassword(
                usuario.getUsuario(),
                usuario.getPassword()
        );

        if(user != null){
            return "Autenticación satisfactoria";
        }else{
            return "Error de autenticación";
        }

    }
}