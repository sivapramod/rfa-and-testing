package com.safety.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.safety.Exception.RecordNotFoundException;
import com.safety.Model.Rfa;
import com.safety.Service.RfaService;

@RestController
public class RfaRestController {

	@Autowired
	RfaService service;
	
	@PostMapping("/rfa")
	public ResponseEntity<Rfa> createRfa(@Validated @RequestBody Rfa rfa){
		
		Rfa r = service.addRfa(rfa);
		System.out.println(r);
		return new ResponseEntity<Rfa>(r,HttpStatus.OK);
	}  
	
	@PutMapping("/rfa/{rfaId}")
	public ResponseEntity<Rfa> updateRfa(@PathVariable int rfaId,@RequestBody Rfa rfa){
		
		Rfa r = service.updateRfa(rfaId,rfa);
 		return new ResponseEntity<Rfa>(r,HttpStatus.OK);
	}
	
	@GetMapping("/rfa")
	public ResponseEntity<List<Rfa>> fetchRfa(){
		
		List<Rfa> r = service.findallRfa();
		return ResponseEntity.ok().body(r);
	}
	
	@GetMapping("/rfa/{rfaId}")
	public ResponseEntity<List<Rfa>> getRfaById(@PathVariable int rfaId){
		Optional<Rfa> r = service.findByRfaId(rfaId);
		if(r.isPresent()) {
			return new ResponseEntity(r.get(),HttpStatus.OK);
		}
		else
		{
			throw new RecordNotFoundException("Record not found...");
		}
	}
}
