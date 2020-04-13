package vikdev.com;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> team = new Team("Adelaide Crows ");
        team.adPlayer(joe);
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago cubs");
        baseballPlayerTeam.adPlayer(pat);
        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Soccer team ");
        soccerPlayerTeam.adPlayer(beckham);

        Team<FootballPlayer> vikas = new Team(" attacker Crows");
        Team<FootballPlayer> akash = new Team(" defender Crows");

       team.matchResult(vikas,1,0);
        team.matchResult(akash,1,1);






    }
}
