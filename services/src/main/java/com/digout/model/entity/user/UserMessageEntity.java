package com.digout.model.entity.user;

import com.digout.model.entity.common.AutoGeneratedIdentifier;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;

@Entity
@Table(name = "USER_MESSAGES")
public class UserMessageEntity extends AutoGeneratedIdentifier {

    private static final long serialVersionUID = 6534657446874063594L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sender_id", nullable = false)
    private UserEntity sender;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "receiver_id", nullable = false)
    private UserEntity receiver;

    @Column(name = "sent_data", nullable = false)
    @Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
    private DateTime sentDate;

    @Column(name = "text")
    private String text;

    @Column(name = "is_read", nullable = false)
    private boolean read = false;

    @Column(name = "is_deleted_by_receiver", nullable = false)
    private boolean deletedByReceiver = false;

    @Column(name = "is_deleted_by_sender", nullable = false)
    private boolean deletedBySender = false;

    @OneToOne(mappedBy = "lastMessage", cascade = CascadeType.ALL)
    private UserConversationEntity conversation;

    public UserMessageEntity() {
    }

    public UserConversationEntity getConversation() {
        return this.conversation;
    }

    public UserEntity getReceiver() {
        return this.receiver;
    }

    public UserEntity getSender() {
        return this.sender;
    }

    public DateTime getSentDate() {
        return this.sentDate;
    }

    public String getText() {
        return this.text;
    }

    public boolean isDeletedByReceiver() {
        return this.deletedByReceiver;
    }

    public boolean isDeletedBySender() {
        return this.deletedBySender;
    }

    public boolean isRead() {
        return this.read;
    }

    public void setConversation(final UserConversationEntity conversation) {
        this.conversation = conversation;
    }

    public void setDeletedByReceiver(final boolean deletedByReceiver) {
        this.deletedByReceiver = deletedByReceiver;
    }

    public void setDeletedBySender(final boolean deletedBySender) {
        this.deletedBySender = deletedBySender;
    }

    public void setRead(final boolean read) {
        this.read = read;
    }

    public void setReceiver(final UserEntity receiver) {
        this.receiver = receiver;
    }

    public void setSender(final UserEntity sender) {
        this.sender = sender;
    }

    public void setSentDate(final DateTime sentDate) {
        this.sentDate = sentDate;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
