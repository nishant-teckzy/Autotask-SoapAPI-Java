/**
 * BillingItemApprovalLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class BillingItemApprovalLevel  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object timeEntryID;

    private java.lang.Object approvalResourceID;

    private java.lang.Object approvalDateTime;

    private java.lang.Object approvalLevel;

    public BillingItemApprovalLevel() {
    }

    public BillingItemApprovalLevel(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object timeEntryID,
           java.lang.Object approvalResourceID,
           java.lang.Object approvalDateTime,
           java.lang.Object approvalLevel) {
        super(
            fields,
            id,
            userDefinedFields);
        this.timeEntryID = timeEntryID;
        this.approvalResourceID = approvalResourceID;
        this.approvalDateTime = approvalDateTime;
        this.approvalLevel = approvalLevel;
    }


    /**
     * Gets the timeEntryID value for this BillingItemApprovalLevel.
     * 
     * @return timeEntryID
     */
    public java.lang.Object getTimeEntryID() {
        return timeEntryID;
    }


    /**
     * Sets the timeEntryID value for this BillingItemApprovalLevel.
     * 
     * @param timeEntryID
     */
    public void setTimeEntryID(java.lang.Object timeEntryID) {
        this.timeEntryID = timeEntryID;
    }


    /**
     * Gets the approvalResourceID value for this BillingItemApprovalLevel.
     * 
     * @return approvalResourceID
     */
    public java.lang.Object getApprovalResourceID() {
        return approvalResourceID;
    }


    /**
     * Sets the approvalResourceID value for this BillingItemApprovalLevel.
     * 
     * @param approvalResourceID
     */
    public void setApprovalResourceID(java.lang.Object approvalResourceID) {
        this.approvalResourceID = approvalResourceID;
    }


    /**
     * Gets the approvalDateTime value for this BillingItemApprovalLevel.
     * 
     * @return approvalDateTime
     */
    public java.lang.Object getApprovalDateTime() {
        return approvalDateTime;
    }


    /**
     * Sets the approvalDateTime value for this BillingItemApprovalLevel.
     * 
     * @param approvalDateTime
     */
    public void setApprovalDateTime(java.lang.Object approvalDateTime) {
        this.approvalDateTime = approvalDateTime;
    }


    /**
     * Gets the approvalLevel value for this BillingItemApprovalLevel.
     * 
     * @return approvalLevel
     */
    public java.lang.Object getApprovalLevel() {
        return approvalLevel;
    }


    /**
     * Sets the approvalLevel value for this BillingItemApprovalLevel.
     * 
     * @param approvalLevel
     */
    public void setApprovalLevel(java.lang.Object approvalLevel) {
        this.approvalLevel = approvalLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingItemApprovalLevel)) return false;
        BillingItemApprovalLevel other = (BillingItemApprovalLevel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timeEntryID==null && other.getTimeEntryID()==null) || 
             (this.timeEntryID!=null &&
              this.timeEntryID.equals(other.getTimeEntryID()))) &&
            ((this.approvalResourceID==null && other.getApprovalResourceID()==null) || 
             (this.approvalResourceID!=null &&
              this.approvalResourceID.equals(other.getApprovalResourceID()))) &&
            ((this.approvalDateTime==null && other.getApprovalDateTime()==null) || 
             (this.approvalDateTime!=null &&
              this.approvalDateTime.equals(other.getApprovalDateTime()))) &&
            ((this.approvalLevel==null && other.getApprovalLevel()==null) || 
             (this.approvalLevel!=null &&
              this.approvalLevel.equals(other.getApprovalLevel())));
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
        if (getTimeEntryID() != null) {
            _hashCode += getTimeEntryID().hashCode();
        }
        if (getApprovalResourceID() != null) {
            _hashCode += getApprovalResourceID().hashCode();
        }
        if (getApprovalDateTime() != null) {
            _hashCode += getApprovalDateTime().hashCode();
        }
        if (getApprovalLevel() != null) {
            _hashCode += getApprovalLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingItemApprovalLevel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillingItemApprovalLevel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeEntryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeEntryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApprovalResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApprovalDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApprovalLevel"));
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
