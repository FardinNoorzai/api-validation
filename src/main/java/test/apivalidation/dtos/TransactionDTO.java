package test.apivalidation.dtos;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@ToString
public class TransactionDTO {


    @NotNull(message = "{transactionId.required}")
    @Size(min = 10, max = 20, message = "{transactionId.size}")
    private String transactionId;

    @NotNull(message = "{transactionType.required}")
    @Pattern(regexp = "DEBIT|CREDIT|TRANSFER|PAYMENT", message = "{transactionType.invalid}")
    private String transactionType;

    @NotNull(message = "{transactionDate.required}")
    @PastOrPresent(message = "{transactionDate.pastOrPresent}")
    private LocalDate transactionDate;

    @NotNull(message = "{amount.required}")
    @DecimalMin(value = "0.01", inclusive = true, message = "{amount.min}")
    @Digits(integer = 15, fraction = 2, message = "{amount.digits}")
    private BigDecimal amount;

    @PositiveOrZero(message = "{fee.positiveOrZero}")
    @Digits(integer = 10, fraction = 2, message = "{fee.digits}")
    private BigDecimal fee;


    @NotNull(message = "{sourceAccount.required}")
    @Size(min = 10, max = 20, message = "{sourceAccount.size}")
    private String sourceAccount;

    @NotNull(message = "{destinationAccount.required}")
    @Size(min = 10, max = 20, message = "{destinationAccount.size}")
    private String destinationAccount;


    @NotNull(message = "{customerId.required}")
    @Size(min = 5, max = 15, message = "{customerId.size}")
    private String customerId;

    @NotBlank(message = "{customerName.required}")
    @Size(min = 3, max = 100, message = "{customerName.size}")
    private String customerName;

    @Email(message = "{customerEmail.invalid}")
    private String customerEmail;


    @Positive(message = "{loanAmount.positive}")
    @Digits(integer = 15, fraction = 2, message = "{loanAmount.digits}")
    private BigDecimal loanAmount;

    @Min(value = 1, message = "{loanTermMonths.min}")
    @Max(value = 360, message = "{loanTermMonths.max}")
    private Integer loanTermMonths;

    @DecimalMin(value = "0.0", inclusive = true, message = "{interestRate.min}")
    @DecimalMax(value = "100.0", inclusive = true, message = "{interestRate.max}")
    private BigDecimal interestRate;


    @NotNull(message = "{status.required}")
    @Pattern(regexp = "PENDING|COMPLETED|FAILED|CANCELLED", message = "{status.invalid}")
    private String status;

    private Boolean recurring;


    @Size(max = 255, message = "{notes.size}")
    private String notes;

}
