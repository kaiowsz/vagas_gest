package app.vercel.kaiowsz.gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;

@Data
public class CreateJobDTO {
    
    @Schema(example = "Vaga para desenvolvedor web júnior.", requiredMode = RequiredMode.REQUIRED)
    private String description;
    
    @Schema(example = "Plano de Saúde, etc...", requiredMode = RequiredMode.REQUIRED)
    private String benefits;
    
    @Schema(example = "Junior/Pleno", requiredMode = RequiredMode.REQUIRED)
    private String level;
}
