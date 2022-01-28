package com.safety.Service;

import java.util.List;
import java.util.Optional;

import com.safety.Model.Rfa;

public interface RfaService {

	Rfa addRfa(Rfa rfa);

	Rfa updateRfa(int requestId, Rfa rfa);

	List<Rfa> findallRfa();

	Optional<Rfa> findByRfaId(int rfaId);

}
