/**
 * ActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ActionType  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object view;

    private java.lang.Object active;

    private java.lang.Object systemActionType;

    public ActionType() {
    }

    public ActionType(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object view,
           java.lang.Object active,
           java.lang.Object systemActionType) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.view = view;
        this.active = active;
        this.systemActionType = systemActionType;
    }


    /**
     * Gets the name value for this ActionType.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this ActionType.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the view value for this ActionType.
     * 
     * @return view
     */
    public java.lang.Object getView() {
        return view;
    }


    /**
     * Sets the view value for this ActionType.
     * 
     * @param view
     */
    public void setView(java.lang.Object view) {
        this.view = view;
    }


    /**
     * Gets the active value for this ActionType.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this ActionType.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the systemActionType value for this ActionType.
     * 
     * @return systemActionType
     */
    public java.lang.Object getSystemActionType() {
        return systemActionType;
    }


    /**
     * Sets the systemActionType value for this ActionType.
     * 
     * @param systemActionType
     */
    public void setSystemActionType(java.lang.Object systemActionType) {
        this.systemActionType = systemActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActionType)) return false;
        ActionType other = (ActionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.view==null && other.getView()==null) || 
             (this.view!=null &&
              this.view.equals(other.getView()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.systemActionType==null && other.getSystemActionType()==null) || 
             (this.systemActionType!=null &&
              this.systemActionType.equals(other.getSystemActionType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getView() != null) {
            _hashCode += getView().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getSystemActionType() != null) {
            _hashCode += getSystemActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ActionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("view");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "View"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SystemActionType"));
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
