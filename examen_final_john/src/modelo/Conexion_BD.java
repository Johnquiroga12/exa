package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arust
 */
public class Conexion_BD {
    Connection con;
    String cadConexion = "jdbc:postgresql://ec2-3-209-124-113.compute-1.amazonaws.com:5432/d91h2scr797m1u";
    String pgUser = "wppjuyejjrhhqx";
    String pgPass = "7eb5453a3bd01171ca81b47032d402cbae419b716e6323d3113ea2e5a3637e1f";

    public Conexion_BD() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(cadConexion, pgUser, pgPass);
            System.out.println("Conexion OK.");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet colsulta(String sql) {
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean accion(String sql){
        boolean correcto = true;
        try {
            Statement st = con.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
            correcto = false;
        }
        return correcto;
    }

   
    public Connection getCon() {
        return con;
    }
}
