package com.keremturak.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class PersonelDepartman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long departmanid;
    Long personelid;
}
