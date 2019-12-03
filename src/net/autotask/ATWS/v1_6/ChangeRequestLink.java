/**
 * ChangeRequestLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ChangeRequestLink  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object changeRequestTicketID;

    private java.lang.Object problemOrIncidentTicketID;

    public ChangeRequestLink() {
    }

    public ChangeRequestLink(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object changeRequestTicketID,
           java.lang.Object problemOrIncidentTicketID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.changeRequestTicketID = changeRequestTicketID;
        this.problemOrIncidentTicketID = problemOrIncidentTicketID;
    }


    /**
     * Gets the changeRequestTicketID value for this ChangeRequestLink.
     * 
     * @return changeRequestTicketID
     */
    public java.lang.Object getChangeRequestTicketID() {
        return changeRequestTicketID;
    }


    /**
     * Sets the changeRequestTicketID value for this ChangeRequestLink.
     * 
     * @param changeRequestTicketID
     */
    public void setChangeRequestTicketID(java.lang.Object changeRequestTicketID) {
        this.changeRequestTicketID = changeRequestTicketID;
    }


    /**
     * Gets the problemOrIncidentTicketID value for this ChangeRequestLink.
     * 
     * @return problemOrIncidentTicketID
     */
    public java.lang.Object getProblemOrIncidentTicketID() {
        return problemOrIncidentTicketID;
    }


    /**
     * Sets the problemOrIncidentTicketID value for this ChangeRequestLink.
     * 
     * @param problemOrIncidentTicketID
     */
    public void setProblemOrIncidentTicketID(java.lang.Object problemOrIncidentTicketID) {
        this.problemOrIncidentTicketID = problemOrIncidentTicketID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeRequestLink)) return false;
        ChangeRequestLink other = (ChangeRequestLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changeRequestTicketID==null && other.getChangeRequestTicketID()==null) || 
             (this.changeRequestTicketID!=null &&
              this.changeRequestTicketID.equals(other.getChangeRequestTicketID()))) &&
            ((this.problemOrIncidentTicketID==null && other.getProblemOrIncidentTicketID()==null) || 
             (this.problemOrIncidentTicketID!=null &&
              this.problemOrIncidentTicketID.equals(other.getProblemOrIncidentTicketID())));
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
        if (getChangeRequestTicketID() != null) {
            _hashCode += getChangeRequestTicketID().hashCode();
        }
        if (getProblemOrIncidentTicketID() != null) {
            _hashCode += getProblemOrIncidentTicketID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeRequestLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeRequestLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeRequestTicketID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeRequestTicketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemOrIncidentTicketID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProblemOrIncidentTicketID"));
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
