package com.keremturak.dto.request;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class SavePersonelRequestDto {
    String token;
    String ad;
    String adres;
    String telefon;
    String acilDurumKisisi;
    String acilDurumTelefonu;
    Long memberDate;
}
