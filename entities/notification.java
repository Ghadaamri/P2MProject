package P2Mbackend.backendp2m.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table (name="notifications")
@Data
public class notification {
    @Id
    @Column(name="id")
    private Long id;
    @Column (name="destinataire")
    private String destinataire;
    @Column (name="contenu_notif")
    private String contenu;
    @Column(name="date_envoi")
    private LocalDate date_envoi ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public LocalDate getDate_envoi() {
        return date_envoi;
    }

    public void setDate_envoi(LocalDate date_envoi) {
        this.date_envoi = date_envoi;
    }
}
