package MetodoDeExpotar;

import dto.Usuario;

import java.util.List;

public interface MetodoDeExportar {
    public abstract void gerarRelatorio(List<Usuario> dados);
}
