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

    public JMenuItem getMncrearperso() {
        return mncrearperso;
    }

    public void setMncrearperso(JMenuItem mncrearperso) {
        this.mncrearperso = mncrearperso;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TIENDA = new javax.swing.JLabel();
        despanemenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MNUcliente = new javax.swing.JMenu();
        mncrearperso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOFTWARE VENTAS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TIENDA.setBackground(new java.awt.Color(153, 0, 0));
        TIENDA.setForeground(new java.awt.Color(0, 0, 0));
        TIENDA.setText("TIENDA");
        getContentPane().add(TIENDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 638, 1055, 40));

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

        mncrearperso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mncrearperso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/profile_plus [#1354].png"))); // NOI18N
        mncrearperso.setText("CREAR CLIENTE");
        mncrearperso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mncrearpersoActionPerformed(evt);
            }
        });
        MNUcliente.add(mncrearperso);

        jMenuBar1.add(MNUcliente);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mncrearpersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mncrearpersoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mncrearpersoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MNUcliente;
    private javax.swing.JLabel TIENDA;
    private javax.swing.JDesktopPane despanemenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mncrearperso;
    // End of variables declaration//GEN-END:variables
}
