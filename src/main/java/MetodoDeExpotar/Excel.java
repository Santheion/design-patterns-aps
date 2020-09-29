package MetodoDeExpotar;

import dto.Usuario;

import java.util.List;

public class Excel implements MetodoDeExportar {
    public void gerarRelatorio(List<Usuario> dados) {
        System.out.format("|---------|-------|-------|---------|%n");
        System.out.format("|    Id   | Nome  | Email | Telefone|%n");
        System.out.format("|---------|-------|-------|---------|%n");
        dados.stream().forEach((Usuario dado) -> {
            System.out.format(String.format(
                    "|    %s   | %s  | %s | %s|%n", dado.getId(), dado.getNome(), dado.getEmail(), dado.getTelefone()
            ));
        });
    }
}
