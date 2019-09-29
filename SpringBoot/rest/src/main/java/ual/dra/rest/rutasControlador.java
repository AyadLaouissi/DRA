package ual.dra.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rutasControlador")
public class rutasControlador {

	@Autowired
	private UserRepository user;

	@GetMapping("usuarios")
	public List<User> mostrarUsuarios(){
		return (List<User>) user.findAll();
	}

	@GetMapping("usuariosString")
	public String mostrarUsuariosString(){
		return user.findAll().toString();
	}


}
