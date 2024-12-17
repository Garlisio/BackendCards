package com.diego.crud.entity.services;

import java.util.List;

import com.diego.crud.entity.models.Card;


public interface ICardsService {
	public Card get(int id);
	public List<Card> getAll();
	public void post(Card card);
	public void put(Card card, int id);
	public void delete(int id);
}
