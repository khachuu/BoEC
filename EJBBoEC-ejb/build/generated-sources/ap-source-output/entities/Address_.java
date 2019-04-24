package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-22T15:34:43")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> country;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> district;
    public static volatile SingularAttribute<Address, Integer> customerId;
    public static volatile SingularAttribute<Address, Integer> employeeId;
    public static volatile SingularAttribute<Address, Integer> id;

}