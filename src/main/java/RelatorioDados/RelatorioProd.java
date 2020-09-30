package RelatorioDados;

import Relatorios.Relatorio;

import java.util.ArrayList;

public class RelatorioProd extends Relatorio {
    // Retorna dados para produção
    @Override
    public void buscarDados() {
        this.dados = new ArrayList<>();
    }
}
