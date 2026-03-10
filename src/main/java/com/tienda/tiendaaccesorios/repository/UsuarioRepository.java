package com.tienda.tiendaaccesorios.repository;

import com.tienda.tiendaaccesorios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsuarioAndPassword(String usuario, String password);

}