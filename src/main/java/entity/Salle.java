package entity;

import javax.persistence.*;

@Entity
public class Salle {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "CodeSal")
    private int codeSal;
    @Basic
    @Column(name = "Designation")
    private String designation;

    public int getCodeSal() {
        return codeSal;
    }

    public void setCodeSal(int codeSal) {
        this.codeSal = codeSal;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salle salle = (Salle) o;

        if (codeSal != salle.codeSal) return false;
        if (designation != null ? !designation.equals(salle.designation) : salle.designation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeSal;
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        return result;
    }
}
