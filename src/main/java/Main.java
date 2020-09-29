import MetodoDeExpotar.MetodoDeExportar;
import MetodoDeExpotar.MetodoDeExpotarFactory;
import Relatorios.Relatorio;
import Relatorios.RelatorioMocked;
import exceptions.MetodoDeExportarException;
import utils.GetUserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos gerar um relatório!\n");
        System.out.println("Digite o formato que deseja exportar seu relatório! ( Csv ou Excel )");
        String formato = GetUserInput.read();

        try {
            Relatorio relatorio = new RelatorioMocked();
            MetodoDeExportar metodoDeExportar = MetodoDeExpotarFactory.getMetodoDeExportar(formato);
            relatorio.setMetodoDeExportar(metodoDeExportar);
            relatorio.gerarRelatorio();
        } catch (MetodoDeExportarException e){
            System.out.println("Método de exportar preenchido não encontrado");
        } catch (Exception e){
            e.getStackTrace();
        }

    }


}
