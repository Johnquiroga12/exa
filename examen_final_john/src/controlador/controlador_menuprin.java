package controlador;

import modelo.modelo_cliente;
import vista.View_menu;
import vista.vista_cliente;

public class controlador_menuprin {

    View_menu vistamenu;

    public controlador_menuprin(View_menu vistamenu) {
        this.vistamenu = vistamenu;
        vistamenu.setVisible(true);
    }
    public void insercontrol() {
        vistamenu.getMncrearperso().addActionListener(j -> crudperso()); 
    }

    private void crudperso() {
        modelo_cliente permodel = new modelo_cliente();
        vista_cliente viperso = new vista_cliente();
        vistamenu.getDespanemenu().add(viperso);
        control_cli control = new control_cli(permodel, viperso);
        control.controlpersona();
    }


}
