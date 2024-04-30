package dz.sofiane.apt_9.apt9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int id;
    private String nom;
    private String prenom;
    private String sexe;
    private Date dateNaissance;
    private String numeroTelephone;
    private String adresse;
}
