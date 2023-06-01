package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Occuper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "CodeProf")
    private int codeProf;
    @Basic
    @Column(name = "CodeSal")
    private int codeSal;
    @Basic
    @Column(name = "date")
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodeProf() {
        return codeProf;
    }

    public void setCodeProf(int codeProf) {
        this.codeProf = codeProf;
    }

    public int getCodeSal() {
        return codeSal;
    }

    public void setCodeSal(int codeSal) {
        this.codeSal = codeSal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Occuper occuper = (Occuper) o;

        if (codeProf != occuper.codeProf) return false;
        if (codeSal != occuper.codeSal) return false;
        if (date != null ? !date.equals(occuper.date) : occuper.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeProf;
        result = 31 * result + codeSal;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
