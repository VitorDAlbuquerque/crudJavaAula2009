package br.com.fatec.testes;

import br.com.fatec.dao.UsuarioDAO;
import br.com.fatec.model.Usuario;

import java.sql.SQLException;


public class TestaAtualizarBD {


    public static void main(String[] args) {


        UsuarioDAO.update(new Usuario(2, "Mudou aqui", "Novologin", "NovaSenha"));
        System.out.println("Atualizado!");
    }
}
