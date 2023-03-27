public class MaquinadeCafeDriver {
    public static void main(String[] args) {

        MaquinadeCafe MadeCafe = new MaquinadeCafe();

        while(MadeCafe.getVasos() > 0){

            MadeCafe.Americano();
            System.out.println();

            MadeCafe.Expreso();
            System.out.println();

            MadeCafe.Capuchino();
            System.out.println();
        }
    MadeCafe.Capacidad();
        System.out.println();
    MadeCafe.CafesHechos();

    }
}
