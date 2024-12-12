package com.diego.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.diego.crud.entity.models.Card;
import com.diego.crud.entity.services.ICardsService;

@CrossOrigin(origins = "*")
@RestController
public class CardController {
	
	@Autowired
	ICardsService productService;
	
	@GetMapping("/product")
	public List<Card> getAllProducts(){
		return productService.getAll();
	}
	@GetMapping("/product/{id}")
	public Card getOne(@PathVariable(value = "id") int id) {
		return productService.get(id);
	}
	
	@PostMapping("/product")
	public void post(@RequestBody Card card) {
		productService.post(card);
	}
	
	@PutMapping("/product/{id}")
	public void put(@RequestBody Card product, @PathVariable(value = "id") int id) {
		productService.put(product, id);
	}
	
	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		productService.delete(id);
	}
}

@ControllerAdvice
@RestController
class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<String>handleAllExceptions(Exception ex){
		return new ResponseEntity<>("AAA", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
