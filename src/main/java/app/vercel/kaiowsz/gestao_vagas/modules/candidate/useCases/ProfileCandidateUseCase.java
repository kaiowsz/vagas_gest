package app.vercel.kaiowsz.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import app.vercel.kaiowsz.gestao_vagas.modules.candidate.CandidateRepository;
import app.vercel.kaiowsz.gestao_vagas.modules.candidate.dto.ProfileCandidateResponseDTO;

@Service
public class ProfileCandidateUseCase {
    
    @Autowired
    private CandidateRepository candidateRepository;
    
    public ProfileCandidateResponseDTO execute(UUID idCandidate) {
        var candidate = this.candidateRepository.findById(idCandidate)
        .orElseThrow(() -> {
            throw new UsernameNotFoundException("User not found.");
        });

        var candidateDTO = ProfileCandidateResponseDTO.builder()
        .description(candidate.getDescription())
        .username(candidate.getUsername())
        .name(candidate.getName())
        .email(candidate.getEmail())
        .id(candidate.getId())
        .build();
    
        return candidateDTO;

    }
}
