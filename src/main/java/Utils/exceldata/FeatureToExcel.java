package Utils.exceldata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FeatureToExcel {
    public static void main(String[] args) {
        List<String[]> data = new ArrayList<>();

        // Agrega las cabeceras
        data.add(new String[]{"Nombre", "Apellido", "Email", "Edad", "Salario", "Departamento"});

        // Agrega los datos de los ejemplos
        data.add(new String[]{"Andres Felipe", "Uruburu Berrio", "andres.uruburu@sophos.com", "27", "4000000", "QA"});
        data.add(new String[]{"Sara", "Alvarez", "sara@sophos.com", "32", "4100000", "Dev"});

        ExcelWriter excelWriter = new ExcelWriter();
        try {
            excelWriter.writeToExcel(data, "Testdata.xlsx");
            System.out.println("Datos escritos correctamente en Testdata.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
