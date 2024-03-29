package P2Mbackend.backendp2m.controller;

import P2Mbackend.backendp2m.dto.Utilisateurdto;
import P2Mbackend.backendp2m.service.Utilisateurservice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/utilisateurs")
public class Utilisateurcontroller {

    private final Utilisateurservice utilisateurservice;

    // Endpoint to add utilisateur via REST API
    @PostMapping
    public ResponseEntity<Utilisateurdto> createUtilisateur(@RequestBody Utilisateurdto utilisateurdto) {
        Utilisateurdto savedutilisateur = utilisateurservice.createUtilisateur(utilisateurdto);
        return new ResponseEntity<>(savedutilisateur, HttpStatus.CREATED);
    }
    //GET UTILISATEUR REST API
    @GetMapping("{id}")
    public  ResponseEntity<Utilisateurdto> getUtilisateurById(@PathVariable("id") UUID utilisateurId){
      Utilisateurdto utilisateurdto=  utilisateurservice.getUtilisateurById(utilisateurId);
      return ResponseEntity.ok(utilisateurdto);
    }
    //GET All UTILISATEUR REST API
    @GetMapping
    public  ResponseEntity<List<Utilisateurdto>> getAllUtilisateur(){
        List<Utilisateurdto> utilisateurs= utilisateurservice.getAllUtilisateurs();
        return  ResponseEntity.ok(utilisateurs);
    }

    // Update Employee REST API
@PutMapping("{id}")
   public  ResponseEntity<Utilisateurdto> updateUtilisateur(@PathVariable("id") UUID utilisateurId, @RequestBody Utilisateurdto updatedUtilisateur){
       Utilisateurdto utilisateurdto =  utilisateurservice.updateUtilisateur(utilisateurId, updatedUtilisateur);

       return  ResponseEntity.ok(utilisateurdto);

   }



    // Delete Employee REST API
@DeleteMapping("{id}")
    public  ResponseEntity<String> deleteUtilisateur( @PathVariable("id") UUID utilisateurId){
        utilisateurservice.deleteUtilisateur(utilisateurId);
        return  ResponseEntity.ok(("utilisateur deleted succesfully !"));

    }




}
