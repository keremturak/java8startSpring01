package com.keremturak.controller;

import com.keremturak.repository.entity.Departman;
import com.keremturak.service.DepartmanService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departman")
public class DepartmanController {
    private final DepartmanService departmanService;
    public DepartmanController(DepartmanService departmanService) {
        this.departmanService = departmanService;
    }

    @GetMapping("/getall")
    public List<Departman> getAll(){
        return departmanService.findAll();
    }
    @PostMapping("/save")
    public void save ( String ad, String konum){
        Departman departman = Departman.builder()
                .ad(ad)
                .konum(konum)
                .build();
        departmanService.save(departman);
    }

    @GetMapping("/delete")
    public void delete(Long id){
        departmanService.delete(id);
    }



    @GetMapping("/findbyyoneticiid")
    public List<Departman> findByyoneticiid(Long id){
        return departmanService.findByYoneticiid(id);
    }
    @GetMapping("/findallbykonumadi")
    public List<Departman> findAllBKonumAdi(String konum){
        return departmanService.findAllByKonumAdi(konum);
    }


}
