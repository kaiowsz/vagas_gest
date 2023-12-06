package app.vercel.kaiowsz.gestao_vagas.modules.candidate;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

    // using findBy, spring knows what to search for. if you wanna search for both at the same time, use: findByUsernameAndEmail.
    
    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);

    Optional<CandidateEntity> findByUsername(String username);

}
