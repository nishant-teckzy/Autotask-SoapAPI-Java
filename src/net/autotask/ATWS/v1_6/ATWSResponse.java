/**
 * ATWSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ATWSResponse  implements java.io.Serializable {
    private int returnCode;

    private net.autotask.ATWS.v1_6.Entity[] entityResults;

    private java.lang.String entityResultType;

    private net.autotask.ATWS.v1_6.ATWSError[] errors;

    private net.autotask.ATWS.v1_6.EntityReturnInfo[] entityReturnInfoResults;

    public ATWSResponse() {
    }

    public ATWSResponse(
           int returnCode,
           net.autotask.ATWS.v1_6.Entity[] entityResults,
           java.lang.String entityResultType,
           net.autotask.ATWS.v1_6.ATWSError[] errors,
           net.autotask.ATWS.v1_6.EntityReturnInfo[] entityReturnInfoResults) {
           this.returnCode = returnCode;
           this.entityResults = entityResults;
           this.entityResultType = entityResultType;
           this.errors = errors;
           this.entityReturnInfoResults = entityReturnInfoResults;
    }


    /**
     * Gets the returnCode value for this ATWSResponse.
     * 
     * @return returnCode
     */
    public int getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this ATWSResponse.
     * 
     * @param returnCode
     */
    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the entityResults value for this ATWSResponse.
     * 
     * @return entityResults
     */
    public net.autotask.ATWS.v1_6.Entity[] getEntityResults() {
        return entityResults;
    }


    /**
     * Sets the entityResults value for this ATWSResponse.
     * 
     * @param entityResults
     */
    public void setEntityResults(net.autotask.ATWS.v1_6.Entity[] entityResults) {
        this.entityResults = entityResults;
    }


    /**
     * Gets the entityResultType value for this ATWSResponse.
     * 
     * @return entityResultType
     */
    public java.lang.String getEntityResultType() {
        return entityResultType;
    }


    /**
     * Sets the entityResultType value for this ATWSResponse.
     * 
     * @param entityResultType
     */
    public void setEntityResultType(java.lang.String entityResultType) {
        this.entityResultType = entityResultType;
    }


    /**
     * Gets the errors value for this ATWSResponse.
     * 
     * @return errors
     */
    public net.autotask.ATWS.v1_6.ATWSError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this ATWSResponse.
     * 
     * @param errors
     */
    public void setErrors(net.autotask.ATWS.v1_6.ATWSError[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the entityReturnInfoResults value for this ATWSResponse.
     * 
     * @return entityReturnInfoResults
     */
    public net.autotask.ATWS.v1_6.EntityReturnInfo[] getEntityReturnInfoResults() {
        return entityReturnInfoResults;
    }


    /**
     * Sets the entityReturnInfoResults value for this ATWSResponse.
     * 
     * @param entityReturnInfoResults
     */
    public void setEntityReturnInfoResults(net.autotask.ATWS.v1_6.EntityReturnInfo[] entityReturnInfoResults) {
        this.entityReturnInfoResults = entityReturnInfoResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ATWSResponse)) return false;
        ATWSResponse other = (ATWSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.returnCode == other.getReturnCode() &&
            ((this.entityResults==null && other.getEntityResults()==null) || 
             (this.entityResults!=null &&
              java.util.Arrays.equals(this.entityResults, other.getEntityResults()))) &&
            ((this.entityResultType==null && other.getEntityResultType()==null) || 
             (this.entityResultType!=null &&
              this.entityResultType.equals(other.getEntityResultType()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.entityReturnInfoResults==null && other.getEntityReturnInfoResults()==null) || 
             (this.entityReturnInfoResults!=null &&
              java.util.Arrays.equals(this.entityReturnInfoResults, other.getEntityReturnInfoResults())));
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
        _hashCode += getReturnCode();
        if (getEntityResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityResultType() != null) {
            _hashCode += getEntityResultType().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityReturnInfoResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityReturnInfoResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityReturnInfoResults(), i);
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
        new org.apache.axis.description.TypeDesc(ATWSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ATWSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReturnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Entity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityResultType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityResultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ATWSError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ATWSError"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityReturnInfoResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityReturnInfoResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityReturnInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityReturnInfo"));
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
