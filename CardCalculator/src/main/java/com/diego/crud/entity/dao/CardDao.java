package com.diego.crud.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.diego.crud.entity.models.Card;

public interface CardDao extends CrudRepository<Card, Integer> {

}
