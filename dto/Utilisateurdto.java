package P2Mbackend.backendp2m.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Utilisateurdto {

        private UUID id;
        private String mdp;
        private  String nom;
        private  String prenom;
        private  String adressemail;
       private LocalDate datenaissance;


}
