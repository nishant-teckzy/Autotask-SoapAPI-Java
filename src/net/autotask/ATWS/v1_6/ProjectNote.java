/**
 * ProjectNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ProjectNote  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object creatorResourceID;

    private java.lang.Object description;

    private java.lang.Object lastActivityDate;

    private java.lang.Object noteType;

    private java.lang.Object publish;

    private java.lang.Object projectID;

    private java.lang.Object title;

    private java.lang.Object announce;

    private java.lang.Object impersonatorCreatorResourceID;

    private java.lang.Object impersonatorUpdaterResourceID;

    private java.lang.Object createDateTime;

    public ProjectNote() {
    }

    public ProjectNote(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object creatorResourceID,
           java.lang.Object description,
           java.lang.Object lastActivityDate,
           java.lang.Object noteType,
           java.lang.Object publish,
           java.lang.Object projectID,
           java.lang.Object title,
           java.lang.Object announce,
           java.lang.Object impersonatorCreatorResourceID,
           java.lang.Object impersonatorUpdaterResourceID,
           java.lang.Object createDateTime) {
        super(
            fields,
            id,
            userDefinedFields);
        this.creatorResourceID = creatorResourceID;
        this.description = description;
        this.lastActivityDate = lastActivityDate;
        this.noteType = noteType;
        this.publish = publish;
        this.projectID = projectID;
        this.title = title;
        this.announce = announce;
        this.impersonatorCreatorResourceID = impersonatorCreatorResourceID;
        this.impersonatorUpdaterResourceID = impersonatorUpdaterResourceID;
        this.createDateTime = createDateTime;
    }


    /**
     * Gets the creatorResourceID value for this ProjectNote.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this ProjectNote.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the description value for this ProjectNote.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProjectNote.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the lastActivityDate value for this ProjectNote.
     * 
     * @return lastActivityDate
     */
    public java.lang.Object getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this ProjectNote.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.lang.Object lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the noteType value for this ProjectNote.
     * 
     * @return noteType
     */
    public java.lang.Object getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this ProjectNote.
     * 
     * @param noteType
     */
    public void setNoteType(java.lang.Object noteType) {
        this.noteType = noteType;
    }


    /**
     * Gets the publish value for this ProjectNote.
     * 
     * @return publish
     */
    public java.lang.Object getPublish() {
        return publish;
    }


    /**
     * Sets the publish value for this ProjectNote.
     * 
     * @param publish
     */
    public void setPublish(java.lang.Object publish) {
        this.publish = publish;
    }


    /**
     * Gets the projectID value for this ProjectNote.
     * 
     * @return projectID
     */
    public java.lang.Object getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this ProjectNote.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.Object projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the title value for this ProjectNote.
     * 
     * @return title
     */
    public java.lang.Object getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProjectNote.
     * 
     * @param title
     */
    public void setTitle(java.lang.Object title) {
        this.title = title;
    }


    /**
     * Gets the announce value for this ProjectNote.
     * 
     * @return announce
     */
    public java.lang.Object getAnnounce() {
        return announce;
    }


    /**
     * Sets the announce value for this ProjectNote.
     * 
     * @param announce
     */
    public void setAnnounce(java.lang.Object announce) {
        this.announce = announce;
    }


    /**
     * Gets the impersonatorCreatorResourceID value for this ProjectNote.
     * 
     * @return impersonatorCreatorResourceID
     */
    public java.lang.Object getImpersonatorCreatorResourceID() {
        return impersonatorCreatorResourceID;
    }


    /**
     * Sets the impersonatorCreatorResourceID value for this ProjectNote.
     * 
     * @param impersonatorCreatorResourceID
     */
    public void setImpersonatorCreatorResourceID(java.lang.Object impersonatorCreatorResourceID) {
        this.impersonatorCreatorResourceID = impersonatorCreatorResourceID;
    }


    /**
     * Gets the impersonatorUpdaterResourceID value for this ProjectNote.
     * 
     * @return impersonatorUpdaterResourceID
     */
    public java.lang.Object getImpersonatorUpdaterResourceID() {
        return impersonatorUpdaterResourceID;
    }


    /**
     * Sets the impersonatorUpdaterResourceID value for this ProjectNote.
     * 
     * @param impersonatorUpdaterResourceID
     */
    public void setImpersonatorUpdaterResourceID(java.lang.Object impersonatorUpdaterResourceID) {
        this.impersonatorUpdaterResourceID = impersonatorUpdaterResourceID;
    }


    /**
     * Gets the createDateTime value for this ProjectNote.
     * 
     * @return createDateTime
     */
    public java.lang.Object getCreateDateTime() {
        return createDateTime;
    }


    /**
     * Sets the createDateTime value for this ProjectNote.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(java.lang.Object createDateTime) {
        this.createDateTime = createDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectNote)) return false;
        ProjectNote other = (ProjectNote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.noteType==null && other.getNoteType()==null) || 
             (this.noteType!=null &&
              this.noteType.equals(other.getNoteType()))) &&
            ((this.publish==null && other.getPublish()==null) || 
             (this.publish!=null &&
              this.publish.equals(other.getPublish()))) &&
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.announce==null && other.getAnnounce()==null) || 
             (this.announce!=null &&
              this.announce.equals(other.getAnnounce()))) &&
            ((this.impersonatorCreatorResourceID==null && other.getImpersonatorCreatorResourceID()==null) || 
             (this.impersonatorCreatorResourceID!=null &&
              this.impersonatorCreatorResourceID.equals(other.getImpersonatorCreatorResourceID()))) &&
            ((this.impersonatorUpdaterResourceID==null && other.getImpersonatorUpdaterResourceID()==null) || 
             (this.impersonatorUpdaterResourceID!=null &&
              this.impersonatorUpdaterResourceID.equals(other.getImpersonatorUpdaterResourceID()))) &&
            ((this.createDateTime==null && other.getCreateDateTime()==null) || 
             (this.createDateTime!=null &&
              this.createDateTime.equals(other.getCreateDateTime())));
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
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
        }
        if (getNoteType() != null) {
            _hashCode += getNoteType().hashCode();
        }
        if (getPublish() != null) {
            _hashCode += getPublish().hashCode();
        }
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAnnounce() != null) {
            _hashCode += getAnnounce().hashCode();
        }
        if (getImpersonatorCreatorResourceID() != null) {
            _hashCode += getImpersonatorCreatorResourceID().hashCode();
        }
        if (getImpersonatorUpdaterResourceID() != null) {
            _hashCode += getImpersonatorUpdaterResourceID().hashCode();
        }
        if (getCreateDateTime() != null) {
            _hashCode += getCreateDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectNote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatorResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NoteType"));
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
        elemField.setFieldName("projectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectID"));
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
        elemField.setFieldName("announce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Announce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impersonatorCreatorResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ImpersonatorCreatorResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impersonatorUpdaterResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ImpersonatorUpdaterResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDateTime"));
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
