import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Facebook implements Iterable<Usuario>{

    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public Facebook(Usuario... usuarios) {
        this.usuarios = Arrays.asList(usuarios);
    }

    @Override
    public Iterator<Usuario> iterator() {
        return usuarios.iterator();
    }

}
