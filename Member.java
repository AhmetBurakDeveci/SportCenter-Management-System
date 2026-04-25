public class Member {
    private int id;
    private String name;
    private String branch;
    private double debt;

    public Member(int id, String name, String branch, double debt) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | İsim: " + name + " | Branş: " + branch + " | Borç: " + debt + " TL";
    }
}