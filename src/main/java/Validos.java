import java.util.Iterator;

public class Validos {

    public static Integer contarPerfisAtivosnoFacebook(Facebook facebook) {
        int quantidade = 0;
        for (Usuario usuario : facebook) {
            if (usuario.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotaldeUsuariosNoFacebook(Facebook facebook) {
        int quantidade = 0;
        for (Iterator a = facebook.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
