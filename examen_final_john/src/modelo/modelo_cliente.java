package modelo;

import java.awt.Image;
import java.awt.List;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class modelo_cliente extends clientes{
    Conexion_BD cpg = new Conexion_BD();

    public modelo_cliente() {
    }

    public modelo_cliente(String cedula, String nombre, String apellido, String direccion, String telefono, String correo_elec, Date fechaNacimiento, Image foto, FileInputStream imagen, int largo) {
        super(cedula, nombre, apellido, direccion, telefono, correo_elec, fechaNacimiento, foto, imagen, largo);
    }
    
    public java.util.List<clientes> listarclientes() {
        java.util.List<clientes> lista = new ArrayList<clientes>();
        try {
            String sql = "select * from cliente";
            ResultSet rs = cpg.colsulta(sql);
            byte[] bytes;
            while (rs.next()) {
                clientes p = new clientes();
                p.setCedula(rs.getString("cedula"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setFechaNacimiento(rs.getDate("direccion"));
                p.setTelefono(rs.getString("telefono"));
                p.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                p.setCorreo_elec(rs.getString("correo_elec"));
                //proceso foto convercion
                bytes = rs.getBytes("foto");
                //bytes=Base64.decode(bytes,0,bytes.length);
                if (bytes != null) {
                    try {
                        p.setFoto(obtenerImagen(bytes));
                    } catch (IOException ex) {
                        Logger.getLogger(modelo_cliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                lista.add(p);
            }
           rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_cliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
       private Image obtenerImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0, param);
    }
  public boolean crear() {
        try {
            String sql = "INSERT INTO cliente (cedula, nombre, apellido, direccion, telefono, fecha_nacimiento,correo_elec, foto)";
            sql += "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setString(1, getCedula());
            ps.setString(2, getNombre());
            ps.setString(3, getApellido());
            ps.setString(4, getDireccion());
            ps.setString(5, getTelefono());
            ps.setDate(6, getFechaNacimiento());
            ps.setString(7, getCorreo_elec());
            ps.setBinaryStream(8, getImagen(), getLargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } 
  
public boolean editar() {
        try {
            String sql = "UPDATE public.cliente\n"
                    + "	SET nombre=?, apellido=?, direccion=?, telefono=?, fecha_nacimiento=?, correo_elec=?, foto=?\n"
                    + "	WHERE cedula='"+getCedula()+"';";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setString(0, getCedula());
            ps.setString(1, getNombre());
            ps.setString(2, getApellido());
            ps.setString(3, getDireccion());
            ps.setString(4, getTelefono());
            ps.setDate(5, (java.sql.Date) getFechaNacimiento());
            ps.setString(6, getCorreo_elec());
            ps.setBinaryStream(7, getImagen(), getLargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(modelo_cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
         
     public boolean eliminarcli(String idcliente){
        String sql = "UPDATE cliente SET WHERE cedula = '" + idcliente + "';";
        System.out.println("" + sql);
        return cpg.accion(sql);
    } 
  
}
