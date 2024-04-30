package dz.sofiane.apt_9.apt9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Apt9Application {

	public static void main(String[] args) {
		SpringApplication.run(Apt9Application.class, args);
	}

	@Autowired
     PatientMapper patientMapper;

	@Autowired
	ConsultationMapper consultationMapper;*/
	@Autowired
	LigneConsultationMapper ligneConsultationMapper;
	@Autowired
	RendezVousMapper rendezVousMapper;
	@Autowired
	Traitement traitement;
	@Override
	public void run(String... args) throws Exception {
//		 TODO : récupérer la liste de tous les patients puis afficher leurs noms
		List<Patient> patients=patientMapper.getAll();
		for (Patient patient : patients) {
			System.out.println(patient);
		}
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
            System.out.println("***************************************************************************************************************************************");
		List<Patient> patients1=patientMapper.getByName("Yahi");
		for (Patient patient: patients1){
			System.out.println(patient);
		}
// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
		Patient patient=new Patient();
                 patient.setId(19);
		 patient.setAdresse("bouira");
		 patient.setDateNaissance(new Date(1995,5,9));
		 patient.setPrenom("sofiane");
		 patient.setSexe("h");
		 patient.setNumeroTelephone("123456");
		 patient.setNom("larachi");
	     patientMapper.createPatient(patient);
               System.out.println("patient created successfully");

		System.out.println("***************************************************************************************************************************************");

		// TODO : rechercher la consultation ayant id=3

		Consultation consultation=consultationMapper.getById(3);
		System.out.println(consultation);
		System.out.println("***************************************************************************************************************************************");
		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
		

}
