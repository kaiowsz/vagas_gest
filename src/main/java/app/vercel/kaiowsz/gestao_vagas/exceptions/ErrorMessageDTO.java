package app.vercel.kaiowsz.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

// DTO - data transfer to object;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {
    private String message;
    private String field;
}
