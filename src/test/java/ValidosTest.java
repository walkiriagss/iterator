import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidosTest {

    @Test
    void deveContarPerfisAtivosNoFacebook() {
        Facebook facebook = new Facebook(
                new Usuario("maquinhojf", true),
                new Usuario("rd2", true),
                new Usuario("walkiria", false),
                new Usuario("joca", true)
        );
        assertEquals(3, Validos.contarPerfisAtivosnoFacebook(facebook));
    }

    @Test
    void deveContarTotalPerfisFacebook() {
        Facebook facebook = new Facebook(
                new Usuario("maquinhojf", true),
                new Usuario("rd2", true),
                new Usuario("walkiria", false),
                new Usuario("joca", true)
        );
        assertEquals(4, Validos.contarTotaldeUsuariosNoFacebook(facebook));
    }
}