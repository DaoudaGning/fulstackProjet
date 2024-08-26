package org.gning.api;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AppartementService {

    @Inject
    AppartementRepository appartementRepository;

    @Transactional
    public void ajouterAppartement(Appartement appartement) {
        appartementRepository.persist(appartement);
    }

    @Transactional
    public void modifierAppartement(Long id, Appartement appartement) {
        Appartement entity = appartementRepository.findById(id);
        if (entity != null) {
            entity.setAdresse(appartement.getAdresse());
            entity.setNombreDeChambres(appartement.getNombreDeChambres());
            entity.setNombreDeSallesDeBain(appartement.getNombreDeSallesDeBain());
            entity.setNombreDeSalons(appartement.getNombreDeSalons());
            entity.setCuisineEquipee(appartement.isCuisineEquipee());
            entity.setAutresCommodites(appartement.getAutresCommodites());
        }
    }

    @Transactional
    public void supprimerAppartement(Long id) {
        appartementRepository.deleteById(id);
    }

    public List<Appartement> listerAppartements() {
        return appartementRepository.listAll();
    }

    public Appartement trouverAppartement(Long id) {
        return appartementRepository.findById(id);
    }
}
