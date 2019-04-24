package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-22T15:34:43")
@StaticMetamodel(Food.class)
public class Food_ { 

    public static volatile SingularAttribute<Food, Integer> productsId;
    public static volatile SingularAttribute<Food, String> protein;
    public static volatile SingularAttribute<Food, Date> exprice;
    public static volatile SingularAttribute<Food, String> vitamin;
    public static volatile SingularAttribute<Food, Integer> typeFoodID;

}