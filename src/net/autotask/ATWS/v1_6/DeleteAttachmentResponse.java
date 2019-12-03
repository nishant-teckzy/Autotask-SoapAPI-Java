/**
 * DeleteAttachmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class DeleteAttachmentResponse  implements java.io.Serializable {
    private java.lang.String deleteAttachmentResult;

    public DeleteAttachmentResponse() {
    }

    public DeleteAttachmentResponse(
           java.lang.String deleteAttachmentResult) {
           this.deleteAttachmentResult = deleteAttachmentResult;
    }


    /**
     * Gets the deleteAttachmentResult value for this DeleteAttachmentResponse.
     * 
     * @return deleteAttachmentResult
     */
    public java.lang.String getDeleteAttachmentResult() {
        return deleteAttachmentResult;
    }


    /**
     * Sets the deleteAttachmentResult value for this DeleteAttachmentResponse.
     * 
     * @param deleteAttachmentResult
     */
    public void setDeleteAttachmentResult(java.lang.String deleteAttachmentResult) {
        this.deleteAttachmentResult = deleteAttachmentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteAttachmentResponse)) return false;
        DeleteAttachmentResponse other = (DeleteAttachmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteAttachmentResult==null && other.getDeleteAttachmentResult()==null) || 
             (this.deleteAttachmentResult!=null &&
              this.deleteAttachmentResult.equals(other.getDeleteAttachmentResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDeleteAttachmentResult() != null) {
            _hashCode += getDeleteAttachmentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteAttachmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", ">DeleteAttachmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteAttachmentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DeleteAttachmentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
