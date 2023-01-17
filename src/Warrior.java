public class Warrior extends Character implements Attacker{
    private int stamina;
    private int strength;

    public Warrior(String name) {
        super(name);
        setStamina();
        setStrength();
        setHp();
    }

    public Warrior(String name, int hp) {
        super(name, hp);
        setStamina();
        setStrength();
    }

    public int getStamina() {
        return stamina;
    }

    private void setStamina() {
        this.stamina = (int) (Math.random() * (50 - 10)) + 10;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength() {
        this.strength = (int) (Math.random() * (10 - 1)) + 1;
    }

    @Override
    public int getHp() {
        return super.getHp();
    }


    public void setHp() {
        int vida = (int) (Math.random() * (200 - 100)) + 100;
        super.setHp(vida);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }

    @Override
    public void attack() {

    }
}