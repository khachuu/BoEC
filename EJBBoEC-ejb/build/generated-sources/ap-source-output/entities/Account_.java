package entities;

import entities.AccountRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-25T23:53:32")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile CollectionAttribute<Account, AccountRoles> accountRolesCollection;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, Short> enabled;
    public static volatile SingularAttribute<Account, String> username;

}