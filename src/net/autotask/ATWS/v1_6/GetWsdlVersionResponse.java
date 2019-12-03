/**
 * GetWsdlVersionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class GetWsdlVersionResponse  implements java.io.Serializable {
    private java.lang.String getWsdlVersionResult;

    public GetWsdlVersionResponse() {
    }

    public GetWsdlVersionResponse(
           java.lang.String getWsdlVersionResult) {
           this.getWsdlVersionResult = getWsdlVersionResult;
    }


    /**
     * Gets the getWsdlVersionResult value for this GetWsdlVersionResponse.
     * 
     * @return getWsdlVersionResult
     */
    public java.lang.String getGetWsdlVersionResult() {
        return getWsdlVersionResult;
    }


    /**
     * Sets the getWsdlVersionResult value for this GetWsdlVersionResponse.
     * 
     * @param getWsdlVersionResult
     */
    public void setGetWsdlVersionResult(java.lang.String getWsdlVersionResult) {
        this.getWsdlVersionResult = getWsdlVersionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWsdlVersionResponse)) return false;
        GetWsdlVersionResponse other = (GetWsdlVersionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWsdlVersionResult==null && other.getGetWsdlVersionResult()==null) || 
             (this.getWsdlVersionResult!=null &&
              this.getWsdlVersionResult.equals(other.getGetWsdlVersionResult())));
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
        if (getGetWsdlVersionResult() != null) {
            _hashCode += getGetWsdlVersionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWsdlVersionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", ">GetWsdlVersionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWsdlVersionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GetWsdlVersionResult"));
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
