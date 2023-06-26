package com.keremturak.controller;

import com.keremturak.dto.request.GetNameUpperCaseRequestDto;
import com.keremturak.exceptions.ErrorType;
import com.keremturak.exceptions.Java8StartException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/personeldepartman")
public class PersonelDepartmanController {
    @PostMapping("/getname")
    public ResponseEntity<String> getNameUpperCase(@RequestBody GetNameUpperCaseRequestDto dto){
        if(dto.getName()==null){
            throw new Java8StartException(ErrorType.BAD_REQUEST_ERROR);
        }
        String nameUpper = dto.getName().toUpperCase();
        return ResponseEntity.ok(nameUpper);
    }

}
