/**
 * SurveyResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class SurveyResults  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object companyRating;

    private java.lang.Object contactID;

    private java.lang.Object contactRating;

    private java.lang.Object completeDate;

    private java.lang.Object resourceRating;

    private java.lang.Object sendDate;

    private java.lang.Object surveyID;

    private java.lang.Object surveyRating;

    private java.lang.Object ticketID;

    public SurveyResults() {
    }

    public SurveyResults(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object companyRating,
           java.lang.Object contactID,
           java.lang.Object contactRating,
           java.lang.Object completeDate,
           java.lang.Object resourceRating,
           java.lang.Object sendDate,
           java.lang.Object surveyID,
           java.lang.Object surveyRating,
           java.lang.Object ticketID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.companyRating = companyRating;
        this.contactID = contactID;
        this.contactRating = contactRating;
        this.completeDate = completeDate;
        this.resourceRating = resourceRating;
        this.sendDate = sendDate;
        this.surveyID = surveyID;
        this.surveyRating = surveyRating;
        this.ticketID = ticketID;
    }


    /**
     * Gets the accountID value for this SurveyResults.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this SurveyResults.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the companyRating value for this SurveyResults.
     * 
     * @return companyRating
     */
    public java.lang.Object getCompanyRating() {
        return companyRating;
    }


    /**
     * Sets the companyRating value for this SurveyResults.
     * 
     * @param companyRating
     */
    public void setCompanyRating(java.lang.Object companyRating) {
        this.companyRating = companyRating;
    }


    /**
     * Gets the contactID value for this SurveyResults.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this SurveyResults.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the contactRating value for this SurveyResults.
     * 
     * @return contactRating
     */
    public java.lang.Object getContactRating() {
        return contactRating;
    }


    /**
     * Sets the contactRating value for this SurveyResults.
     * 
     * @param contactRating
     */
    public void setContactRating(java.lang.Object contactRating) {
        this.contactRating = contactRating;
    }


    /**
     * Gets the completeDate value for this SurveyResults.
     * 
     * @return completeDate
     */
    public java.lang.Object getCompleteDate() {
        return completeDate;
    }


    /**
     * Sets the completeDate value for this SurveyResults.
     * 
     * @param completeDate
     */
    public void setCompleteDate(java.lang.Object completeDate) {
        this.completeDate = completeDate;
    }


    /**
     * Gets the resourceRating value for this SurveyResults.
     * 
     * @return resourceRating
     */
    public java.lang.Object getResourceRating() {
        return resourceRating;
    }


    /**
     * Sets the resourceRating value for this SurveyResults.
     * 
     * @param resourceRating
     */
    public void setResourceRating(java.lang.Object resourceRating) {
        this.resourceRating = resourceRating;
    }


    /**
     * Gets the sendDate value for this SurveyResults.
     * 
     * @return sendDate
     */
    public java.lang.Object getSendDate() {
        return sendDate;
    }


    /**
     * Sets the sendDate value for this SurveyResults.
     * 
     * @param sendDate
     */
    public void setSendDate(java.lang.Object sendDate) {
        this.sendDate = sendDate;
    }


    /**
     * Gets the surveyID value for this SurveyResults.
     * 
     * @return surveyID
     */
    public java.lang.Object getSurveyID() {
        return surveyID;
    }


    /**
     * Sets the surveyID value for this SurveyResults.
     * 
     * @param surveyID
     */
    public void setSurveyID(java.lang.Object surveyID) {
        this.surveyID = surveyID;
    }


    /**
     * Gets the surveyRating value for this SurveyResults.
     * 
     * @return surveyRating
     */
    public java.lang.Object getSurveyRating() {
        return surveyRating;
    }


    /**
     * Sets the surveyRating value for this SurveyResults.
     * 
     * @param surveyRating
     */
    public void setSurveyRating(java.lang.Object surveyRating) {
        this.surveyRating = surveyRating;
    }


    /**
     * Gets the ticketID value for this SurveyResults.
     * 
     * @return ticketID
     */
    public java.lang.Object getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this SurveyResults.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Object ticketID) {
        this.ticketID = ticketID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurveyResults)) return false;
        SurveyResults other = (SurveyResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.companyRating==null && other.getCompanyRating()==null) || 
             (this.companyRating!=null &&
              this.companyRating.equals(other.getCompanyRating()))) &&
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.contactRating==null && other.getContactRating()==null) || 
             (this.contactRating!=null &&
              this.contactRating.equals(other.getContactRating()))) &&
            ((this.completeDate==null && other.getCompleteDate()==null) || 
             (this.completeDate!=null &&
              this.completeDate.equals(other.getCompleteDate()))) &&
            ((this.resourceRating==null && other.getResourceRating()==null) || 
             (this.resourceRating!=null &&
              this.resourceRating.equals(other.getResourceRating()))) &&
            ((this.sendDate==null && other.getSendDate()==null) || 
             (this.sendDate!=null &&
              this.sendDate.equals(other.getSendDate()))) &&
            ((this.surveyID==null && other.getSurveyID()==null) || 
             (this.surveyID!=null &&
              this.surveyID.equals(other.getSurveyID()))) &&
            ((this.surveyRating==null && other.getSurveyRating()==null) || 
             (this.surveyRating!=null &&
              this.surveyRating.equals(other.getSurveyRating()))) &&
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getCompanyRating() != null) {
            _hashCode += getCompanyRating().hashCode();
        }
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getContactRating() != null) {
            _hashCode += getContactRating().hashCode();
        }
        if (getCompleteDate() != null) {
            _hashCode += getCompleteDate().hashCode();
        }
        if (getResourceRating() != null) {
            _hashCode += getResourceRating().hashCode();
        }
        if (getSendDate() != null) {
            _hashCode += getSendDate().hashCode();
        }
        if (getSurveyID() != null) {
            _hashCode += getSurveyID().hashCode();
        }
        if (getSurveyRating() != null) {
            _hashCode += getSurveyRating().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SurveyResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SurveyResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompanyRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContactID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContactRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompleteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResourceRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SurveyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SurveyRating"));
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
