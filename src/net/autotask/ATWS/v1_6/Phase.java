/**
 * Phase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Phase  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object createDate;

    private java.lang.Object creatorResourceID;

    private java.lang.Object description;

    private java.lang.Object dueDate;

    private java.lang.Object estimatedHours;

    private java.lang.Object externalID;

    private java.lang.Object lastActivityDateTime;

    private java.lang.Object parentPhaseID;

    private java.lang.Object phaseNumber;

    private java.lang.Object projectID;

    private java.lang.Object scheduled;

    private java.lang.Object startDate;

    private java.lang.Object title;

    public Phase() {
    }

    public Phase(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object createDate,
           java.lang.Object creatorResourceID,
           java.lang.Object description,
           java.lang.Object dueDate,
           java.lang.Object estimatedHours,
           java.lang.Object externalID,
           java.lang.Object lastActivityDateTime,
           java.lang.Object parentPhaseID,
           java.lang.Object phaseNumber,
           java.lang.Object projectID,
           java.lang.Object scheduled,
           java.lang.Object startDate,
           java.lang.Object title) {
        super(
            fields,
            id,
            userDefinedFields);
        this.createDate = createDate;
        this.creatorResourceID = creatorResourceID;
        this.description = description;
        this.dueDate = dueDate;
        this.estimatedHours = estimatedHours;
        this.externalID = externalID;
        this.lastActivityDateTime = lastActivityDateTime;
        this.parentPhaseID = parentPhaseID;
        this.phaseNumber = phaseNumber;
        this.projectID = projectID;
        this.scheduled = scheduled;
        this.startDate = startDate;
        this.title = title;
    }


    /**
     * Gets the createDate value for this Phase.
     * 
     * @return createDate
     */
    public java.lang.Object getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this Phase.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.Object createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the creatorResourceID value for this Phase.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this Phase.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the description value for this Phase.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Phase.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the dueDate value for this Phase.
     * 
     * @return dueDate
     */
    public java.lang.Object getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Phase.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.Object dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the estimatedHours value for this Phase.
     * 
     * @return estimatedHours
     */
    public java.lang.Object getEstimatedHours() {
        return estimatedHours;
    }


    /**
     * Sets the estimatedHours value for this Phase.
     * 
     * @param estimatedHours
     */
    public void setEstimatedHours(java.lang.Object estimatedHours) {
        this.estimatedHours = estimatedHours;
    }


    /**
     * Gets the externalID value for this Phase.
     * 
     * @return externalID
     */
    public java.lang.Object getExternalID() {
        return externalID;
    }


    /**
     * Sets the externalID value for this Phase.
     * 
     * @param externalID
     */
    public void setExternalID(java.lang.Object externalID) {
        this.externalID = externalID;
    }


    /**
     * Gets the lastActivityDateTime value for this Phase.
     * 
     * @return lastActivityDateTime
     */
    public java.lang.Object getLastActivityDateTime() {
        return lastActivityDateTime;
    }


    /**
     * Sets the lastActivityDateTime value for this Phase.
     * 
     * @param lastActivityDateTime
     */
    public void setLastActivityDateTime(java.lang.Object lastActivityDateTime) {
        this.lastActivityDateTime = lastActivityDateTime;
    }


    /**
     * Gets the parentPhaseID value for this Phase.
     * 
     * @return parentPhaseID
     */
    public java.lang.Object getParentPhaseID() {
        return parentPhaseID;
    }


    /**
     * Sets the parentPhaseID value for this Phase.
     * 
     * @param parentPhaseID
     */
    public void setParentPhaseID(java.lang.Object parentPhaseID) {
        this.parentPhaseID = parentPhaseID;
    }


    /**
     * Gets the phaseNumber value for this Phase.
     * 
     * @return phaseNumber
     */
    public java.lang.Object getPhaseNumber() {
        return phaseNumber;
    }


    /**
     * Sets the phaseNumber value for this Phase.
     * 
     * @param phaseNumber
     */
    public void setPhaseNumber(java.lang.Object phaseNumber) {
        this.phaseNumber = phaseNumber;
    }


    /**
     * Gets the projectID value for this Phase.
     * 
     * @return projectID
     */
    public java.lang.Object getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this Phase.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.Object projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the scheduled value for this Phase.
     * 
     * @return scheduled
     */
    public java.lang.Object getScheduled() {
        return scheduled;
    }


    /**
     * Sets the scheduled value for this Phase.
     * 
     * @param scheduled
     */
    public void setScheduled(java.lang.Object scheduled) {
        this.scheduled = scheduled;
    }


    /**
     * Gets the startDate value for this Phase.
     * 
     * @return startDate
     */
    public java.lang.Object getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Phase.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.Object startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the title value for this Phase.
     * 
     * @return title
     */
    public java.lang.Object getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Phase.
     * 
     * @param title
     */
    public void setTitle(java.lang.Object title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Phase)) return false;
        Phase other = (Phase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.estimatedHours==null && other.getEstimatedHours()==null) || 
             (this.estimatedHours!=null &&
              this.estimatedHours.equals(other.getEstimatedHours()))) &&
            ((this.externalID==null && other.getExternalID()==null) || 
             (this.externalID!=null &&
              this.externalID.equals(other.getExternalID()))) &&
            ((this.lastActivityDateTime==null && other.getLastActivityDateTime()==null) || 
             (this.lastActivityDateTime!=null &&
              this.lastActivityDateTime.equals(other.getLastActivityDateTime()))) &&
            ((this.parentPhaseID==null && other.getParentPhaseID()==null) || 
             (this.parentPhaseID!=null &&
              this.parentPhaseID.equals(other.getParentPhaseID()))) &&
            ((this.phaseNumber==null && other.getPhaseNumber()==null) || 
             (this.phaseNumber!=null &&
              this.phaseNumber.equals(other.getPhaseNumber()))) &&
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.scheduled==null && other.getScheduled()==null) || 
             (this.scheduled!=null &&
              this.scheduled.equals(other.getScheduled()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getEstimatedHours() != null) {
            _hashCode += getEstimatedHours().hashCode();
        }
        if (getExternalID() != null) {
            _hashCode += getExternalID().hashCode();
        }
        if (getLastActivityDateTime() != null) {
            _hashCode += getLastActivityDateTime().hashCode();
        }
        if (getParentPhaseID() != null) {
            _hashCode += getParentPhaseID().hashCode();
        }
        if (getPhaseNumber() != null) {
            _hashCode += getPhaseNumber().hashCode();
        }
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getScheduled() != null) {
            _hashCode += getScheduled().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Phase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Phase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EstimatedHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExternalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentPhaseID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ParentPhaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phaseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PhaseNumber"));
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
        elemField.setFieldName("scheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Scheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StartDate"));
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
