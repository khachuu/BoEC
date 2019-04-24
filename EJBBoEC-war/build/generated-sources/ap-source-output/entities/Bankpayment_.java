package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-23T01:28:22")
@StaticMetamodel(Bankpayment.class)
public class Bankpayment_ { 

    public static volatile SingularAttribute<Bankpayment, Integer> bankId;
    public static volatile SingularAttribute<Bankpayment, String> ownerName;
    public static volatile SingularAttribute<Bankpayment, Integer> paymentMethodId;
    public static volatile SingularAttribute<Bankpayment, String> cartNo;

}