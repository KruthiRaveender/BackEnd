package com.example.controller;

import java.util.List;

import com.example.exceptions.IdNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Question;
import com.example.service.ServiceClass;

@RestController
@RequestMapping("/questions")
@CrossOrigin("http://localhost:4200")
public class ControllerClass {
	@Autowired
	ServiceClass serviceobj;

	

	
	// Get All Questions Data
	@GetMapping("/GetAllQuestions")
	private ResponseEntity<List<Question>> getAllQuestion() {
		List<Question> quelist = serviceobj.getQuestion();
		return new ResponseEntity<List<Question>>(quelist, new HttpHeaders(), HttpStatus.OK);

	}
	// Get Particular Question Data
		@GetMapping("/GetQuestion/{id}")
		private ResponseEntity<Question> getEmployee(@PathVariable("id") int id) {
			Question q = serviceobj.getQuestionById(id);
			if (q == null) {
				throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
			} else {
				return new ResponseEntity<Question>(q, new HttpHeaders(), HttpStatus.OK);
			}
		}
	

	

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
