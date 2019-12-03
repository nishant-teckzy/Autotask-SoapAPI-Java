/**
 * GetEntityInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class GetEntityInfoResponse  implements java.io.Serializable {
    private net.autotask.ATWS.v1_6.EntityInfo[] getEntityInfoResult;

    public GetEntityInfoResponse() {
    }

    public GetEntityInfoResponse(
           net.autotask.ATWS.v1_6.EntityInfo[] getEntityInfoResult) {
           this.getEntityInfoResult = getEntityInfoResult;
    }


    /**
     * Gets the getEntityInfoResult value for this GetEntityInfoResponse.
     * 
     * @return getEntityInfoResult
     */
    public net.autotask.ATWS.v1_6.EntityInfo[] getGetEntityInfoResult() {
        return getEntityInfoResult;
    }


    /**
     * Sets the getEntityInfoResult value for this GetEntityInfoResponse.
     * 
     * @param getEntityInfoResult
     */
    public void setGetEntityInfoResult(net.autotask.ATWS.v1_6.EntityInfo[] getEntityInfoResult) {
        this.getEntityInfoResult = getEntityInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEntityInfoResponse)) return false;
        GetEntityInfoResponse other = (GetEntityInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEntityInfoResult==null && other.getGetEntityInfoResult()==null) || 
             (this.getEntityInfoResult!=null &&
              java.util.Arrays.equals(this.getEntityInfoResult, other.getGetEntityInfoResult())));
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
        if (getGetEntityInfoResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetEntityInfoResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetEntityInfoResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetEntityInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", ">GetEntityInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEntityInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GetEntityInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityInfo"));
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
