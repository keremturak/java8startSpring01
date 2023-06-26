package com.keremturak.controller;

import com.keremturak.dto.request.SavePersonelRequestDto;
import com.keremturak.dto.response.FindAllVwUserResponseDto;
import com.keremturak.mapper.IPersonelMapper;
import com.keremturak.repository.entity.Personel;
import com.keremturak.service.PersonelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.keremturak.constants.RestApiList.*;

@RestController
@RequestMapping("/personel")

public class PersonelController {
    PersonelService service;

    public PersonelController(PersonelService service) {
        this.service = service;
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Personel>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(FINDALLVWUSER)
    public ResponseEntity<List<FindAllVwUserResponseDto>> getAllVwPersonel() {
        List<Personel> plist = service.findAll();
        List<FindAllVwUserResponseDto> result = new ArrayList<>();
        plist.forEach(x -> {
            FindAllVwUserResponseDto dto = FindAllVwUserResponseDto.builder()
                    .id(x.getId())
                    .ad(x.getAd())
                    .photo(x.getPhoto())
                    .build();
            result.add(dto);
        });
        return ResponseEntity.ok(result);
    }

    @PostMapping(SAVEDTO)
    public ResponseEntity<Boolean> savePersonelDto(@RequestBody SavePersonelRequestDto dto) {
        Personel personel = Personel.builder()
                .ad(dto.getAd())
                .adres(dto.getAdres())
                .telefon(dto.getTelefon())
                .build();
        service.save(personel);
        return ResponseEntity.ok(true);

    }
    @PostMapping(SAVEDTO2)
    public ResponseEntity<Boolean> savePersonelMapperDto2(@RequestBody SavePersonelRequestDto dto){

        return ResponseEntity.ok(service.saveFromDto(dto));
    }

    @GetMapping(FINDALLVWUSERMAPPER)
    public ResponseEntity<List<FindAllVwUserResponseDto>> getAllPersonelMapper(){
        List<Personel> plist = service.findAll();
        List<FindAllVwUserResponseDto> result = new ArrayList<>();
        plist.forEach(x -> {
            FindAllVwUserResponseDto findAllVwUserResponseDto = IPersonelMapper.INSTANCE.DtofromPersonel(x);
            result.add(findAllVwUserResponseDto);
        });
        return ResponseEntity.ok(result);

    }

}
