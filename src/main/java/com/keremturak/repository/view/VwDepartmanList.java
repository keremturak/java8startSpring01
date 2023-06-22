package com.keremturak.repository.view;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder

public class VwDepartmanList {
    Long id;
    String ad;
    VwDepartmanList(Long id, String ad){
        this.id = id;
        this.ad=ad;
    }
}
