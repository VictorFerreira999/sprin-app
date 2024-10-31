package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // Construtor sem argumentos necessário para a desserialização
public class User {
    private String name;
    private String email;

    public String getName() {
        return null;
    }
}
