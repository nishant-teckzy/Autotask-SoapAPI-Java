/**
 * TicketChecklistItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class TicketChecklistItem  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object completed;

    private java.lang.Object completedByResourceID;

    private java.lang.Object completedDateTime;

    private java.lang.Object important;

    private java.lang.Object itemName;

    private java.lang.Object knowledgebaseArticleID;

    private java.lang.Object position;

    private java.lang.Object ticketID;

    public TicketChecklistItem() {
    }

    public TicketChecklistItem(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object completed,
           java.lang.Object completedByResourceID,
           java.lang.Object completedDateTime,
           java.lang.Object important,
           java.lang.Object itemName,
           java.lang.Object knowledgebaseArticleID,
           java.lang.Object position,
           java.lang.Object ticketID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.completed = completed;
        this.completedByResourceID = completedByResourceID;
        this.completedDateTime = completedDateTime;
        this.important = important;
        this.itemName = itemName;
        this.knowledgebaseArticleID = knowledgebaseArticleID;
        this.position = position;
        this.ticketID = ticketID;
    }


    /**
     * Gets the completed value for this TicketChecklistItem.
     * 
     * @return completed
     */
    public java.lang.Object getCompleted() {
        return completed;
    }


    /**
     * Sets the completed value for this TicketChecklistItem.
     * 
     * @param completed
     */
    public void setCompleted(java.lang.Object completed) {
        this.completed = completed;
    }


    /**
     * Gets the completedByResourceID value for this TicketChecklistItem.
     * 
     * @return completedByResourceID
     */
    public java.lang.Object getCompletedByResourceID() {
        return completedByResourceID;
    }


    /**
     * Sets the completedByResourceID value for this TicketChecklistItem.
     * 
     * @param completedByResourceID
     */
    public void setCompletedByResourceID(java.lang.Object completedByResourceID) {
        this.completedByResourceID = completedByResourceID;
    }


    /**
     * Gets the completedDateTime value for this TicketChecklistItem.
     * 
     * @return completedDateTime
     */
    public java.lang.Object getCompletedDateTime() {
        return completedDateTime;
    }


    /**
     * Sets the completedDateTime value for this TicketChecklistItem.
     * 
     * @param completedDateTime
     */
    public void setCompletedDateTime(java.lang.Object completedDateTime) {
        this.completedDateTime = completedDateTime;
    }


    /**
     * Gets the important value for this TicketChecklistItem.
     * 
     * @return important
     */
    public java.lang.Object getImportant() {
        return important;
    }


    /**
     * Sets the important value for this TicketChecklistItem.
     * 
     * @param important
     */
    public void setImportant(java.lang.Object important) {
        this.important = important;
    }


    /**
     * Gets the itemName value for this TicketChecklistItem.
     * 
     * @return itemName
     */
    public java.lang.Object getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this TicketChecklistItem.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.Object itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the knowledgebaseArticleID value for this TicketChecklistItem.
     * 
     * @return knowledgebaseArticleID
     */
    public java.lang.Object getKnowledgebaseArticleID() {
        return knowledgebaseArticleID;
    }


    /**
     * Sets the knowledgebaseArticleID value for this TicketChecklistItem.
     * 
     * @param knowledgebaseArticleID
     */
    public void setKnowledgebaseArticleID(java.lang.Object knowledgebaseArticleID) {
        this.knowledgebaseArticleID = knowledgebaseArticleID;
    }


    /**
     * Gets the position value for this TicketChecklistItem.
     * 
     * @return position
     */
    public java.lang.Object getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TicketChecklistItem.
     * 
     * @param position
     */
    public void setPosition(java.lang.Object position) {
        this.position = position;
    }


    /**
     * Gets the ticketID value for this TicketChecklistItem.
     * 
     * @return ticketID
     */
    public java.lang.Object getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this TicketChecklistItem.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Object ticketID) {
        this.ticketID = ticketID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketChecklistItem)) return false;
        TicketChecklistItem other = (TicketChecklistItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.completed==null && other.getCompleted()==null) || 
             (this.completed!=null &&
              this.completed.equals(other.getCompleted()))) &&
            ((this.completedByResourceID==null && other.getCompletedByResourceID()==null) || 
             (this.completedByResourceID!=null &&
              this.completedByResourceID.equals(other.getCompletedByResourceID()))) &&
            ((this.completedDateTime==null && other.getCompletedDateTime()==null) || 
             (this.completedDateTime!=null &&
              this.completedDateTime.equals(other.getCompletedDateTime()))) &&
            ((this.important==null && other.getImportant()==null) || 
             (this.important!=null &&
              this.important.equals(other.getImportant()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.knowledgebaseArticleID==null && other.getKnowledgebaseArticleID()==null) || 
             (this.knowledgebaseArticleID!=null &&
              this.knowledgebaseArticleID.equals(other.getKnowledgebaseArticleID()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID())));
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
        if (getCompleted() != null) {
            _hashCode += getCompleted().hashCode();
        }
        if (getCompletedByResourceID() != null) {
            _hashCode += getCompletedByResourceID().hashCode();
        }
        if (getCompletedDateTime() != null) {
            _hashCode += getCompletedDateTime().hashCode();
        }
        if (getImportant() != null) {
            _hashCode += getImportant().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getKnowledgebaseArticleID() != null) {
            _hashCode += getKnowledgebaseArticleID().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketChecklistItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketChecklistItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Completed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedByResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompletedByResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompletedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("important");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Important"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("knowledgebaseArticleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "KnowledgebaseArticleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketID"));
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
