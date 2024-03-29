package P2Mbackend.backendp2m.repositories;

import P2Mbackend.backendp2m.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Utilisateurrepository extends JpaRepository <Utilisateur, UUID> {





}
