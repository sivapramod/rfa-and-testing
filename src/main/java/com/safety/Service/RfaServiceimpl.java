package com.safety.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safety.DAO.RfaDAO;
import com.safety.Model.Rfa;

@Service
public class RfaServiceimpl implements RfaService{

	@Autowired
	RfaDAO dao;
	
	@Override
	public Rfa addRfa(Rfa rfa) {

        Rfa r=dao.save(rfa);
		return r;
	}

	@Override
	public Rfa updateRfa(int requestId, Rfa rfa) {

		Rfa r=dao.save(rfa);
		return r;
	}

	@Override
	public List<Rfa> findallRfa() {

        List<Rfa> r=dao.findAll();
		return r;
	}

	@Override
	public Optional<Rfa> findByRfaId(int rfaId) {
		
		return dao.findById(rfaId);
	}

}
