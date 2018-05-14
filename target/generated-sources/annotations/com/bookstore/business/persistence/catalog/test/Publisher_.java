package com.bookstore.business.persistence.catalog.test;

import com.bookstore.business.persistence.catalog.Address;
import com.bookstore.business.persistence.catalog.Publisher;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-14T14:40:45")
@StaticMetamodel(Publisher.class)
public class Publisher_ { 

    public static volatile SingularAttribute<Publisher, Address> address;
    public static volatile SingularAttribute<Publisher, List> books;
    public static volatile SingularAttribute<Publisher, String> name;
    public static volatile SingularAttribute<Publisher, Long> id;

}