public class Monster extends Creature{
    public Monster(int M, int N){
        super(M, N);
    }
    public void check_up(){
        System.out.printf("MONSTER%n");
        super.check_up();
    }

}
