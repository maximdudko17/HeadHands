import static java.lang.Math.random;

public abstract class Creature {
    protected boolean alive;
    protected final int M;
    protected final int N;
    protected final int attack;
    protected final int defense;
    protected final int health;
    protected int cur_health;

    public Creature(int M, int N){
        this.M = M;
        this.N = N;
        attack = rnd(0,30);
        defense = rnd(0,30);
        health = rnd(0,N);
        cur_health = health;
        alive = true;
    }

    public void check_up(){
        System.out.printf("M: %d%n", M);
        System.out.printf("N: %d%n", N);
        System.out.printf("attack: %d%n", attack);
        System.out.printf("defense: %d%n", defense);
        System.out.printf("health: %d%n", health);
        System.out.printf("cur_health: %d%n%n", cur_health);
    }

    public void death(){
        if(cur_health <= 0){
            alive = false;
        }
    }

    public boolean get_alive(){
        return alive;
    }


    private static int rnd(int min, int max){
        max -= min;
        return (int) (random() * ++max) + min;

    }

    private static boolean cubes_throw(int mod){
        for(int i = 0; i < mod; i++){
            if(rnd(1,6) >= 5) return true;
        }
        return false;
    }
    private static int damage(int M, int N){
        return rnd(M,N);
    }

    public void hit_creature(Creature defender) {
        if (this.get_alive() && defender.get_alive()) {
            int mod = this.attack - defender.defense + 1;
            if (cubes_throw(mod)) {
                defender.cur_health -= damage(N, M);
                System.out.printf("Damaged %d%n%n", rnd(M, N));
                defender.death();
            } else System.out.printf("Damage Blocked%n%n");
        }
        else System.out.printf("DEAD%n%n");
    }

}
