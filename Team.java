

// Criar um time
class Member {
    String name;
    String typo;
    int level;
    int rank;

    public Member(String name, String typo, int level, int rank){
        this.name = name;
        this.typo = typo;
        this.level = level;
        this.rank = rank;
    }
    public String getNome() {
        return this.name;
    }
    public String getTypo() {
        return this.typo;
    }
    public int getLevel() {
        return this.level;
    }
    public int getRank() {
        return this.rank;
    }
}

public class Team {
    Member member;
    public Team(Member member){
        this.member = member;
    }
    
    public static void main(String[] args) {
        Member member = new Member("cesar", "Macho", 1000, 1000);
        Team myTeam = new Team(member);
        System.out.println(member.getNome());
        System.out.println(member.getTypo());
        System.out.println(member.getLevel());
        System.out.println(member.getRank());
        
    }
}