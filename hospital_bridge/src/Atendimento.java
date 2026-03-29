abstract class Atendimento {
    protected TipoAtendimento tipo;

    public Atendimento(TipoAtendimento tipo) {
        this.tipo = tipo;
    }

    public abstract void realizarAtendimento();
}
