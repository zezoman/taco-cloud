package tacos.domain;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {
    @NotBlank(message = "name must not be empty")
    private String name;
    @NotBlank(message = "street must not be empty")
    private String street;
    @NotBlank(message = "city must not be empty")
    private String city;
    @NotBlank(message = "state must not be empty")
    private String state;
    @NotBlank(message = "zip must not be empty")
    private String zip;

    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV code")
    private String ccCVV;
}
