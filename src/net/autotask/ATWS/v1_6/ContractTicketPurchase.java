/**
 * ContractTicketPurchase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractTicketPurchase  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractID;

    private java.lang.Object datePurchased;

    private java.lang.Object endDate;

    private java.lang.Object invoiceNumber;

    private java.lang.Object isPaid;

    private java.lang.Object paymentNumber;

    private java.lang.Object startDate;

    private java.lang.Object status;

    private java.lang.Object paymentType;

    private java.lang.Object perTicketRate;

    private java.lang.Object ticketsPurchased;

    private java.lang.Object ticketsUsed;

    public ContractTicketPurchase() {
    }

    public ContractTicketPurchase(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractID,
           java.lang.Object datePurchased,
           java.lang.Object endDate,
           java.lang.Object invoiceNumber,
           java.lang.Object isPaid,
           java.lang.Object paymentNumber,
           java.lang.Object startDate,
           java.lang.Object status,
           java.lang.Object paymentType,
           java.lang.Object perTicketRate,
           java.lang.Object ticketsPurchased,
           java.lang.Object ticketsUsed) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractID = contractID;
        this.datePurchased = datePurchased;
        this.endDate = endDate;
        this.invoiceNumber = invoiceNumber;
        this.isPaid = isPaid;
        this.paymentNumber = paymentNumber;
        this.startDate = startDate;
        this.status = status;
        this.paymentType = paymentType;
        this.perTicketRate = perTicketRate;
        this.ticketsPurchased = ticketsPurchased;
        this.ticketsUsed = ticketsUsed;
    }


    /**
     * Gets the contractID value for this ContractTicketPurchase.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractTicketPurchase.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the datePurchased value for this ContractTicketPurchase.
     * 
     * @return datePurchased
     */
    public java.lang.Object getDatePurchased() {
        return datePurchased;
    }


    /**
     * Sets the datePurchased value for this ContractTicketPurchase.
     * 
     * @param datePurchased
     */
    public void setDatePurchased(java.lang.Object datePurchased) {
        this.datePurchased = datePurchased;
    }


    /**
     * Gets the endDate value for this ContractTicketPurchase.
     * 
     * @return endDate
     */
    public java.lang.Object getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ContractTicketPurchase.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.Object endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the invoiceNumber value for this ContractTicketPurchase.
     * 
     * @return invoiceNumber
     */
    public java.lang.Object getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this ContractTicketPurchase.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.Object invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the isPaid value for this ContractTicketPurchase.
     * 
     * @return isPaid
     */
    public java.lang.Object getIsPaid() {
        return isPaid;
    }


    /**
     * Sets the isPaid value for this ContractTicketPurchase.
     * 
     * @param isPaid
     */
    public void setIsPaid(java.lang.Object isPaid) {
        this.isPaid = isPaid;
    }


    /**
     * Gets the paymentNumber value for this ContractTicketPurchase.
     * 
     * @return paymentNumber
     */
    public java.lang.Object getPaymentNumber() {
        return paymentNumber;
    }


    /**
     * Sets the paymentNumber value for this ContractTicketPurchase.
     * 
     * @param paymentNumber
     */
    public void setPaymentNumber(java.lang.Object paymentNumber) {
        this.paymentNumber = paymentNumber;
    }


    /**
     * Gets the startDate value for this ContractTicketPurchase.
     * 
     * @return startDate
     */
    public java.lang.Object getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ContractTicketPurchase.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.Object startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this ContractTicketPurchase.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContractTicketPurchase.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the paymentType value for this ContractTicketPurchase.
     * 
     * @return paymentType
     */
    public java.lang.Object getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this ContractTicketPurchase.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Object paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the perTicketRate value for this ContractTicketPurchase.
     * 
     * @return perTicketRate
     */
    public java.lang.Object getPerTicketRate() {
        return perTicketRate;
    }


    /**
     * Sets the perTicketRate value for this ContractTicketPurchase.
     * 
     * @param perTicketRate
     */
    public void setPerTicketRate(java.lang.Object perTicketRate) {
        this.perTicketRate = perTicketRate;
    }


    /**
     * Gets the ticketsPurchased value for this ContractTicketPurchase.
     * 
     * @return ticketsPurchased
     */
    public java.lang.Object getTicketsPurchased() {
        return ticketsPurchased;
    }


    /**
     * Sets the ticketsPurchased value for this ContractTicketPurchase.
     * 
     * @param ticketsPurchased
     */
    public void setTicketsPurchased(java.lang.Object ticketsPurchased) {
        this.ticketsPurchased = ticketsPurchased;
    }


    /**
     * Gets the ticketsUsed value for this ContractTicketPurchase.
     * 
     * @return ticketsUsed
     */
    public java.lang.Object getTicketsUsed() {
        return ticketsUsed;
    }


    /**
     * Sets the ticketsUsed value for this ContractTicketPurchase.
     * 
     * @param ticketsUsed
     */
    public void setTicketsUsed(java.lang.Object ticketsUsed) {
        this.ticketsUsed = ticketsUsed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractTicketPurchase)) return false;
        ContractTicketPurchase other = (ContractTicketPurchase) obj;
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
            ((this.datePurchased==null && other.getDatePurchased()==null) || 
             (this.datePurchased!=null &&
              this.datePurchased.equals(other.getDatePurchased()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.isPaid==null && other.getIsPaid()==null) || 
             (this.isPaid!=null &&
              this.isPaid.equals(other.getIsPaid()))) &&
            ((this.paymentNumber==null && other.getPaymentNumber()==null) || 
             (this.paymentNumber!=null &&
              this.paymentNumber.equals(other.getPaymentNumber()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.perTicketRate==null && other.getPerTicketRate()==null) || 
             (this.perTicketRate!=null &&
              this.perTicketRate.equals(other.getPerTicketRate()))) &&
            ((this.ticketsPurchased==null && other.getTicketsPurchased()==null) || 
             (this.ticketsPurchased!=null &&
              this.ticketsPurchased.equals(other.getTicketsPurchased()))) &&
            ((this.ticketsUsed==null && other.getTicketsUsed()==null) || 
             (this.ticketsUsed!=null &&
              this.ticketsUsed.equals(other.getTicketsUsed())));
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
        if (getDatePurchased() != null) {
            _hashCode += getDatePurchased().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getIsPaid() != null) {
            _hashCode += getIsPaid().hashCode();
        }
        if (getPaymentNumber() != null) {
            _hashCode += getPaymentNumber().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getPerTicketRate() != null) {
            _hashCode += getPerTicketRate().hashCode();
        }
        if (getTicketsPurchased() != null) {
            _hashCode += getTicketsPurchased().hashCode();
        }
        if (getTicketsUsed() != null) {
            _hashCode += getTicketsUsed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractTicketPurchase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractTicketPurchase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EndDate"));
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
        elemField.setFieldName("isPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsPaid"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StartDate"));
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
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perTicketRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PerTicketRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketsPurchased");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketsPurchased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketsUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketsUsed"));
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
