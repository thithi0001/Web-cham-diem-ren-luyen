package app.mapper;

import app.dto.StudentDTO;
import app.models.Students;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "dd/MM/yyyy")
    StudentDTO toDto(Students student);
}
