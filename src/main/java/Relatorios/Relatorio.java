package Relatorios;

import MetodoDeExpotar.MetodoDeExportar;
import dto.Usuario;

import java.util.List;

public abstract class Relatorio {
    protected List<Usuario> dados;

    public abstract void buscarDados();

    private MetodoDeExportar metodoDeExportar;

    public void setMetodoDeExportar(MetodoDeExportar metodoDeExportar) {
        this.metodoDeExportar = metodoDeExportar;
    }

    public void gerarRelatorio(){
        metodoDeExportar.gerarRelatorio(dados);
    }
}
