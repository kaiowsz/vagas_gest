package app.vercel.kaiowsz.gestao_vagas.modules.candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

// @Data to setters and getters in once;

@Data
@Entity(name = "candidate")
public class CandidateEntity {
    
    @NotBlank(message = "O campo nome é obrigatório.")
    @Schema(example = "Kaio")
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "Username inválido.")
    @Schema(example = "kaiowsz")
    private String username;

    @NotBlank()
    @Email(message = "O email inserido deve ser válido.")
    @Schema(example = "kaio@gmail.com")
    private String email;

    @NotBlank()
    @Length(min = 8, message = "A senha deve ter no mínimo 8 dígitos.")
    @Schema(example = "12345678", minLength = 8)
    private String password;
    
    @Schema(example = "Web Developer")
    private String description;
    
    private String curriculum;
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
