package ie.tudublin;

public class cat {
    private int numLives;
     String name;

    public cat(String name) {
        this.name = name;
        this.numLives = 9;
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public void kill() {
        if (numLives > 0) {
            numLives--;
            System.out.println("Ouch!");
        } else {
            System.out.println("Dead");
        }
    }
}

class Main {
    public static void main(String[] args) {
        cat xavier = new cat("Xavier");
        while (xavier.getNumLives() > 0) {
            xavier.kill();
        }
    }
}
