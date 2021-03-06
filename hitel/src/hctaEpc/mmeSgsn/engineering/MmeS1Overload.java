/* 
 * @(#)MmeS1Overload.java        1.0 09/12/14
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
import com.tailf.jnc.YangUInt16;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/engineering/mme-s1-overload"
 * <p>
 * See line 721 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeS1Overload extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeS1Overload object.
     */
    public MmeS1Overload() {
        super(Epc.NAMESPACE, "mme-s1-overload");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeS1Overload clone() {
        return (MmeS1Overload)cloneContent(new MmeS1Overload());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeS1Overload cloneShallow() {
        return (MmeS1Overload)cloneShallowContent(new MmeS1Overload());
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
            "zero-rel-cap-subs-trigger",
            "zero-rel-cap-cong-trigger",
            "zero-rel-cap-duration",
            "ovld-start-impact",
            "ovld-start-duration",
            "ovld-start-minor-cause",
            "ovld-start-major-cause",
            "ovld-start-critical-cause",
        };
    }

    /* Access methods for optional leaf child: "zero-rel-cap-subs-trigger". */

    /**
     * Gets the value for child leaf "zero-rel-cap-subs-trigger".
     * @return The value of the leaf.
     */
    public YangEnumeration getZeroRelCapSubsTriggerValue() throws JNCException {
        YangEnumeration zeroRelCapSubsTrigger = (YangEnumeration)getValue("zero-rel-cap-subs-trigger");
        if (zeroRelCapSubsTrigger == null) {
            zeroRelCapSubsTrigger = new YangEnumeration("sub-ovld-major", new String[] {  // default
                "disable",
                "sub-ovld-minor",
                "sub-ovld-major",
                "sub-ovld-critical",
            });
        }
        return zeroRelCapSubsTrigger;
    }

    /**
     * Sets the value for child leaf "zero-rel-cap-subs-trigger",
     * using instance of generated typedef class.
     * @param zeroRelCapSubsTriggerValue The value to set.
     * @param zeroRelCapSubsTriggerValue used during instantiation.
     */
    public void setZeroRelCapSubsTriggerValue(YangEnumeration zeroRelCapSubsTriggerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "zero-rel-cap-subs-trigger",
            zeroRelCapSubsTriggerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "zero-rel-cap-subs-trigger",
     * using a String value.
     * @param zeroRelCapSubsTriggerValue used during instantiation.
     */
    public void setZeroRelCapSubsTriggerValue(String zeroRelCapSubsTriggerValue)
            throws JNCException {
        setZeroRelCapSubsTriggerValue(new YangEnumeration(zeroRelCapSubsTriggerValue, new String[] {
             "disable",
             "sub-ovld-minor",
             "sub-ovld-major",
             "sub-ovld-critical",
        }));
    }

    /**
     * Unsets the value for child leaf "zero-rel-cap-subs-trigger".
     */
    public void unsetZeroRelCapSubsTriggerValue() throws JNCException {
        delete("zero-rel-cap-subs-trigger");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "zero-rel-cap-subs-trigger" leaf will not have a value.
     */
    public void addZeroRelCapSubsTrigger() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "zero-rel-cap-subs-trigger",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "zero-rel-cap-subs-trigger" with operation "replace".
     */
    public void markZeroRelCapSubsTriggerReplace() throws JNCException {
        markLeafReplace("zeroRelCapSubsTrigger");
    }

    /**
     * Marks the leaf "zero-rel-cap-subs-trigger" with operation "merge".
     */
    public void markZeroRelCapSubsTriggerMerge() throws JNCException {
        markLeafMerge("zeroRelCapSubsTrigger");
    }

    /**
     * Marks the leaf "zero-rel-cap-subs-trigger" with operation "create".
     */
    public void markZeroRelCapSubsTriggerCreate() throws JNCException {
        markLeafCreate("zeroRelCapSubsTrigger");
    }

    /**
     * Marks the leaf "zero-rel-cap-subs-trigger" with operation "delete".
     */
    public void markZeroRelCapSubsTriggerDelete() throws JNCException {
        markLeafDelete("zeroRelCapSubsTrigger");
    }

    /* Access methods for optional leaf child: "zero-rel-cap-cong-trigger". */

    /**
     * Gets the value for child leaf "zero-rel-cap-cong-trigger".
     * @return The value of the leaf.
     */
    public YangEnumeration getZeroRelCapCongTriggerValue() throws JNCException {
        YangEnumeration zeroRelCapCongTrigger = (YangEnumeration)getValue("zero-rel-cap-cong-trigger");
        if (zeroRelCapCongTrigger == null) {
            zeroRelCapCongTrigger = new YangEnumeration("congestion-minor", new String[] {  // default
                "disable",
                "congestion-minor",
                "congestion-major",
                "congestion-critical",
            });
        }
        return zeroRelCapCongTrigger;
    }

    /**
     * Sets the value for child leaf "zero-rel-cap-cong-trigger",
     * using instance of generated typedef class.
     * @param zeroRelCapCongTriggerValue The value to set.
     * @param zeroRelCapCongTriggerValue used during instantiation.
     */
    public void setZeroRelCapCongTriggerValue(YangEnumeration zeroRelCapCongTriggerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "zero-rel-cap-cong-trigger",
            zeroRelCapCongTriggerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "zero-rel-cap-cong-trigger",
     * using a String value.
     * @param zeroRelCapCongTriggerValue used during instantiation.
     */
    public void setZeroRelCapCongTriggerValue(String zeroRelCapCongTriggerValue)
            throws JNCException {
        setZeroRelCapCongTriggerValue(new YangEnumeration(zeroRelCapCongTriggerValue, new String[] {
             "disable",
             "congestion-minor",
             "congestion-major",
             "congestion-critical",
        }));
    }

    /**
     * Unsets the value for child leaf "zero-rel-cap-cong-trigger".
     */
    public void unsetZeroRelCapCongTriggerValue() throws JNCException {
        delete("zero-rel-cap-cong-trigger");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "zero-rel-cap-cong-trigger" leaf will not have a value.
     */
    public void addZeroRelCapCongTrigger() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "zero-rel-cap-cong-trigger",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "zero-rel-cap-cong-trigger" with operation "replace".
     */
    public void markZeroRelCapCongTriggerReplace() throws JNCException {
        markLeafReplace("zeroRelCapCongTrigger");
    }

    /**
     * Marks the leaf "zero-rel-cap-cong-trigger" with operation "merge".
     */
    public void markZeroRelCapCongTriggerMerge() throws JNCException {
        markLeafMerge("zeroRelCapCongTrigger");
    }

    /**
     * Marks the leaf "zero-rel-cap-cong-trigger" with operation "create".
     */
    public void markZeroRelCapCongTriggerCreate() throws JNCException {
        markLeafCreate("zeroRelCapCongTrigger");
    }

    /**
     * Marks the leaf "zero-rel-cap-cong-trigger" with operation "delete".
     */
    public void markZeroRelCapCongTriggerDelete() throws JNCException {
        markLeafDelete("zeroRelCapCongTrigger");
    }

    /* Access methods for optional leaf child: "zero-rel-cap-duration". */

    /**
     * Gets the value for child leaf "zero-rel-cap-duration".
     * @return The value of the leaf.
     */
    public YangUInt16 getZeroRelCapDurationValue() throws JNCException {
        YangUInt16 zeroRelCapDuration = (YangUInt16)getValue("zero-rel-cap-duration");
        if (zeroRelCapDuration == null) {
            zeroRelCapDuration = new YangUInt16("10");  // default
        }
        return zeroRelCapDuration;
    }

    /**
     * Sets the value for child leaf "zero-rel-cap-duration",
     * using instance of generated typedef class.
     * @param zeroRelCapDurationValue The value to set.
     * @param zeroRelCapDurationValue used during instantiation.
     */
    public void setZeroRelCapDurationValue(YangUInt16 zeroRelCapDurationValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "zero-rel-cap-duration",
            zeroRelCapDurationValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "zero-rel-cap-duration",
     * using Java primitive values.
     * @param zeroRelCapDurationValue used during instantiation.
     */
    public void setZeroRelCapDurationValue(int zeroRelCapDurationValue)
            throws JNCException {
        setZeroRelCapDurationValue(new YangUInt16(zeroRelCapDurationValue));
    }

    /**
     * Sets the value for child leaf "zero-rel-cap-duration",
     * using a String value.
     * @param zeroRelCapDurationValue used during instantiation.
     */
    public void setZeroRelCapDurationValue(String zeroRelCapDurationValue)
            throws JNCException {
        setZeroRelCapDurationValue(new YangUInt16(zeroRelCapDurationValue));
    }

    /**
     * Unsets the value for child leaf "zero-rel-cap-duration".
     */
    public void unsetZeroRelCapDurationValue() throws JNCException {
        delete("zero-rel-cap-duration");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "zero-rel-cap-duration" leaf will not have a value.
     */
    public void addZeroRelCapDuration() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "zero-rel-cap-duration",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "zero-rel-cap-duration" with operation "replace".
     */
    public void markZeroRelCapDurationReplace() throws JNCException {
        markLeafReplace("zeroRelCapDuration");
    }

    /**
     * Marks the leaf "zero-rel-cap-duration" with operation "merge".
     */
    public void markZeroRelCapDurationMerge() throws JNCException {
        markLeafMerge("zeroRelCapDuration");
    }

    /**
     * Marks the leaf "zero-rel-cap-duration" with operation "create".
     */
    public void markZeroRelCapDurationCreate() throws JNCException {
        markLeafCreate("zeroRelCapDuration");
    }

    /**
     * Marks the leaf "zero-rel-cap-duration" with operation "delete".
     */
    public void markZeroRelCapDurationDelete() throws JNCException {
        markLeafDelete("zeroRelCapDuration");
    }

    /* Access methods for optional leaf child: "ovld-start-impact". */

    /**
     * Gets the value for child leaf "ovld-start-impact".
     * @return The value of the leaf.
     */
    public YangUInt8 getOvldStartImpactValue() throws JNCException {
        YangUInt8 ovldStartImpact = (YangUInt8)getValue("ovld-start-impact");
        if (ovldStartImpact == null) {
            ovldStartImpact = new YangUInt8("10");  // default
        }
        return ovldStartImpact;
    }

    /**
     * Sets the value for child leaf "ovld-start-impact",
     * using instance of generated typedef class.
     * @param ovldStartImpactValue The value to set.
     * @param ovldStartImpactValue used during instantiation.
     */
    public void setOvldStartImpactValue(YangUInt8 ovldStartImpactValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-impact",
            ovldStartImpactValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ovld-start-impact",
     * using Java primitive values.
     * @param ovldStartImpactValue used during instantiation.
     */
    public void setOvldStartImpactValue(short ovldStartImpactValue)
            throws JNCException {
        setOvldStartImpactValue(new YangUInt8(ovldStartImpactValue));
    }

    /**
     * Sets the value for child leaf "ovld-start-impact",
     * using a String value.
     * @param ovldStartImpactValue used during instantiation.
     */
    public void setOvldStartImpactValue(String ovldStartImpactValue)
            throws JNCException {
        setOvldStartImpactValue(new YangUInt8(ovldStartImpactValue));
    }

    /**
     * Unsets the value for child leaf "ovld-start-impact".
     */
    public void unsetOvldStartImpactValue() throws JNCException {
        delete("ovld-start-impact");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ovld-start-impact" leaf will not have a value.
     */
    public void addOvldStartImpact() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-impact",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ovld-start-impact" with operation "replace".
     */
    public void markOvldStartImpactReplace() throws JNCException {
        markLeafReplace("ovldStartImpact");
    }

    /**
     * Marks the leaf "ovld-start-impact" with operation "merge".
     */
    public void markOvldStartImpactMerge() throws JNCException {
        markLeafMerge("ovldStartImpact");
    }

    /**
     * Marks the leaf "ovld-start-impact" with operation "create".
     */
    public void markOvldStartImpactCreate() throws JNCException {
        markLeafCreate("ovldStartImpact");
    }

    /**
     * Marks the leaf "ovld-start-impact" with operation "delete".
     */
    public void markOvldStartImpactDelete() throws JNCException {
        markLeafDelete("ovldStartImpact");
    }

    /* Access methods for optional leaf child: "ovld-start-duration". */

    /**
     * Gets the value for child leaf "ovld-start-duration".
     * @return The value of the leaf.
     */
    public YangUInt16 getOvldStartDurationValue() throws JNCException {
        YangUInt16 ovldStartDuration = (YangUInt16)getValue("ovld-start-duration");
        if (ovldStartDuration == null) {
            ovldStartDuration = new YangUInt16("10");  // default
        }
        return ovldStartDuration;
    }

    /**
     * Sets the value for child leaf "ovld-start-duration",
     * using instance of generated typedef class.
     * @param ovldStartDurationValue The value to set.
     * @param ovldStartDurationValue used during instantiation.
     */
    public void setOvldStartDurationValue(YangUInt16 ovldStartDurationValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-duration",
            ovldStartDurationValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ovld-start-duration",
     * using Java primitive values.
     * @param ovldStartDurationValue used during instantiation.
     */
    public void setOvldStartDurationValue(int ovldStartDurationValue)
            throws JNCException {
        setOvldStartDurationValue(new YangUInt16(ovldStartDurationValue));
    }

    /**
     * Sets the value for child leaf "ovld-start-duration",
     * using a String value.
     * @param ovldStartDurationValue used during instantiation.
     */
    public void setOvldStartDurationValue(String ovldStartDurationValue)
            throws JNCException {
        setOvldStartDurationValue(new YangUInt16(ovldStartDurationValue));
    }

    /**
     * Unsets the value for child leaf "ovld-start-duration".
     */
    public void unsetOvldStartDurationValue() throws JNCException {
        delete("ovld-start-duration");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ovld-start-duration" leaf will not have a value.
     */
    public void addOvldStartDuration() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-duration",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ovld-start-duration" with operation "replace".
     */
    public void markOvldStartDurationReplace() throws JNCException {
        markLeafReplace("ovldStartDuration");
    }

    /**
     * Marks the leaf "ovld-start-duration" with operation "merge".
     */
    public void markOvldStartDurationMerge() throws JNCException {
        markLeafMerge("ovldStartDuration");
    }

    /**
     * Marks the leaf "ovld-start-duration" with operation "create".
     */
    public void markOvldStartDurationCreate() throws JNCException {
        markLeafCreate("ovldStartDuration");
    }

    /**
     * Marks the leaf "ovld-start-duration" with operation "delete".
     */
    public void markOvldStartDurationDelete() throws JNCException {
        markLeafDelete("ovldStartDuration");
    }

    /* Access methods for optional leaf child: "ovld-start-minor-cause". */

    /**
     * Gets the value for child leaf "ovld-start-minor-cause".
     * @return The value of the leaf.
     */
    public YangEnumeration getOvldStartMinorCauseValue() throws JNCException {
        YangEnumeration ovldStartMinorCause = (YangEnumeration)getValue("ovld-start-minor-cause");
        if (ovldStartMinorCause == null) {
            ovldStartMinorCause = new YangEnumeration("mps-mt-services-only", new String[] {  // default
                "disable",
                "no-rrc-for-non-emg-modt",
                "no-rrc-for-non-emg-sig",
                "emg-only",
                "mps-mt-services-only",
                "prio-sess-mt-srvc-only",
                "no-del-tol-access",
            });
        }
        return ovldStartMinorCause;
    }

    /**
     * Sets the value for child leaf "ovld-start-minor-cause",
     * using instance of generated typedef class.
     * @param ovldStartMinorCauseValue The value to set.
     * @param ovldStartMinorCauseValue used during instantiation.
     */
    public void setOvldStartMinorCauseValue(YangEnumeration ovldStartMinorCauseValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-minor-cause",
            ovldStartMinorCauseValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ovld-start-minor-cause",
     * using a String value.
     * @param ovldStartMinorCauseValue used during instantiation.
     */
    public void setOvldStartMinorCauseValue(String ovldStartMinorCauseValue)
            throws JNCException {
        setOvldStartMinorCauseValue(new YangEnumeration(ovldStartMinorCauseValue, new String[] {
             "disable",
             "no-rrc-for-non-emg-modt",
             "no-rrc-for-non-emg-sig",
             "emg-only",
             "mps-mt-services-only",
             "prio-sess-mt-srvc-only",
             "no-del-tol-access",
        }));
    }

    /**
     * Unsets the value for child leaf "ovld-start-minor-cause".
     */
    public void unsetOvldStartMinorCauseValue() throws JNCException {
        delete("ovld-start-minor-cause");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ovld-start-minor-cause" leaf will not have a value.
     */
    public void addOvldStartMinorCause() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-minor-cause",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ovld-start-minor-cause" with operation "replace".
     */
    public void markOvldStartMinorCauseReplace() throws JNCException {
        markLeafReplace("ovldStartMinorCause");
    }

    /**
     * Marks the leaf "ovld-start-minor-cause" with operation "merge".
     */
    public void markOvldStartMinorCauseMerge() throws JNCException {
        markLeafMerge("ovldStartMinorCause");
    }

    /**
     * Marks the leaf "ovld-start-minor-cause" with operation "create".
     */
    public void markOvldStartMinorCauseCreate() throws JNCException {
        markLeafCreate("ovldStartMinorCause");
    }

    /**
     * Marks the leaf "ovld-start-minor-cause" with operation "delete".
     */
    public void markOvldStartMinorCauseDelete() throws JNCException {
        markLeafDelete("ovldStartMinorCause");
    }

    /* Access methods for optional leaf child: "ovld-start-major-cause". */

    /**
     * Gets the value for child leaf "ovld-start-major-cause".
     * @return The value of the leaf.
     */
    public YangEnumeration getOvldStartMajorCauseValue() throws JNCException {
        YangEnumeration ovldStartMajorCause = (YangEnumeration)getValue("ovld-start-major-cause");
        if (ovldStartMajorCause == null) {
            ovldStartMajorCause = new YangEnumeration("mps-mt-services-only", new String[] {  // default
                "disable",
                "no-rrc-for-non-emg-modt",
                "no-rrc-for-non-emg-sig",
                "emg-only",
                "mps-mt-services-only",
                "prio-sess-mt-srvc-only",
                "no-del-tol-access",
            });
        }
        return ovldStartMajorCause;
    }

    /**
     * Sets the value for child leaf "ovld-start-major-cause",
     * using instance of generated typedef class.
     * @param ovldStartMajorCauseValue The value to set.
     * @param ovldStartMajorCauseValue used during instantiation.
     */
    public void setOvldStartMajorCauseValue(YangEnumeration ovldStartMajorCauseValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-major-cause",
            ovldStartMajorCauseValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ovld-start-major-cause",
     * using a String value.
     * @param ovldStartMajorCauseValue used during instantiation.
     */
    public void setOvldStartMajorCauseValue(String ovldStartMajorCauseValue)
            throws JNCException {
        setOvldStartMajorCauseValue(new YangEnumeration(ovldStartMajorCauseValue, new String[] {
             "disable",
             "no-rrc-for-non-emg-modt",
             "no-rrc-for-non-emg-sig",
             "emg-only",
             "mps-mt-services-only",
             "prio-sess-mt-srvc-only",
             "no-del-tol-access",
        }));
    }

    /**
     * Unsets the value for child leaf "ovld-start-major-cause".
     */
    public void unsetOvldStartMajorCauseValue() throws JNCException {
        delete("ovld-start-major-cause");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ovld-start-major-cause" leaf will not have a value.
     */
    public void addOvldStartMajorCause() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-major-cause",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ovld-start-major-cause" with operation "replace".
     */
    public void markOvldStartMajorCauseReplace() throws JNCException {
        markLeafReplace("ovldStartMajorCause");
    }

    /**
     * Marks the leaf "ovld-start-major-cause" with operation "merge".
     */
    public void markOvldStartMajorCauseMerge() throws JNCException {
        markLeafMerge("ovldStartMajorCause");
    }

    /**
     * Marks the leaf "ovld-start-major-cause" with operation "create".
     */
    public void markOvldStartMajorCauseCreate() throws JNCException {
        markLeafCreate("ovldStartMajorCause");
    }

    /**
     * Marks the leaf "ovld-start-major-cause" with operation "delete".
     */
    public void markOvldStartMajorCauseDelete() throws JNCException {
        markLeafDelete("ovldStartMajorCause");
    }

    /* Access methods for optional leaf child: "ovld-start-critical-cause". */

    /**
     * Gets the value for child leaf "ovld-start-critical-cause".
     * @return The value of the leaf.
     */
    public YangEnumeration getOvldStartCriticalCauseValue() throws JNCException {
        YangEnumeration ovldStartCriticalCause = (YangEnumeration)getValue("ovld-start-critical-cause");
        if (ovldStartCriticalCause == null) {
            ovldStartCriticalCause = new YangEnumeration("mps-mt-services-only", new String[] {  // default
                "disable",
                "no-rrc-for-non-emg-modt",
                "no-rrc-for-non-emg-sig",
                "emg-only",
                "mps-mt-services-only",
                "prio-sess-mt-srvc-only",
                "no-del-tol-access",
            });
        }
        return ovldStartCriticalCause;
    }

    /**
     * Sets the value for child leaf "ovld-start-critical-cause",
     * using instance of generated typedef class.
     * @param ovldStartCriticalCauseValue The value to set.
     * @param ovldStartCriticalCauseValue used during instantiation.
     */
    public void setOvldStartCriticalCauseValue(YangEnumeration ovldStartCriticalCauseValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-critical-cause",
            ovldStartCriticalCauseValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ovld-start-critical-cause",
     * using a String value.
     * @param ovldStartCriticalCauseValue used during instantiation.
     */
    public void setOvldStartCriticalCauseValue(String ovldStartCriticalCauseValue)
            throws JNCException {
        setOvldStartCriticalCauseValue(new YangEnumeration(ovldStartCriticalCauseValue, new String[] {
             "disable",
             "no-rrc-for-non-emg-modt",
             "no-rrc-for-non-emg-sig",
             "emg-only",
             "mps-mt-services-only",
             "prio-sess-mt-srvc-only",
             "no-del-tol-access",
        }));
    }

    /**
     * Unsets the value for child leaf "ovld-start-critical-cause".
     */
    public void unsetOvldStartCriticalCauseValue() throws JNCException {
        delete("ovld-start-critical-cause");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ovld-start-critical-cause" leaf will not have a value.
     */
    public void addOvldStartCriticalCause() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ovld-start-critical-cause",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ovld-start-critical-cause" with operation "replace".
     */
    public void markOvldStartCriticalCauseReplace() throws JNCException {
        markLeafReplace("ovldStartCriticalCause");
    }

    /**
     * Marks the leaf "ovld-start-critical-cause" with operation "merge".
     */
    public void markOvldStartCriticalCauseMerge() throws JNCException {
        markLeafMerge("ovldStartCriticalCause");
    }

    /**
     * Marks the leaf "ovld-start-critical-cause" with operation "create".
     */
    public void markOvldStartCriticalCauseCreate() throws JNCException {
        markLeafCreate("ovldStartCriticalCause");
    }

    /**
     * Marks the leaf "ovld-start-critical-cause" with operation "delete".
     */
    public void markOvldStartCriticalCauseDelete() throws JNCException {
        markLeafDelete("ovldStartCriticalCause");
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
