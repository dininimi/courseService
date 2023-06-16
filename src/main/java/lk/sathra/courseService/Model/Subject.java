package lk.sathra.courseService.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="credits")
    private int credit;

    @Column(name="lecturer_id")
    private int lectId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getLectId() {
        return lectId;
    }

    public void setLectId(int lectId) {
        this.lectId = lectId;
    }
}
