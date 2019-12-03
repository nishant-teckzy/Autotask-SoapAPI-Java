/**
 * PurchaseApproval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class PurchaseApproval  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object costType;

    private java.lang.Object isApproved;

    private java.lang.Object rejectNote;

    public PurchaseApproval() {
    }

    public PurchaseApproval(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object costType,
           java.lang.Object isApproved,
           java.lang.Object rejectNote) {
        super(
            fields,
            id,
            userDefinedFields);
        this.costType = costType;
        this.isApproved = isApproved;
        this.rejectNote = rejectNote;
    }


    /**
     * Gets the costType value for this PurchaseApproval.
     * 
     * @return costType
     */
    public java.lang.Object getCostType() {
        return costType;
    }


    /**
     * Sets the costType value for this PurchaseApproval.
     * 
     * @param costType
     */
    public void setCostType(java.lang.Object costType) {
        this.costType = costType;
    }


    /**
     * Gets the isApproved value for this PurchaseApproval.
     * 
     * @return isApproved
     */
    public java.lang.Object getIsApproved() {
        return isApproved;
    }


    /**
     * Sets the isApproved value for this PurchaseApproval.
     * 
     * @param isApproved
     */
    public void setIsApproved(java.lang.Object isApproved) {
        this.isApproved = isApproved;
    }


    /**
     * Gets the rejectNote value for this PurchaseApproval.
     * 
     * @return rejectNote
     */
    public java.lang.Object getRejectNote() {
        return rejectNote;
    }


    /**
     * Sets the rejectNote value for this PurchaseApproval.
     * 
     * @param rejectNote
     */
    public void setRejectNote(java.lang.Object rejectNote) {
        this.rejectNote = rejectNote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseApproval)) return false;
        PurchaseApproval other = (PurchaseApproval) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.costType==null && other.getCostType()==null) || 
             (this.costType!=null &&
              this.costType.equals(other.getCostType()))) &&
            ((this.isApproved==null && other.getIsApproved()==null) || 
             (this.isApproved!=null &&
              this.isApproved.equals(other.getIsApproved()))) &&
            ((this.rejectNote==null && other.getRejectNote()==null) || 
             (this.rejectNote!=null &&
              this.rejectNote.equals(other.getRejectNote())));
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
        if (getCostType() != null) {
            _hashCode += getCostType().hashCode();
        }
        if (getIsApproved() != null) {
            _hashCode += getIsApproved().hashCode();
        }
        if (getRejectNote() != null) {
            _hashCode += getRejectNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseApproval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseApproval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CostType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RejectNote"));
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
