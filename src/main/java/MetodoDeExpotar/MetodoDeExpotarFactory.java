package MetodoDeExpotar;

import exceptions.MetodoDeExportarException;

public class MetodoDeExpotarFactory {
    public static MetodoDeExportar getMetodoDeExportar(String metodoDeExportar) throws MetodoDeExportarException {
        switch (metodoDeExportar){
            case("Excel"):
                return new Excel();
            case("Csv"):
                return new Csv();
            default:
                throw new MetodoDeExportarException();
        }
    }
}
