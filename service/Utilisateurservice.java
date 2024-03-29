package P2Mbackend.backendp2m.service;

import P2Mbackend.backendp2m.dto.Utilisateurdto;

import java.util.List;
import java.util.UUID;

public interface Utilisateurservice {
    Utilisateurdto createUtilisateur(Utilisateurdto utilisateurdto);
    Utilisateurdto getUtilisateurById(UUID utilisateurId);
    List<Utilisateurdto> getAllUtilisateurs ();
    Utilisateurdto updateUtilisateur(UUID utilisateurId,Utilisateurdto updatedUtilisateur);
    void deleteUtilisateur(UUID utilisateurId);

}
