package dz.sofiane.apt_9.apt9.mappers;

import dz.sofiane.apt_9.apt9.models.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {

     List<Patient> getAll();

    List<Patient>getByName(String name);
     void createPatient(Patient patient) ;


}
