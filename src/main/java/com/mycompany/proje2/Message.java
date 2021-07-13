/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proje2;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "messages")
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m"),
    @NamedQuery(name = "Message.findByMessageID", query = "SELECT m FROM Message m WHERE m.messageID = :messageID"),
    @NamedQuery(name = "Message.findByCreationTime", query = "SELECT m FROM Message m WHERE m.creationTime = :creationTime"),
    @NamedQuery(name = "Message.findByMessageCc", query = "SELECT m FROM Message m WHERE m.messageCc = :messageCc"),
    @NamedQuery(name = "Message.findByMessageField", query = "SELECT m FROM Message m WHERE m.messageField = :messageField"),
    @NamedQuery(name = "Message.findByMessageFrom", query = "SELECT m FROM Message m WHERE m.messageFrom = :messageFrom"),
    @NamedQuery(name = "Message.findByMessageSubject", query = "SELECT m FROM Message m WHERE m.messageSubject = :messageSubject"),
    @NamedQuery(name = "Message.findByMessageTo", query = "SELECT m FROM Message m WHERE m.messageTo = :messageTo"),
    @NamedQuery(name = "Message.findByPriority", query = "SELECT m FROM Message m WHERE m.priority = :priority")})
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MessageID", unique = true, nullable = false)
    private Integer messageID;
    
    @Column(name = "CreationTime")
    private String creationTime;
    
    @Column(name = "MessageCc")
    private String messageCc;
    
    @Column(name = "MessageField")
    private String messageField;
    
    @Column(name = "MessageFrom")
    private String messageFrom;
    
    @Column(name = "MessageSubject")
    private String messageSubject;
    
    @Column(name = "MessageTo")
    private String messageTo;
    
    @Column(name = "Priority")
    private String priority;

    public Message() {
    }

    public Message(Integer messageID) {
        this.messageID = messageID;
    }
    
    public Message(String creationTime,String messageFrom, String messageTo, String messageCc , String messageSubject, String messageField, String priority) {
        this.creationTime = creationTime;
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.messageCc = messageCc;
        this.messageSubject = messageSubject;
        this.messageField = messageField;
        this.priority = priority;
    }

    public Integer getMessageID() {
        return messageID;
    }

    public void setMessageID(Integer messageID) {
        this.messageID = messageID;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getMessageCc() {
        return messageCc;
    }

    public void setMessageCc(String messageCc) {
        this.messageCc = messageCc;
    }

    public String getMessageField() {
        return messageField;
    }

    public void setMessageField(String messageField) {
        this.messageField = messageField;
    }

    public String getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(String messageTo) {
        this.messageTo = messageTo;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messageID != null ? messageID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        return !((this.messageID == null && other.messageID != null) || (this.messageID != null && !this.messageID.equals(other.messageID)));
    }

    @Override
    public String toString() {
        return "Message{" +
                "\nMessage Creation Time : " + creationTime +
                "\nMessage From : " + messageFrom +
                "\nMessage To : " + messageTo +
                "\nMessage Cc : " + messageCc +
                "\nMessage Subject : " + messageSubject  +
                "\nMessage : " + messageField +
                "\nMessage Priority : " + priority  +
                "\n}";
    }
    
}
