package app.vercel.kaiowsz.gestao_vagas.modules.candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "candidate")
// @Data to setters and getters in once;

public class CandidateEntity {
    
    @NotBlank(message = "O campo nome é obrigatório.")
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "Username inválido.")
    private String username;

    @NotBlank()
    @Email(message = "O email inserido deve ser válido.")
    private String email;

    @NotBlank()
    @Length(min = 8, message = "A senha deve ter no mínimo 8 dígitos.")
    private String password;
    
    private String description;
    
    private String curriculum;
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
