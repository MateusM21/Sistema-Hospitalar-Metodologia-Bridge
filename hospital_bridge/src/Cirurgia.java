class Cirurgia extends Atendimento {
    public Cirurgia(TipoAtendimento tipo) {
        super(tipo);
    }

    public void realizarAtendimento() {
        System.out.println("Cirurgia:");
        tipo.executar();
    }
}
