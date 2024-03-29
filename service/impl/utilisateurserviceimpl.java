package P2Mbackend.backendp2m.service.impl;

import P2Mbackend.backendp2m.entities.Utilisateur;
import P2Mbackend.backendp2m.exception.RessouceNotFoundException;
import P2Mbackend.backendp2m.mapper.Utilisateurmapper;
import P2Mbackend.backendp2m.repositories.Utilisateurrepository;
import P2Mbackend.backendp2m.dto.Utilisateurdto;
import P2Mbackend.backendp2m.service.Utilisateurservice;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class utilisateurserviceimpl implements Utilisateurservice {
    private Utilisateurrepository utilisateurrepository;

    @Override
    public Utilisateurdto createUtilisateur(Utilisateurdto utilisateurdto) {
        Utilisateur utilisateur = Utilisateurmapper.mapToUtilisateur(utilisateurdto);
        Utilisateur savedutilisateur = utilisateurrepository.save(utilisateur);
        return Utilisateurmapper.mapToUtilisateurDTO(savedutilisateur);
    }

    @Override
    public Utilisateurdto getUtilisateurById(UUID utilisateurId) {
        Utilisateur utilisateur = utilisateurrepository.findById(utilisateurId)

                .orElseThrow(() ->
                        new RessouceNotFoundException("utilisateur does not exist with given id:"+utilisateurId));
        return Utilisateurmapper.mapToUtilisateurDTO(utilisateur);
    }

    @Override
    public List<Utilisateurdto> getAllUtilisateurs() {
        List<Utilisateur> utilisateurs = utilisateurrepository.findAll();
        return utilisateurs.stream()
                .map(utilisateur -> Utilisateurmapper.mapToUtilisateurDTO(utilisateur))
                .collect(Collectors.toList());
    }

    @Override
    public Utilisateurdto updateUtilisateur(UUID utilisateurId,Utilisateurdto updatedUtilisateur) {
        Utilisateur utilisateur=  utilisateurrepository.findById(utilisateurId)
                .orElseThrow(() ->
                        new RessouceNotFoundException("utilisateur does not exist with given id:"+utilisateurId));



        utilisateur.setPrenom(updatedUtilisateur.getPrenom());
        utilisateur.setNom(updatedUtilisateur.getNom());
        utilisateur.setMdp(updatedUtilisateur.getMdp());
        utilisateur.setAdressemail(updatedUtilisateur.getAdressemail());
        utilisateur.setAdressemail(String.valueOf(updatedUtilisateur.getDatenaissance()));
        Utilisateur  updatedUtilisateurObj = utilisateurrepository.save(utilisateur);


       return Utilisateurmapper.mapToUtilisateurDTO(updatedUtilisateurObj);

    }





    @Override
    public void deleteUtilisateur(UUID utilisateurId) {
        Utilisateur utilisateur=  utilisateurrepository.findById(utilisateurId)
                .orElseThrow(() ->
                        new RessouceNotFoundException("utilisateur does not exist with given id:"+utilisateurId));
        utilisateurrepository.deleteById(utilisateurId);
    }
}