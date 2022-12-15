package com.more.examen02.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.more.examen02.entity.Pagos;

public interface PagoService {
	public List<Pagos> finById(int id, Pageable page);
	
	public Pagos save(Pagos articulo);

}
