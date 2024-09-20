package br.com.fatec.testes;

import br.com.fatec.dao.UsuarioDAO;
import br.com.fatec.model.Usuario;

public class TestaListarBD {

    public static void main(String[] args) {
        System.out.println(UsuarioDAO.listarBD());

    }
}
