public class MaquinadeCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;
    private int Americano;
    private int Expreso;
    private int Capuchino;

    public MaquinadeCafe() {
        this.agua = 5000;
        this.vasos = 15;
        this.cafe = 1000;
        this.crema = 1500;
        this.Americano = 0;
        this.Expreso = 0;
        this.Capuchino = 0;

    }

    public MaquinadeCafe(int agua, int cafe, int crema, int vasos, int americano, int expreso, int capuchino) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
        Americano = americano;
        Expreso = expreso;
        Capuchino = capuchino;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getAmericano() {
        return Americano;
    }

    public void setAmericano(int americano) {
        Americano = americano;
    }

    public int getExpreso() {
        return Expreso;
    }

    public void setExpreso(int expreso) {
        Expreso = expreso;
    }

    public int getCapuchino() {
        return Capuchino;
    }

    public void setCapuchino(int capuchino) {
        Capuchino = capuchino;
    }

    @Override
    public String toString() {
        return "MaquinadeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                ", Americano=" + Americano +
                ", Expreso=" + Expreso +
                ", Capuchino=" + Capuchino +
                '}';
    }

    public void Americano(){

        if(this.agua >= 150 && this.cafe >= 12 && this.vasos >= 1){

            this.agua -= 150;
            this.agua -= 12;
            this.vasos--;
            Americano++;
            System.out.println("El Americano esta listo...");
        } else{

            System.out.println("Se terminaron los ingredientes para el cafe...");
        }
    }

    public void Expreso(){

        if(this.agua >= 130 && this.cafe >= 18 && this.vasos >= 1) {
            this.agua -= 130;
            this.cafe -= 18;
            this.vasos--;
            Expreso++;
            System.out.println("El Expreso esta listo...");
        } else{
            System.out.println("Se terminaron los ingredientes para el cafe...");
        }
    }

    public void Capuchino(){

        if(this.agua >= 80 && this.cafe >= 20 && this.crema >= 50 && this.vasos >= 1){
           this.agua -= 80;
           this.cafe -= 20;
           this.crema -= 50;
           this.vasos--;
           Capuchino++;
            System.out.println("El Capuchino esta listo ...");
        } else{
            System.out.println("Se terminaron los ingredientes para el cafe..");
        }
    }

    public void Capacidad(){
        System.out.println("Restan   " + this.agua + " ml de agua...");
        System.out.println("\nRestan  " + this.cafe + " g de cafe...");
        System.out.println("\nRestan  " + this.crema + " ml de crema...");
        System.out.println("\nRestan  " + this.vasos + "  vasos...");
    }

        public void CafesHechos(){
            System.out.println("Cafes totales servidos:");
            System.out.println(Americano + "  Americanos...");
            System.out.println(Expreso + "  Expresoss...");
            System.out.println(Capuchino + "  Capuchinos...");
        }
}
