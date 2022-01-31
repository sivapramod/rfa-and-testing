package com.safety;





import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import com.safety.DAO.RfaDAO;
import com.safety.Model.Rfa;

import com.safety.Service.RfaService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RfaTest {

	@Autowired
	RfaService service;
	
	@MockBean
	RfaDAO repository;
	
	
	@Test
	 public void getAllRfaTest() {
		OngoingStubbing<List<Rfa>> thenReturn = when(repository.findAll()).thenReturn
				(Stream.of( new Rfa(1,2,"reason","request")).collect(Collectors.toList()));       
		assertEquals(1,service.findallRfa().size());
	}
	

	
	@Test
	public void saveInncident() {
		
		Rfa rfa =new Rfa(1, 2,"reason","request");
		when(repository.save(rfa)).thenReturn(rfa);
		assertEquals(rfa,service.addRfa(rfa));
	}

	
}