package com.example.cherifaziz.Services;


import com.example.cherifaziz.entities.Cours;

import java.util.List;
import java.util.Optional;

public interface ICoursService {

    List<Cours> retrieveAllCours();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Optional<Cours> retrieveCours (Long numCours);

    void removeCours(Long numCours);

}
