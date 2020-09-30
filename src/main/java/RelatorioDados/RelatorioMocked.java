package RelatorioDados;

import Relatorios.Relatorio;

import java.util.ArrayList;

public class RelatorioMocked extends Relatorio {

    // Retorna dados para testes
    @Override
    public void buscarDados() {
        this.dados = new ArrayList<>();
    }
}
