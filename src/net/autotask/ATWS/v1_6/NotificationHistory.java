/**
 * NotificationHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class NotificationHistory  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object notificationSentTime;

    private java.lang.Object templateName;

    private java.lang.Object notificationHistoryTypeID;

    private java.lang.Object entityTitle;

    private java.lang.Object entityNumber;

    private boolean isDeleted;

    private boolean isActive;

    private boolean isTemplateJob;

    private java.lang.Object initiatingResourceID;

    private java.lang.Object initiatingContactID;

    private java.lang.Object recipientEmailAddress;

    private java.lang.Object recipientDisplayName;

    private java.lang.Object accountID;

    private java.lang.Object quoteID;

    private java.lang.Object opportunityID;

    private java.lang.Object projectID;

    private java.lang.Object taskID;

    private java.lang.Object ticketID;

    private java.lang.Object timeEntryID;

    public NotificationHistory() {
    }

    public NotificationHistory(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object notificationSentTime,
           java.lang.Object templateName,
           java.lang.Object notificationHistoryTypeID,
           java.lang.Object entityTitle,
           java.lang.Object entityNumber,
           boolean isDeleted,
           boolean isActive,
           boolean isTemplateJob,
           java.lang.Object initiatingResourceID,
           java.lang.Object initiatingContactID,
           java.lang.Object recipientEmailAddress,
           java.lang.Object recipientDisplayName,
           java.lang.Object accountID,
           java.lang.Object quoteID,
           java.lang.Object opportunityID,
           java.lang.Object projectID,
           java.lang.Object taskID,
           java.lang.Object ticketID,
           java.lang.Object timeEntryID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.notificationSentTime = notificationSentTime;
        this.templateName = templateName;
        this.notificationHistoryTypeID = notificationHistoryTypeID;
        this.entityTitle = entityTitle;
        this.entityNumber = entityNumber;
        this.isDeleted = isDeleted;
        this.isActive = isActive;
        this.isTemplateJob = isTemplateJob;
        this.initiatingResourceID = initiatingResourceID;
        this.initiatingContactID = initiatingContactID;
        this.recipientEmailAddress = recipientEmailAddress;
        this.recipientDisplayName = recipientDisplayName;
        this.accountID = accountID;
        this.quoteID = quoteID;
        this.opportunityID = opportunityID;
        this.projectID = projectID;
        this.taskID = taskID;
        this.ticketID = ticketID;
        this.timeEntryID = timeEntryID;
    }


    /**
     * Gets the notificationSentTime value for this NotificationHistory.
     * 
     * @return notificationSentTime
     */
    public java.lang.Object getNotificationSentTime() {
        return notificationSentTime;
    }


    /**
     * Sets the notificationSentTime value for this NotificationHistory.
     * 
     * @param notificationSentTime
     */
    public void setNotificationSentTime(java.lang.Object notificationSentTime) {
        this.notificationSentTime = notificationSentTime;
    }


    /**
     * Gets the templateName value for this NotificationHistory.
     * 
     * @return templateName
     */
    public java.lang.Object getTemplateName() {
        return templateName;
    }


    /**
     * Sets the templateName value for this NotificationHistory.
     * 
     * @param templateName
     */
    public void setTemplateName(java.lang.Object templateName) {
        this.templateName = templateName;
    }


    /**
     * Gets the notificationHistoryTypeID value for this NotificationHistory.
     * 
     * @return notificationHistoryTypeID
     */
    public java.lang.Object getNotificationHistoryTypeID() {
        return notificationHistoryTypeID;
    }


    /**
     * Sets the notificationHistoryTypeID value for this NotificationHistory.
     * 
     * @param notificationHistoryTypeID
     */
    public void setNotificationHistoryTypeID(java.lang.Object notificationHistoryTypeID) {
        this.notificationHistoryTypeID = notificationHistoryTypeID;
    }


    /**
     * Gets the entityTitle value for this NotificationHistory.
     * 
     * @return entityTitle
     */
    public java.lang.Object getEntityTitle() {
        return entityTitle;
    }


    /**
     * Sets the entityTitle value for this NotificationHistory.
     * 
     * @param entityTitle
     */
    public void setEntityTitle(java.lang.Object entityTitle) {
        this.entityTitle = entityTitle;
    }


    /**
     * Gets the entityNumber value for this NotificationHistory.
     * 
     * @return entityNumber
     */
    public java.lang.Object getEntityNumber() {
        return entityNumber;
    }


    /**
     * Sets the entityNumber value for this NotificationHistory.
     * 
     * @param entityNumber
     */
    public void setEntityNumber(java.lang.Object entityNumber) {
        this.entityNumber = entityNumber;
    }


    /**
     * Gets the isDeleted value for this NotificationHistory.
     * 
     * @return isDeleted
     */
    public boolean isIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this NotificationHistory.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isActive value for this NotificationHistory.
     * 
     * @return isActive
     */
    public boolean isIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this NotificationHistory.
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isTemplateJob value for this NotificationHistory.
     * 
     * @return isTemplateJob
     */
    public boolean isIsTemplateJob() {
        return isTemplateJob;
    }


    /**
     * Sets the isTemplateJob value for this NotificationHistory.
     * 
     * @param isTemplateJob
     */
    public void setIsTemplateJob(boolean isTemplateJob) {
        this.isTemplateJob = isTemplateJob;
    }


    /**
     * Gets the initiatingResourceID value for this NotificationHistory.
     * 
     * @return initiatingResourceID
     */
    public java.lang.Object getInitiatingResourceID() {
        return initiatingResourceID;
    }


    /**
     * Sets the initiatingResourceID value for this NotificationHistory.
     * 
     * @param initiatingResourceID
     */
    public void setInitiatingResourceID(java.lang.Object initiatingResourceID) {
        this.initiatingResourceID = initiatingResourceID;
    }


    /**
     * Gets the initiatingContactID value for this NotificationHistory.
     * 
     * @return initiatingContactID
     */
    public java.lang.Object getInitiatingContactID() {
        return initiatingContactID;
    }


    /**
     * Sets the initiatingContactID value for this NotificationHistory.
     * 
     * @param initiatingContactID
     */
    public void setInitiatingContactID(java.lang.Object initiatingContactID) {
        this.initiatingContactID = initiatingContactID;
    }


    /**
     * Gets the recipientEmailAddress value for this NotificationHistory.
     * 
     * @return recipientEmailAddress
     */
    public java.lang.Object getRecipientEmailAddress() {
        return recipientEmailAddress;
    }


    /**
     * Sets the recipientEmailAddress value for this NotificationHistory.
     * 
     * @param recipientEmailAddress
     */
    public void setRecipientEmailAddress(java.lang.Object recipientEmailAddress) {
        this.recipientEmailAddress = recipientEmailAddress;
    }


    /**
     * Gets the recipientDisplayName value for this NotificationHistory.
     * 
     * @return recipientDisplayName
     */
    public java.lang.Object getRecipientDisplayName() {
        return recipientDisplayName;
    }


    /**
     * Sets the recipientDisplayName value for this NotificationHistory.
     * 
     * @param recipientDisplayName
     */
    public void setRecipientDisplayName(java.lang.Object recipientDisplayName) {
        this.recipientDisplayName = recipientDisplayName;
    }


    /**
     * Gets the accountID value for this NotificationHistory.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this NotificationHistory.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the quoteID value for this NotificationHistory.
     * 
     * @return quoteID
     */
    public java.lang.Object getQuoteID() {
        return quoteID;
    }


    /**
     * Sets the quoteID value for this NotificationHistory.
     * 
     * @param quoteID
     */
    public void setQuoteID(java.lang.Object quoteID) {
        this.quoteID = quoteID;
    }


    /**
     * Gets the opportunityID value for this NotificationHistory.
     * 
     * @return opportunityID
     */
    public java.lang.Object getOpportunityID() {
        return opportunityID;
    }


    /**
     * Sets the opportunityID value for this NotificationHistory.
     * 
     * @param opportunityID
     */
    public void setOpportunityID(java.lang.Object opportunityID) {
        this.opportunityID = opportunityID;
    }


    /**
     * Gets the projectID value for this NotificationHistory.
     * 
     * @return projectID
     */
    public java.lang.Object getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this NotificationHistory.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.Object projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the taskID value for this NotificationHistory.
     * 
     * @return taskID
     */
    public java.lang.Object getTaskID() {
        return taskID;
    }


    /**
     * Sets the taskID value for this NotificationHistory.
     * 
     * @param taskID
     */
    public void setTaskID(java.lang.Object taskID) {
        this.taskID = taskID;
    }


    /**
     * Gets the ticketID value for this NotificationHistory.
     * 
     * @return ticketID
     */
    public java.lang.Object getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this NotificationHistory.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Object ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the timeEntryID value for this NotificationHistory.
     * 
     * @return timeEntryID
     */
    public java.lang.Object getTimeEntryID() {
        return timeEntryID;
    }


    /**
     * Sets the timeEntryID value for this NotificationHistory.
     * 
     * @param timeEntryID
     */
    public void setTimeEntryID(java.lang.Object timeEntryID) {
        this.timeEntryID = timeEntryID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationHistory)) return false;
        NotificationHistory other = (NotificationHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notificationSentTime==null && other.getNotificationSentTime()==null) || 
             (this.notificationSentTime!=null &&
              this.notificationSentTime.equals(other.getNotificationSentTime()))) &&
            ((this.templateName==null && other.getTemplateName()==null) || 
             (this.templateName!=null &&
              this.templateName.equals(other.getTemplateName()))) &&
            ((this.notificationHistoryTypeID==null && other.getNotificationHistoryTypeID()==null) || 
             (this.notificationHistoryTypeID!=null &&
              this.notificationHistoryTypeID.equals(other.getNotificationHistoryTypeID()))) &&
            ((this.entityTitle==null && other.getEntityTitle()==null) || 
             (this.entityTitle!=null &&
              this.entityTitle.equals(other.getEntityTitle()))) &&
            ((this.entityNumber==null && other.getEntityNumber()==null) || 
             (this.entityNumber!=null &&
              this.entityNumber.equals(other.getEntityNumber()))) &&
            this.isDeleted == other.isIsDeleted() &&
            this.isActive == other.isIsActive() &&
            this.isTemplateJob == other.isIsTemplateJob() &&
            ((this.initiatingResourceID==null && other.getInitiatingResourceID()==null) || 
             (this.initiatingResourceID!=null &&
              this.initiatingResourceID.equals(other.getInitiatingResourceID()))) &&
            ((this.initiatingContactID==null && other.getInitiatingContactID()==null) || 
             (this.initiatingContactID!=null &&
              this.initiatingContactID.equals(other.getInitiatingContactID()))) &&
            ((this.recipientEmailAddress==null && other.getRecipientEmailAddress()==null) || 
             (this.recipientEmailAddress!=null &&
              this.recipientEmailAddress.equals(other.getRecipientEmailAddress()))) &&
            ((this.recipientDisplayName==null && other.getRecipientDisplayName()==null) || 
             (this.recipientDisplayName!=null &&
              this.recipientDisplayName.equals(other.getRecipientDisplayName()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.quoteID==null && other.getQuoteID()==null) || 
             (this.quoteID!=null &&
              this.quoteID.equals(other.getQuoteID()))) &&
            ((this.opportunityID==null && other.getOpportunityID()==null) || 
             (this.opportunityID!=null &&
              this.opportunityID.equals(other.getOpportunityID()))) &&
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.taskID==null && other.getTaskID()==null) || 
             (this.taskID!=null &&
              this.taskID.equals(other.getTaskID()))) &&
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.timeEntryID==null && other.getTimeEntryID()==null) || 
             (this.timeEntryID!=null &&
              this.timeEntryID.equals(other.getTimeEntryID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNotificationSentTime() != null) {
            _hashCode += getNotificationSentTime().hashCode();
        }
        if (getTemplateName() != null) {
            _hashCode += getTemplateName().hashCode();
        }
        if (getNotificationHistoryTypeID() != null) {
            _hashCode += getNotificationHistoryTypeID().hashCode();
        }
        if (getEntityTitle() != null) {
            _hashCode += getEntityTitle().hashCode();
        }
        if (getEntityNumber() != null) {
            _hashCode += getEntityNumber().hashCode();
        }
        _hashCode += (isIsDeleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsTemplateJob() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInitiatingResourceID() != null) {
            _hashCode += getInitiatingResourceID().hashCode();
        }
        if (getInitiatingContactID() != null) {
            _hashCode += getInitiatingContactID().hashCode();
        }
        if (getRecipientEmailAddress() != null) {
            _hashCode += getRecipientEmailAddress().hashCode();
        }
        if (getRecipientDisplayName() != null) {
            _hashCode += getRecipientDisplayName().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getQuoteID() != null) {
            _hashCode += getQuoteID().hashCode();
        }
        if (getOpportunityID() != null) {
            _hashCode += getOpportunityID().hashCode();
        }
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getTaskID() != null) {
            _hashCode += getTaskID().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getTimeEntryID() != null) {
            _hashCode += getTimeEntryID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NotificationHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationSentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NotificationSentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TemplateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationHistoryTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NotificationHistoryTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTemplateJob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsTemplateJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatingResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InitiatingResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatingContactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InitiatingContactID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RecipientEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RecipientDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OpportunityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaskID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeEntryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeEntryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
