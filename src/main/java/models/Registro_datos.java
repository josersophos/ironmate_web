package models;
import lombok.Data;
//con esta libreria importamos lombok y evitamos colocar los getters y setters
@Data
public class Registro_datos {

    private String strUrl;
    private String strNombre;
    private String strApellido;
    private String strEmail;
    private String strEdad;
    private String strSalario;
    private String strDepartamento;

    private String strValidateNombre;


    public Registro_datos(String strUrl, String strNombre, String strApellido, String strEmail, String strEdad, String strSalario, String strDepartamento, String strValidateNombre) {
        this.strUrl = strUrl;
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strEmail = strEmail;
        this.strEdad = strEdad;
        this.strSalario = strSalario;
        this.strDepartamento = strDepartamento;
        this.strValidateNombre = strValidateNombre;
    }

}
