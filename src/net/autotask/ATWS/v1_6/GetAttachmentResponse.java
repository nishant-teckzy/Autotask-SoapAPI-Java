/**
 * GetAttachmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class GetAttachmentResponse  implements java.io.Serializable {
    private net.autotask.ATWS.v1_6.Attachment getAttachmentResult;

    public GetAttachmentResponse() {
    }

    public GetAttachmentResponse(
           net.autotask.ATWS.v1_6.Attachment getAttachmentResult) {
           this.getAttachmentResult = getAttachmentResult;
    }


    /**
     * Gets the getAttachmentResult value for this GetAttachmentResponse.
     * 
     * @return getAttachmentResult
     */
    public net.autotask.ATWS.v1_6.Attachment getGetAttachmentResult() {
        return getAttachmentResult;
    }


    /**
     * Sets the getAttachmentResult value for this GetAttachmentResponse.
     * 
     * @param getAttachmentResult
     */
    public void setGetAttachmentResult(net.autotask.ATWS.v1_6.Attachment getAttachmentResult) {
        this.getAttachmentResult = getAttachmentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAttachmentResponse)) return false;
        GetAttachmentResponse other = (GetAttachmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAttachmentResult==null && other.getGetAttachmentResult()==null) || 
             (this.getAttachmentResult!=null &&
              this.getAttachmentResult.equals(other.getGetAttachmentResult())));
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
        if (getGetAttachmentResult() != null) {
            _hashCode += getGetAttachmentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAttachmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", ">GetAttachmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAttachmentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GetAttachmentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Attachment"));
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
