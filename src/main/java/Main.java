import MetodoDeExpotar.MetodoDeExportar;
import MetodoDeExpotar.MetodoDeExpotarFactory;
import RelatorioDados.RelatorioMocked;
import RelatorioDados.RelatorioProd;
import Relatorios.Relatorio;
import exceptions.MetodoDeExportarException;
import utils.GetUserInput;

import java.util.Scanner;

public class Main {
    private static boolean IS_TEST_ENV = true;

    public static void main(String[] args) {
        System.out.println("Vamos gerar um relatório!\n");
        System.out.println("Digite o formato que deseja exportar seu relatório! ( Csv ou Excel )");
        String formato = GetUserInput.read();
        Relatorio relatorio;

        try {
            if(IS_TEST_ENV)
                relatorio = new RelatorioMocked();
            else
                relatorio = new RelatorioProd();

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
