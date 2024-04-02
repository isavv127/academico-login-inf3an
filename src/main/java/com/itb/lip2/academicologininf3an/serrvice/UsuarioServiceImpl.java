package com.itb.lip2.academicologininf3an.serrvice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itb.lip2.academicologininf3an.model.Usuario;
import com.itb.lip2.academicologininf3an.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario save (Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

}
