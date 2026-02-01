package br.dev.tblima.gestaovagas.modules.company.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "company")
@Data
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "Username cannot be empty or whitespace")
    private String username;

    @Email(message = "Invalid email format")
    private String email;

    @Length(min = 10, max = 100, message = "Password must have between 10 and 100 characters")
    private String password;

    private String website;

    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
