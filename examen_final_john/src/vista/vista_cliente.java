package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class vista_cliente extends javax.swing.JInternalFrame {
    public vista_cliente() {
        initComponents();        
    }

    public JDateChooser getFecha() {
        return fecha;
    }

    public void setFecha(JDateChooser fecha) {
        this.fecha = fecha;
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

    public JButton getBtnactual() {
        return btnactual;
    }

    public void setBtnactual(JButton btnactual) {
        this.btnactual = btnactual;
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

    public JButton getBtnexaminar() {
        return btnexaminar;
    }

    public void setBtnexaminar(JButton btnexaminar) {
        this.btnexaminar = btnexaminar;
    }

    public JButton getBtnguardar() {
        return btnguardar;
    }

    public void setBtnguardar(JButton btnguardar) {
        this.btnguardar = btnguardar;
    }

    public JTextField getTxtdireccion() {
        return txtdireccion;
    }

    public void setTxtdireccion(JTextField txtdireccion) {
        this.txtdireccion = txtdireccion;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdlcliente = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        txtced = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtape = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        lbfoto = new javax.swing.JLabel();
        btnexaminar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtcorreo = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbcliente = new javax.swing.JTable();
        btncrear = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnactual = new javax.swing.JButton();

        jdlcliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("fecha de nacimiento");
        jdlcliente.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 30));
        jdlcliente.getContentPane().add(txtced, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, -1));
        jdlcliente.getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, -1));
        jdlcliente.getContentPane().add(txtape, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, -1));

        jLabel2.setText("apellido");
        jdlcliente.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel3.setText("direccion");
        jdlcliente.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel4.setText("telefono");
        jdlcliente.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        jLabel5.setText("cedula");
        jdlcliente.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 60, 30));

        jLabel6.setText("correo");
        jdlcliente.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 50, -1));

        jLabel7.setText("foto");
        jdlcliente.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 20));

        jLabel8.setText("cedula");
        jdlcliente.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));

        jLabel9.setText("cedula");
        jdlcliente.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));

        jLabel10.setText("cedula");
        jdlcliente.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));

        jLabel11.setText("cedula");
        jdlcliente.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));

        jLabel12.setText("cedula");
        jdlcliente.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 64, -1, -1));
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

        btnexaminar.setText("examinar");
        jdlcliente.getContentPane().add(btnexaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        btnguardar.setText("guardar");
        jdlcliente.getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));
        jdlcliente.getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 110, -1));

        btncancelar.setText("cancelar");
        jdlcliente.getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTbcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cedula", "nombre", "apellido", "direccion ", "telefono", "fecha__N", "correo", "foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbcliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 145, 670, 280));

        btncrear.setText("crear");
        getContentPane().add(btncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        btneditar.setText("editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        btneliminar.setText("eliminar");
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel13.setText("CLIENTES");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 70));

        btnactual.setText("actualizar");
        getContentPane().add(btnactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

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
    private javax.swing.JButton btnexaminar;
    private javax.swing.JButton btnguardar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
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
