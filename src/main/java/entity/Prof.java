package entity;

import javax.persistence.*;

@Entity
public class Prof {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "CodeProf")
    private int codeProf;
    @Basic
    @Column(name = "Nom")
    private String nom;
    @Basic
    @Column(name = "Prenom")
    private String prenom;
    @Basic
    @Column(name = "Grade")
    private String grade;

    public int getCodeProf() {
        return codeProf;
    }

    public void setCodeProf(int codeProf) {
        this.codeProf = codeProf;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prof prof = (Prof) o;

        if (codeProf != prof.codeProf) return false;
        if (nom != null ? !nom.equals(prof.nom) : prof.nom != null) return false;
        if (prenom != null ? !prenom.equals(prof.prenom) : prof.prenom != null) return false;
        if (grade != null ? !grade.equals(prof.grade) : prof.grade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeProf;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }
}
