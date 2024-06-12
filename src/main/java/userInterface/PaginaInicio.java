package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")

public class PaginaInicio extends PageObject {

   public static final Target Menu_elements = Target.the("Click opción elements").located(By.xpath("//*[@class='card mt-4 top-card'][1]"));
   public static final Target Web_Tables = Target.the("click opcion web tables").located(By.xpath("//*[text()='Web Tables']"));
   public static final Target Add_Registro = Target.the("click Add registro").located(By.id("addNewRecordButton"));
   public static final Target First_Name = Target.the("ingresar nombre").located(By.id("firstName"));
   public static final Target Last_Name = Target.the("ingresar apellido").located(By.id("lastName"));
   public static final Target User_Email = Target.the("ingresar email").located(By.id("userEmail"));
   public static final Target Age = Target.the("ingresar edad").located(By.id("age"));
   public static final Target Salary = Target.the("ingresar salario").located(By.id("salary"));
   public static final Target Department = Target.the("ingresar departamento").located(By.id("department"));
   public static final Target Submit = Target.the("guardar datos").located(By.id("submit"));
   public static final Target Delete_record1 = Target.the("borrar registro 1").located(By.id("delete-record-1"));

   public static final Target Validate_Registro = Target.the("Validar registro 1").locatedBy("//div[@class='rt-td' and contains(text(),'{0}')]" );
   //public static final Target Validate_Registro = Target.the("Validar registro 1").located(By.className("text-center"));


}
