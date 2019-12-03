/**
 * GetZoneInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class GetZoneInfoResponse  implements java.io.Serializable {
    private net.autotask.ATWS.v1_6.ATWSZoneInfo getZoneInfoResult;

    public GetZoneInfoResponse() {
    }

    public GetZoneInfoResponse(
           net.autotask.ATWS.v1_6.ATWSZoneInfo getZoneInfoResult) {
           this.getZoneInfoResult = getZoneInfoResult;
    }


    /**
     * Gets the getZoneInfoResult value for this GetZoneInfoResponse.
     * 
     * @return getZoneInfoResult
     */
    public net.autotask.ATWS.v1_6.ATWSZoneInfo getGetZoneInfoResult() {
        return getZoneInfoResult;
    }


    /**
     * Sets the getZoneInfoResult value for this GetZoneInfoResponse.
     * 
     * @param getZoneInfoResult
     */
    public void setGetZoneInfoResult(net.autotask.ATWS.v1_6.ATWSZoneInfo getZoneInfoResult) {
        this.getZoneInfoResult = getZoneInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZoneInfoResponse)) return false;
        GetZoneInfoResponse other = (GetZoneInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZoneInfoResult==null && other.getGetZoneInfoResult()==null) || 
             (this.getZoneInfoResult!=null &&
              this.getZoneInfoResult.equals(other.getGetZoneInfoResult())));
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
        if (getGetZoneInfoResult() != null) {
            _hashCode += getGetZoneInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZoneInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", ">getZoneInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZoneInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "getZoneInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ATWSZoneInfo"));
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
