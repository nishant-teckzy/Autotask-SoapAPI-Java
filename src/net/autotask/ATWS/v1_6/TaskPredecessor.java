/**
 * TaskPredecessor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class TaskPredecessor  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object lagDays;

    private java.lang.Object predecessorTaskID;

    private java.lang.Object successorTaskID;

    public TaskPredecessor() {
    }

    public TaskPredecessor(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object lagDays,
           java.lang.Object predecessorTaskID,
           java.lang.Object successorTaskID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.lagDays = lagDays;
        this.predecessorTaskID = predecessorTaskID;
        this.successorTaskID = successorTaskID;
    }


    /**
     * Gets the lagDays value for this TaskPredecessor.
     * 
     * @return lagDays
     */
    public java.lang.Object getLagDays() {
        return lagDays;
    }


    /**
     * Sets the lagDays value for this TaskPredecessor.
     * 
     * @param lagDays
     */
    public void setLagDays(java.lang.Object lagDays) {
        this.lagDays = lagDays;
    }


    /**
     * Gets the predecessorTaskID value for this TaskPredecessor.
     * 
     * @return predecessorTaskID
     */
    public java.lang.Object getPredecessorTaskID() {
        return predecessorTaskID;
    }


    /**
     * Sets the predecessorTaskID value for this TaskPredecessor.
     * 
     * @param predecessorTaskID
     */
    public void setPredecessorTaskID(java.lang.Object predecessorTaskID) {
        this.predecessorTaskID = predecessorTaskID;
    }


    /**
     * Gets the successorTaskID value for this TaskPredecessor.
     * 
     * @return successorTaskID
     */
    public java.lang.Object getSuccessorTaskID() {
        return successorTaskID;
    }


    /**
     * Sets the successorTaskID value for this TaskPredecessor.
     * 
     * @param successorTaskID
     */
    public void setSuccessorTaskID(java.lang.Object successorTaskID) {
        this.successorTaskID = successorTaskID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskPredecessor)) return false;
        TaskPredecessor other = (TaskPredecessor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lagDays==null && other.getLagDays()==null) || 
             (this.lagDays!=null &&
              this.lagDays.equals(other.getLagDays()))) &&
            ((this.predecessorTaskID==null && other.getPredecessorTaskID()==null) || 
             (this.predecessorTaskID!=null &&
              this.predecessorTaskID.equals(other.getPredecessorTaskID()))) &&
            ((this.successorTaskID==null && other.getSuccessorTaskID()==null) || 
             (this.successorTaskID!=null &&
              this.successorTaskID.equals(other.getSuccessorTaskID())));
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
        if (getLagDays() != null) {
            _hashCode += getLagDays().hashCode();
        }
        if (getPredecessorTaskID() != null) {
            _hashCode += getPredecessorTaskID().hashCode();
        }
        if (getSuccessorTaskID() != null) {
            _hashCode += getSuccessorTaskID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskPredecessor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaskPredecessor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LagDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessorTaskID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PredecessorTaskID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successorTaskID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SuccessorTaskID"));
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
