/* M:M association */
//Dependant object
class Team{
    String TeamName;
    String TeamColor;
    String TeamBoard;
    public Team(String TeamName, String TeamColor, String TeamBoard){
        this.TeamName = TeamName;
        this.TeamColor = TeamColor;
        this.TeamBoard = TeamBoard;
    }
}
//Target oobject
class Players{
    private String PName;
    private int PID;
    private String PRoll;
    //HAS_A relation
    Team[] tm;
    public Players(String PName, int PID, String PRoll,Team[] tm){
        this.PName = PName;
        this.PID = PID;
        this.PRoll = PRoll;
        this.tm = tm;
    }
    public void disp(){
        System.out.println("PNAME   :: "+PName);
        System.out.println("PID     :: "+PID);
        System.out.println("PROLL   :: "+PRoll);
        for (Team p : tm) {
            System.out.println("T_NAME  :: " + p.TeamName);
            System.out.println("T_COLOR :: " + p.TeamColor);
            System.out.println("T_BOARD :: " + p.TeamBoard);
        }
    }

}
public class HAS_A_relation2 {
    public static void main(String[] args){
        Team ref1 = new Team("CSK","Yellow","BCCI");
        Team ref2 = new Team("MI","Blue","BCCI");
        Team ref3 = new Team("RCB","Red","BCCI");
        Team[] t = new Team[3];
        t[0]=ref1;
        t[1]=ref2;
        t[2]=ref3;

        Players ref4 = new Players("MSD",7,"Finisher",t);
        Players ref5 = new Players("Rohit",45,"Opener Batsman",t);
        Players ref6 = new Players("Kohli",18,"Opener Batsman",t);

        //M:M
        System.out.println("Players Details are ...........");
        ref4.disp();
        System.out.println();
        ref5.disp();
        System.out.println();
        ref6.disp();



    }
}
