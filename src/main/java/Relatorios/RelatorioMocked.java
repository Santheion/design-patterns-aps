package Relatorios;

import java.util.ArrayList;

public class RelatorioMocked extends Relatorio {
    @Override
    public void buscarDados() {
        this.dados = new ArrayList<>();
    }
}
