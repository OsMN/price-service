package com.everis.bootcamp.priceservice.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.bootcamp.priceservice.model.Prices;
import com.everis.bootcamp.priceservice.repository.PriceRepository;

@Service
public class PriceService {

	private PriceRepository priceRepository;

	public PriceService(PriceRepository priceRepository) {
		this.priceRepository = priceRepository;
	}

	public Prices get(Integer priceId) {
		return priceRepository.findById(priceId).orElse(new Prices());
	}
	
	public BigDecimal getPriceById(Integer priceId) {
		return priceRepository.findById(priceId).orElse(new Prices()).getPrice();
	}
	public List<Prices> getAllPrices() {
		return priceRepository.findAll();
	}
}
