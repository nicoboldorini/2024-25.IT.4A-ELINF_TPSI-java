
public class Cronometro {

    private long inizio;
    private long fine;
    public Cronometro() {
        this.inizio = 0;
        this.fine = 0;
    }
    public void inizio() {
        this.inizio = System.currentTimeMillis();
    }

    public void fine() {
        this.fine = System.currentTimeMillis();
    }

    public long elapsed() {
        return fine - inizio;
    }

    public double sec() {
        return elapsed() / 1000.0;
    }
}
	
	
	
	

