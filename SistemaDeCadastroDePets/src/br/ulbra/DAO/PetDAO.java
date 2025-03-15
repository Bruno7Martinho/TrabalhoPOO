/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.DAO;

import br.ulbra.entity.Pet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class PetDAO {
    Connection con;
 
    public PetDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }
 

    
    


public void salvar(Pet p) {
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO pet (nomePet,raca,anoNascimento, sexo, corPelo) VALUES (?,?,?,?,?)");

            stmt.setString(1, p.getNomePet());
            stmt.setString(2, p.getRaca());
            stmt.setString(3, p.getAnoNascimento()); 
            stmt.setString(4, p.getSexo());
            stmt.setString(5, p.getCorPelo());
            
            
            
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pet Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}


