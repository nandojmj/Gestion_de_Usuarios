package com.nandomj.paneladmin.controllers;

import com.nandomj.paneladmin.models.Usuario;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    static List<Usuario> usuarios =  new ArrayList<>();

        //List.of(new Usuario(1,"Lucas","Moy","3008153133","carlos@example.com")); Ingresar por Postman GET Json

    //Consultar Usuarios: /api/usuarios [GET]
    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    //Eliminar Usuarios: /api/usuarios/(EJEMPLO):id [DELETE]
    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id) {

        for (Usuario user : usuarios) {
            if (id.equals(user.getId().toString())) {
                usuarios.remove(user);
            }
        }
        // Usuario usuarioEncontrado = usuarios.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }

    //Crear usuarios: /api/usuarios [POST]
    @PostMapping("/api/usuarios")
    public void agregarUsuario(@RequestBody Usuario user) {
        usuarios.add(user);
    }

}
