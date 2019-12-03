/**
 * TicketChangeRequestApproval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class TicketChangeRequestApproval  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object ticketID;

    private java.lang.Object resourceID;

    private java.lang.Object contactID;

    private java.lang.Object approveRejectDateTime;

    private java.lang.Object approveRejectNote;

    private java.lang.Object isApproved;

    public TicketChangeRequestApproval() {
    }

    public TicketChangeRequestApproval(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object ticketID,
           java.lang.Object resourceID,
           java.lang.Object contactID,
           java.lang.Object approveRejectDateTime,
           java.lang.Object approveRejectNote,
           java.lang.Object isApproved) {
        super(
            fields,
            id,
            userDefinedFields);
        this.ticketID = ticketID;
        this.resourceID = resourceID;
        this.contactID = contactID;
        this.approveRejectDateTime = approveRejectDateTime;
        this.approveRejectNote = approveRejectNote;
        this.isApproved = isApproved;
    }


    /**
     * Gets the ticketID value for this TicketChangeRequestApproval.
     * 
     * @return ticketID
     */
    public java.lang.Object getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this TicketChangeRequestApproval.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Object ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the resourceID value for this TicketChangeRequestApproval.
     * 
     * @return resourceID
     */
    public java.lang.Object getResourceID() {
        return resourceID;
    }


    /**
     * Sets the resourceID value for this TicketChangeRequestApproval.
     * 
     * @param resourceID
     */
    public void setResourceID(java.lang.Object resourceID) {
        this.resourceID = resourceID;
    }


    /**
     * Gets the contactID value for this TicketChangeRequestApproval.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this TicketChangeRequestApproval.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the approveRejectDateTime value for this TicketChangeRequestApproval.
     * 
     * @return approveRejectDateTime
     */
    public java.lang.Object getApproveRejectDateTime() {
        return approveRejectDateTime;
    }


    /**
     * Sets the approveRejectDateTime value for this TicketChangeRequestApproval.
     * 
     * @param approveRejectDateTime
     */
    public void setApproveRejectDateTime(java.lang.Object approveRejectDateTime) {
        this.approveRejectDateTime = approveRejectDateTime;
    }


    /**
     * Gets the approveRejectNote value for this TicketChangeRequestApproval.
     * 
     * @return approveRejectNote
     */
    public java.lang.Object getApproveRejectNote() {
        return approveRejectNote;
    }


    /**
     * Sets the approveRejectNote value for this TicketChangeRequestApproval.
     * 
     * @param approveRejectNote
     */
    public void setApproveRejectNote(java.lang.Object approveRejectNote) {
        this.approveRejectNote = approveRejectNote;
    }


    /**
     * Gets the isApproved value for this TicketChangeRequestApproval.
     * 
     * @return isApproved
     */
    public java.lang.Object getIsApproved() {
        return isApproved;
    }


    /**
     * Sets the isApproved value for this TicketChangeRequestApproval.
     * 
     * @param isApproved
     */
    public void setIsApproved(java.lang.Object isApproved) {
        this.isApproved = isApproved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketChangeRequestApproval)) return false;
        TicketChangeRequestApproval other = (TicketChangeRequestApproval) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.resourceID==null && other.getResourceID()==null) || 
             (this.resourceID!=null &&
              this.resourceID.equals(other.getResourceID()))) &&
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.approveRejectDateTime==null && other.getApproveRejectDateTime()==null) || 
             (this.approveRejectDateTime!=null &&
              this.approveRejectDateTime.equals(other.getApproveRejectDateTime()))) &&
            ((this.approveRejectNote==null && other.getApproveRejectNote()==null) || 
             (this.approveRejectNote!=null &&
              this.approveRejectNote.equals(other.getApproveRejectNote()))) &&
            ((this.isApproved==null && other.getIsApproved()==null) || 
             (this.isApproved!=null &&
              this.isApproved.equals(other.getIsApproved())));
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
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getResourceID() != null) {
            _hashCode += getResourceID().hashCode();
        }
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getApproveRejectDateTime() != null) {
            _hashCode += getApproveRejectDateTime().hashCode();
        }
        if (getApproveRejectNote() != null) {
            _hashCode += getApproveRejectNote().hashCode();
        }
        if (getIsApproved() != null) {
            _hashCode += getIsApproved().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketChangeRequestApproval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketChangeRequestApproval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResourceID"));
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
        elemField.setFieldName("approveRejectDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApproveRejectDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveRejectNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApproveRejectNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsApproved"));
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
