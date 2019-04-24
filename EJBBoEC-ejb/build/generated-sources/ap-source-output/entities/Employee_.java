package entities;

import entities.Manager;
import entities.Onlinesaleempl;
import entities.Shopkeeper;
import entities.Storageempl;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-22T15:34:43")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Shopkeeper> shopkeeper;
    public static volatile SingularAttribute<Employee, Manager> manager;
    public static volatile SingularAttribute<Employee, String> accountUsername;
    public static volatile SingularAttribute<Employee, String> roles;
    public static volatile SingularAttribute<Employee, Integer> fullNameID;
    public static volatile SingularAttribute<Employee, Integer> depatrmentId;
    public static volatile SingularAttribute<Employee, Integer> id;
    public static volatile SingularAttribute<Employee, Storageempl> storageempl;
    public static volatile SingularAttribute<Employee, Onlinesaleempl> onlinesaleempl;
    public static volatile SingularAttribute<Employee, Integer> salaryId;

}