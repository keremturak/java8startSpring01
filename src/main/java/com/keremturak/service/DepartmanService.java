package com.keremturak.service;

import com.keremturak.repository.IDepartmanRepository;
import com.keremturak.repository.entity.Departman;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmanService {
    private final IDepartmanRepository repository;

    public DepartmanService(IDepartmanRepository repository) {
        this.repository=repository;
    }

    public void save(Departman departman){
        repository.save(departman);
    }
    public List<Departman> findAll(){
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Departman> findByYoneticiid(Long id){
        return repository.findByYoneticiid(id);
    }
    public List<Departman> findAllByKonumAdi(String id){
        return repository.findAllByKonum(id);
    }
}
