/**
 * AccountPhysicalLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class AccountPhysicalLocation  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object name;

    private java.lang.Object description;

    private java.lang.Object address1;

    private java.lang.Object address2;

    private java.lang.Object city;

    private java.lang.Object state;

    private java.lang.Object postalCode;

    private java.lang.Object countryID;

    private java.lang.Object phone;

    private java.lang.Object alternatePhone1;

    private java.lang.Object alternatePhone2;

    private java.lang.Object fax;

    private java.lang.Object roundtripDistance;

    private java.lang.Object active;

    private java.lang.Object primary;

    public AccountPhysicalLocation() {
    }

    public AccountPhysicalLocation(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object name,
           java.lang.Object description,
           java.lang.Object address1,
           java.lang.Object address2,
           java.lang.Object city,
           java.lang.Object state,
           java.lang.Object postalCode,
           java.lang.Object countryID,
           java.lang.Object phone,
           java.lang.Object alternatePhone1,
           java.lang.Object alternatePhone2,
           java.lang.Object fax,
           java.lang.Object roundtripDistance,
           java.lang.Object active,
           java.lang.Object primary) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.name = name;
        this.description = description;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.countryID = countryID;
        this.phone = phone;
        this.alternatePhone1 = alternatePhone1;
        this.alternatePhone2 = alternatePhone2;
        this.fax = fax;
        this.roundtripDistance = roundtripDistance;
        this.active = active;
        this.primary = primary;
    }


    /**
     * Gets the accountID value for this AccountPhysicalLocation.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this AccountPhysicalLocation.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the name value for this AccountPhysicalLocation.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountPhysicalLocation.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the description value for this AccountPhysicalLocation.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountPhysicalLocation.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the address1 value for this AccountPhysicalLocation.
     * 
     * @return address1
     */
    public java.lang.Object getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this AccountPhysicalLocation.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.Object address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this AccountPhysicalLocation.
     * 
     * @return address2
     */
    public java.lang.Object getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this AccountPhysicalLocation.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.Object address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this AccountPhysicalLocation.
     * 
     * @return city
     */
    public java.lang.Object getCity() {
        return city;
    }


    /**
     * Sets the city value for this AccountPhysicalLocation.
     * 
     * @param city
     */
    public void setCity(java.lang.Object city) {
        this.city = city;
    }


    /**
     * Gets the state value for this AccountPhysicalLocation.
     * 
     * @return state
     */
    public java.lang.Object getState() {
        return state;
    }


    /**
     * Sets the state value for this AccountPhysicalLocation.
     * 
     * @param state
     */
    public void setState(java.lang.Object state) {
        this.state = state;
    }


    /**
     * Gets the postalCode value for this AccountPhysicalLocation.
     * 
     * @return postalCode
     */
    public java.lang.Object getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this AccountPhysicalLocation.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.Object postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the countryID value for this AccountPhysicalLocation.
     * 
     * @return countryID
     */
    public java.lang.Object getCountryID() {
        return countryID;
    }


    /**
     * Sets the countryID value for this AccountPhysicalLocation.
     * 
     * @param countryID
     */
    public void setCountryID(java.lang.Object countryID) {
        this.countryID = countryID;
    }


    /**
     * Gets the phone value for this AccountPhysicalLocation.
     * 
     * @return phone
     */
    public java.lang.Object getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this AccountPhysicalLocation.
     * 
     * @param phone
     */
    public void setPhone(java.lang.Object phone) {
        this.phone = phone;
    }


    /**
     * Gets the alternatePhone1 value for this AccountPhysicalLocation.
     * 
     * @return alternatePhone1
     */
    public java.lang.Object getAlternatePhone1() {
        return alternatePhone1;
    }


    /**
     * Sets the alternatePhone1 value for this AccountPhysicalLocation.
     * 
     * @param alternatePhone1
     */
    public void setAlternatePhone1(java.lang.Object alternatePhone1) {
        this.alternatePhone1 = alternatePhone1;
    }


    /**
     * Gets the alternatePhone2 value for this AccountPhysicalLocation.
     * 
     * @return alternatePhone2
     */
    public java.lang.Object getAlternatePhone2() {
        return alternatePhone2;
    }


    /**
     * Sets the alternatePhone2 value for this AccountPhysicalLocation.
     * 
     * @param alternatePhone2
     */
    public void setAlternatePhone2(java.lang.Object alternatePhone2) {
        this.alternatePhone2 = alternatePhone2;
    }


    /**
     * Gets the fax value for this AccountPhysicalLocation.
     * 
     * @return fax
     */
    public java.lang.Object getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this AccountPhysicalLocation.
     * 
     * @param fax
     */
    public void setFax(java.lang.Object fax) {
        this.fax = fax;
    }


    /**
     * Gets the roundtripDistance value for this AccountPhysicalLocation.
     * 
     * @return roundtripDistance
     */
    public java.lang.Object getRoundtripDistance() {
        return roundtripDistance;
    }


    /**
     * Sets the roundtripDistance value for this AccountPhysicalLocation.
     * 
     * @param roundtripDistance
     */
    public void setRoundtripDistance(java.lang.Object roundtripDistance) {
        this.roundtripDistance = roundtripDistance;
    }


    /**
     * Gets the active value for this AccountPhysicalLocation.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this AccountPhysicalLocation.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the primary value for this AccountPhysicalLocation.
     * 
     * @return primary
     */
    public java.lang.Object getPrimary() {
        return primary;
    }


    /**
     * Sets the primary value for this AccountPhysicalLocation.
     * 
     * @param primary
     */
    public void setPrimary(java.lang.Object primary) {
        this.primary = primary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountPhysicalLocation)) return false;
        AccountPhysicalLocation other = (AccountPhysicalLocation) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.countryID==null && other.getCountryID()==null) || 
             (this.countryID!=null &&
              this.countryID.equals(other.getCountryID()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.alternatePhone1==null && other.getAlternatePhone1()==null) || 
             (this.alternatePhone1!=null &&
              this.alternatePhone1.equals(other.getAlternatePhone1()))) &&
            ((this.alternatePhone2==null && other.getAlternatePhone2()==null) || 
             (this.alternatePhone2!=null &&
              this.alternatePhone2.equals(other.getAlternatePhone2()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.roundtripDistance==null && other.getRoundtripDistance()==null) || 
             (this.roundtripDistance!=null &&
              this.roundtripDistance.equals(other.getRoundtripDistance()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.primary==null && other.getPrimary()==null) || 
             (this.primary!=null &&
              this.primary.equals(other.getPrimary())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getCountryID() != null) {
            _hashCode += getCountryID().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getAlternatePhone1() != null) {
            _hashCode += getAlternatePhone1().hashCode();
        }
        if (getAlternatePhone2() != null) {
            _hashCode += getAlternatePhone2().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getRoundtripDistance() != null) {
            _hashCode += getRoundtripDistance().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getPrimary() != null) {
            _hashCode += getPrimary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountPhysicalLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountPhysicalLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
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
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CountryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternatePhone1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AlternatePhone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternatePhone2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AlternatePhone2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RoundtripDistance"));
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
        elemField.setFieldName("primary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Primary"));
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
