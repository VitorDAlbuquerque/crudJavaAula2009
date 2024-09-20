package br.com.fatec.testes;

import br.com.fatec.dao.UsuarioDAO;
import br.com.fatec.model.Usuario;

import java.sql.SQLException;

public class TestaInsertBD {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub

        UsuarioDAO.insere(new Usuario("Sirley Addão", "sirley.gmail.com", "1234"));
        UsuarioDAO.insere(new Usuario("Raul Costa", "raul.gmail.com", "1234"));
        UsuarioDAO.insere(new Usuario("Luciana Pereira", "luciana.gmail.com", "1234"));
    }

}