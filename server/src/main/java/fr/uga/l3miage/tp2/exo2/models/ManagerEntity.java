package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("manager")
public class ManagerEntity extends EmployeEntity{
    private String niveauGestion;
}