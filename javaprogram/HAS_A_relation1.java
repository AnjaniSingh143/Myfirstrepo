/*HAS_A relation.....
* ---> M:1 association..*/

//dependant object..
class Board{
    public String b_name;
    public int b_Id;
    public String b_country;
    public void setB_name(String b_name){
        this.b_name = b_name;
    }
    public void setB_Id(int b_Id){
        this.b_Id = b_Id;
    }
    public void setB_country(String b_country){
        this.b_country = b_country;
    }
}

// target object...
class Player{
    private String pname;
    private int pId;
    private String proll;

    //HAS_A relation
    Board bd;
    public void setPname(String pname){
        this.pname = pname;
    }
    public void setpId(int pId){
        this.pId = pId;
    }
    public void setProll(String proll){
        this.proll = proll;
    }
    public void setBd(Board bd){
        this.bd=bd;
    }
//    Player[] pl = new Player[3];
    public void disp(){         //instead of it we can use getter....
        System.out.println("PNAME  :: "+pname);
        System.out.println("PID    :: "+pId);
        System.out.println("P_roll :: "+proll);

        System.out.println("BNAME     :: "+bd.b_name);
        System.out.println("BID       :: "+bd.b_Id);
        System.out.println("B_Country :: "+bd.b_country);

    }

}
public class HAS_A_relation1 {
    public static void main(String args[]){
        Board ref = new Board();
        ref.setB_name("BCCI");
        ref.setB_Id(146);
        ref.setB_country("INDIA");

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        p1.setBd(ref);
        p1.setPname("Sachin");
        p1.setpId(10);
        p1.setProll("All-rounder");

        p2.setBd(ref);
        p2.setPname("MSD");
        p2.setpId(7);
        p2.setProll("Finisher (Captain)");

        p3.setBd(ref);
        p3.setPname("Kohli");
        p3.setpId(18);
        p3.setProll("Batsman");

        System.out.println("Players details are.........");
        p1.disp();
        System.out.println();
        p2.disp();
        System.out.println();
        p3.disp();




    }
}
