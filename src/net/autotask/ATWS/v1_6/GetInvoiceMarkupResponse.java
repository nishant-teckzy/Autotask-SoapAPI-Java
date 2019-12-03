/**
 * GetInvoiceMarkupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class GetInvoiceMarkupResponse  implements java.io.Serializable {
    private java.lang.String getInvoiceMarkupResult;

    public GetInvoiceMarkupResponse() {
    }

    public GetInvoiceMarkupResponse(
           java.lang.String getInvoiceMarkupResult) {
           this.getInvoiceMarkupResult = getInvoiceMarkupResult;
    }


    /**
     * Gets the getInvoiceMarkupResult value for this GetInvoiceMarkupResponse.
     * 
     * @return getInvoiceMarkupResult
     */
    public java.lang.String getGetInvoiceMarkupResult() {
        return getInvoiceMarkupResult;
    }


    /**
     * Sets the getInvoiceMarkupResult value for this GetInvoiceMarkupResponse.
     * 
     * @param getInvoiceMarkupResult
     */
    public void setGetInvoiceMarkupResult(java.lang.String getInvoiceMarkupResult) {
        this.getInvoiceMarkupResult = getInvoiceMarkupResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInvoiceMarkupResponse)) return false;
        GetInvoiceMarkupResponse other = (GetInvoiceMarkupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInvoiceMarkupResult==null && other.getGetInvoiceMarkupResult()==null) || 
             (this.getInvoiceMarkupResult!=null &&
              this.getInvoiceMarkupResult.equals(other.getGetInvoiceMarkupResult())));
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
        if (getGetInvoiceMarkupResult() != null) {
            _hashCode += getGetInvoiceMarkupResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInvoiceMarkupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", ">GetInvoiceMarkupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInvoiceMarkupResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GetInvoiceMarkupResult"));
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
