package desafio.dominio;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Mentoria {
    String titulo;
    String descricao;
    LocalDate data;

}
