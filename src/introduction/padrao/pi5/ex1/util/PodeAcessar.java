package introduction.padrao.pi5.ex1.util;

public enum PodeAcessar {
    PODE_ACESSAR(true),
    NAO_PODE_ACESSAR(false);

    private boolean permissao;

    PodeAcessar(boolean permissao) {
        this.permissao = permissao;
    }

    public boolean isPermissao() {
        return permissao;
    }
}
