package app.vercel.kaiowsz.gestao_vagas.modules.company.dto;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthCompanyDTO {
    
    private String password;
    private String username;

}
