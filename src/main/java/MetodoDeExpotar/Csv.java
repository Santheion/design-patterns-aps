package MetodoDeExpotar;

import dto.Usuario;

import java.util.List;

public class Csv implements MetodoDeExportar {
    @Override
    public void gerarRelatorio(List<Usuario> dados) {
        System.out.println("Id;Nome;Email;Telefone;\n");
        dados.stream().forEach((d) -> {
            System.out.println(
                    String.format("%s;%s;%s;%s;\n")
            );
        });
    }
}
