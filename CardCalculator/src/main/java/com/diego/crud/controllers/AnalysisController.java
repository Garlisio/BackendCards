package com.diego.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.diego.crud.entity.models.Analysis;
import com.diego.crud.entity.services.IAnalysisService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/analisis")
public class AnalysisController {

    @Autowired
    private IAnalysisService analisisService;

    @GetMapping
    public List<Analysis> getAllAnalisis() {
        return analisisService.getAll();
    }

    @GetMapping("/{id}")
    public Analysis getAnalisis(@PathVariable(value = "id") int id) {
        return analisisService.get(id);
    }

    @PostMapping
    public void createAnalisis(@RequestBody Analysis analisis) {
        analisisService.post(analisis);
    }

    @PutMapping("/{id}")
    public void updateAnalisis(@RequestBody Analysis analisis, @PathVariable(value = "id") int id) {
        analisisService.put(analisis, id);
    }

    @DeleteMapping("/{id}")
    public void deleteAnalisis(@PathVariable(value = "id") int id) {
        analisisService.delete(id);
    }
}
