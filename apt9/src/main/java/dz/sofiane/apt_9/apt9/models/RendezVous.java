package dz.sofiane.apt_9.apt9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class RendezVous {

    private int id;
    private Timestamp date_rdv;
    private Patient id_patient;
}
