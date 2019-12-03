/**
 * BusinessLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class BusinessLocation  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object address1;

    private java.lang.Object address2;

    private java.lang.Object city;

    private java.lang.Object state;

    private java.lang.Object postalCode;

    private java.lang.Object additionalAddressInfo;

    private java.lang.Object countryID;

    private java.lang.Object holidaySetID;

    private java.lang.Object noHoursOnHolidays;

    private java.lang.Object _default;

    private java.lang.Object firstDayOfWeek;

    private java.lang.Object dateFormat;

    private java.lang.Object timeFormat;

    private java.lang.Object numberFormat;

    private java.lang.Object timeZoneID;

    private java.lang.Object sundayBusinessHoursStartTime;

    private java.lang.Object sundayBusinessHoursEndTime;

    private java.lang.Object sundayExtendedHoursStartTime;

    private java.lang.Object sundayExtendedHoursEndTime;

    private java.lang.Object mondayBusinessHoursStartTime;

    private java.lang.Object mondayBusinessHoursEndTime;

    private java.lang.Object mondayExtendedHoursStartTime;

    private java.lang.Object mondayExtendedHoursEndTime;

    private java.lang.Object tuesdayBusinessHoursStartTime;

    private java.lang.Object tuesdayBusinessHoursEndTime;

    private java.lang.Object tuesdayExtendedHoursStartTime;

    private java.lang.Object tuesdayExtendedHoursEndTime;

    private java.lang.Object wednesdayBusinessHoursStartTime;

    private java.lang.Object wednesdayBusinessHoursEndTime;

    private java.lang.Object wednesdayExtendedHoursStartTime;

    private java.lang.Object wednesdayExtendedHoursEndTime;

    private java.lang.Object thursdayBusinessHoursStartTime;

    private java.lang.Object thursdayBusinessHoursEndTime;

    private java.lang.Object thursdayExtendedHoursStartTime;

    private java.lang.Object thursdayExtendedHoursEndTime;

    private java.lang.Object fridayBusinessHoursStartTime;

    private java.lang.Object fridayBusinessHoursEndTime;

    private java.lang.Object fridayExtendedHoursStartTime;

    private java.lang.Object fridayExtendedHoursEndTime;

    private java.lang.Object saturdayBusinessHoursStartTime;

    private java.lang.Object saturdayBusinessHoursEndTime;

    private java.lang.Object saturdayExtendedHoursStartTime;

    private java.lang.Object saturdayExtendedHoursEndTime;

    public BusinessLocation() {
    }

    public BusinessLocation(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object address1,
           java.lang.Object address2,
           java.lang.Object city,
           java.lang.Object state,
           java.lang.Object postalCode,
           java.lang.Object additionalAddressInfo,
           java.lang.Object countryID,
           java.lang.Object holidaySetID,
           java.lang.Object noHoursOnHolidays,
           java.lang.Object _default,
           java.lang.Object firstDayOfWeek,
           java.lang.Object dateFormat,
           java.lang.Object timeFormat,
           java.lang.Object numberFormat,
           java.lang.Object timeZoneID,
           java.lang.Object sundayBusinessHoursStartTime,
           java.lang.Object sundayBusinessHoursEndTime,
           java.lang.Object sundayExtendedHoursStartTime,
           java.lang.Object sundayExtendedHoursEndTime,
           java.lang.Object mondayBusinessHoursStartTime,
           java.lang.Object mondayBusinessHoursEndTime,
           java.lang.Object mondayExtendedHoursStartTime,
           java.lang.Object mondayExtendedHoursEndTime,
           java.lang.Object tuesdayBusinessHoursStartTime,
           java.lang.Object tuesdayBusinessHoursEndTime,
           java.lang.Object tuesdayExtendedHoursStartTime,
           java.lang.Object tuesdayExtendedHoursEndTime,
           java.lang.Object wednesdayBusinessHoursStartTime,
           java.lang.Object wednesdayBusinessHoursEndTime,
           java.lang.Object wednesdayExtendedHoursStartTime,
           java.lang.Object wednesdayExtendedHoursEndTime,
           java.lang.Object thursdayBusinessHoursStartTime,
           java.lang.Object thursdayBusinessHoursEndTime,
           java.lang.Object thursdayExtendedHoursStartTime,
           java.lang.Object thursdayExtendedHoursEndTime,
           java.lang.Object fridayBusinessHoursStartTime,
           java.lang.Object fridayBusinessHoursEndTime,
           java.lang.Object fridayExtendedHoursStartTime,
           java.lang.Object fridayExtendedHoursEndTime,
           java.lang.Object saturdayBusinessHoursStartTime,
           java.lang.Object saturdayBusinessHoursEndTime,
           java.lang.Object saturdayExtendedHoursStartTime,
           java.lang.Object saturdayExtendedHoursEndTime) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.additionalAddressInfo = additionalAddressInfo;
        this.countryID = countryID;
        this.holidaySetID = holidaySetID;
        this.noHoursOnHolidays = noHoursOnHolidays;
        this._default = _default;
        this.firstDayOfWeek = firstDayOfWeek;
        this.dateFormat = dateFormat;
        this.timeFormat = timeFormat;
        this.numberFormat = numberFormat;
        this.timeZoneID = timeZoneID;
        this.sundayBusinessHoursStartTime = sundayBusinessHoursStartTime;
        this.sundayBusinessHoursEndTime = sundayBusinessHoursEndTime;
        this.sundayExtendedHoursStartTime = sundayExtendedHoursStartTime;
        this.sundayExtendedHoursEndTime = sundayExtendedHoursEndTime;
        this.mondayBusinessHoursStartTime = mondayBusinessHoursStartTime;
        this.mondayBusinessHoursEndTime = mondayBusinessHoursEndTime;
        this.mondayExtendedHoursStartTime = mondayExtendedHoursStartTime;
        this.mondayExtendedHoursEndTime = mondayExtendedHoursEndTime;
        this.tuesdayBusinessHoursStartTime = tuesdayBusinessHoursStartTime;
        this.tuesdayBusinessHoursEndTime = tuesdayBusinessHoursEndTime;
        this.tuesdayExtendedHoursStartTime = tuesdayExtendedHoursStartTime;
        this.tuesdayExtendedHoursEndTime = tuesdayExtendedHoursEndTime;
        this.wednesdayBusinessHoursStartTime = wednesdayBusinessHoursStartTime;
        this.wednesdayBusinessHoursEndTime = wednesdayBusinessHoursEndTime;
        this.wednesdayExtendedHoursStartTime = wednesdayExtendedHoursStartTime;
        this.wednesdayExtendedHoursEndTime = wednesdayExtendedHoursEndTime;
        this.thursdayBusinessHoursStartTime = thursdayBusinessHoursStartTime;
        this.thursdayBusinessHoursEndTime = thursdayBusinessHoursEndTime;
        this.thursdayExtendedHoursStartTime = thursdayExtendedHoursStartTime;
        this.thursdayExtendedHoursEndTime = thursdayExtendedHoursEndTime;
        this.fridayBusinessHoursStartTime = fridayBusinessHoursStartTime;
        this.fridayBusinessHoursEndTime = fridayBusinessHoursEndTime;
        this.fridayExtendedHoursStartTime = fridayExtendedHoursStartTime;
        this.fridayExtendedHoursEndTime = fridayExtendedHoursEndTime;
        this.saturdayBusinessHoursStartTime = saturdayBusinessHoursStartTime;
        this.saturdayBusinessHoursEndTime = saturdayBusinessHoursEndTime;
        this.saturdayExtendedHoursStartTime = saturdayExtendedHoursStartTime;
        this.saturdayExtendedHoursEndTime = saturdayExtendedHoursEndTime;
    }


    /**
     * Gets the name value for this BusinessLocation.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this BusinessLocation.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the address1 value for this BusinessLocation.
     * 
     * @return address1
     */
    public java.lang.Object getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this BusinessLocation.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.Object address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this BusinessLocation.
     * 
     * @return address2
     */
    public java.lang.Object getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this BusinessLocation.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.Object address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this BusinessLocation.
     * 
     * @return city
     */
    public java.lang.Object getCity() {
        return city;
    }


    /**
     * Sets the city value for this BusinessLocation.
     * 
     * @param city
     */
    public void setCity(java.lang.Object city) {
        this.city = city;
    }


    /**
     * Gets the state value for this BusinessLocation.
     * 
     * @return state
     */
    public java.lang.Object getState() {
        return state;
    }


    /**
     * Sets the state value for this BusinessLocation.
     * 
     * @param state
     */
    public void setState(java.lang.Object state) {
        this.state = state;
    }


    /**
     * Gets the postalCode value for this BusinessLocation.
     * 
     * @return postalCode
     */
    public java.lang.Object getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this BusinessLocation.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.Object postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the additionalAddressInfo value for this BusinessLocation.
     * 
     * @return additionalAddressInfo
     */
    public java.lang.Object getAdditionalAddressInfo() {
        return additionalAddressInfo;
    }


    /**
     * Sets the additionalAddressInfo value for this BusinessLocation.
     * 
     * @param additionalAddressInfo
     */
    public void setAdditionalAddressInfo(java.lang.Object additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
    }


    /**
     * Gets the countryID value for this BusinessLocation.
     * 
     * @return countryID
     */
    public java.lang.Object getCountryID() {
        return countryID;
    }


    /**
     * Sets the countryID value for this BusinessLocation.
     * 
     * @param countryID
     */
    public void setCountryID(java.lang.Object countryID) {
        this.countryID = countryID;
    }


    /**
     * Gets the holidaySetID value for this BusinessLocation.
     * 
     * @return holidaySetID
     */
    public java.lang.Object getHolidaySetID() {
        return holidaySetID;
    }


    /**
     * Sets the holidaySetID value for this BusinessLocation.
     * 
     * @param holidaySetID
     */
    public void setHolidaySetID(java.lang.Object holidaySetID) {
        this.holidaySetID = holidaySetID;
    }


    /**
     * Gets the noHoursOnHolidays value for this BusinessLocation.
     * 
     * @return noHoursOnHolidays
     */
    public java.lang.Object getNoHoursOnHolidays() {
        return noHoursOnHolidays;
    }


    /**
     * Sets the noHoursOnHolidays value for this BusinessLocation.
     * 
     * @param noHoursOnHolidays
     */
    public void setNoHoursOnHolidays(java.lang.Object noHoursOnHolidays) {
        this.noHoursOnHolidays = noHoursOnHolidays;
    }


    /**
     * Gets the _default value for this BusinessLocation.
     * 
     * @return _default
     */
    public java.lang.Object get_default() {
        return _default;
    }


    /**
     * Sets the _default value for this BusinessLocation.
     * 
     * @param _default
     */
    public void set_default(java.lang.Object _default) {
        this._default = _default;
    }


    /**
     * Gets the firstDayOfWeek value for this BusinessLocation.
     * 
     * @return firstDayOfWeek
     */
    public java.lang.Object getFirstDayOfWeek() {
        return firstDayOfWeek;
    }


    /**
     * Sets the firstDayOfWeek value for this BusinessLocation.
     * 
     * @param firstDayOfWeek
     */
    public void setFirstDayOfWeek(java.lang.Object firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
    }


    /**
     * Gets the dateFormat value for this BusinessLocation.
     * 
     * @return dateFormat
     */
    public java.lang.Object getDateFormat() {
        return dateFormat;
    }


    /**
     * Sets the dateFormat value for this BusinessLocation.
     * 
     * @param dateFormat
     */
    public void setDateFormat(java.lang.Object dateFormat) {
        this.dateFormat = dateFormat;
    }


    /**
     * Gets the timeFormat value for this BusinessLocation.
     * 
     * @return timeFormat
     */
    public java.lang.Object getTimeFormat() {
        return timeFormat;
    }


    /**
     * Sets the timeFormat value for this BusinessLocation.
     * 
     * @param timeFormat
     */
    public void setTimeFormat(java.lang.Object timeFormat) {
        this.timeFormat = timeFormat;
    }


    /**
     * Gets the numberFormat value for this BusinessLocation.
     * 
     * @return numberFormat
     */
    public java.lang.Object getNumberFormat() {
        return numberFormat;
    }


    /**
     * Sets the numberFormat value for this BusinessLocation.
     * 
     * @param numberFormat
     */
    public void setNumberFormat(java.lang.Object numberFormat) {
        this.numberFormat = numberFormat;
    }


    /**
     * Gets the timeZoneID value for this BusinessLocation.
     * 
     * @return timeZoneID
     */
    public java.lang.Object getTimeZoneID() {
        return timeZoneID;
    }


    /**
     * Sets the timeZoneID value for this BusinessLocation.
     * 
     * @param timeZoneID
     */
    public void setTimeZoneID(java.lang.Object timeZoneID) {
        this.timeZoneID = timeZoneID;
    }


    /**
     * Gets the sundayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @return sundayBusinessHoursStartTime
     */
    public java.lang.Object getSundayBusinessHoursStartTime() {
        return sundayBusinessHoursStartTime;
    }


    /**
     * Sets the sundayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @param sundayBusinessHoursStartTime
     */
    public void setSundayBusinessHoursStartTime(java.lang.Object sundayBusinessHoursStartTime) {
        this.sundayBusinessHoursStartTime = sundayBusinessHoursStartTime;
    }


    /**
     * Gets the sundayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @return sundayBusinessHoursEndTime
     */
    public java.lang.Object getSundayBusinessHoursEndTime() {
        return sundayBusinessHoursEndTime;
    }


    /**
     * Sets the sundayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @param sundayBusinessHoursEndTime
     */
    public void setSundayBusinessHoursEndTime(java.lang.Object sundayBusinessHoursEndTime) {
        this.sundayBusinessHoursEndTime = sundayBusinessHoursEndTime;
    }


    /**
     * Gets the sundayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @return sundayExtendedHoursStartTime
     */
    public java.lang.Object getSundayExtendedHoursStartTime() {
        return sundayExtendedHoursStartTime;
    }


    /**
     * Sets the sundayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @param sundayExtendedHoursStartTime
     */
    public void setSundayExtendedHoursStartTime(java.lang.Object sundayExtendedHoursStartTime) {
        this.sundayExtendedHoursStartTime = sundayExtendedHoursStartTime;
    }


    /**
     * Gets the sundayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @return sundayExtendedHoursEndTime
     */
    public java.lang.Object getSundayExtendedHoursEndTime() {
        return sundayExtendedHoursEndTime;
    }


    /**
     * Sets the sundayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @param sundayExtendedHoursEndTime
     */
    public void setSundayExtendedHoursEndTime(java.lang.Object sundayExtendedHoursEndTime) {
        this.sundayExtendedHoursEndTime = sundayExtendedHoursEndTime;
    }


    /**
     * Gets the mondayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @return mondayBusinessHoursStartTime
     */
    public java.lang.Object getMondayBusinessHoursStartTime() {
        return mondayBusinessHoursStartTime;
    }


    /**
     * Sets the mondayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @param mondayBusinessHoursStartTime
     */
    public void setMondayBusinessHoursStartTime(java.lang.Object mondayBusinessHoursStartTime) {
        this.mondayBusinessHoursStartTime = mondayBusinessHoursStartTime;
    }


    /**
     * Gets the mondayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @return mondayBusinessHoursEndTime
     */
    public java.lang.Object getMondayBusinessHoursEndTime() {
        return mondayBusinessHoursEndTime;
    }


    /**
     * Sets the mondayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @param mondayBusinessHoursEndTime
     */
    public void setMondayBusinessHoursEndTime(java.lang.Object mondayBusinessHoursEndTime) {
        this.mondayBusinessHoursEndTime = mondayBusinessHoursEndTime;
    }


    /**
     * Gets the mondayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @return mondayExtendedHoursStartTime
     */
    public java.lang.Object getMondayExtendedHoursStartTime() {
        return mondayExtendedHoursStartTime;
    }


    /**
     * Sets the mondayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @param mondayExtendedHoursStartTime
     */
    public void setMondayExtendedHoursStartTime(java.lang.Object mondayExtendedHoursStartTime) {
        this.mondayExtendedHoursStartTime = mondayExtendedHoursStartTime;
    }


    /**
     * Gets the mondayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @return mondayExtendedHoursEndTime
     */
    public java.lang.Object getMondayExtendedHoursEndTime() {
        return mondayExtendedHoursEndTime;
    }


    /**
     * Sets the mondayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @param mondayExtendedHoursEndTime
     */
    public void setMondayExtendedHoursEndTime(java.lang.Object mondayExtendedHoursEndTime) {
        this.mondayExtendedHoursEndTime = mondayExtendedHoursEndTime;
    }


    /**
     * Gets the tuesdayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @return tuesdayBusinessHoursStartTime
     */
    public java.lang.Object getTuesdayBusinessHoursStartTime() {
        return tuesdayBusinessHoursStartTime;
    }


    /**
     * Sets the tuesdayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @param tuesdayBusinessHoursStartTime
     */
    public void setTuesdayBusinessHoursStartTime(java.lang.Object tuesdayBusinessHoursStartTime) {
        this.tuesdayBusinessHoursStartTime = tuesdayBusinessHoursStartTime;
    }


    /**
     * Gets the tuesdayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @return tuesdayBusinessHoursEndTime
     */
    public java.lang.Object getTuesdayBusinessHoursEndTime() {
        return tuesdayBusinessHoursEndTime;
    }


    /**
     * Sets the tuesdayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @param tuesdayBusinessHoursEndTime
     */
    public void setTuesdayBusinessHoursEndTime(java.lang.Object tuesdayBusinessHoursEndTime) {
        this.tuesdayBusinessHoursEndTime = tuesdayBusinessHoursEndTime;
    }


    /**
     * Gets the tuesdayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @return tuesdayExtendedHoursStartTime
     */
    public java.lang.Object getTuesdayExtendedHoursStartTime() {
        return tuesdayExtendedHoursStartTime;
    }


    /**
     * Sets the tuesdayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @param tuesdayExtendedHoursStartTime
     */
    public void setTuesdayExtendedHoursStartTime(java.lang.Object tuesdayExtendedHoursStartTime) {
        this.tuesdayExtendedHoursStartTime = tuesdayExtendedHoursStartTime;
    }


    /**
     * Gets the tuesdayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @return tuesdayExtendedHoursEndTime
     */
    public java.lang.Object getTuesdayExtendedHoursEndTime() {
        return tuesdayExtendedHoursEndTime;
    }


    /**
     * Sets the tuesdayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @param tuesdayExtendedHoursEndTime
     */
    public void setTuesdayExtendedHoursEndTime(java.lang.Object tuesdayExtendedHoursEndTime) {
        this.tuesdayExtendedHoursEndTime = tuesdayExtendedHoursEndTime;
    }


    /**
     * Gets the wednesdayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @return wednesdayBusinessHoursStartTime
     */
    public java.lang.Object getWednesdayBusinessHoursStartTime() {
        return wednesdayBusinessHoursStartTime;
    }


    /**
     * Sets the wednesdayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @param wednesdayBusinessHoursStartTime
     */
    public void setWednesdayBusinessHoursStartTime(java.lang.Object wednesdayBusinessHoursStartTime) {
        this.wednesdayBusinessHoursStartTime = wednesdayBusinessHoursStartTime;
    }


    /**
     * Gets the wednesdayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @return wednesdayBusinessHoursEndTime
     */
    public java.lang.Object getWednesdayBusinessHoursEndTime() {
        return wednesdayBusinessHoursEndTime;
    }


    /**
     * Sets the wednesdayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @param wednesdayBusinessHoursEndTime
     */
    public void setWednesdayBusinessHoursEndTime(java.lang.Object wednesdayBusinessHoursEndTime) {
        this.wednesdayBusinessHoursEndTime = wednesdayBusinessHoursEndTime;
    }


    /**
     * Gets the wednesdayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @return wednesdayExtendedHoursStartTime
     */
    public java.lang.Object getWednesdayExtendedHoursStartTime() {
        return wednesdayExtendedHoursStartTime;
    }


    /**
     * Sets the wednesdayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @param wednesdayExtendedHoursStartTime
     */
    public void setWednesdayExtendedHoursStartTime(java.lang.Object wednesdayExtendedHoursStartTime) {
        this.wednesdayExtendedHoursStartTime = wednesdayExtendedHoursStartTime;
    }


    /**
     * Gets the wednesdayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @return wednesdayExtendedHoursEndTime
     */
    public java.lang.Object getWednesdayExtendedHoursEndTime() {
        return wednesdayExtendedHoursEndTime;
    }


    /**
     * Sets the wednesdayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @param wednesdayExtendedHoursEndTime
     */
    public void setWednesdayExtendedHoursEndTime(java.lang.Object wednesdayExtendedHoursEndTime) {
        this.wednesdayExtendedHoursEndTime = wednesdayExtendedHoursEndTime;
    }


    /**
     * Gets the thursdayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @return thursdayBusinessHoursStartTime
     */
    public java.lang.Object getThursdayBusinessHoursStartTime() {
        return thursdayBusinessHoursStartTime;
    }


    /**
     * Sets the thursdayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @param thursdayBusinessHoursStartTime
     */
    public void setThursdayBusinessHoursStartTime(java.lang.Object thursdayBusinessHoursStartTime) {
        this.thursdayBusinessHoursStartTime = thursdayBusinessHoursStartTime;
    }


    /**
     * Gets the thursdayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @return thursdayBusinessHoursEndTime
     */
    public java.lang.Object getThursdayBusinessHoursEndTime() {
        return thursdayBusinessHoursEndTime;
    }


    /**
     * Sets the thursdayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @param thursdayBusinessHoursEndTime
     */
    public void setThursdayBusinessHoursEndTime(java.lang.Object thursdayBusinessHoursEndTime) {
        this.thursdayBusinessHoursEndTime = thursdayBusinessHoursEndTime;
    }


    /**
     * Gets the thursdayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @return thursdayExtendedHoursStartTime
     */
    public java.lang.Object getThursdayExtendedHoursStartTime() {
        return thursdayExtendedHoursStartTime;
    }


    /**
     * Sets the thursdayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @param thursdayExtendedHoursStartTime
     */
    public void setThursdayExtendedHoursStartTime(java.lang.Object thursdayExtendedHoursStartTime) {
        this.thursdayExtendedHoursStartTime = thursdayExtendedHoursStartTime;
    }


    /**
     * Gets the thursdayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @return thursdayExtendedHoursEndTime
     */
    public java.lang.Object getThursdayExtendedHoursEndTime() {
        return thursdayExtendedHoursEndTime;
    }


    /**
     * Sets the thursdayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @param thursdayExtendedHoursEndTime
     */
    public void setThursdayExtendedHoursEndTime(java.lang.Object thursdayExtendedHoursEndTime) {
        this.thursdayExtendedHoursEndTime = thursdayExtendedHoursEndTime;
    }


    /**
     * Gets the fridayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @return fridayBusinessHoursStartTime
     */
    public java.lang.Object getFridayBusinessHoursStartTime() {
        return fridayBusinessHoursStartTime;
    }


    /**
     * Sets the fridayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @param fridayBusinessHoursStartTime
     */
    public void setFridayBusinessHoursStartTime(java.lang.Object fridayBusinessHoursStartTime) {
        this.fridayBusinessHoursStartTime = fridayBusinessHoursStartTime;
    }


    /**
     * Gets the fridayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @return fridayBusinessHoursEndTime
     */
    public java.lang.Object getFridayBusinessHoursEndTime() {
        return fridayBusinessHoursEndTime;
    }


    /**
     * Sets the fridayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @param fridayBusinessHoursEndTime
     */
    public void setFridayBusinessHoursEndTime(java.lang.Object fridayBusinessHoursEndTime) {
        this.fridayBusinessHoursEndTime = fridayBusinessHoursEndTime;
    }


    /**
     * Gets the fridayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @return fridayExtendedHoursStartTime
     */
    public java.lang.Object getFridayExtendedHoursStartTime() {
        return fridayExtendedHoursStartTime;
    }


    /**
     * Sets the fridayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @param fridayExtendedHoursStartTime
     */
    public void setFridayExtendedHoursStartTime(java.lang.Object fridayExtendedHoursStartTime) {
        this.fridayExtendedHoursStartTime = fridayExtendedHoursStartTime;
    }


    /**
     * Gets the fridayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @return fridayExtendedHoursEndTime
     */
    public java.lang.Object getFridayExtendedHoursEndTime() {
        return fridayExtendedHoursEndTime;
    }


    /**
     * Sets the fridayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @param fridayExtendedHoursEndTime
     */
    public void setFridayExtendedHoursEndTime(java.lang.Object fridayExtendedHoursEndTime) {
        this.fridayExtendedHoursEndTime = fridayExtendedHoursEndTime;
    }


    /**
     * Gets the saturdayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @return saturdayBusinessHoursStartTime
     */
    public java.lang.Object getSaturdayBusinessHoursStartTime() {
        return saturdayBusinessHoursStartTime;
    }


    /**
     * Sets the saturdayBusinessHoursStartTime value for this BusinessLocation.
     * 
     * @param saturdayBusinessHoursStartTime
     */
    public void setSaturdayBusinessHoursStartTime(java.lang.Object saturdayBusinessHoursStartTime) {
        this.saturdayBusinessHoursStartTime = saturdayBusinessHoursStartTime;
    }


    /**
     * Gets the saturdayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @return saturdayBusinessHoursEndTime
     */
    public java.lang.Object getSaturdayBusinessHoursEndTime() {
        return saturdayBusinessHoursEndTime;
    }


    /**
     * Sets the saturdayBusinessHoursEndTime value for this BusinessLocation.
     * 
     * @param saturdayBusinessHoursEndTime
     */
    public void setSaturdayBusinessHoursEndTime(java.lang.Object saturdayBusinessHoursEndTime) {
        this.saturdayBusinessHoursEndTime = saturdayBusinessHoursEndTime;
    }


    /**
     * Gets the saturdayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @return saturdayExtendedHoursStartTime
     */
    public java.lang.Object getSaturdayExtendedHoursStartTime() {
        return saturdayExtendedHoursStartTime;
    }


    /**
     * Sets the saturdayExtendedHoursStartTime value for this BusinessLocation.
     * 
     * @param saturdayExtendedHoursStartTime
     */
    public void setSaturdayExtendedHoursStartTime(java.lang.Object saturdayExtendedHoursStartTime) {
        this.saturdayExtendedHoursStartTime = saturdayExtendedHoursStartTime;
    }


    /**
     * Gets the saturdayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @return saturdayExtendedHoursEndTime
     */
    public java.lang.Object getSaturdayExtendedHoursEndTime() {
        return saturdayExtendedHoursEndTime;
    }


    /**
     * Sets the saturdayExtendedHoursEndTime value for this BusinessLocation.
     * 
     * @param saturdayExtendedHoursEndTime
     */
    public void setSaturdayExtendedHoursEndTime(java.lang.Object saturdayExtendedHoursEndTime) {
        this.saturdayExtendedHoursEndTime = saturdayExtendedHoursEndTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessLocation)) return false;
        BusinessLocation other = (BusinessLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
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
            ((this.additionalAddressInfo==null && other.getAdditionalAddressInfo()==null) || 
             (this.additionalAddressInfo!=null &&
              this.additionalAddressInfo.equals(other.getAdditionalAddressInfo()))) &&
            ((this.countryID==null && other.getCountryID()==null) || 
             (this.countryID!=null &&
              this.countryID.equals(other.getCountryID()))) &&
            ((this.holidaySetID==null && other.getHolidaySetID()==null) || 
             (this.holidaySetID!=null &&
              this.holidaySetID.equals(other.getHolidaySetID()))) &&
            ((this.noHoursOnHolidays==null && other.getNoHoursOnHolidays()==null) || 
             (this.noHoursOnHolidays!=null &&
              this.noHoursOnHolidays.equals(other.getNoHoursOnHolidays()))) &&
            ((this._default==null && other.get_default()==null) || 
             (this._default!=null &&
              this._default.equals(other.get_default()))) &&
            ((this.firstDayOfWeek==null && other.getFirstDayOfWeek()==null) || 
             (this.firstDayOfWeek!=null &&
              this.firstDayOfWeek.equals(other.getFirstDayOfWeek()))) &&
            ((this.dateFormat==null && other.getDateFormat()==null) || 
             (this.dateFormat!=null &&
              this.dateFormat.equals(other.getDateFormat()))) &&
            ((this.timeFormat==null && other.getTimeFormat()==null) || 
             (this.timeFormat!=null &&
              this.timeFormat.equals(other.getTimeFormat()))) &&
            ((this.numberFormat==null && other.getNumberFormat()==null) || 
             (this.numberFormat!=null &&
              this.numberFormat.equals(other.getNumberFormat()))) &&
            ((this.timeZoneID==null && other.getTimeZoneID()==null) || 
             (this.timeZoneID!=null &&
              this.timeZoneID.equals(other.getTimeZoneID()))) &&
            ((this.sundayBusinessHoursStartTime==null && other.getSundayBusinessHoursStartTime()==null) || 
             (this.sundayBusinessHoursStartTime!=null &&
              this.sundayBusinessHoursStartTime.equals(other.getSundayBusinessHoursStartTime()))) &&
            ((this.sundayBusinessHoursEndTime==null && other.getSundayBusinessHoursEndTime()==null) || 
             (this.sundayBusinessHoursEndTime!=null &&
              this.sundayBusinessHoursEndTime.equals(other.getSundayBusinessHoursEndTime()))) &&
            ((this.sundayExtendedHoursStartTime==null && other.getSundayExtendedHoursStartTime()==null) || 
             (this.sundayExtendedHoursStartTime!=null &&
              this.sundayExtendedHoursStartTime.equals(other.getSundayExtendedHoursStartTime()))) &&
            ((this.sundayExtendedHoursEndTime==null && other.getSundayExtendedHoursEndTime()==null) || 
             (this.sundayExtendedHoursEndTime!=null &&
              this.sundayExtendedHoursEndTime.equals(other.getSundayExtendedHoursEndTime()))) &&
            ((this.mondayBusinessHoursStartTime==null && other.getMondayBusinessHoursStartTime()==null) || 
             (this.mondayBusinessHoursStartTime!=null &&
              this.mondayBusinessHoursStartTime.equals(other.getMondayBusinessHoursStartTime()))) &&
            ((this.mondayBusinessHoursEndTime==null && other.getMondayBusinessHoursEndTime()==null) || 
             (this.mondayBusinessHoursEndTime!=null &&
              this.mondayBusinessHoursEndTime.equals(other.getMondayBusinessHoursEndTime()))) &&
            ((this.mondayExtendedHoursStartTime==null && other.getMondayExtendedHoursStartTime()==null) || 
             (this.mondayExtendedHoursStartTime!=null &&
              this.mondayExtendedHoursStartTime.equals(other.getMondayExtendedHoursStartTime()))) &&
            ((this.mondayExtendedHoursEndTime==null && other.getMondayExtendedHoursEndTime()==null) || 
             (this.mondayExtendedHoursEndTime!=null &&
              this.mondayExtendedHoursEndTime.equals(other.getMondayExtendedHoursEndTime()))) &&
            ((this.tuesdayBusinessHoursStartTime==null && other.getTuesdayBusinessHoursStartTime()==null) || 
             (this.tuesdayBusinessHoursStartTime!=null &&
              this.tuesdayBusinessHoursStartTime.equals(other.getTuesdayBusinessHoursStartTime()))) &&
            ((this.tuesdayBusinessHoursEndTime==null && other.getTuesdayBusinessHoursEndTime()==null) || 
             (this.tuesdayBusinessHoursEndTime!=null &&
              this.tuesdayBusinessHoursEndTime.equals(other.getTuesdayBusinessHoursEndTime()))) &&
            ((this.tuesdayExtendedHoursStartTime==null && other.getTuesdayExtendedHoursStartTime()==null) || 
             (this.tuesdayExtendedHoursStartTime!=null &&
              this.tuesdayExtendedHoursStartTime.equals(other.getTuesdayExtendedHoursStartTime()))) &&
            ((this.tuesdayExtendedHoursEndTime==null && other.getTuesdayExtendedHoursEndTime()==null) || 
             (this.tuesdayExtendedHoursEndTime!=null &&
              this.tuesdayExtendedHoursEndTime.equals(other.getTuesdayExtendedHoursEndTime()))) &&
            ((this.wednesdayBusinessHoursStartTime==null && other.getWednesdayBusinessHoursStartTime()==null) || 
             (this.wednesdayBusinessHoursStartTime!=null &&
              this.wednesdayBusinessHoursStartTime.equals(other.getWednesdayBusinessHoursStartTime()))) &&
            ((this.wednesdayBusinessHoursEndTime==null && other.getWednesdayBusinessHoursEndTime()==null) || 
             (this.wednesdayBusinessHoursEndTime!=null &&
              this.wednesdayBusinessHoursEndTime.equals(other.getWednesdayBusinessHoursEndTime()))) &&
            ((this.wednesdayExtendedHoursStartTime==null && other.getWednesdayExtendedHoursStartTime()==null) || 
             (this.wednesdayExtendedHoursStartTime!=null &&
              this.wednesdayExtendedHoursStartTime.equals(other.getWednesdayExtendedHoursStartTime()))) &&
            ((this.wednesdayExtendedHoursEndTime==null && other.getWednesdayExtendedHoursEndTime()==null) || 
             (this.wednesdayExtendedHoursEndTime!=null &&
              this.wednesdayExtendedHoursEndTime.equals(other.getWednesdayExtendedHoursEndTime()))) &&
            ((this.thursdayBusinessHoursStartTime==null && other.getThursdayBusinessHoursStartTime()==null) || 
             (this.thursdayBusinessHoursStartTime!=null &&
              this.thursdayBusinessHoursStartTime.equals(other.getThursdayBusinessHoursStartTime()))) &&
            ((this.thursdayBusinessHoursEndTime==null && other.getThursdayBusinessHoursEndTime()==null) || 
             (this.thursdayBusinessHoursEndTime!=null &&
              this.thursdayBusinessHoursEndTime.equals(other.getThursdayBusinessHoursEndTime()))) &&
            ((this.thursdayExtendedHoursStartTime==null && other.getThursdayExtendedHoursStartTime()==null) || 
             (this.thursdayExtendedHoursStartTime!=null &&
              this.thursdayExtendedHoursStartTime.equals(other.getThursdayExtendedHoursStartTime()))) &&
            ((this.thursdayExtendedHoursEndTime==null && other.getThursdayExtendedHoursEndTime()==null) || 
             (this.thursdayExtendedHoursEndTime!=null &&
              this.thursdayExtendedHoursEndTime.equals(other.getThursdayExtendedHoursEndTime()))) &&
            ((this.fridayBusinessHoursStartTime==null && other.getFridayBusinessHoursStartTime()==null) || 
             (this.fridayBusinessHoursStartTime!=null &&
              this.fridayBusinessHoursStartTime.equals(other.getFridayBusinessHoursStartTime()))) &&
            ((this.fridayBusinessHoursEndTime==null && other.getFridayBusinessHoursEndTime()==null) || 
             (this.fridayBusinessHoursEndTime!=null &&
              this.fridayBusinessHoursEndTime.equals(other.getFridayBusinessHoursEndTime()))) &&
            ((this.fridayExtendedHoursStartTime==null && other.getFridayExtendedHoursStartTime()==null) || 
             (this.fridayExtendedHoursStartTime!=null &&
              this.fridayExtendedHoursStartTime.equals(other.getFridayExtendedHoursStartTime()))) &&
            ((this.fridayExtendedHoursEndTime==null && other.getFridayExtendedHoursEndTime()==null) || 
             (this.fridayExtendedHoursEndTime!=null &&
              this.fridayExtendedHoursEndTime.equals(other.getFridayExtendedHoursEndTime()))) &&
            ((this.saturdayBusinessHoursStartTime==null && other.getSaturdayBusinessHoursStartTime()==null) || 
             (this.saturdayBusinessHoursStartTime!=null &&
              this.saturdayBusinessHoursStartTime.equals(other.getSaturdayBusinessHoursStartTime()))) &&
            ((this.saturdayBusinessHoursEndTime==null && other.getSaturdayBusinessHoursEndTime()==null) || 
             (this.saturdayBusinessHoursEndTime!=null &&
              this.saturdayBusinessHoursEndTime.equals(other.getSaturdayBusinessHoursEndTime()))) &&
            ((this.saturdayExtendedHoursStartTime==null && other.getSaturdayExtendedHoursStartTime()==null) || 
             (this.saturdayExtendedHoursStartTime!=null &&
              this.saturdayExtendedHoursStartTime.equals(other.getSaturdayExtendedHoursStartTime()))) &&
            ((this.saturdayExtendedHoursEndTime==null && other.getSaturdayExtendedHoursEndTime()==null) || 
             (this.saturdayExtendedHoursEndTime!=null &&
              this.saturdayExtendedHoursEndTime.equals(other.getSaturdayExtendedHoursEndTime())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
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
        if (getAdditionalAddressInfo() != null) {
            _hashCode += getAdditionalAddressInfo().hashCode();
        }
        if (getCountryID() != null) {
            _hashCode += getCountryID().hashCode();
        }
        if (getHolidaySetID() != null) {
            _hashCode += getHolidaySetID().hashCode();
        }
        if (getNoHoursOnHolidays() != null) {
            _hashCode += getNoHoursOnHolidays().hashCode();
        }
        if (get_default() != null) {
            _hashCode += get_default().hashCode();
        }
        if (getFirstDayOfWeek() != null) {
            _hashCode += getFirstDayOfWeek().hashCode();
        }
        if (getDateFormat() != null) {
            _hashCode += getDateFormat().hashCode();
        }
        if (getTimeFormat() != null) {
            _hashCode += getTimeFormat().hashCode();
        }
        if (getNumberFormat() != null) {
            _hashCode += getNumberFormat().hashCode();
        }
        if (getTimeZoneID() != null) {
            _hashCode += getTimeZoneID().hashCode();
        }
        if (getSundayBusinessHoursStartTime() != null) {
            _hashCode += getSundayBusinessHoursStartTime().hashCode();
        }
        if (getSundayBusinessHoursEndTime() != null) {
            _hashCode += getSundayBusinessHoursEndTime().hashCode();
        }
        if (getSundayExtendedHoursStartTime() != null) {
            _hashCode += getSundayExtendedHoursStartTime().hashCode();
        }
        if (getSundayExtendedHoursEndTime() != null) {
            _hashCode += getSundayExtendedHoursEndTime().hashCode();
        }
        if (getMondayBusinessHoursStartTime() != null) {
            _hashCode += getMondayBusinessHoursStartTime().hashCode();
        }
        if (getMondayBusinessHoursEndTime() != null) {
            _hashCode += getMondayBusinessHoursEndTime().hashCode();
        }
        if (getMondayExtendedHoursStartTime() != null) {
            _hashCode += getMondayExtendedHoursStartTime().hashCode();
        }
        if (getMondayExtendedHoursEndTime() != null) {
            _hashCode += getMondayExtendedHoursEndTime().hashCode();
        }
        if (getTuesdayBusinessHoursStartTime() != null) {
            _hashCode += getTuesdayBusinessHoursStartTime().hashCode();
        }
        if (getTuesdayBusinessHoursEndTime() != null) {
            _hashCode += getTuesdayBusinessHoursEndTime().hashCode();
        }
        if (getTuesdayExtendedHoursStartTime() != null) {
            _hashCode += getTuesdayExtendedHoursStartTime().hashCode();
        }
        if (getTuesdayExtendedHoursEndTime() != null) {
            _hashCode += getTuesdayExtendedHoursEndTime().hashCode();
        }
        if (getWednesdayBusinessHoursStartTime() != null) {
            _hashCode += getWednesdayBusinessHoursStartTime().hashCode();
        }
        if (getWednesdayBusinessHoursEndTime() != null) {
            _hashCode += getWednesdayBusinessHoursEndTime().hashCode();
        }
        if (getWednesdayExtendedHoursStartTime() != null) {
            _hashCode += getWednesdayExtendedHoursStartTime().hashCode();
        }
        if (getWednesdayExtendedHoursEndTime() != null) {
            _hashCode += getWednesdayExtendedHoursEndTime().hashCode();
        }
        if (getThursdayBusinessHoursStartTime() != null) {
            _hashCode += getThursdayBusinessHoursStartTime().hashCode();
        }
        if (getThursdayBusinessHoursEndTime() != null) {
            _hashCode += getThursdayBusinessHoursEndTime().hashCode();
        }
        if (getThursdayExtendedHoursStartTime() != null) {
            _hashCode += getThursdayExtendedHoursStartTime().hashCode();
        }
        if (getThursdayExtendedHoursEndTime() != null) {
            _hashCode += getThursdayExtendedHoursEndTime().hashCode();
        }
        if (getFridayBusinessHoursStartTime() != null) {
            _hashCode += getFridayBusinessHoursStartTime().hashCode();
        }
        if (getFridayBusinessHoursEndTime() != null) {
            _hashCode += getFridayBusinessHoursEndTime().hashCode();
        }
        if (getFridayExtendedHoursStartTime() != null) {
            _hashCode += getFridayExtendedHoursStartTime().hashCode();
        }
        if (getFridayExtendedHoursEndTime() != null) {
            _hashCode += getFridayExtendedHoursEndTime().hashCode();
        }
        if (getSaturdayBusinessHoursStartTime() != null) {
            _hashCode += getSaturdayBusinessHoursStartTime().hashCode();
        }
        if (getSaturdayBusinessHoursEndTime() != null) {
            _hashCode += getSaturdayBusinessHoursEndTime().hashCode();
        }
        if (getSaturdayExtendedHoursStartTime() != null) {
            _hashCode += getSaturdayExtendedHoursStartTime().hashCode();
        }
        if (getSaturdayExtendedHoursEndTime() != null) {
            _hashCode += getSaturdayExtendedHoursEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BusinessLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
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
        elemField.setFieldName("additionalAddressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdditionalAddressInfo"));
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
        elemField.setFieldName("holidaySetID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HolidaySetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noHoursOnHolidays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NoHoursOnHolidays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Default"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstDayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FirstDayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DateFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NumberFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayBusinessHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SundayBusinessHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayBusinessHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SundayBusinessHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayExtendedHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SundayExtendedHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayExtendedHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SundayExtendedHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mondayBusinessHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MondayBusinessHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mondayBusinessHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MondayBusinessHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mondayExtendedHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MondayExtendedHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mondayExtendedHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MondayExtendedHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayBusinessHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TuesdayBusinessHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayBusinessHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TuesdayBusinessHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayExtendedHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TuesdayExtendedHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayExtendedHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TuesdayExtendedHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayBusinessHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WednesdayBusinessHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayBusinessHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WednesdayBusinessHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayExtendedHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WednesdayExtendedHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayExtendedHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WednesdayExtendedHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursdayBusinessHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ThursdayBusinessHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursdayBusinessHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ThursdayBusinessHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursdayExtendedHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ThursdayExtendedHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursdayExtendedHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ThursdayExtendedHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fridayBusinessHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FridayBusinessHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fridayBusinessHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FridayBusinessHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fridayExtendedHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FridayExtendedHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fridayExtendedHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FridayExtendedHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayBusinessHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SaturdayBusinessHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayBusinessHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SaturdayBusinessHoursEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayExtendedHoursStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SaturdayExtendedHoursStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayExtendedHoursEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SaturdayExtendedHoursEndTime"));
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
