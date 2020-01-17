package Car;

public class Part {
    private Integer id;
    private String name;
    private String details;

    public Part(Integer id, String name, String dt) {
        this.id = id;
        this.name = name;
        this.details = dt;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
