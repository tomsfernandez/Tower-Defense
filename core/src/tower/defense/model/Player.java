package tower.defense.model;

/**
 * Created by Tomi on 08/11/2015.
 */
public class Player {

    private int money;
    private int level;
    private double score;
    private int lives;

    public Player(){
        money = 0;
        level = 1;
        lives = 1;
        score = 0;
    }

    public double getScore() {
        return score;
    }

    public void increaseScore(int typeOfMinion) {
        this.score += getMoney()*getLevel() * getLives()* typeOfMinion/10;
    }

    public int getLives() {
        return lives;
    }

    public int getMoney() {
        return money;
    }

    public int getLevel() {
        return level;
    }

    public boolean isOver() {
        return lives <= 0;
    }

    public void spendLife(int typeOfMinion) {
        lives -= typeOfMinion;
    }

    public void addMoney(int typeOfMinion){
        money += typeOfMinion*50;
    }

    public void printString(){
        System.out.println("Vida: " + getLives() + ", Plata: " + getMoney() + ", Nivel: " + getLevel() + ", Score: " + getScore());
    }
}
