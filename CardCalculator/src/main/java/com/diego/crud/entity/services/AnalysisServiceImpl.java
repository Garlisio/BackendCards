package com.diego.crud.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.crud.entity.dao.AnalysisDao;
import com.diego.crud.entity.models.Analysis;

@Service
public class AnalysisServiceImpl implements IAnalysisService {

    @Autowired
    private AnalysisDao analysisDao;

    @Override
    public Analysis get(int id) {
        return analysisDao.findById(id).orElse(null);
    }

    @Override
    public List<Analysis> getAll() {
        return (List<Analysis>) analysisDao.findAll();
    }

    @Override
    public void post(Analysis analysis) {
    	analysisDao.save(analysis);
    }

    @Override
    public void put(Analysis analysis, int id) {
    	analysisDao.findById(id).ifPresent(existingAnalysis -> {
            analysis.setID_Analisis(id);
            analysisDao.save(analysis);
        });
    }

    @Override
    public void delete(int id) {
    	analysisDao.deleteById(id);
    }
}
