package com.keremturak.mapper;

import com.keremturak.dto.request.SavePersonelRequestDto;
import com.keremturak.dto.response.FindAllVwUserResponseDto;
import com.keremturak.repository.entity.Personel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPersonelMapper {
    IPersonelMapper INSTANCE = Mappers.getMapper(IPersonelMapper.class);

    @Mapping(source = "memberDate", target = "giristarihi")
    Personel PersonelFromDto(final SavePersonelRequestDto dto);


    FindAllVwUserResponseDto DtofromPersonel(final Personel personel);
}
