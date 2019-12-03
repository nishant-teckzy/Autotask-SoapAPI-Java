/**
 * AccountToDo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class AccountToDo  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object contactID;

    private java.lang.Object opportunityID;

    private java.lang.Object ticketID;

    private java.lang.Object contractID;

    private java.lang.Object assignedToResourceID;

    private java.lang.Object startDateTime;

    private java.lang.Object endDateTime;

    private java.lang.Object actionType;

    private java.lang.Object activityDescription;

    private java.lang.Object completedDate;

    private java.lang.Object createDateTime;

    private java.lang.Object creatorResourceID;

    private java.lang.Object lastModifiedDate;

    public AccountToDo() {
    }

    public AccountToDo(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object contactID,
           java.lang.Object opportunityID,
           java.lang.Object ticketID,
           java.lang.Object contractID,
           java.lang.Object assignedToResourceID,
           java.lang.Object startDateTime,
           java.lang.Object endDateTime,
           java.lang.Object actionType,
           java.lang.Object activityDescription,
           java.lang.Object completedDate,
           java.lang.Object createDateTime,
           java.lang.Object creatorResourceID,
           java.lang.Object lastModifiedDate) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.contactID = contactID;
        this.opportunityID = opportunityID;
        this.ticketID = ticketID;
        this.contractID = contractID;
        this.assignedToResourceID = assignedToResourceID;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.actionType = actionType;
        this.activityDescription = activityDescription;
        this.completedDate = completedDate;
        this.createDateTime = createDateTime;
        this.creatorResourceID = creatorResourceID;
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the accountID value for this AccountToDo.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this AccountToDo.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the contactID value for this AccountToDo.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this AccountToDo.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the opportunityID value for this AccountToDo.
     * 
     * @return opportunityID
     */
    public java.lang.Object getOpportunityID() {
        return opportunityID;
    }


    /**
     * Sets the opportunityID value for this AccountToDo.
     * 
     * @param opportunityID
     */
    public void setOpportunityID(java.lang.Object opportunityID) {
        this.opportunityID = opportunityID;
    }


    /**
     * Gets the ticketID value for this AccountToDo.
     * 
     * @return ticketID
     */
    public java.lang.Object getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this AccountToDo.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Object ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the contractID value for this AccountToDo.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this AccountToDo.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the assignedToResourceID value for this AccountToDo.
     * 
     * @return assignedToResourceID
     */
    public java.lang.Object getAssignedToResourceID() {
        return assignedToResourceID;
    }


    /**
     * Sets the assignedToResourceID value for this AccountToDo.
     * 
     * @param assignedToResourceID
     */
    public void setAssignedToResourceID(java.lang.Object assignedToResourceID) {
        this.assignedToResourceID = assignedToResourceID;
    }


    /**
     * Gets the startDateTime value for this AccountToDo.
     * 
     * @return startDateTime
     */
    public java.lang.Object getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this AccountToDo.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.Object startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this AccountToDo.
     * 
     * @return endDateTime
     */
    public java.lang.Object getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this AccountToDo.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.Object endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the actionType value for this AccountToDo.
     * 
     * @return actionType
     */
    public java.lang.Object getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this AccountToDo.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.Object actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the activityDescription value for this AccountToDo.
     * 
     * @return activityDescription
     */
    public java.lang.Object getActivityDescription() {
        return activityDescription;
    }


    /**
     * Sets the activityDescription value for this AccountToDo.
     * 
     * @param activityDescription
     */
    public void setActivityDescription(java.lang.Object activityDescription) {
        this.activityDescription = activityDescription;
    }


    /**
     * Gets the completedDate value for this AccountToDo.
     * 
     * @return completedDate
     */
    public java.lang.Object getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this AccountToDo.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.lang.Object completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the createDateTime value for this AccountToDo.
     * 
     * @return createDateTime
     */
    public java.lang.Object getCreateDateTime() {
        return createDateTime;
    }


    /**
     * Sets the createDateTime value for this AccountToDo.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(java.lang.Object createDateTime) {
        this.createDateTime = createDateTime;
    }


    /**
     * Gets the creatorResourceID value for this AccountToDo.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this AccountToDo.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the lastModifiedDate value for this AccountToDo.
     * 
     * @return lastModifiedDate
     */
    public java.lang.Object getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this AccountToDo.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.lang.Object lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountToDo)) return false;
        AccountToDo other = (AccountToDo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.opportunityID==null && other.getOpportunityID()==null) || 
             (this.opportunityID!=null &&
              this.opportunityID.equals(other.getOpportunityID()))) &&
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.assignedToResourceID==null && other.getAssignedToResourceID()==null) || 
             (this.assignedToResourceID!=null &&
              this.assignedToResourceID.equals(other.getAssignedToResourceID()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.activityDescription==null && other.getActivityDescription()==null) || 
             (this.activityDescription!=null &&
              this.activityDescription.equals(other.getActivityDescription()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.createDateTime==null && other.getCreateDateTime()==null) || 
             (this.createDateTime!=null &&
              this.createDateTime.equals(other.getCreateDateTime()))) &&
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate())));
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getOpportunityID() != null) {
            _hashCode += getOpportunityID().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getAssignedToResourceID() != null) {
            _hashCode += getAssignedToResourceID().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getActivityDescription() != null) {
            _hashCode += getActivityDescription().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getCreateDateTime() != null) {
            _hashCode += getCreateDateTime().hashCode();
        }
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountToDo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountToDo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContactID"));
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
        elemField.setFieldName("ticketID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedToResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AssignedToResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ActionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ActivityDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatorResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastModifiedDate"));
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
