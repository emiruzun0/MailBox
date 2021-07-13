package com.mycompany.proje2;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-07-13T10:39:10", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Message.class)
public class Message_ { 

    public static volatile SingularAttribute<Message, String> messageField;
    public static volatile SingularAttribute<Message, String> creationTime;
    public static volatile SingularAttribute<Message, String> messageSubject;
    public static volatile SingularAttribute<Message, Integer> messageID;
    public static volatile SingularAttribute<Message, String> messageTo;
    public static volatile SingularAttribute<Message, String> messageCc;
    public static volatile SingularAttribute<Message, String> priority;
    public static volatile SingularAttribute<Message, String> messageFrom;

}