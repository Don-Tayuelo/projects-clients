package com.sofka.projectsmodule.exceptionsHandler;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.sofka.projectsmodule.exceptionsHandler.excepciones.InvalidRequestBodyException;
import com.sofka.projectsmodule.exceptionsHandler.excepciones.ProjectNotFoundException;
import com.sofka.projectsmodule.exceptionsHandler.excepciones.ProjectsCollectionEmptyException;

@ControllerAdvice
@RestController
public class ProjectsExceptionController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = ProjectNotFoundException.class)
	public ResponseEntity<Object> exception(ProjectNotFoundException exception) {
		return new ResponseEntity<>("Tu ID no coincide con ningún ID de la BD."
				+ " O bien, la colección está vacía.", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = ProjectsCollectionEmptyException.class)
	public ResponseEntity<Object> exception(ProjectsCollectionEmptyException exception) {
		return new ResponseEntity<>("Existencias de proyectos en 0.", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = InvalidRequestBodyException.class)
	public ResponseEntity<Object> exception(InvalidRequestBodyException exception) {
		return new ResponseEntity<>("Cuerpo del proyecto inválido.", HttpStatus.BAD_REQUEST);
	}

	// ************************************************************************************************
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), "Validation Failed", ex.getBindingResult().toString());
		return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);
	}
}
