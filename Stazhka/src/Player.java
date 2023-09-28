public class Player extends Creature{
    private int counter = 0;
    public void check_up(){
        System.out.printf("PLAYER%n");
        super.check_up();
    }

    public void healing() {
        if (this.get_alive()) {
            if (counter < 4) {
                System.out.printf("Healed %f%n%n", (health * 0.3));
                cur_health += (int) (health * 0.3);
                if (cur_health > health) cur_health = health;
                counter++;
            } else {
                System.out.printf("No more healing%n%n");
            }
        }
        else System.out.printf("DEAD%n%n");
    }
    public Player(int M, int N){
        super(M, N);
    }
}
