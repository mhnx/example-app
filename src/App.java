import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Skills> skills = getSkills();

        Player player = new Player("Link",
                12, 100, skills);

        Player monster = new Player("monster", 20, 200, skills);

        int life = player.getLife();

        System.out.println(player.getLevel());
        life = life - 10;
        player.upLevel();

        Fight fight = new Fight();

        fight.fight(player, monster);
        fight.fight(player, monster);

        System.out.println(player.isAlive());
    }

    private static List<Skills> getSkills() {
        return List.of(
                new Skills("bow and arrow", 200),
                new Skills("sword", 350)
        );
    }

}