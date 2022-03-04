package desafio.dominio;

import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void increverBootcamp(Bootcamp bootcamp) {}

    public void progrdir() {}

    public void calcularTotalXp() {}

}
