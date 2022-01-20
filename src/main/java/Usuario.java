public class Usuario {
    private String perfil;
    private boolean ativo;

    public Usuario(String perfil, boolean ativo) {
        this.perfil = perfil;
        this.ativo = ativo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
