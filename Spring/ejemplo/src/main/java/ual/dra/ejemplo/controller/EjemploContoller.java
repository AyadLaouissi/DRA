package ual.dra.ejemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploContoller {

	@RequestMapping(method = RequestMethod.GET, value = "/hola")
	public String hola(){
		return "Hello";
	}

}
