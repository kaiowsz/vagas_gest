package app.vercel.kaiowsz.gestao_vagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import app.vercel.kaiowsz.gestao_vagas.exceptions.UserAlreadyExistsException;
import app.vercel.kaiowsz.gestao_vagas.modules.candidate.CandidateEntity;
import app.vercel.kaiowsz.gestao_vagas.modules.candidate.CandidateRepository;

// @service é uma anotation que declara que aqui é uma camada de serviço. (no caso, aqui estão as regras de negócios da aplicação.)

@Service
public class CreateCandidateUseCase {
    @Autowired
    private CandidateRepository candidateRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        
        this.candidateRepository
        .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
        .ifPresent(user -> {
            throw new UserAlreadyExistsException();
        });

        var password = passwordEncoder.encode(candidateEntity.getPassword());

        candidateEntity.setPassword(password);

        return this.candidateRepository.save(candidateEntity);
    }
}