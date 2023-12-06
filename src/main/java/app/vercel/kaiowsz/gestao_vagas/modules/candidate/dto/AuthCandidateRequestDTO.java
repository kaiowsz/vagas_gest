package app.vercel.kaiowsz.gestao_vagas.modules.candidate.dto;

public record AuthCandidateRequestDTO(String username, String password) {



}

// Records are created to storage immutable data. They have their own getter to get the dates. 

// They don't have setters justly because they storage IMMUTABLE data.