package app.vercel.kaiowsz.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {
    
    @Schema(example = "Desenvolvedor Web.") 
    private String description;
    
    @Schema(example = "Kaiowsz")
    private String username;
    
    @Schema(example = "kaio@gmail.com")
    private String email;
    
    @Schema(example = "Kaio")
    private String name;
   
    private UUID id;
}
