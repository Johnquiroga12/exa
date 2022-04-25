package examen_final_john;

import controlador.controlador_menuprin;
import vista.View_menu;

public class Examen_final_john {

    public static void main(String[] args) {
                View_menu vista=new View_menu();
        controlador_menuprin conto= new controlador_menuprin(vista);
        conto.insercontrol();

    }
    
}
