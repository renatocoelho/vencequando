package app.security;
import java.util.Set;

import br.com.caelum.vraptor.security.Permission;
import br.com.caelum.vraptor.security.User;

public class AuthService implements Permission {
	//@Inject User user
	@Override
	public Set<String> getPermissionsByRole(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getRolesByUser(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUsername(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
/*
    @Inject UsuarioDAO usuarioDAO;

    @Override
    public User getUserByUsername(String username) {
        Usuario usuario = usuarioDAO.selecionarUsuarioByUsername(username);
        return new User(usuario.getUsername(), usuario.getPassword());
    }

    @Override
    public Set<String> getRolesByUser(String username) {
        return usuarioDAO.listarPerfilsByUsername(username);
    }

    @Override
    public Set<String> getPermissionsByRole(String role) {
        return usuarioDAO.listarPermissoesByPerfil(role);
    }
    */
}
