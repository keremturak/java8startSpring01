package com.keremturak.service;

import com.keremturak.repository.IPersonelRepository;
import com.keremturak.repository.entity.Personel;
import com.keremturak.utility.ServiceManager;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PersonelService extends ServiceManager<Personel,Long> {
    private final IPersonelRepository repository;
    public PersonelService(IPersonelRepository repository){
        super(repository);
        this.repository=repository;

    }




}
