package br.com.alura.forum.handler;

public class ErroDeFormulario {
    private String campo;
    private String erro;

    public ErroDeFormulario() {
    }

    public ErroDeFormulario(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
