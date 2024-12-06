package ma.projet.grpc.services;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.repositories.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public Compte findCompteById(Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }

    // Nouvelle méthode pour sauvegarder un compte
    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }
}
