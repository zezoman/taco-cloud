package tacos.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "Thr name must be at least 5 chars long")
    private String name;
    @Size(min = 1, message = "You must add at least 1 ingredient")
    private List<String> ingredients;

}
