package com.itb.lip2.academicologininf3an.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itb.lip2.academicologininf3an.model.Usuario;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

	
	@GetMapping("/users")
	public List <Usuario> getUsers() {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario us1 = new Usuario();
		us1.setId(1l);
		us1.setNome("Iasmyn Barbosa");
		us1.setEmail("myn@gmail.com");
		
		Usuario us2 = new Usuario();
		us1.setId(2l);
		us1.setNome("Quem sou");
		us1.setEmail("slamds@gmail.com");
		
		usuarios.add(us1);
		usuarios.add(us2);
		
		
		return usuarios;
	}
}
