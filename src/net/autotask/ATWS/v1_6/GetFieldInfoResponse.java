/**
 * GetFieldInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class GetFieldInfoResponse  implements java.io.Serializable {
    private net.autotask.ATWS.v1_6.Field[] getFieldInfoResult;

    public GetFieldInfoResponse() {
    }

    public GetFieldInfoResponse(
           net.autotask.ATWS.v1_6.Field[] getFieldInfoResult) {
           this.getFieldInfoResult = getFieldInfoResult;
    }


    /**
     * Gets the getFieldInfoResult value for this GetFieldInfoResponse.
     * 
     * @return getFieldInfoResult
     */
    public net.autotask.ATWS.v1_6.Field[] getGetFieldInfoResult() {
        return getFieldInfoResult;
    }


    /**
     * Sets the getFieldInfoResult value for this GetFieldInfoResponse.
     * 
     * @param getFieldInfoResult
     */
    public void setGetFieldInfoResult(net.autotask.ATWS.v1_6.Field[] getFieldInfoResult) {
        this.getFieldInfoResult = getFieldInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFieldInfoResponse)) return false;
        GetFieldInfoResponse other = (GetFieldInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFieldInfoResult==null && other.getGetFieldInfoResult()==null) || 
             (this.getFieldInfoResult!=null &&
              java.util.Arrays.equals(this.getFieldInfoResult, other.getGetFieldInfoResult())));
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
        if (getGetFieldInfoResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetFieldInfoResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetFieldInfoResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFieldInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", ">GetFieldInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFieldInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GetFieldInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Field"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Field"));
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
