package com.diego.crud.entity.services;

import java.util.List;
import com.diego.crud.entity.models.Analysis;

public interface IAnalysisService {
    public Analysis get(int id);
    public List<Analysis> getAll();
    public void post(Analysis analysis);
    public void put(Analysis analysis, int id);
    public void delete(int id);
}
