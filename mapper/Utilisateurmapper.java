package P2Mbackend.backendp2m.mapper;

import P2Mbackend.backendp2m.dto.Utilisateurdto;
import P2Mbackend.backendp2m.entities.Utilisateur;

public class Utilisateurmapper {
    public static Utilisateurdto mapToUtilisateurDTO(Utilisateur utilisateur) {
        return new Utilisateurdto(
                utilisateur.getId(),
                utilisateur.getMdp(),
                utilisateur.getNom(),
                utilisateur.getPrenom(),
                utilisateur.getAdressemail(),
                utilisateur.getDatenaissance()
        );
    }

    public static Utilisateur mapToUtilisateur(Utilisateurdto utilisateurdto) {
        Utilisateur user = new Utilisateur();
        user.setId(utilisateurdto.getId());
        user.setMdp(utilisateurdto.getMdp());
        user.setNom(utilisateurdto.getNom());
        user.setPrenom(utilisateurdto.getPrenom());
        user.setAdressemail(utilisateurdto.getAdressemail());
       user.setDatenaissance(utilisateurdto.getDatenaissance());
        return user;
    }
}
