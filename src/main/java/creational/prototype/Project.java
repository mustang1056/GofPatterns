package creational.prototype;

public class Project implements Copyable {
    private int id;
    private String projetName;
    private String sourceCode;

    public Project(int id, String projetName, String sourceCode) {
        this.id = id;
        this.projetName = projetName;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjetName() {
        return projetName;
    }

    public void setProjetName(String projetName) {
        this.projetName = projetName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, projetName, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projetName='" + projetName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
