package br.com.fatec.testes;

import br.com.fatec.dao.UsuarioDAO;
import br.com.fatec.model.Usuario;
import java.sql.SQLException;

public class TestaDeletarBD {
    public static void main(String[] args) {

    UsuarioDAO.removeById(1);

    }
}
