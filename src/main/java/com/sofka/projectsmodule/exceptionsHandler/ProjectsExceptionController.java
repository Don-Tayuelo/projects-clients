package com.sofka.projectsmodule.exceptionsHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sofka.projectsmodule.exceptionsHandler.excepciones.InvalidProjectException;
import com.sofka.projectsmodule.exceptionsHandler.excepciones.ProjectNotFoundException;

@ControllerAdvice
public class ProjectsExceptionController {
	
	@ExceptionHandler(value = ProjectNotFoundException.class)
	public ResponseEntity<Object> exception(ProjectNotFoundException exception) {
		return new ResponseEntity<>("Tu ID no coincide con ningún ID de la BD.", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = InvalidProjectException.class)
	public ResponseEntity<Object> invalidProjectException(InvalidProjectException exception) {
		return new ResponseEntity<>("Cuerpo del proyecto inválido.", HttpStatus.BAD_REQUEST);
	}
}
