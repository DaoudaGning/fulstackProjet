package org.gning.api;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AppartementRepository implements PanacheRepository<Appartement> {
  
}
