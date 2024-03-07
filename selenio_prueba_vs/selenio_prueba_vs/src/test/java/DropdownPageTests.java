import driverConfiguracion.Inicio;
import org.testng.annotations.Test;
import pages.DropdownPage;


public class DropdownPageTests extends Inicio {


    @Test //selecciona la opcion que le pasamos a la variable option
    public void testSelectOptionTwo() throws InterruptedException {
        DropdownPage dropdown = homepage.clickDropDown();
        Thread.sleep(1000);
        String option = "Option 2";
        dropdown.selectFromDropDown(option);
        Thread.sleep(1000);

    }

    /*

    * ir a la pagina principal (url)
    * click en dropdown
    * click para seleccionar la opcion 1
    *
   Resultado esperado muestra la opcion 1 seleccionada



    * ir a la pagina principal (url)
    * click en dropdown
    * click para seleccionar la opcion 2
    *
   Resultado esperado muestra la opcion 2 seleccionada
    * */

    @Test //selecciona la opcion que le pasamos a la variable option
    public void testOptionOne() throws InterruptedException {
        DropdownPage dropdown = homepage.clickDropDown();
        Thread.sleep(1500);
        String option = "Option 1";
        dropdown.selectFromDropDown(option);
        Thread.sleep(1500);

    }



}
