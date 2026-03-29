class Consulta extends Atendimento {
    public Consulta(TipoAtendimento tipo) {
        super(tipo);
    }

    public void realizarAtendimento() {
        System.out.println("Consulta:");
        tipo.executar();
    }
}
