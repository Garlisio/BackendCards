package com.diego.crud.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.crud.entity.models.Card;
import com.diego.crud.entity.dao.CardDao;

@Service
public class CardServiceImpl implements ICardsService {
	
	@Autowired
	private CardDao crudDao;
	
	@Override
	public Card get(int id) {
		return crudDao.findById(id).get();
	}
	
	@Override
	public List<Card> getAll() {
		return (List<Card>) crudDao.findAll();
	}
	
	@Override
	public void post(Card card) {
		System.out.println(card);
		crudDao.save(card);
	}
	
	@Override
	public void put(Card product, int id) {
		crudDao.findById(id).ifPresent((x)-> {
			product.setID_Carta(id);
			crudDao.save(product);
		});
	}
	
	@Override
	public void delete(int id) {
		crudDao.deleteById(id);
	}
	
}
