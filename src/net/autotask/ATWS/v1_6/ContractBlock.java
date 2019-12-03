/**
 * ContractBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractBlock  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractID;

    private java.lang.Object status;

    private java.lang.Object isPaid;

    private java.lang.Object datePurchased;

    private java.lang.Object startDate;

    private java.lang.Object endDate;

    private java.lang.Object hours;

    private java.lang.Object hourlyRate;

    private java.lang.Object invoiceNumber;

    private java.lang.Object paymentNumber;

    private java.lang.Object paymentType;

    private java.lang.Object hoursApproved;

    public ContractBlock() {
    }

    public ContractBlock(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractID,
           java.lang.Object status,
           java.lang.Object isPaid,
           java.lang.Object datePurchased,
           java.lang.Object startDate,
           java.lang.Object endDate,
           java.lang.Object hours,
           java.lang.Object hourlyRate,
           java.lang.Object invoiceNumber,
           java.lang.Object paymentNumber,
           java.lang.Object paymentType,
           java.lang.Object hoursApproved) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractID = contractID;
        this.status = status;
        this.isPaid = isPaid;
        this.datePurchased = datePurchased;
        this.startDate = startDate;
        this.endDate = endDate;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
        this.invoiceNumber = invoiceNumber;
        this.paymentNumber = paymentNumber;
        this.paymentType = paymentType;
        this.hoursApproved = hoursApproved;
    }


    /**
     * Gets the contractID value for this ContractBlock.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractBlock.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the status value for this ContractBlock.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContractBlock.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the isPaid value for this ContractBlock.
     * 
     * @return isPaid
     */
    public java.lang.Object getIsPaid() {
        return isPaid;
    }


    /**
     * Sets the isPaid value for this ContractBlock.
     * 
     * @param isPaid
     */
    public void setIsPaid(java.lang.Object isPaid) {
        this.isPaid = isPaid;
    }


    /**
     * Gets the datePurchased value for this ContractBlock.
     * 
     * @return datePurchased
     */
    public java.lang.Object getDatePurchased() {
        return datePurchased;
    }


    /**
     * Sets the datePurchased value for this ContractBlock.
     * 
     * @param datePurchased
     */
    public void setDatePurchased(java.lang.Object datePurchased) {
        this.datePurchased = datePurchased;
    }


    /**
     * Gets the startDate value for this ContractBlock.
     * 
     * @return startDate
     */
    public java.lang.Object getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ContractBlock.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.Object startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ContractBlock.
     * 
     * @return endDate
     */
    public java.lang.Object getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ContractBlock.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.Object endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the hours value for this ContractBlock.
     * 
     * @return hours
     */
    public java.lang.Object getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this ContractBlock.
     * 
     * @param hours
     */
    public void setHours(java.lang.Object hours) {
        this.hours = hours;
    }


    /**
     * Gets the hourlyRate value for this ContractBlock.
     * 
     * @return hourlyRate
     */
    public java.lang.Object getHourlyRate() {
        return hourlyRate;
    }


    /**
     * Sets the hourlyRate value for this ContractBlock.
     * 
     * @param hourlyRate
     */
    public void setHourlyRate(java.lang.Object hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    /**
     * Gets the invoiceNumber value for this ContractBlock.
     * 
     * @return invoiceNumber
     */
    public java.lang.Object getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this ContractBlock.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.Object invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the paymentNumber value for this ContractBlock.
     * 
     * @return paymentNumber
     */
    public java.lang.Object getPaymentNumber() {
        return paymentNumber;
    }


    /**
     * Sets the paymentNumber value for this ContractBlock.
     * 
     * @param paymentNumber
     */
    public void setPaymentNumber(java.lang.Object paymentNumber) {
        this.paymentNumber = paymentNumber;
    }


    /**
     * Gets the paymentType value for this ContractBlock.
     * 
     * @return paymentType
     */
    public java.lang.Object getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this ContractBlock.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Object paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the hoursApproved value for this ContractBlock.
     * 
     * @return hoursApproved
     */
    public java.lang.Object getHoursApproved() {
        return hoursApproved;
    }


    /**
     * Sets the hoursApproved value for this ContractBlock.
     * 
     * @param hoursApproved
     */
    public void setHoursApproved(java.lang.Object hoursApproved) {
        this.hoursApproved = hoursApproved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractBlock)) return false;
        ContractBlock other = (ContractBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.isPaid==null && other.getIsPaid()==null) || 
             (this.isPaid!=null &&
              this.isPaid.equals(other.getIsPaid()))) &&
            ((this.datePurchased==null && other.getDatePurchased()==null) || 
             (this.datePurchased!=null &&
              this.datePurchased.equals(other.getDatePurchased()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              this.hours.equals(other.getHours()))) &&
            ((this.hourlyRate==null && other.getHourlyRate()==null) || 
             (this.hourlyRate!=null &&
              this.hourlyRate.equals(other.getHourlyRate()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.paymentNumber==null && other.getPaymentNumber()==null) || 
             (this.paymentNumber!=null &&
              this.paymentNumber.equals(other.getPaymentNumber()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.hoursApproved==null && other.getHoursApproved()==null) || 
             (this.hoursApproved!=null &&
              this.hoursApproved.equals(other.getHoursApproved())));
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
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIsPaid() != null) {
            _hashCode += getIsPaid().hashCode();
        }
        if (getDatePurchased() != null) {
            _hashCode += getDatePurchased().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getHours() != null) {
            _hashCode += getHours().hashCode();
        }
        if (getHourlyRate() != null) {
            _hashCode += getHourlyRate().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getPaymentNumber() != null) {
            _hashCode += getPaymentNumber().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getHoursApproved() != null) {
            _hashCode += getHoursApproved().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePurchased");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DatePurchased"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourlyRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HourlyRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HoursApproved"));
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
