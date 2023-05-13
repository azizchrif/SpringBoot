package com.example.cherifaziz.Repositories;

import com.example.cherifaziz.entities.Abonnement;
import com.example.cherifaziz.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {
    List<Abonnement> findByTypeAbonOrderByDateDebut(TypeAbonnement typeAbonnement);
    List<Abonnement> findAbonnementByDateDebutAndDateFin(LocalDate startDate, LocalDate endDate);
}


