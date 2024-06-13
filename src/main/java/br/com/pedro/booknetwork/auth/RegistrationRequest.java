package br.com.pedro.booknetwork.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Firstname name is mandatory")
    @NotBlank(message = "Firstname name is mandatory")
    private String firstName;
    @NotEmpty(message = "Lastname name is mandatory")
    @NotBlank(message = "Lastname name is mandatory")
    private String lastName;
    @Email(message = "Email not formatted")
    @NotEmpty(message = "Email name is mandatory")
    @NotBlank(message = "Email name is mandatory")
    private String email;
    @NotEmpty(message = "Password name is mandatory")
    @NotBlank(message = "Password name is mandatory")
    @Size(min = 8, message = "Password should be 8 characters long minimum")
    private String password;
}
