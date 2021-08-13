package com.banco.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.demo.interfaceService.IPersonaService;
import com.banco.demo.interfaces.IPersona;
import com.banco.demo.modelo.Persona;


@Service
public class PersonaService implements IPersonaService {

	
	@Autowired
	private IPersona data;
	
	
	@Override
	public List<Persona> listar() {
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		int res=0;
		Persona persona=data.save(p);
		
		if(!persona.equals(null)) {
			
			res=1;
			
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
