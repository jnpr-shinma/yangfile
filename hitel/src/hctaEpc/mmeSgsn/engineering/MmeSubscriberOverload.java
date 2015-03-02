/* 
 * @(#)MmeSubscriberOverload.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.engineering;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/engineering/mme-subscriber-overload"
 * <p>
 * See line 1320 in
 * scConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeSubscriberOverload extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeSubscriberOverload object.
     */
    public MmeSubscriberOverload() {
        super(Epc.NAMESPACE, "mme-subscriber-overload");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeSubscriberOverload clone() {
        return (MmeSubscriberOverload)cloneContent(new MmeSubscriberOverload());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeSubscriberOverload cloneShallow() {
        return (MmeSubscriberOverload)cloneShallowContent(new MmeSubscriberOverload());
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return null;
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "minor-onset",
            "minor-abate",
            "minor-action",
            "minor-ovld",
            "major-onset",
            "major-abate",
            "major-action",
            "major-ovld",
            "critical-onset",
            "critical-abate",
            "critical-action",
            "critical-ovld",
        };
    }

    /* Access methods for optional leaf child: "minor-onset". */

    /**
     * Gets the value for child leaf "minor-onset".
     * @return The value of the leaf.
     */
    public YangUInt8 getMinorOnsetValue() throws JNCException {
        YangUInt8 minorOnset = (YangUInt8)getValue("minor-onset");
        if (minorOnset == null) {
            minorOnset = new YangUInt8("70");  // default
        }
        return minorOnset;
    }

    /**
     * Sets the value for child leaf "minor-onset",
     * using instance of generated typedef class.
     * @param minorOnsetValue The value to set.
     * @param minorOnsetValue used during instantiation.
     */
    public void setMinorOnsetValue(YangUInt8 minorOnsetValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "minor-onset",
            minorOnsetValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "minor-onset",
     * using Java primitive values.
     * @param minorOnsetValue used during instantiation.
     */
    public void setMinorOnsetValue(short minorOnsetValue) throws JNCException {
        setMinorOnsetValue(new YangUInt8(minorOnsetValue));
    }

    /**
     * Sets the value for child leaf "minor-onset",
     * using a String value.
     * @param minorOnsetValue used during instantiation.
     */
    public void setMinorOnsetValue(String minorOnsetValue) throws JNCException {
        setMinorOnsetValue(new YangUInt8(minorOnsetValue));
    }

    /**
     * Unsets the value for child leaf "minor-onset".
     */
    public void unsetMinorOnsetValue() throws JNCException {
        delete("minor-onset");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "minor-onset" leaf will not have a value.
     */
    public void addMinorOnset() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "minor-onset",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "minor-onset" with operation "replace".
     */
    public void markMinorOnsetReplace() throws JNCException {
        markLeafReplace("minorOnset");
    }

    /**
     * Marks the leaf "minor-onset" with operation "merge".
     */
    public void markMinorOnsetMerge() throws JNCException {
        markLeafMerge("minorOnset");
    }

    /**
     * Marks the leaf "minor-onset" with operation "create".
     */
    public void markMinorOnsetCreate() throws JNCException {
        markLeafCreate("minorOnset");
    }

    /**
     * Marks the leaf "minor-onset" with operation "delete".
     */
    public void markMinorOnsetDelete() throws JNCException {
        markLeafDelete("minorOnset");
    }

    /* Access methods for optional leaf child: "minor-abate". */

    /**
     * Gets the value for child leaf "minor-abate".
     * @return The value of the leaf.
     */
    public YangUInt8 getMinorAbateValue() throws JNCException {
        YangUInt8 minorAbate = (YangUInt8)getValue("minor-abate");
        if (minorAbate == null) {
            minorAbate = new YangUInt8("65");  // default
        }
        return minorAbate;
    }

    /**
     * Sets the value for child leaf "minor-abate",
     * using instance of generated typedef class.
     * @param minorAbateValue The value to set.
     * @param minorAbateValue used during instantiation.
     */
    public void setMinorAbateValue(YangUInt8 minorAbateValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "minor-abate",
            minorAbateValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "minor-abate",
     * using Java primitive values.
     * @param minorAbateValue used during instantiation.
     */
    public void setMinorAbateValue(short minorAbateValue) throws JNCException {
        setMinorAbateValue(new YangUInt8(minorAbateValue));
    }

    /**
     * Sets the value for child leaf "minor-abate",
     * using a String value.
     * @param minorAbateValue used during instantiation.
     */
    public void setMinorAbateValue(String minorAbateValue) throws JNCException {
        setMinorAbateValue(new YangUInt8(minorAbateValue));
    }

    /**
     * Unsets the value for child leaf "minor-abate".
     */
    public void unsetMinorAbateValue() throws JNCException {
        delete("minor-abate");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "minor-abate" leaf will not have a value.
     */
    public void addMinorAbate() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "minor-abate",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "minor-abate" with operation "replace".
     */
    public void markMinorAbateReplace() throws JNCException {
        markLeafReplace("minorAbate");
    }

    /**
     * Marks the leaf "minor-abate" with operation "merge".
     */
    public void markMinorAbateMerge() throws JNCException {
        markLeafMerge("minorAbate");
    }

    /**
     * Marks the leaf "minor-abate" with operation "create".
     */
    public void markMinorAbateCreate() throws JNCException {
        markLeafCreate("minorAbate");
    }

    /**
     * Marks the leaf "minor-abate" with operation "delete".
     */
    public void markMinorAbateDelete() throws JNCException {
        markLeafDelete("minorAbate");
    }

    /* Access methods for optional leaf child: "minor-action". */

    /**
     * Gets the value for child leaf "minor-action".
     * @return The value of the leaf.
     */
    public YangEnumeration getMinorActionValue() throws JNCException {
        YangEnumeration minorAction = (YangEnumeration)getValue("minor-action");
        if (minorAction == null) {
            minorAction = new YangEnumeration("reject-roamer-itau-irau", new String[] {  // default
                "none",
                "reject-roamer-attach",
                "reject-roamer-itau-irau",
                "reject-all-attach",
                "reject-all-itau-irau",
                "reject-roamer-inc-ho",
                "reject-all-s1-iu-inc-ho",
                "load-rebalancing-tau",
                "detach-idle-roamer",
                "detach-idle-ue",
                "detach-all-ue",
            });
        }
        return minorAction;
    }

    /**
     * Sets the value for child leaf "minor-action",
     * using instance of generated typedef class.
     * @param minorActionValue The value to set.
     * @param minorActionValue used during instantiation.
     */
    public void setMinorActionValue(YangEnumeration minorActionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "minor-action",
            minorActionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "minor-action",
     * using a String value.
     * @param minorActionValue used during instantiation.
     */
    public void setMinorActionValue(String minorActionValue)
            throws JNCException {
        setMinorActionValue(new YangEnumeration(minorActionValue, new String[] {
             "none",
             "reject-roamer-attach",
             "reject-roamer-itau-irau",
             "reject-all-attach",
             "reject-all-itau-irau",
             "reject-roamer-inc-ho",
             "reject-all-s1-iu-inc-ho",
             "load-rebalancing-tau",
             "detach-idle-roamer",
             "detach-idle-ue",
             "detach-all-ue",
        }));
    }

    /**
     * Unsets the value for child leaf "minor-action".
     */
    public void unsetMinorActionValue() throws JNCException {
        delete("minor-action");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "minor-action" leaf will not have a value.
     */
    public void addMinorAction() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "minor-action",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "minor-action" with operation "replace".
     */
    public void markMinorActionReplace() throws JNCException {
        markLeafReplace("minorAction");
    }

    /**
     * Marks the leaf "minor-action" with operation "merge".
     */
    public void markMinorActionMerge() throws JNCException {
        markLeafMerge("minorAction");
    }

    /**
     * Marks the leaf "minor-action" with operation "create".
     */
    public void markMinorActionCreate() throws JNCException {
        markLeafCreate("minorAction");
    }

    /**
     * Marks the leaf "minor-action" with operation "delete".
     */
    public void markMinorActionDelete() throws JNCException {
        markLeafDelete("minorAction");
    }

    /* Access methods for optional leaf child: "minor-ovld". */

    /**
     * Gets the value for child leaf "minor-ovld".
     * @return The value of the leaf.
     */
    public YangEnumeration getMinorOvldValue() throws JNCException {
        YangEnumeration minorOvld = (YangEnumeration)getValue("minor-ovld");
        if (minorOvld == null) {
            minorOvld = new YangEnumeration("enable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return minorOvld;
    }

    /**
     * Sets the value for child leaf "minor-ovld",
     * using instance of generated typedef class.
     * @param minorOvldValue The value to set.
     * @param minorOvldValue used during instantiation.
     */
    public void setMinorOvldValue(YangEnumeration minorOvldValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "minor-ovld",
            minorOvldValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "minor-ovld",
     * using a String value.
     * @param minorOvldValue used during instantiation.
     */
    public void setMinorOvldValue(String minorOvldValue) throws JNCException {
        setMinorOvldValue(new YangEnumeration(minorOvldValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "minor-ovld".
     */
    public void unsetMinorOvldValue() throws JNCException {
        delete("minor-ovld");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "minor-ovld" leaf will not have a value.
     */
    public void addMinorOvld() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "minor-ovld",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "minor-ovld" with operation "replace".
     */
    public void markMinorOvldReplace() throws JNCException {
        markLeafReplace("minorOvld");
    }

    /**
     * Marks the leaf "minor-ovld" with operation "merge".
     */
    public void markMinorOvldMerge() throws JNCException {
        markLeafMerge("minorOvld");
    }

    /**
     * Marks the leaf "minor-ovld" with operation "create".
     */
    public void markMinorOvldCreate() throws JNCException {
        markLeafCreate("minorOvld");
    }

    /**
     * Marks the leaf "minor-ovld" with operation "delete".
     */
    public void markMinorOvldDelete() throws JNCException {
        markLeafDelete("minorOvld");
    }

    /* Access methods for optional leaf child: "major-onset". */

    /**
     * Gets the value for child leaf "major-onset".
     * @return The value of the leaf.
     */
    public YangUInt8 getMajorOnsetValue() throws JNCException {
        YangUInt8 majorOnset = (YangUInt8)getValue("major-onset");
        if (majorOnset == null) {
            majorOnset = new YangUInt8("80");  // default
        }
        return majorOnset;
    }

    /**
     * Sets the value for child leaf "major-onset",
     * using instance of generated typedef class.
     * @param majorOnsetValue The value to set.
     * @param majorOnsetValue used during instantiation.
     */
    public void setMajorOnsetValue(YangUInt8 majorOnsetValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "major-onset",
            majorOnsetValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "major-onset",
     * using Java primitive values.
     * @param majorOnsetValue used during instantiation.
     */
    public void setMajorOnsetValue(short majorOnsetValue) throws JNCException {
        setMajorOnsetValue(new YangUInt8(majorOnsetValue));
    }

    /**
     * Sets the value for child leaf "major-onset",
     * using a String value.
     * @param majorOnsetValue used during instantiation.
     */
    public void setMajorOnsetValue(String majorOnsetValue) throws JNCException {
        setMajorOnsetValue(new YangUInt8(majorOnsetValue));
    }

    /**
     * Unsets the value for child leaf "major-onset".
     */
    public void unsetMajorOnsetValue() throws JNCException {
        delete("major-onset");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "major-onset" leaf will not have a value.
     */
    public void addMajorOnset() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "major-onset",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "major-onset" with operation "replace".
     */
    public void markMajorOnsetReplace() throws JNCException {
        markLeafReplace("majorOnset");
    }

    /**
     * Marks the leaf "major-onset" with operation "merge".
     */
    public void markMajorOnsetMerge() throws JNCException {
        markLeafMerge("majorOnset");
    }

    /**
     * Marks the leaf "major-onset" with operation "create".
     */
    public void markMajorOnsetCreate() throws JNCException {
        markLeafCreate("majorOnset");
    }

    /**
     * Marks the leaf "major-onset" with operation "delete".
     */
    public void markMajorOnsetDelete() throws JNCException {
        markLeafDelete("majorOnset");
    }

    /* Access methods for optional leaf child: "major-abate". */

    /**
     * Gets the value for child leaf "major-abate".
     * @return The value of the leaf.
     */
    public YangUInt8 getMajorAbateValue() throws JNCException {
        YangUInt8 majorAbate = (YangUInt8)getValue("major-abate");
        if (majorAbate == null) {
            majorAbate = new YangUInt8("75");  // default
        }
        return majorAbate;
    }

    /**
     * Sets the value for child leaf "major-abate",
     * using instance of generated typedef class.
     * @param majorAbateValue The value to set.
     * @param majorAbateValue used during instantiation.
     */
    public void setMajorAbateValue(YangUInt8 majorAbateValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "major-abate",
            majorAbateValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "major-abate",
     * using Java primitive values.
     * @param majorAbateValue used during instantiation.
     */
    public void setMajorAbateValue(short majorAbateValue) throws JNCException {
        setMajorAbateValue(new YangUInt8(majorAbateValue));
    }

    /**
     * Sets the value for child leaf "major-abate",
     * using a String value.
     * @param majorAbateValue used during instantiation.
     */
    public void setMajorAbateValue(String majorAbateValue) throws JNCException {
        setMajorAbateValue(new YangUInt8(majorAbateValue));
    }

    /**
     * Unsets the value for child leaf "major-abate".
     */
    public void unsetMajorAbateValue() throws JNCException {
        delete("major-abate");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "major-abate" leaf will not have a value.
     */
    public void addMajorAbate() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "major-abate",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "major-abate" with operation "replace".
     */
    public void markMajorAbateReplace() throws JNCException {
        markLeafReplace("majorAbate");
    }

    /**
     * Marks the leaf "major-abate" with operation "merge".
     */
    public void markMajorAbateMerge() throws JNCException {
        markLeafMerge("majorAbate");
    }

    /**
     * Marks the leaf "major-abate" with operation "create".
     */
    public void markMajorAbateCreate() throws JNCException {
        markLeafCreate("majorAbate");
    }

    /**
     * Marks the leaf "major-abate" with operation "delete".
     */
    public void markMajorAbateDelete() throws JNCException {
        markLeafDelete("majorAbate");
    }

    /* Access methods for optional leaf child: "major-action". */

    /**
     * Gets the value for child leaf "major-action".
     * @return The value of the leaf.
     */
    public YangEnumeration getMajorActionValue() throws JNCException {
        YangEnumeration majorAction = (YangEnumeration)getValue("major-action");
        if (majorAction == null) {
            majorAction = new YangEnumeration("reject-all-itau-irau", new String[] {  // default
                "none",
                "reject-roamer-attach",
                "reject-roamer-itau-irau",
                "reject-all-attach",
                "reject-all-itau-irau",
                "reject-roamer-inc-ho",
                "reject-all-s1-iu-inc-ho",
                "load-rebalancing-tau",
                "detach-idle-roamer",
                "detach-idle-ue",
                "detach-all-ue",
            });
        }
        return majorAction;
    }

    /**
     * Sets the value for child leaf "major-action",
     * using instance of generated typedef class.
     * @param majorActionValue The value to set.
     * @param majorActionValue used during instantiation.
     */
    public void setMajorActionValue(YangEnumeration majorActionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "major-action",
            majorActionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "major-action",
     * using a String value.
     * @param majorActionValue used during instantiation.
     */
    public void setMajorActionValue(String majorActionValue)
            throws JNCException {
        setMajorActionValue(new YangEnumeration(majorActionValue, new String[] {
             "none",
             "reject-roamer-attach",
             "reject-roamer-itau-irau",
             "reject-all-attach",
             "reject-all-itau-irau",
             "reject-roamer-inc-ho",
             "reject-all-s1-iu-inc-ho",
             "load-rebalancing-tau",
             "detach-idle-roamer",
             "detach-idle-ue",
             "detach-all-ue",
        }));
    }

    /**
     * Unsets the value for child leaf "major-action".
     */
    public void unsetMajorActionValue() throws JNCException {
        delete("major-action");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "major-action" leaf will not have a value.
     */
    public void addMajorAction() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "major-action",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "major-action" with operation "replace".
     */
    public void markMajorActionReplace() throws JNCException {
        markLeafReplace("majorAction");
    }

    /**
     * Marks the leaf "major-action" with operation "merge".
     */
    public void markMajorActionMerge() throws JNCException {
        markLeafMerge("majorAction");
    }

    /**
     * Marks the leaf "major-action" with operation "create".
     */
    public void markMajorActionCreate() throws JNCException {
        markLeafCreate("majorAction");
    }

    /**
     * Marks the leaf "major-action" with operation "delete".
     */
    public void markMajorActionDelete() throws JNCException {
        markLeafDelete("majorAction");
    }

    /* Access methods for optional leaf child: "major-ovld". */

    /**
     * Gets the value for child leaf "major-ovld".
     * @return The value of the leaf.
     */
    public YangEnumeration getMajorOvldValue() throws JNCException {
        YangEnumeration majorOvld = (YangEnumeration)getValue("major-ovld");
        if (majorOvld == null) {
            majorOvld = new YangEnumeration("enable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return majorOvld;
    }

    /**
     * Sets the value for child leaf "major-ovld",
     * using instance of generated typedef class.
     * @param majorOvldValue The value to set.
     * @param majorOvldValue used during instantiation.
     */
    public void setMajorOvldValue(YangEnumeration majorOvldValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "major-ovld",
            majorOvldValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "major-ovld",
     * using a String value.
     * @param majorOvldValue used during instantiation.
     */
    public void setMajorOvldValue(String majorOvldValue) throws JNCException {
        setMajorOvldValue(new YangEnumeration(majorOvldValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "major-ovld".
     */
    public void unsetMajorOvldValue() throws JNCException {
        delete("major-ovld");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "major-ovld" leaf will not have a value.
     */
    public void addMajorOvld() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "major-ovld",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "major-ovld" with operation "replace".
     */
    public void markMajorOvldReplace() throws JNCException {
        markLeafReplace("majorOvld");
    }

    /**
     * Marks the leaf "major-ovld" with operation "merge".
     */
    public void markMajorOvldMerge() throws JNCException {
        markLeafMerge("majorOvld");
    }

    /**
     * Marks the leaf "major-ovld" with operation "create".
     */
    public void markMajorOvldCreate() throws JNCException {
        markLeafCreate("majorOvld");
    }

    /**
     * Marks the leaf "major-ovld" with operation "delete".
     */
    public void markMajorOvldDelete() throws JNCException {
        markLeafDelete("majorOvld");
    }

    /* Access methods for optional leaf child: "critical-onset". */

    /**
     * Gets the value for child leaf "critical-onset".
     * @return The value of the leaf.
     */
    public YangUInt8 getCriticalOnsetValue() throws JNCException {
        YangUInt8 criticalOnset = (YangUInt8)getValue("critical-onset");
        if (criticalOnset == null) {
            criticalOnset = new YangUInt8("90");  // default
        }
        return criticalOnset;
    }

    /**
     * Sets the value for child leaf "critical-onset",
     * using instance of generated typedef class.
     * @param criticalOnsetValue The value to set.
     * @param criticalOnsetValue used during instantiation.
     */
    public void setCriticalOnsetValue(YangUInt8 criticalOnsetValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "critical-onset",
            criticalOnsetValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "critical-onset",
     * using Java primitive values.
     * @param criticalOnsetValue used during instantiation.
     */
    public void setCriticalOnsetValue(short criticalOnsetValue)
            throws JNCException {
        setCriticalOnsetValue(new YangUInt8(criticalOnsetValue));
    }

    /**
     * Sets the value for child leaf "critical-onset",
     * using a String value.
     * @param criticalOnsetValue used during instantiation.
     */
    public void setCriticalOnsetValue(String criticalOnsetValue)
            throws JNCException {
        setCriticalOnsetValue(new YangUInt8(criticalOnsetValue));
    }

    /**
     * Unsets the value for child leaf "critical-onset".
     */
    public void unsetCriticalOnsetValue() throws JNCException {
        delete("critical-onset");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "critical-onset" leaf will not have a value.
     */
    public void addCriticalOnset() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "critical-onset",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "critical-onset" with operation "replace".
     */
    public void markCriticalOnsetReplace() throws JNCException {
        markLeafReplace("criticalOnset");
    }

    /**
     * Marks the leaf "critical-onset" with operation "merge".
     */
    public void markCriticalOnsetMerge() throws JNCException {
        markLeafMerge("criticalOnset");
    }

    /**
     * Marks the leaf "critical-onset" with operation "create".
     */
    public void markCriticalOnsetCreate() throws JNCException {
        markLeafCreate("criticalOnset");
    }

    /**
     * Marks the leaf "critical-onset" with operation "delete".
     */
    public void markCriticalOnsetDelete() throws JNCException {
        markLeafDelete("criticalOnset");
    }

    /* Access methods for optional leaf child: "critical-abate". */

    /**
     * Gets the value for child leaf "critical-abate".
     * @return The value of the leaf.
     */
    public YangUInt8 getCriticalAbateValue() throws JNCException {
        YangUInt8 criticalAbate = (YangUInt8)getValue("critical-abate");
        if (criticalAbate == null) {
            criticalAbate = new YangUInt8("85");  // default
        }
        return criticalAbate;
    }

    /**
     * Sets the value for child leaf "critical-abate",
     * using instance of generated typedef class.
     * @param criticalAbateValue The value to set.
     * @param criticalAbateValue used during instantiation.
     */
    public void setCriticalAbateValue(YangUInt8 criticalAbateValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "critical-abate",
            criticalAbateValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "critical-abate",
     * using Java primitive values.
     * @param criticalAbateValue used during instantiation.
     */
    public void setCriticalAbateValue(short criticalAbateValue)
            throws JNCException {
        setCriticalAbateValue(new YangUInt8(criticalAbateValue));
    }

    /**
     * Sets the value for child leaf "critical-abate",
     * using a String value.
     * @param criticalAbateValue used during instantiation.
     */
    public void setCriticalAbateValue(String criticalAbateValue)
            throws JNCException {
        setCriticalAbateValue(new YangUInt8(criticalAbateValue));
    }

    /**
     * Unsets the value for child leaf "critical-abate".
     */
    public void unsetCriticalAbateValue() throws JNCException {
        delete("critical-abate");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "critical-abate" leaf will not have a value.
     */
    public void addCriticalAbate() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "critical-abate",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "critical-abate" with operation "replace".
     */
    public void markCriticalAbateReplace() throws JNCException {
        markLeafReplace("criticalAbate");
    }

    /**
     * Marks the leaf "critical-abate" with operation "merge".
     */
    public void markCriticalAbateMerge() throws JNCException {
        markLeafMerge("criticalAbate");
    }

    /**
     * Marks the leaf "critical-abate" with operation "create".
     */
    public void markCriticalAbateCreate() throws JNCException {
        markLeafCreate("criticalAbate");
    }

    /**
     * Marks the leaf "critical-abate" with operation "delete".
     */
    public void markCriticalAbateDelete() throws JNCException {
        markLeafDelete("criticalAbate");
    }

    /* Access methods for optional leaf child: "critical-action". */

    /**
     * Gets the value for child leaf "critical-action".
     * @return The value of the leaf.
     */
    public YangEnumeration getCriticalActionValue() throws JNCException {
        YangEnumeration criticalAction = (YangEnumeration)getValue("critical-action");
        if (criticalAction == null) {
            criticalAction = new YangEnumeration("reject-all-s1-iu-inc-ho", new String[] {  // default
                "none",
                "reject-roamer-attach",
                "reject-roamer-itau-irau",
                "reject-all-attach",
                "reject-all-itau-irau",
                "reject-roamer-inc-ho",
                "reject-all-s1-iu-inc-ho",
                "load-rebalancing-tau",
                "detach-idle-roamer",
                "detach-idle-ue",
                "detach-all-ue",
            });
        }
        return criticalAction;
    }

    /**
     * Sets the value for child leaf "critical-action",
     * using instance of generated typedef class.
     * @param criticalActionValue The value to set.
     * @param criticalActionValue used during instantiation.
     */
    public void setCriticalActionValue(YangEnumeration criticalActionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "critical-action",
            criticalActionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "critical-action",
     * using a String value.
     * @param criticalActionValue used during instantiation.
     */
    public void setCriticalActionValue(String criticalActionValue)
            throws JNCException {
        setCriticalActionValue(new YangEnumeration(criticalActionValue, new String[] {
             "none",
             "reject-roamer-attach",
             "reject-roamer-itau-irau",
             "reject-all-attach",
             "reject-all-itau-irau",
             "reject-roamer-inc-ho",
             "reject-all-s1-iu-inc-ho",
             "load-rebalancing-tau",
             "detach-idle-roamer",
             "detach-idle-ue",
             "detach-all-ue",
        }));
    }

    /**
     * Unsets the value for child leaf "critical-action".
     */
    public void unsetCriticalActionValue() throws JNCException {
        delete("critical-action");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "critical-action" leaf will not have a value.
     */
    public void addCriticalAction() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "critical-action",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "critical-action" with operation "replace".
     */
    public void markCriticalActionReplace() throws JNCException {
        markLeafReplace("criticalAction");
    }

    /**
     * Marks the leaf "critical-action" with operation "merge".
     */
    public void markCriticalActionMerge() throws JNCException {
        markLeafMerge("criticalAction");
    }

    /**
     * Marks the leaf "critical-action" with operation "create".
     */
    public void markCriticalActionCreate() throws JNCException {
        markLeafCreate("criticalAction");
    }

    /**
     * Marks the leaf "critical-action" with operation "delete".
     */
    public void markCriticalActionDelete() throws JNCException {
        markLeafDelete("criticalAction");
    }

    /* Access methods for optional leaf child: "critical-ovld". */

    /**
     * Gets the value for child leaf "critical-ovld".
     * @return The value of the leaf.
     */
    public YangEnumeration getCriticalOvldValue() throws JNCException {
        YangEnumeration criticalOvld = (YangEnumeration)getValue("critical-ovld");
        if (criticalOvld == null) {
            criticalOvld = new YangEnumeration("enable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return criticalOvld;
    }

    /**
     * Sets the value for child leaf "critical-ovld",
     * using instance of generated typedef class.
     * @param criticalOvldValue The value to set.
     * @param criticalOvldValue used during instantiation.
     */
    public void setCriticalOvldValue(YangEnumeration criticalOvldValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "critical-ovld",
            criticalOvldValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "critical-ovld",
     * using a String value.
     * @param criticalOvldValue used during instantiation.
     */
    public void setCriticalOvldValue(String criticalOvldValue)
            throws JNCException {
        setCriticalOvldValue(new YangEnumeration(criticalOvldValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "critical-ovld".
     */
    public void unsetCriticalOvldValue() throws JNCException {
        delete("critical-ovld");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "critical-ovld" leaf will not have a value.
     */
    public void addCriticalOvld() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "critical-ovld",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "critical-ovld" with operation "replace".
     */
    public void markCriticalOvldReplace() throws JNCException {
        markLeafReplace("criticalOvld");
    }

    /**
     * Marks the leaf "critical-ovld" with operation "merge".
     */
    public void markCriticalOvldMerge() throws JNCException {
        markLeafMerge("criticalOvld");
    }

    /**
     * Marks the leaf "critical-ovld" with operation "create".
     */
    public void markCriticalOvldCreate() throws JNCException {
        markLeafCreate("criticalOvld");
    }

    /**
     * Marks the leaf "critical-ovld" with operation "delete".
     */
    public void markCriticalOvldDelete() throws JNCException {
        markLeafDelete("criticalOvld");
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
