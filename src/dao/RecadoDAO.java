/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
//import java.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import model.Recado;

/**
 *
 * @author Jean Nelson
 */
public class RecadoDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar(Recado recado) throws SQLException{
        
        sql = "INsert Into recados values(?, ?, ?, ?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, recado.getSetorRecado());
        pst.setString(3, recado.getTituloRecado());
        pst.setString(4, recado.getMensagemRecado());
        
        //sql = "INsert Into recados values(0, 'aaa2', 'bbb2', 'ccc2')";
        pst.execute();
        pst.close();
    }
    
    public void alterar(int id,String msg) throws SQLException{
        sql = "Update recados set mensagem = '"+msg+"' where id = "+id;
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.execute();
        pst.close();
    }
    
    public List<Recado> ListaRecado(String busca) throws SQLException{
        List<Recado> listaRecados;
        listaRecados =  new ArrayList();
        
        sql = "Select * From recados Where setor like '%"+busca+"%' order by id";

        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaRecados.add(new Recado(
                    rs.getInt("id"),
                    rs.getString("setor"),
                    rs.getString("titulo"),
                    rs.getString("mensagem")
            ));
        }
        pst.close();
        return listaRecados;
    }
    
}
