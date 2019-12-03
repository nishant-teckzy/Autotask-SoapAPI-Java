/**
 * AttachmentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class AttachmentInfo  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object parentID;

    private java.lang.Object parentType;

    private java.lang.Object type;

    private java.lang.Object title;

    private java.lang.Object fullPath;

    private java.lang.Object attachDate;

    private java.lang.Object fileSize;

    private java.lang.Object attachedByResourceID;

    private java.lang.Object attachedByContactID;

    private java.lang.Object publish;

    private java.lang.Object contentType;

    private java.lang.Object opportunityID;

    public AttachmentInfo() {
    }

    public AttachmentInfo(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object parentID,
           java.lang.Object parentType,
           java.lang.Object type,
           java.lang.Object title,
           java.lang.Object fullPath,
           java.lang.Object attachDate,
           java.lang.Object fileSize,
           java.lang.Object attachedByResourceID,
           java.lang.Object attachedByContactID,
           java.lang.Object publish,
           java.lang.Object contentType,
           java.lang.Object opportunityID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.parentID = parentID;
        this.parentType = parentType;
        this.type = type;
        this.title = title;
        this.fullPath = fullPath;
        this.attachDate = attachDate;
        this.fileSize = fileSize;
        this.attachedByResourceID = attachedByResourceID;
        this.attachedByContactID = attachedByContactID;
        this.publish = publish;
        this.contentType = contentType;
        this.opportunityID = opportunityID;
    }


    /**
     * Gets the parentID value for this AttachmentInfo.
     * 
     * @return parentID
     */
    public java.lang.Object getParentID() {
        return parentID;
    }


    /**
     * Sets the parentID value for this AttachmentInfo.
     * 
     * @param parentID
     */
    public void setParentID(java.lang.Object parentID) {
        this.parentID = parentID;
    }


    /**
     * Gets the parentType value for this AttachmentInfo.
     * 
     * @return parentType
     */
    public java.lang.Object getParentType() {
        return parentType;
    }


    /**
     * Sets the parentType value for this AttachmentInfo.
     * 
     * @param parentType
     */
    public void setParentType(java.lang.Object parentType) {
        this.parentType = parentType;
    }


    /**
     * Gets the type value for this AttachmentInfo.
     * 
     * @return type
     */
    public java.lang.Object getType() {
        return type;
    }


    /**
     * Sets the type value for this AttachmentInfo.
     * 
     * @param type
     */
    public void setType(java.lang.Object type) {
        this.type = type;
    }


    /**
     * Gets the title value for this AttachmentInfo.
     * 
     * @return title
     */
    public java.lang.Object getTitle() {
        return title;
    }


    /**
     * Sets the title value for this AttachmentInfo.
     * 
     * @param title
     */
    public void setTitle(java.lang.Object title) {
        this.title = title;
    }


    /**
     * Gets the fullPath value for this AttachmentInfo.
     * 
     * @return fullPath
     */
    public java.lang.Object getFullPath() {
        return fullPath;
    }


    /**
     * Sets the fullPath value for this AttachmentInfo.
     * 
     * @param fullPath
     */
    public void setFullPath(java.lang.Object fullPath) {
        this.fullPath = fullPath;
    }


    /**
     * Gets the attachDate value for this AttachmentInfo.
     * 
     * @return attachDate
     */
    public java.lang.Object getAttachDate() {
        return attachDate;
    }


    /**
     * Sets the attachDate value for this AttachmentInfo.
     * 
     * @param attachDate
     */
    public void setAttachDate(java.lang.Object attachDate) {
        this.attachDate = attachDate;
    }


    /**
     * Gets the fileSize value for this AttachmentInfo.
     * 
     * @return fileSize
     */
    public java.lang.Object getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this AttachmentInfo.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.Object fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the attachedByResourceID value for this AttachmentInfo.
     * 
     * @return attachedByResourceID
     */
    public java.lang.Object getAttachedByResourceID() {
        return attachedByResourceID;
    }


    /**
     * Sets the attachedByResourceID value for this AttachmentInfo.
     * 
     * @param attachedByResourceID
     */
    public void setAttachedByResourceID(java.lang.Object attachedByResourceID) {
        this.attachedByResourceID = attachedByResourceID;
    }


    /**
     * Gets the attachedByContactID value for this AttachmentInfo.
     * 
     * @return attachedByContactID
     */
    public java.lang.Object getAttachedByContactID() {
        return attachedByContactID;
    }


    /**
     * Sets the attachedByContactID value for this AttachmentInfo.
     * 
     * @param attachedByContactID
     */
    public void setAttachedByContactID(java.lang.Object attachedByContactID) {
        this.attachedByContactID = attachedByContactID;
    }


    /**
     * Gets the publish value for this AttachmentInfo.
     * 
     * @return publish
     */
    public java.lang.Object getPublish() {
        return publish;
    }


    /**
     * Sets the publish value for this AttachmentInfo.
     * 
     * @param publish
     */
    public void setPublish(java.lang.Object publish) {
        this.publish = publish;
    }


    /**
     * Gets the contentType value for this AttachmentInfo.
     * 
     * @return contentType
     */
    public java.lang.Object getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this AttachmentInfo.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.Object contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the opportunityID value for this AttachmentInfo.
     * 
     * @return opportunityID
     */
    public java.lang.Object getOpportunityID() {
        return opportunityID;
    }


    /**
     * Sets the opportunityID value for this AttachmentInfo.
     * 
     * @param opportunityID
     */
    public void setOpportunityID(java.lang.Object opportunityID) {
        this.opportunityID = opportunityID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachmentInfo)) return false;
        AttachmentInfo other = (AttachmentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parentID==null && other.getParentID()==null) || 
             (this.parentID!=null &&
              this.parentID.equals(other.getParentID()))) &&
            ((this.parentType==null && other.getParentType()==null) || 
             (this.parentType!=null &&
              this.parentType.equals(other.getParentType()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.fullPath==null && other.getFullPath()==null) || 
             (this.fullPath!=null &&
              this.fullPath.equals(other.getFullPath()))) &&
            ((this.attachDate==null && other.getAttachDate()==null) || 
             (this.attachDate!=null &&
              this.attachDate.equals(other.getAttachDate()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.attachedByResourceID==null && other.getAttachedByResourceID()==null) || 
             (this.attachedByResourceID!=null &&
              this.attachedByResourceID.equals(other.getAttachedByResourceID()))) &&
            ((this.attachedByContactID==null && other.getAttachedByContactID()==null) || 
             (this.attachedByContactID!=null &&
              this.attachedByContactID.equals(other.getAttachedByContactID()))) &&
            ((this.publish==null && other.getPublish()==null) || 
             (this.publish!=null &&
              this.publish.equals(other.getPublish()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.opportunityID==null && other.getOpportunityID()==null) || 
             (this.opportunityID!=null &&
              this.opportunityID.equals(other.getOpportunityID())));
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
        if (getParentID() != null) {
            _hashCode += getParentID().hashCode();
        }
        if (getParentType() != null) {
            _hashCode += getParentType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFullPath() != null) {
            _hashCode += getFullPath().hashCode();
        }
        if (getAttachDate() != null) {
            _hashCode += getAttachDate().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getAttachedByResourceID() != null) {
            _hashCode += getAttachedByResourceID().hashCode();
        }
        if (getAttachedByContactID() != null) {
            _hashCode += getAttachedByContactID().hashCode();
        }
        if (getPublish() != null) {
            _hashCode += getPublish().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getOpportunityID() != null) {
            _hashCode += getOpportunityID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachmentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AttachmentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ParentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ParentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FullPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AttachDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedByResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AttachedByResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedByContactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AttachedByContactID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Publish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OpportunityID"));
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
