public class Person {
    private int id;
    private String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void checkScoreboard(Scoreboard score){
        System.out.println(score.getTime());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Id : " + this.id + " & Name : " + this.name;
    }
}
