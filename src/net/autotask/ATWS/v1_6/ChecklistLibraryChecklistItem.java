/**
 * ChecklistLibraryChecklistItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ChecklistLibraryChecklistItem  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object itemName;

    private java.lang.Object important;

    private java.lang.Object knowledgebaseArticleID;

    private java.lang.Object position;

    private java.lang.Object checklistLibraryID;

    public ChecklistLibraryChecklistItem() {
    }

    public ChecklistLibraryChecklistItem(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object itemName,
           java.lang.Object important,
           java.lang.Object knowledgebaseArticleID,
           java.lang.Object position,
           java.lang.Object checklistLibraryID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.itemName = itemName;
        this.important = important;
        this.knowledgebaseArticleID = knowledgebaseArticleID;
        this.position = position;
        this.checklistLibraryID = checklistLibraryID;
    }


    /**
     * Gets the itemName value for this ChecklistLibraryChecklistItem.
     * 
     * @return itemName
     */
    public java.lang.Object getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this ChecklistLibraryChecklistItem.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.Object itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the important value for this ChecklistLibraryChecklistItem.
     * 
     * @return important
     */
    public java.lang.Object getImportant() {
        return important;
    }


    /**
     * Sets the important value for this ChecklistLibraryChecklistItem.
     * 
     * @param important
     */
    public void setImportant(java.lang.Object important) {
        this.important = important;
    }


    /**
     * Gets the knowledgebaseArticleID value for this ChecklistLibraryChecklistItem.
     * 
     * @return knowledgebaseArticleID
     */
    public java.lang.Object getKnowledgebaseArticleID() {
        return knowledgebaseArticleID;
    }


    /**
     * Sets the knowledgebaseArticleID value for this ChecklistLibraryChecklistItem.
     * 
     * @param knowledgebaseArticleID
     */
    public void setKnowledgebaseArticleID(java.lang.Object knowledgebaseArticleID) {
        this.knowledgebaseArticleID = knowledgebaseArticleID;
    }


    /**
     * Gets the position value for this ChecklistLibraryChecklistItem.
     * 
     * @return position
     */
    public java.lang.Object getPosition() {
        return position;
    }


    /**
     * Sets the position value for this ChecklistLibraryChecklistItem.
     * 
     * @param position
     */
    public void setPosition(java.lang.Object position) {
        this.position = position;
    }


    /**
     * Gets the checklistLibraryID value for this ChecklistLibraryChecklistItem.
     * 
     * @return checklistLibraryID
     */
    public java.lang.Object getChecklistLibraryID() {
        return checklistLibraryID;
    }


    /**
     * Sets the checklistLibraryID value for this ChecklistLibraryChecklistItem.
     * 
     * @param checklistLibraryID
     */
    public void setChecklistLibraryID(java.lang.Object checklistLibraryID) {
        this.checklistLibraryID = checklistLibraryID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChecklistLibraryChecklistItem)) return false;
        ChecklistLibraryChecklistItem other = (ChecklistLibraryChecklistItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.important==null && other.getImportant()==null) || 
             (this.important!=null &&
              this.important.equals(other.getImportant()))) &&
            ((this.knowledgebaseArticleID==null && other.getKnowledgebaseArticleID()==null) || 
             (this.knowledgebaseArticleID!=null &&
              this.knowledgebaseArticleID.equals(other.getKnowledgebaseArticleID()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.checklistLibraryID==null && other.getChecklistLibraryID()==null) || 
             (this.checklistLibraryID!=null &&
              this.checklistLibraryID.equals(other.getChecklistLibraryID())));
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
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getImportant() != null) {
            _hashCode += getImportant().hashCode();
        }
        if (getKnowledgebaseArticleID() != null) {
            _hashCode += getKnowledgebaseArticleID().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getChecklistLibraryID() != null) {
            _hashCode += getChecklistLibraryID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChecklistLibraryChecklistItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChecklistLibraryChecklistItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ItemName"));
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
        elemField.setFieldName("checklistLibraryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChecklistLibraryID"));
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
