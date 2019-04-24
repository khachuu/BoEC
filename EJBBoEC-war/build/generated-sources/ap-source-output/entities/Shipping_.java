package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-23T01:28:22")
@StaticMetamodel(Shipping.class)
public class Shipping_ { 

    public static volatile SingularAttribute<Shipping, Float> priceShipping;
    public static volatile SingularAttribute<Shipping, Integer> shippingTypeId;
    public static volatile SingularAttribute<Shipping, Date> dateDelay;
    public static volatile SingularAttribute<Shipping, Integer> id;
    public static volatile SingularAttribute<Shipping, String> region;
    public static volatile SingularAttribute<Shipping, Integer> shippingStatusId;

}