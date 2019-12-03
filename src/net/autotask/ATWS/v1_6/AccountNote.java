/**
 * AccountNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class AccountNote  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object contactID;

    private java.lang.Object opportunityID;

    private java.lang.Object assignedResourceID;

    private java.lang.Object actionType;

    private java.lang.Object startDateTime;

    private java.lang.Object endDateTime;

    private java.lang.Object completedDateTime;

    private java.lang.Object name;

    private java.lang.Object note;

    private java.lang.Object lastModifiedDate;

    private java.lang.Object impersonatorCreatorResourceID;

    private java.lang.Object impersonatorUpdaterResourceID;

    private java.lang.Object createDateTime;

    public AccountNote() {
    }

    public AccountNote(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object contactID,
           java.lang.Object opportunityID,
           java.lang.Object assignedResourceID,
           java.lang.Object actionType,
           java.lang.Object startDateTime,
           java.lang.Object endDateTime,
           java.lang.Object completedDateTime,
           java.lang.Object name,
           java.lang.Object note,
           java.lang.Object lastModifiedDate,
           java.lang.Object impersonatorCreatorResourceID,
           java.lang.Object impersonatorUpdaterResourceID,
           java.lang.Object createDateTime) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.contactID = contactID;
        this.opportunityID = opportunityID;
        this.assignedResourceID = assignedResourceID;
        this.actionType = actionType;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.completedDateTime = completedDateTime;
        this.name = name;
        this.note = note;
        this.lastModifiedDate = lastModifiedDate;
        this.impersonatorCreatorResourceID = impersonatorCreatorResourceID;
        this.impersonatorUpdaterResourceID = impersonatorUpdaterResourceID;
        this.createDateTime = createDateTime;
    }


    /**
     * Gets the accountID value for this AccountNote.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this AccountNote.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the contactID value for this AccountNote.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this AccountNote.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the opportunityID value for this AccountNote.
     * 
     * @return opportunityID
     */
    public java.lang.Object getOpportunityID() {
        return opportunityID;
    }


    /**
     * Sets the opportunityID value for this AccountNote.
     * 
     * @param opportunityID
     */
    public void setOpportunityID(java.lang.Object opportunityID) {
        this.opportunityID = opportunityID;
    }


    /**
     * Gets the assignedResourceID value for this AccountNote.
     * 
     * @return assignedResourceID
     */
    public java.lang.Object getAssignedResourceID() {
        return assignedResourceID;
    }


    /**
     * Sets the assignedResourceID value for this AccountNote.
     * 
     * @param assignedResourceID
     */
    public void setAssignedResourceID(java.lang.Object assignedResourceID) {
        this.assignedResourceID = assignedResourceID;
    }


    /**
     * Gets the actionType value for this AccountNote.
     * 
     * @return actionType
     */
    public java.lang.Object getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this AccountNote.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.Object actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the startDateTime value for this AccountNote.
     * 
     * @return startDateTime
     */
    public java.lang.Object getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this AccountNote.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.Object startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this AccountNote.
     * 
     * @return endDateTime
     */
    public java.lang.Object getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this AccountNote.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.Object endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the completedDateTime value for this AccountNote.
     * 
     * @return completedDateTime
     */
    public java.lang.Object getCompletedDateTime() {
        return completedDateTime;
    }


    /**
     * Sets the completedDateTime value for this AccountNote.
     * 
     * @param completedDateTime
     */
    public void setCompletedDateTime(java.lang.Object completedDateTime) {
        this.completedDateTime = completedDateTime;
    }


    /**
     * Gets the name value for this AccountNote.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountNote.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the note value for this AccountNote.
     * 
     * @return note
     */
    public java.lang.Object getNote() {
        return note;
    }


    /**
     * Sets the note value for this AccountNote.
     * 
     * @param note
     */
    public void setNote(java.lang.Object note) {
        this.note = note;
    }


    /**
     * Gets the lastModifiedDate value for this AccountNote.
     * 
     * @return lastModifiedDate
     */
    public java.lang.Object getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this AccountNote.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.lang.Object lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the impersonatorCreatorResourceID value for this AccountNote.
     * 
     * @return impersonatorCreatorResourceID
     */
    public java.lang.Object getImpersonatorCreatorResourceID() {
        return impersonatorCreatorResourceID;
    }


    /**
     * Sets the impersonatorCreatorResourceID value for this AccountNote.
     * 
     * @param impersonatorCreatorResourceID
     */
    public void setImpersonatorCreatorResourceID(java.lang.Object impersonatorCreatorResourceID) {
        this.impersonatorCreatorResourceID = impersonatorCreatorResourceID;
    }


    /**
     * Gets the impersonatorUpdaterResourceID value for this AccountNote.
     * 
     * @return impersonatorUpdaterResourceID
     */
    public java.lang.Object getImpersonatorUpdaterResourceID() {
        return impersonatorUpdaterResourceID;
    }


    /**
     * Sets the impersonatorUpdaterResourceID value for this AccountNote.
     * 
     * @param impersonatorUpdaterResourceID
     */
    public void setImpersonatorUpdaterResourceID(java.lang.Object impersonatorUpdaterResourceID) {
        this.impersonatorUpdaterResourceID = impersonatorUpdaterResourceID;
    }


    /**
     * Gets the createDateTime value for this AccountNote.
     * 
     * @return createDateTime
     */
    public java.lang.Object getCreateDateTime() {
        return createDateTime;
    }


    /**
     * Sets the createDateTime value for this AccountNote.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(java.lang.Object createDateTime) {
        this.createDateTime = createDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountNote)) return false;
        AccountNote other = (AccountNote) obj;
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
            ((this.assignedResourceID==null && other.getAssignedResourceID()==null) || 
             (this.assignedResourceID!=null &&
              this.assignedResourceID.equals(other.getAssignedResourceID()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.completedDateTime==null && other.getCompletedDateTime()==null) || 
             (this.completedDateTime!=null &&
              this.completedDateTime.equals(other.getCompletedDateTime()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.impersonatorCreatorResourceID==null && other.getImpersonatorCreatorResourceID()==null) || 
             (this.impersonatorCreatorResourceID!=null &&
              this.impersonatorCreatorResourceID.equals(other.getImpersonatorCreatorResourceID()))) &&
            ((this.impersonatorUpdaterResourceID==null && other.getImpersonatorUpdaterResourceID()==null) || 
             (this.impersonatorUpdaterResourceID!=null &&
              this.impersonatorUpdaterResourceID.equals(other.getImpersonatorUpdaterResourceID()))) &&
            ((this.createDateTime==null && other.getCreateDateTime()==null) || 
             (this.createDateTime!=null &&
              this.createDateTime.equals(other.getCreateDateTime())));
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
        if (getAssignedResourceID() != null) {
            _hashCode += getAssignedResourceID().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getCompletedDateTime() != null) {
            _hashCode += getCompletedDateTime().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getImpersonatorCreatorResourceID() != null) {
            _hashCode += getImpersonatorCreatorResourceID().hashCode();
        }
        if (getImpersonatorUpdaterResourceID() != null) {
            _hashCode += getImpersonatorUpdaterResourceID().hashCode();
        }
        if (getCreateDateTime() != null) {
            _hashCode += getCreateDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountNote"));
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
        elemField.setFieldName("assignedResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AssignedResourceID"));
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
        elemField.setFieldName("completedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompletedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Note"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impersonatorCreatorResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ImpersonatorCreatorResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impersonatorUpdaterResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ImpersonatorUpdaterResourceID"));
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
