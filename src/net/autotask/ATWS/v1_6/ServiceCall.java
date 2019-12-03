/**
 * ServiceCall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ServiceCall  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object startDateTime;

    private java.lang.Object endDateTime;

    private java.lang.Object description;

    private java.lang.Object complete;

    private java.lang.Object creatorResourceID;

    private java.lang.Object createDateTime;

    private java.lang.Object lastModifiedDateTime;

    private java.lang.Object duration;

    private java.lang.Object status;

    private java.lang.Object canceledByResource;

    private java.lang.Object canceledDateTime;

    private java.lang.Object cancelationNoticeHours;

    private java.lang.Object accountPhysicalLocationID;

    public ServiceCall() {
    }

    public ServiceCall(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object startDateTime,
           java.lang.Object endDateTime,
           java.lang.Object description,
           java.lang.Object complete,
           java.lang.Object creatorResourceID,
           java.lang.Object createDateTime,
           java.lang.Object lastModifiedDateTime,
           java.lang.Object duration,
           java.lang.Object status,
           java.lang.Object canceledByResource,
           java.lang.Object canceledDateTime,
           java.lang.Object cancelationNoticeHours,
           java.lang.Object accountPhysicalLocationID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.description = description;
        this.complete = complete;
        this.creatorResourceID = creatorResourceID;
        this.createDateTime = createDateTime;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.duration = duration;
        this.status = status;
        this.canceledByResource = canceledByResource;
        this.canceledDateTime = canceledDateTime;
        this.cancelationNoticeHours = cancelationNoticeHours;
        this.accountPhysicalLocationID = accountPhysicalLocationID;
    }


    /**
     * Gets the accountID value for this ServiceCall.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this ServiceCall.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the startDateTime value for this ServiceCall.
     * 
     * @return startDateTime
     */
    public java.lang.Object getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ServiceCall.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.Object startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ServiceCall.
     * 
     * @return endDateTime
     */
    public java.lang.Object getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ServiceCall.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.Object endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the description value for this ServiceCall.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ServiceCall.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the complete value for this ServiceCall.
     * 
     * @return complete
     */
    public java.lang.Object getComplete() {
        return complete;
    }


    /**
     * Sets the complete value for this ServiceCall.
     * 
     * @param complete
     */
    public void setComplete(java.lang.Object complete) {
        this.complete = complete;
    }


    /**
     * Gets the creatorResourceID value for this ServiceCall.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this ServiceCall.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the createDateTime value for this ServiceCall.
     * 
     * @return createDateTime
     */
    public java.lang.Object getCreateDateTime() {
        return createDateTime;
    }


    /**
     * Sets the createDateTime value for this ServiceCall.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(java.lang.Object createDateTime) {
        this.createDateTime = createDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this ServiceCall.
     * 
     * @return lastModifiedDateTime
     */
    public java.lang.Object getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this ServiceCall.
     * 
     * @param lastModifiedDateTime
     */
    public void setLastModifiedDateTime(java.lang.Object lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the duration value for this ServiceCall.
     * 
     * @return duration
     */
    public java.lang.Object getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this ServiceCall.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Object duration) {
        this.duration = duration;
    }


    /**
     * Gets the status value for this ServiceCall.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ServiceCall.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the canceledByResource value for this ServiceCall.
     * 
     * @return canceledByResource
     */
    public java.lang.Object getCanceledByResource() {
        return canceledByResource;
    }


    /**
     * Sets the canceledByResource value for this ServiceCall.
     * 
     * @param canceledByResource
     */
    public void setCanceledByResource(java.lang.Object canceledByResource) {
        this.canceledByResource = canceledByResource;
    }


    /**
     * Gets the canceledDateTime value for this ServiceCall.
     * 
     * @return canceledDateTime
     */
    public java.lang.Object getCanceledDateTime() {
        return canceledDateTime;
    }


    /**
     * Sets the canceledDateTime value for this ServiceCall.
     * 
     * @param canceledDateTime
     */
    public void setCanceledDateTime(java.lang.Object canceledDateTime) {
        this.canceledDateTime = canceledDateTime;
    }


    /**
     * Gets the cancelationNoticeHours value for this ServiceCall.
     * 
     * @return cancelationNoticeHours
     */
    public java.lang.Object getCancelationNoticeHours() {
        return cancelationNoticeHours;
    }


    /**
     * Sets the cancelationNoticeHours value for this ServiceCall.
     * 
     * @param cancelationNoticeHours
     */
    public void setCancelationNoticeHours(java.lang.Object cancelationNoticeHours) {
        this.cancelationNoticeHours = cancelationNoticeHours;
    }


    /**
     * Gets the accountPhysicalLocationID value for this ServiceCall.
     * 
     * @return accountPhysicalLocationID
     */
    public java.lang.Object getAccountPhysicalLocationID() {
        return accountPhysicalLocationID;
    }


    /**
     * Sets the accountPhysicalLocationID value for this ServiceCall.
     * 
     * @param accountPhysicalLocationID
     */
    public void setAccountPhysicalLocationID(java.lang.Object accountPhysicalLocationID) {
        this.accountPhysicalLocationID = accountPhysicalLocationID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceCall)) return false;
        ServiceCall other = (ServiceCall) obj;
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
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.complete==null && other.getComplete()==null) || 
             (this.complete!=null &&
              this.complete.equals(other.getComplete()))) &&
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.createDateTime==null && other.getCreateDateTime()==null) || 
             (this.createDateTime!=null &&
              this.createDateTime.equals(other.getCreateDateTime()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.canceledByResource==null && other.getCanceledByResource()==null) || 
             (this.canceledByResource!=null &&
              this.canceledByResource.equals(other.getCanceledByResource()))) &&
            ((this.canceledDateTime==null && other.getCanceledDateTime()==null) || 
             (this.canceledDateTime!=null &&
              this.canceledDateTime.equals(other.getCanceledDateTime()))) &&
            ((this.cancelationNoticeHours==null && other.getCancelationNoticeHours()==null) || 
             (this.cancelationNoticeHours!=null &&
              this.cancelationNoticeHours.equals(other.getCancelationNoticeHours()))) &&
            ((this.accountPhysicalLocationID==null && other.getAccountPhysicalLocationID()==null) || 
             (this.accountPhysicalLocationID!=null &&
              this.accountPhysicalLocationID.equals(other.getAccountPhysicalLocationID())));
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
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getComplete() != null) {
            _hashCode += getComplete().hashCode();
        }
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getCreateDateTime() != null) {
            _hashCode += getCreateDateTime().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCanceledByResource() != null) {
            _hashCode += getCanceledByResource().hashCode();
        }
        if (getCanceledDateTime() != null) {
            _hashCode += getCanceledDateTime().hashCode();
        }
        if (getCancelationNoticeHours() != null) {
            _hashCode += getCancelationNoticeHours().hashCode();
        }
        if (getAccountPhysicalLocationID() != null) {
            _hashCode += getAccountPhysicalLocationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceCall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceCall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Complete"));
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
        elemField.setFieldName("createDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canceledByResource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CanceledByResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canceledDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CanceledDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelationNoticeHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CancelationNoticeHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPhysicalLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountPhysicalLocationID"));
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
