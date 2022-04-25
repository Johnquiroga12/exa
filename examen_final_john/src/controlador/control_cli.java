package controlador;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.xml.ws.Holder;
import modelo.clientes;
import modelo.modelo_cliente;
import sun.swing.table.DefaultTableCellHeaderRenderer;
import vista.vista_cliente;

public class control_cli {

    private modelo_cliente model;
    private vista_cliente vis;
    private JFileChooser jfch;

    public control_cli(modelo_cliente model, vista_cliente vis) {
        this.model = model;
        this.vis = vis;
    }

    public void controlpersona() {
        vis.getBtnexaminar().addActionListener(j -> examifoto());
        vis.getBtncrear().addActionListener(h -> abrirdialo(1));
        vis.getBtneditar().addActionListener(h -> abrirdialo(2));
        vis.getBtneliminar().addActionListener(j -> eli());
        vis.getBtnguardar().addActionListener(h -> creareditar());
                vis.getBtnactual().addActionListener(j ->cargar());
    }

    private void examifoto() {
        jfch = new JFileChooser();
        jfch.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int est = jfch.showOpenDialog(vis);
        if (est == JFileChooser.APPROVE_OPTION) {
            try {
                Image img = ImageIO.read(jfch.getSelectedFile()).getScaledInstance(vis.getLbfoto().getWidth(), vis.getLbfoto().getWidth(), Image.SCALE_DEFAULT);
                Icon icon = new ImageIcon(img);
                vis.getLbfoto().setIcon(icon);
                vis.getLbfoto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(control_cli.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
        private void eli() {
        int yy;
        yy = vis.getjTbcliente().getSelectedRow();
        if (yy != -1) {
            String nu = vis.getjTbcliente().getValueAt(yy, 0).toString();
            if (model.eliminarcli(nu)) {
                JOptionPane.showMessageDialog(vis, "se elimino correctamente");
            }
        }
    }
    private void cargar() {
        vis.getjTbcliente().setDefaultRenderer(Object.class, new Imangentabla());
        vis.getjTbcliente().setRowHeight(100);
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) vis.getjTbcliente().getModel();
        tabla.setNumRows(0);

        List<clientes> lis = model.listarclientes();
        Holder<Integer> i = new Holder<>(0);
        lis.stream().forEach(q -> {

            tabla.addRow(new Object[9]);//cantidad de columna
           vis.getjTbcliente().setValueAt(q.getCedula(), i.value, 0);
            vis.getjTbcliente().setValueAt(q.getNombre(), i.value, 1);
            vis.getjTbcliente().setValueAt(q.getApellido(), i.value, 2);
            vis.getjTbcliente().setValueAt(q.getDireccion(), i.value, 3);
            vis.getjTbcliente().setValueAt(q.getTelefono(), i.value, 4);
            vis.getjTbcliente().setValueAt(q.getFechaNacimiento(), i.value, 5);
            vis.getjTbcliente().setValueAt(q.getCorreo_elec(), i.value, 6);
            Image foto = q.getFoto();
            if (foto != null) {

                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(nimg);
                DefaultTableCellRenderer render = new DefaultTableCellHeaderRenderer();
                render.setIcon(icon);
                vis.getjTbcliente().setValueAt(new JLabel(icon), i.value, 7);

            } else {
                vis.getjTbcliente().setValueAt(null, i.value, 7);

            }
            i.value++;
        });
    }

    private void abrirdialo(int num) {
        String title;
        if (num == 1) {
            title = "crear nueva persona";
           vis.getJdlcliente().setName("crear");
        } else {
            editar();
            title = "editar persona";
           vis.getJdlcliente().setName("editar");
        }
        vis.getJdlcliente().setLocationRelativeTo(vis);
       vis.getJdlcliente().setSize(750, 520);
           Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - vis.getJdlcliente().getWidth()) / 2);
        int y = (int) ((dimension.getHeight() -vis.getJdlcliente().getHeight()) / 2);
        vis.getJdlcliente().setLocation(x, y);
   
        vis.getJdlcliente().setTitle(title);
        vis.getJdlcliente().setVisible(true);
    }
    private void creareditar() {
            if (vis.getJdlcliente().getName() == "crear") {
                String cedula = vis.getTxtced().getText();
                String nombre = vis.getTxtnom().getText();
                String apellido = vis.getTxtape().getText();
                String direc= vis.getTxtdireccion().getText();
                
               String telefono = vis.getTxttelefono().getText();
                String fechanaci = ((JTextField) vis.getFecha().getDateEditor().getUiComponent()).getText();
                Date fecha = java.sql.Date.valueOf(fechanaci);
                String correo = vis.getTxtcorreo().getText();
                modelo_cliente per = new modelo_cliente();
                per.setCedula(cedula);
                per.setNombre(nombre);
                per.setApellido(apellido);
                 per.setDireccion(direc);
                per.setFechaNacimiento((java.sql.Date) fecha);
                per.setTelefono(telefono);
                               per.setCorreo_elec(correo);

                try {
                    //Foto
                    FileInputStream img = new FileInputStream(jfch.getSelectedFile());
                    int largo = (int) jfch.getSelectedFile().length();
                    per.setImagen(img);
                    per.setLargo(largo);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(control_cli.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (per.crearPersonaByte()) {
                    vis.getJdlcliente().setVisible(false);
                    JOptionPane.showMessageDialog(vis, "Persona Creada Satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(vis, "No se pudo crear la persona");
                }

            } else {
                modelo_cliente t = new modelo_cliente();
                String ced = vis.getTxtced().getText();
                String nombre = vis.getTxtnom().getText();
                String apellido = vis.getTxtape().getText();
                String fechanaci = ((JTextField) vis.getFecha().getDateEditor().getUiComponent()).getText();
                Date fechaper = java.sql.Date.valueOf(fechanaci);
                String tlefono = vis.getTxttelefono().getText();
                String correo = vis.getTxtcorreo().getText();

                t.setCedula(ced);
                t.setNombre(nombre);
                t.setApellido(apellido);
                t.setFechaNacimiento(fechaper);
                t.setTelefono(tlefono);
                t.setCorreo_elec(correo);
                if (jfch == null) {
                if (t.editarClienteBDA()) {
                    JOptionPane.showMessageDialog(vis, "SE MODIIFICO LA PERSONA");
                } else {
                    JOptionPane.showMessageDialog(vis, "Se a producido un error al modificar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    //Foto
                    FileInputStream img = new FileInputStream(jfch.getSelectedFile());
                    int largo = (int) jfch.getSelectedFile().length();
                    t.setImagen(img);
                    t.setLargo(largo);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(control_cli.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            
            }
        }
    }

    private void editar() {
        List<clientes> per = model.listarclientes();
        int xx = vis.getjTbcliente().getSelectedRow();
        if (xx != -1) {
            String ve = vis.getjTbcliente().getValueAt(xx, 0).toString();
            for (int a = 0; a < per.size(); a++) {
                if (per.get(a).getCedula().equals(ve)) {
                    String idper = per.get(a).getCedula();
                    String NOM = per.get(a).getNombre();
                    String ape = per.get(a).getApellido();
                    String direcc = per.get(a).getDireccion();
                    String tlf = per.get(a).getTelefono();
                    Date fna = per.get(a).getFechaNacimiento();
                    String correo = per.get(a).getCorreo_elec();
                    vis.getTxtced().setText(idper);
                    vis.getTxtnom().setText(NOM);
                    vis.getTxtape().setText(ape);
                    vis.getTxtdireccion().setText(direcc);
                    vis.getFecha().setDate(fna);
                    vis.getTxttelefono().setText(tlf);
                    vis.getTxtcorreo().setText(correo);
                   
                    Image ft = per.get(a).getFoto();
                    Image j = ft.getScaledInstance(196, 136, Image.SCALE_SMOOTH);
                    Icon ic = new ImageIcon(j);
                    vis.getLbfoto().setIcon(ic);
                
                } else {
                }
            }
        } else {
            JOptionPane.showMessageDialog(vis, "error seleccione una fila");
            vis.getJdlcliente().dispose();
        }
    }



}
