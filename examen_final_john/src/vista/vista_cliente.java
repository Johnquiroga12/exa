package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
public class vista_cliente extends javax.swing.JInternalFrame {
    //SE CREA LOS GETTER Y SETTER  
    
    public vista_cliente() {
        initComponents();
    }

    public JButton getBtnactual() {
        return btnactual;
    }

    public void setBtnactual(JButton btnactual) {
        this.btnactual = btnactual;
    }

    public JButton getBtneliminar1() {
        return btneliminar1;
    }

    public void setBtneliminar1(JButton btneliminar1) {
        this.btneliminar1 = btneliminar1;
    }

    public JButton getBtnexaminar1() {
        return btnexaminar1;
    }

    public void setBtnexaminar1(JButton btnexaminar1) {
        this.btnexaminar1 = btnexaminar1;
    }

    public JDateChooser getFecha() {
        return fecha;
    }

    public void setFecha(JDateChooser fecha) {
        this.fecha = fecha;
    }

    public JTextField getTxtdireccion() {
        return txtdireccion;
    }

    public void setTxtdireccion(JTextField txtdireccion) {
        this.txtdireccion = txtdireccion;
    }

    public JButton getBtncancelar() {
        return btncancelar;
    }

    public void setBtncancelar(JButton btncancelar) {
        this.btncancelar = btncancelar;
    }

    public JButton getBtncrear() {
        return btncrear;
    }

    public void setBtncrear(JButton btncrear) {
        this.btncrear = btncrear;
    }

    public JButton getBtneditar() {
        return btneditar;
    }

    public void setBtneditar(JButton btneditar) {
        this.btneditar = btneditar;
    }

    public JButton getBtneliminar() {
        return btneliminar;
    }

    public void setBtneliminar(JButton btneliminar) {
        this.btneliminar = btneliminar;
    }

    public JButton getBtnguardar() {
        return btnguardar;
    }

    public void setBtnguardar(JButton btnguardar) {
        this.btnguardar = btnguardar;
    }

    public JTable getjTbcliente() {
        return jTbcliente;
    }

    public void setjTbcliente(JTable jTbcliente) {
        this.jTbcliente = jTbcliente;
    }

    public JDialog getJdlcliente() {
        return jdlcliente;
    }

    public void setJdlcliente(JDialog jdlcliente) {
        this.jdlcliente = jdlcliente;
    }

    public JLabel getLbfoto() {
        return lbfoto;
    }

    public void setLbfoto(JLabel lbfoto) {
        this.lbfoto = lbfoto;
    }

    public JTextField getTxtape() {
        return txtape;
    }

    public void setTxtape(JTextField txtape) {
        this.txtape = txtape;
    }

    public JTextField getTxtced() {
        return txtced;
    }

    public void setTxtced(JTextField txtced) {
        this.txtced = txtced;
    }

    public JTextField getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(JTextField txtcorreo) {
        this.txtcorreo = txtcorreo;
    }

    public JTextField getTxtnom() {
        return txtnom;
    }

    public void setTxtnom(JTextField txtnom) {
        this.txtnom = txtnom;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextField txttelefono) {
        this.txttelefono = txttelefono;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdlcliente = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        txtced = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtape = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        lbfoto = new javax.swing.JLabel();
        btnexaminar1 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtcorreo = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbcliente = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btneditar = new javax.swing.JButton();
        btncrear = new javax.swing.JButton();
        btneliminar1 = new javax.swing.JButton();
        btnactual = new javax.swing.JButton();

        jdlcliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("fecha de nacimiento");
        jdlcliente.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 30));
        jdlcliente.getContentPane().add(txtced, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, -1));
        jdlcliente.getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, -1));
        jdlcliente.getContentPane().add(txtape, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, -1));

        jLabel16.setText("apellido");
        jdlcliente.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel20.setText("direccion");
        jdlcliente.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel21.setText("telefono");
        jdlcliente.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        jLabel22.setText("nombre");
        jdlcliente.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 60, 30));

        jLabel23.setText("correo");
        jdlcliente.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 50, -1));

        jLabel24.setText("foto");
        jdlcliente.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 20));

        jLabel25.setText("cedula");
        jdlcliente.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));

        jLabel26.setText("cedula");
        jdlcliente.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));

        jLabel27.setText("cedula");
        jdlcliente.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));

        jLabel28.setText("cedula");
        jdlcliente.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));

        jLabel29.setText("cedula");
        jdlcliente.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));

        fecha.setDateFormatString("yyyy-MM-dd");
        jdlcliente.getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, -1));
        jdlcliente.getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, -1));

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        jdlcliente.getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 110, -1));

        lbfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdlcliente.getContentPane().add(lbfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 220, 190));

        btnexaminar1.setText("examinar");
        jdlcliente.getContentPane().add(btnexaminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        btnguardar.setText("guardar");
        jdlcliente.getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));
        jdlcliente.getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 110, -1));

        btncancelar.setText("cancelar");
        jdlcliente.getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));
        jdlcliente.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 460));

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTbcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "DIRECCION", "TELEFONO", "FECHA N", "CORREO", "FOTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTbcliente);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 850, 300));

        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel6.setText("PRODUCTOS");
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, 30));

        btneliminar.setText("eliminar");
        jInternalFrame1.getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel17.setText("CLIENTES");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 250, 60));

        btneditar.setText("editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        btncrear.setText("crear");
        getContentPane().add(btncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        btneliminar1.setText("eliminar");
        getContentPane().add(btneliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        btnactual.setText("actualizar");
        getContentPane().add(btnactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditarActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactual;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminar1;
    private javax.swing.JButton btnexaminar1;
    private javax.swing.JButton btnguardar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTbcliente;
    private javax.swing.JDialog jdlcliente;
    private javax.swing.JLabel lbfoto;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtced;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
