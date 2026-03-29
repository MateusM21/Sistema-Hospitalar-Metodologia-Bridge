public class Main {
    public static void main(String[] args) {
        Atendimento consultaOnline = new Consulta(new Online());
        consultaOnline.realizarAtendimento();

        Atendimento cirurgiaEmergencia = new Cirurgia(new Emergencia());
        cirurgiaEmergencia.realizarAtendimento();
    }
}
