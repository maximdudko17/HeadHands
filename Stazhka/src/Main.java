// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player player = new Player(10,30);
        Monster monster = new Monster(10,30);
        player.check_up();
        monster.check_up();
        monster.hit_creature(player);
        monster.hit_creature(player);
        monster.hit_creature(player);
        monster.hit_creature(player);
        player.check_up();
        player.healing();
        player.healing();
        player.healing();
        player.healing();
        player.healing();
        player.check_up();


    }
}