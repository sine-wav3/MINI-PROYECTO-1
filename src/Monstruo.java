public class Monstruo extends Carta {

    private int atk;
    private int def;
    private int nivel;
    private boolean enAtaque;

    public Monstruo(String nombre, int atk, int def, int nivel) {
        super(nombre);
        this.atk = atk;
        this.def = def;
        this.nivel = nivel;
        this.enAtaque = true;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getNivel() {
        return nivel;
    }

    public boolean isEnAtaque(){
        return enAtaque;
    }
    public void setEnAtaque(boolean enAtaque){
        this.enAtaque = enAtaque;
    }
}