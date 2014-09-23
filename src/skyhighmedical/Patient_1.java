/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package skyhighmedical;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "PATIENT", catalog = "", schema = "Z3419939")
@NamedQueries({
    @NamedQuery(name = "Patient_1.findAll", query = "SELECT p FROM Patient_1 p"),
    @NamedQuery(name = "Patient_1.findByPatientid", query = "SELECT p FROM Patient_1 p WHERE p.patientid = :patientid"),
    @NamedQuery(name = "Patient_1.findByFirstname", query = "SELECT p FROM Patient_1 p WHERE p.firstname = :firstname"),
    @NamedQuery(name = "Patient_1.findByLastname", query = "SELECT p FROM Patient_1 p WHERE p.lastname = :lastname"),
    @NamedQuery(name = "Patient_1.findByContact", query = "SELECT p FROM Patient_1 p WHERE p.contact = :contact"),
    @NamedQuery(name = "Patient_1.findByAddress", query = "SELECT p FROM Patient_1 p WHERE p.address = :address"),
    @NamedQuery(name = "Patient_1.findByGp", query = "SELECT p FROM Patient_1 p WHERE p.gp = :gp")})
public class Patient_1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PATIENTID")
    private String patientid;
    @Basic(optional = false)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "LASTNAME")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "GP")
    private String gp;

    public Patient_1() {
    }

    public Patient_1(String patientid) {
        this.patientid = patientid;
    }

    public Patient_1(String patientid, String firstname, String lastname, String contact) {
        this.patientid = patientid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contact = contact;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientid != null ? patientid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient_1)) {
            return false;
        }
        Patient_1 other = (Patient_1) object;
        if ((this.patientid == null && other.patientid != null) || (this.patientid != null && !this.patientid.equals(other.patientid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "skyhighmedical.Patient_1[ patientid=" + patientid + " ]";
    }
    
}
