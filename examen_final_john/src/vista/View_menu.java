package vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class View_menu extends javax.swing.JFrame {
    public View_menu() {
        initComponents();
    }

    public JMenu getMNUcliente() {
        return MNUcliente;
    }

    public void setMNUcliente(JMenu MNUcliente) {
        this.MNUcliente = MNUcliente;
    }

    public JDesktopPane getDespanemenu() {
        return despanemenu;
    }

    public void setDespanemenu(JDesktopPane despanemenu) {
        this.despanemenu = despanemenu;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenuItem getBtncreaclimenu() {
        return btncreaclimenu;
    }

    public void setBtncreaclimenu(JMenuItem btncreaclimenu) {
        this.btncreaclimenu = btncreaclimenu;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        despanemenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MNUcliente = new javax.swing.JMenu();
        btncreaclimenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOFTWARE VENTAS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        despanemenu.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout despanemenuLayout = new javax.swing.GroupLayout(despanemenu);
        despanemenu.setLayout(despanemenuLayout);
        despanemenuLayout.setHorizontalGroup(
            despanemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        despanemenuLayout.setVerticalGroup(
            despanemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(despanemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 600));

        jMenuBar1.setBackground(new java.awt.Color(153, 0, 0));

        MNUcliente.setForeground(new java.awt.Color(255, 255, 255));
        MNUcliente.setText("CLIENT E");
        MNUcliente.setBorderPainted(false);
        MNUcliente.setContentAreaFilled(false);

        btncreaclimenu.setText("crear");
        MNUcliente.add(btncreaclimenu);

        jMenuBar1.add(MNUcliente);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MNUcliente;
    private javax.swing.JMenuItem btncreaclimenu;
    private javax.swing.JDesktopPane despanemenu;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
