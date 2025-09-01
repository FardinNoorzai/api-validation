package test.apivalidation.dtos;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;

@Data
public class UserDTO {

    @NotBlank(message = "{name.required}")
    @Size(min = 2, max = 50, message = "{name.size}")
    private String name;

    @NotBlank(message = "{email.required}")
    @Email(message = "{email.invalid}")
    private String email;

    @NotBlank(message = "{password.required}")
    @Size(min = 8, message = "{password.size}")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$",
            message = "{password.pattern}"
    )
    private String password;

    @NotBlank(message = "{role.required}")
    @Size(min = 2, max = 20, message = "{role.size}")
    private String role;

    @NotNull(message = "{createdAt.required}")
    private Instant createdAt;

    @NotNull(message = "{birthday.required}")
    @Past(message = "{birthday.past}")
    private LocalDate birthday;
}
