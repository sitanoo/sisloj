package br.senai.sc.sisloj;

import br.senai.sc.sisloj.dao.ClienteDao;
import br.senai.sc.sisloj.modelo.Cliente;
import br.senai.sc.sisloj.views.CadastroCliente;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;

public class SisLoj {

    public static void main(String[] args) throws SQLException {
        /*ClienteDao c = new ClienteDao();
        List<Cliente> clientes = c.listarClientes();
        
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = clientes.get(i);
            System.out.println(cli.getNomcli());
        }*/
        
        JFrame frame = new JFrame("Cadastro de Cliente");
        CadastroCliente cadCli = new CadastroCliente();
        
        frame.setSize(500,500);
        frame.add(cadCli);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}