/* 
 * @(#)MmeLocationReport.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.subscriber;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangUInt32;

import com.tailf.jnc.YangBoolean;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/subscriber/mme-location-report"
 * <p>
 * See line 2694 in
 * scConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeLocationReport extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeLocationReport object.
     */
    public MmeLocationReport() {
        super(Epc.NAMESPACE, "mme-location-report");
    }

    /**
     * Constructor for an initialized MmeLocationReport object,
     * 
     * @param slnIdValue Key argument of child.
     */
    public MmeLocationReport(YangUInt32 slnIdValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-location-report");
        Leaf slnId = new Leaf(Epc.NAMESPACE, "sln-id");
        slnId.setValue(slnIdValue);
        insertChild(slnId, childrenNames());
    }

    /**
     * Constructor for an initialized MmeLocationReport object,
     * with String keys.
     * @param slnIdValue Key argument of child.
     */
    public MmeLocationReport(String slnIdValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-location-report");
        Leaf slnId = new Leaf(Epc.NAMESPACE, "sln-id");
        slnId.setValue(new YangUInt32(slnIdValue));
        insertChild(slnId, childrenNames());
    }

    /**
     * Constructor for an initialized MmeLocationReport object,
     * with keys of built in Java types.
     * @param slnIdValue Key argument of child.
     */
    public MmeLocationReport(long slnIdValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-location-report");
        Leaf slnId = new Leaf(Epc.NAMESPACE, "sln-id");
        slnId.setValue(new YangUInt32(slnIdValue));
        insertChild(slnId, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeLocationReport clone() {
        MmeLocationReport copy;
        try {
            copy = new MmeLocationReport(getSlnIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeLocationReport)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeLocationReport cloneShallow() {
        MmeLocationReport copy;
        try {
            copy = new MmeLocationReport(getSlnIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeLocationReport)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "sln-id",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "sln-id",
            "imsi",
            "imei",
            "imeisv",
            "page",
            "alarm",
            "end-time",
        };
    }

    /* Access methods for leaf child: "sln-id". */

    /**
     * Gets the value for child leaf "sln-id".
     * @return The value of the leaf.
     */
    public YangUInt32 getSlnIdValue() throws JNCException {
        return (YangUInt32)getValue("sln-id");
    }

    /**
     * Sets the value for child leaf "sln-id",
     * using instance of generated typedef class.
     * @param slnIdValue The value to set.
     * @param slnIdValue used during instantiation.
     */
    public void setSlnIdValue(YangUInt32 slnIdValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "sln-id",
            slnIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "sln-id",
     * using Java primitive values.
     * @param slnIdValue used during instantiation.
     */
    public void setSlnIdValue(long slnIdValue) throws JNCException {
        setSlnIdValue(new YangUInt32(slnIdValue));
    }

    /**
     * Sets the value for child leaf "sln-id",
     * using a String value.
     * @param slnIdValue used during instantiation.
     */
    public void setSlnIdValue(String slnIdValue) throws JNCException {
        setSlnIdValue(new YangUInt32(slnIdValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "sln-id" leaf will not have a value.
     */
    public void addSlnId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "sln-id",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "imsi". */

    /**
     * Gets the value for child leaf "imsi".
     * @return The value of the leaf.
     */
    public YangString getImsiValue() throws JNCException {
        return (YangString)getValue("imsi");
    }

    /**
     * Sets the value for child leaf "imsi",
     * using instance of generated typedef class.
     * @param imsiValue The value to set.
     * @param imsiValue used during instantiation.
     */
    public void setImsiValue(YangString imsiValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imsi",
            imsiValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "imsi",
     * using a String value.
     * @param imsiValue used during instantiation.
     */
    public void setImsiValue(String imsiValue) throws JNCException {
        setImsiValue(new YangString(imsiValue));
    }

    /**
     * Unsets the value for child leaf "imsi".
     */
    public void unsetImsiValue() throws JNCException {
        delete("imsi");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "imsi" leaf will not have a value.
     */
    public void addImsi() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imsi",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "imsi" with operation "replace".
     */
    public void markImsiReplace() throws JNCException {
        markLeafReplace("imsi");
    }

    /**
     * Marks the leaf "imsi" with operation "merge".
     */
    public void markImsiMerge() throws JNCException {
        markLeafMerge("imsi");
    }

    /**
     * Marks the leaf "imsi" with operation "create".
     */
    public void markImsiCreate() throws JNCException {
        markLeafCreate("imsi");
    }

    /**
     * Marks the leaf "imsi" with operation "delete".
     */
    public void markImsiDelete() throws JNCException {
        markLeafDelete("imsi");
    }

    /* Access methods for optional leaf child: "imei". */

    /**
     * Gets the value for child leaf "imei".
     * @return The value of the leaf.
     */
    public YangString getImeiValue() throws JNCException {
        return (YangString)getValue("imei");
    }

    /**
     * Sets the value for child leaf "imei",
     * using instance of generated typedef class.
     * @param imeiValue The value to set.
     * @param imeiValue used during instantiation.
     */
    public void setImeiValue(YangString imeiValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imei",
            imeiValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "imei",
     * using a String value.
     * @param imeiValue used during instantiation.
     */
    public void setImeiValue(String imeiValue) throws JNCException {
        setImeiValue(new YangString(imeiValue));
    }

    /**
     * Unsets the value for child leaf "imei".
     */
    public void unsetImeiValue() throws JNCException {
        delete("imei");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "imei" leaf will not have a value.
     */
    public void addImei() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imei",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "imei" with operation "replace".
     */
    public void markImeiReplace() throws JNCException {
        markLeafReplace("imei");
    }

    /**
     * Marks the leaf "imei" with operation "merge".
     */
    public void markImeiMerge() throws JNCException {
        markLeafMerge("imei");
    }

    /**
     * Marks the leaf "imei" with operation "create".
     */
    public void markImeiCreate() throws JNCException {
        markLeafCreate("imei");
    }

    /**
     * Marks the leaf "imei" with operation "delete".
     */
    public void markImeiDelete() throws JNCException {
        markLeafDelete("imei");
    }

    /* Access methods for optional leaf child: "imeisv". */

    /**
     * Gets the value for child leaf "imeisv".
     * @return The value of the leaf.
     */
    public YangString getImeisvValue() throws JNCException {
        return (YangString)getValue("imeisv");
    }

    /**
     * Sets the value for child leaf "imeisv",
     * using instance of generated typedef class.
     * @param imeisvValue The value to set.
     * @param imeisvValue used during instantiation.
     */
    public void setImeisvValue(YangString imeisvValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imeisv",
            imeisvValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "imeisv",
     * using a String value.
     * @param imeisvValue used during instantiation.
     */
    public void setImeisvValue(String imeisvValue) throws JNCException {
        setImeisvValue(new YangString(imeisvValue));
    }

    /**
     * Unsets the value for child leaf "imeisv".
     */
    public void unsetImeisvValue() throws JNCException {
        delete("imeisv");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "imeisv" leaf will not have a value.
     */
    public void addImeisv() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imeisv",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "imeisv" with operation "replace".
     */
    public void markImeisvReplace() throws JNCException {
        markLeafReplace("imeisv");
    }

    /**
     * Marks the leaf "imeisv" with operation "merge".
     */
    public void markImeisvMerge() throws JNCException {
        markLeafMerge("imeisv");
    }

    /**
     * Marks the leaf "imeisv" with operation "create".
     */
    public void markImeisvCreate() throws JNCException {
        markLeafCreate("imeisv");
    }

    /**
     * Marks the leaf "imeisv" with operation "delete".
     */
    public void markImeisvDelete() throws JNCException {
        markLeafDelete("imeisv");
    }

    /* Access methods for optional leaf child: "page". */

    /**
     * Gets the value for child leaf "page".
     * @return The value of the leaf.
     */
    public YangBoolean getPageValue() throws JNCException {
        YangBoolean page = (YangBoolean)getValue("page");
        if (page == null) {
            page = new YangBoolean("true");  // default
        }
        return page;
    }

    /**
     * Sets the value for child leaf "page",
     * using instance of generated typedef class.
     * @param pageValue The value to set.
     * @param pageValue used during instantiation.
     */
    public void setPageValue(YangBoolean pageValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "page",
            pageValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "page",
     * using Java primitive values.
     * @param pageValue used during instantiation.
     */
    public void setPageValue(Boolean pageValue) throws JNCException {
        setPageValue(new YangBoolean(pageValue));
    }

    /**
     * Sets the value for child leaf "page",
     * using a String value.
     * @param pageValue used during instantiation.
     */
    public void setPageValue(String pageValue) throws JNCException {
        setPageValue(new YangBoolean(pageValue));
    }

    /**
     * Unsets the value for child leaf "page".
     */
    public void unsetPageValue() throws JNCException {
        delete("page");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "page" leaf will not have a value.
     */
    public void addPage() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "page",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "page" with operation "replace".
     */
    public void markPageReplace() throws JNCException {
        markLeafReplace("page");
    }

    /**
     * Marks the leaf "page" with operation "merge".
     */
    public void markPageMerge() throws JNCException {
        markLeafMerge("page");
    }

    /**
     * Marks the leaf "page" with operation "create".
     */
    public void markPageCreate() throws JNCException {
        markLeafCreate("page");
    }

    /**
     * Marks the leaf "page" with operation "delete".
     */
    public void markPageDelete() throws JNCException {
        markLeafDelete("page");
    }

    /* Access methods for optional leaf child: "alarm". */

    /**
     * Gets the value for child leaf "alarm".
     * @return The value of the leaf.
     */
    public YangBoolean getAlarmValue() throws JNCException {
        YangBoolean alarm = (YangBoolean)getValue("alarm");
        if (alarm == null) {
            alarm = new YangBoolean("true");  // default
        }
        return alarm;
    }

    /**
     * Sets the value for child leaf "alarm",
     * using instance of generated typedef class.
     * @param alarmValue The value to set.
     * @param alarmValue used during instantiation.
     */
    public void setAlarmValue(YangBoolean alarmValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "alarm",
            alarmValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "alarm",
     * using Java primitive values.
     * @param alarmValue used during instantiation.
     */
    public void setAlarmValue(Boolean alarmValue) throws JNCException {
        setAlarmValue(new YangBoolean(alarmValue));
    }

    /**
     * Sets the value for child leaf "alarm",
     * using a String value.
     * @param alarmValue used during instantiation.
     */
    public void setAlarmValue(String alarmValue) throws JNCException {
        setAlarmValue(new YangBoolean(alarmValue));
    }

    /**
     * Unsets the value for child leaf "alarm".
     */
    public void unsetAlarmValue() throws JNCException {
        delete("alarm");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "alarm" leaf will not have a value.
     */
    public void addAlarm() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "alarm",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "alarm" with operation "replace".
     */
    public void markAlarmReplace() throws JNCException {
        markLeafReplace("alarm");
    }

    /**
     * Marks the leaf "alarm" with operation "merge".
     */
    public void markAlarmMerge() throws JNCException {
        markLeafMerge("alarm");
    }

    /**
     * Marks the leaf "alarm" with operation "create".
     */
    public void markAlarmCreate() throws JNCException {
        markLeafCreate("alarm");
    }

    /**
     * Marks the leaf "alarm" with operation "delete".
     */
    public void markAlarmDelete() throws JNCException {
        markLeafDelete("alarm");
    }

    /* Access methods for optional leaf child: "end-time". */

    /**
     * Gets the value for child leaf "end-time".
     * @return The value of the leaf.
     */
    public YangString getEndTimeValue() throws JNCException {
        return (YangString)getValue("end-time");
    }

    /**
     * Sets the value for child leaf "end-time",
     * using instance of generated typedef class.
     * @param endTimeValue The value to set.
     * @param endTimeValue used during instantiation.
     */
    public void setEndTimeValue(YangString endTimeValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "end-time",
            endTimeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "end-time",
     * using a String value.
     * @param endTimeValue used during instantiation.
     */
    public void setEndTimeValue(String endTimeValue) throws JNCException {
        setEndTimeValue(new YangString(endTimeValue));
    }

    /**
     * Unsets the value for child leaf "end-time".
     */
    public void unsetEndTimeValue() throws JNCException {
        delete("end-time");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "end-time" leaf will not have a value.
     */
    public void addEndTime() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "end-time",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "end-time" with operation "replace".
     */
    public void markEndTimeReplace() throws JNCException {
        markLeafReplace("endTime");
    }

    /**
     * Marks the leaf "end-time" with operation "merge".
     */
    public void markEndTimeMerge() throws JNCException {
        markLeafMerge("endTime");
    }

    /**
     * Marks the leaf "end-time" with operation "create".
     */
    public void markEndTimeCreate() throws JNCException {
        markLeafCreate("endTime");
    }

    /**
     * Marks the leaf "end-time" with operation "delete".
     */
    public void markEndTimeDelete() throws JNCException {
        markLeafDelete("endTime");
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
    }

}