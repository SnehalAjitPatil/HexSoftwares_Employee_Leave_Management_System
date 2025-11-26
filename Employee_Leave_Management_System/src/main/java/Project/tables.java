/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GANESH
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        try{
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            //st.executeUpdate(string)
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            try{
                con.close();
                st.close();
            } 
            catch(Exception e)
            {
                
            }
        }
    }
}
