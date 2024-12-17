package com.diego.crud.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.diego.crud.entity.models.Analysis;

public interface AnalysisDao extends CrudRepository<Analysis, Integer> {
}
