package com.itb.lip2.academicologininf3an.serrvice;

import java.util.List;

import com.itb.lip2.academicologininf3an.model.Usuario;
public interface UsuarioService {
	
	Usuario save(Usuario usuario);
	List<Usuario> findAll();
}
