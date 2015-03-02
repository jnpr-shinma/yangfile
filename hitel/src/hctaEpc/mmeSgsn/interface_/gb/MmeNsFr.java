/* 
 * @(#)MmeNsFr.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.gb;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt16;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/gb/mme-ns-fr"
 * <p>
 * See line 228 in
 * gtlConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeNsFr extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeNsFr object.
     */
    public MmeNsFr() {
        super(Epc.NAMESPACE, "mme-ns-fr");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeNsFr clone() {
        return (MmeNsFr)cloneContent(new MmeNsFr());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeNsFr cloneShallow() {
        return (MmeNsFr)cloneShallowContent(new MmeNsFr());
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
            "ns-alive-retry",
            "ns-alive-timer",
            "ns-block-retries",
            "ns-block-timer",
            "ns-fr-max-segment-size",
            "ns-nsvc-alarm-condition",
            "ns-reset-retry",
            "ns-reset-timer",
            "ns-test-timer",
            "ns-unblock-retries",
        };
    }

    /* Access methods for optional leaf child: "ns-alive-retry". */

    /**
     * Gets the value for child leaf "ns-alive-retry".
     * @return The value of the leaf.
     */
    public YangUInt8 getNsAliveRetryValue() throws JNCException {
        YangUInt8 nsAliveRetry = (YangUInt8)getValue("ns-alive-retry");
        if (nsAliveRetry == null) {
            nsAliveRetry = new YangUInt8("10");  // default
        }
        return nsAliveRetry;
    }

    /**
     * Sets the value for child leaf "ns-alive-retry",
     * using instance of generated typedef class.
     * @param nsAliveRetryValue The value to set.
     * @param nsAliveRetryValue used during instantiation.
     */
    public void setNsAliveRetryValue(YangUInt8 nsAliveRetryValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-alive-retry",
            nsAliveRetryValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-alive-retry",
     * using Java primitive values.
     * @param nsAliveRetryValue used during instantiation.
     */
    public void setNsAliveRetryValue(short nsAliveRetryValue)
            throws JNCException {
        setNsAliveRetryValue(new YangUInt8(nsAliveRetryValue));
    }

    /**
     * Sets the value for child leaf "ns-alive-retry",
     * using a String value.
     * @param nsAliveRetryValue used during instantiation.
     */
    public void setNsAliveRetryValue(String nsAliveRetryValue)
            throws JNCException {
        setNsAliveRetryValue(new YangUInt8(nsAliveRetryValue));
    }

    /**
     * Unsets the value for child leaf "ns-alive-retry".
     */
    public void unsetNsAliveRetryValue() throws JNCException {
        delete("ns-alive-retry");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-alive-retry" leaf will not have a value.
     */
    public void addNsAliveRetry() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-alive-retry",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-alive-retry" with operation "replace".
     */
    public void markNsAliveRetryReplace() throws JNCException {
        markLeafReplace("nsAliveRetry");
    }

    /**
     * Marks the leaf "ns-alive-retry" with operation "merge".
     */
    public void markNsAliveRetryMerge() throws JNCException {
        markLeafMerge("nsAliveRetry");
    }

    /**
     * Marks the leaf "ns-alive-retry" with operation "create".
     */
    public void markNsAliveRetryCreate() throws JNCException {
        markLeafCreate("nsAliveRetry");
    }

    /**
     * Marks the leaf "ns-alive-retry" with operation "delete".
     */
    public void markNsAliveRetryDelete() throws JNCException {
        markLeafDelete("nsAliveRetry");
    }

    /* Access methods for optional leaf child: "ns-alive-timer". */

    /**
     * Gets the value for child leaf "ns-alive-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getNsAliveTimerValue() throws JNCException {
        YangUInt8 nsAliveTimer = (YangUInt8)getValue("ns-alive-timer");
        if (nsAliveTimer == null) {
            nsAliveTimer = new YangUInt8("3");  // default
        }
        return nsAliveTimer;
    }

    /**
     * Sets the value for child leaf "ns-alive-timer",
     * using instance of generated typedef class.
     * @param nsAliveTimerValue The value to set.
     * @param nsAliveTimerValue used during instantiation.
     */
    public void setNsAliveTimerValue(YangUInt8 nsAliveTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-alive-timer",
            nsAliveTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-alive-timer",
     * using Java primitive values.
     * @param nsAliveTimerValue used during instantiation.
     */
    public void setNsAliveTimerValue(short nsAliveTimerValue)
            throws JNCException {
        setNsAliveTimerValue(new YangUInt8(nsAliveTimerValue));
    }

    /**
     * Sets the value for child leaf "ns-alive-timer",
     * using a String value.
     * @param nsAliveTimerValue used during instantiation.
     */
    public void setNsAliveTimerValue(String nsAliveTimerValue)
            throws JNCException {
        setNsAliveTimerValue(new YangUInt8(nsAliveTimerValue));
    }

    /**
     * Unsets the value for child leaf "ns-alive-timer".
     */
    public void unsetNsAliveTimerValue() throws JNCException {
        delete("ns-alive-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-alive-timer" leaf will not have a value.
     */
    public void addNsAliveTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-alive-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-alive-timer" with operation "replace".
     */
    public void markNsAliveTimerReplace() throws JNCException {
        markLeafReplace("nsAliveTimer");
    }

    /**
     * Marks the leaf "ns-alive-timer" with operation "merge".
     */
    public void markNsAliveTimerMerge() throws JNCException {
        markLeafMerge("nsAliveTimer");
    }

    /**
     * Marks the leaf "ns-alive-timer" with operation "create".
     */
    public void markNsAliveTimerCreate() throws JNCException {
        markLeafCreate("nsAliveTimer");
    }

    /**
     * Marks the leaf "ns-alive-timer" with operation "delete".
     */
    public void markNsAliveTimerDelete() throws JNCException {
        markLeafDelete("nsAliveTimer");
    }

    /* Access methods for optional leaf child: "ns-block-retries". */

    /**
     * Gets the value for child leaf "ns-block-retries".
     * @return The value of the leaf.
     */
    public YangUInt8 getNsBlockRetriesValue() throws JNCException {
        YangUInt8 nsBlockRetries = (YangUInt8)getValue("ns-block-retries");
        if (nsBlockRetries == null) {
            nsBlockRetries = new YangUInt8("3");  // default
        }
        return nsBlockRetries;
    }

    /**
     * Sets the value for child leaf "ns-block-retries",
     * using instance of generated typedef class.
     * @param nsBlockRetriesValue The value to set.
     * @param nsBlockRetriesValue used during instantiation.
     */
    public void setNsBlockRetriesValue(YangUInt8 nsBlockRetriesValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-block-retries",
            nsBlockRetriesValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-block-retries",
     * using Java primitive values.
     * @param nsBlockRetriesValue used during instantiation.
     */
    public void setNsBlockRetriesValue(short nsBlockRetriesValue)
            throws JNCException {
        setNsBlockRetriesValue(new YangUInt8(nsBlockRetriesValue));
    }

    /**
     * Sets the value for child leaf "ns-block-retries",
     * using a String value.
     * @param nsBlockRetriesValue used during instantiation.
     */
    public void setNsBlockRetriesValue(String nsBlockRetriesValue)
            throws JNCException {
        setNsBlockRetriesValue(new YangUInt8(nsBlockRetriesValue));
    }

    /**
     * Unsets the value for child leaf "ns-block-retries".
     */
    public void unsetNsBlockRetriesValue() throws JNCException {
        delete("ns-block-retries");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-block-retries" leaf will not have a value.
     */
    public void addNsBlockRetries() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-block-retries",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-block-retries" with operation "replace".
     */
    public void markNsBlockRetriesReplace() throws JNCException {
        markLeafReplace("nsBlockRetries");
    }

    /**
     * Marks the leaf "ns-block-retries" with operation "merge".
     */
    public void markNsBlockRetriesMerge() throws JNCException {
        markLeafMerge("nsBlockRetries");
    }

    /**
     * Marks the leaf "ns-block-retries" with operation "create".
     */
    public void markNsBlockRetriesCreate() throws JNCException {
        markLeafCreate("nsBlockRetries");
    }

    /**
     * Marks the leaf "ns-block-retries" with operation "delete".
     */
    public void markNsBlockRetriesDelete() throws JNCException {
        markLeafDelete("nsBlockRetries");
    }

    /* Access methods for optional leaf child: "ns-block-timer". */

    /**
     * Gets the value for child leaf "ns-block-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getNsBlockTimerValue() throws JNCException {
        YangUInt8 nsBlockTimer = (YangUInt8)getValue("ns-block-timer");
        if (nsBlockTimer == null) {
            nsBlockTimer = new YangUInt8("5");  // default
        }
        return nsBlockTimer;
    }

    /**
     * Sets the value for child leaf "ns-block-timer",
     * using instance of generated typedef class.
     * @param nsBlockTimerValue The value to set.
     * @param nsBlockTimerValue used during instantiation.
     */
    public void setNsBlockTimerValue(YangUInt8 nsBlockTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-block-timer",
            nsBlockTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-block-timer",
     * using Java primitive values.
     * @param nsBlockTimerValue used during instantiation.
     */
    public void setNsBlockTimerValue(short nsBlockTimerValue)
            throws JNCException {
        setNsBlockTimerValue(new YangUInt8(nsBlockTimerValue));
    }

    /**
     * Sets the value for child leaf "ns-block-timer",
     * using a String value.
     * @param nsBlockTimerValue used during instantiation.
     */
    public void setNsBlockTimerValue(String nsBlockTimerValue)
            throws JNCException {
        setNsBlockTimerValue(new YangUInt8(nsBlockTimerValue));
    }

    /**
     * Unsets the value for child leaf "ns-block-timer".
     */
    public void unsetNsBlockTimerValue() throws JNCException {
        delete("ns-block-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-block-timer" leaf will not have a value.
     */
    public void addNsBlockTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-block-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-block-timer" with operation "replace".
     */
    public void markNsBlockTimerReplace() throws JNCException {
        markLeafReplace("nsBlockTimer");
    }

    /**
     * Marks the leaf "ns-block-timer" with operation "merge".
     */
    public void markNsBlockTimerMerge() throws JNCException {
        markLeafMerge("nsBlockTimer");
    }

    /**
     * Marks the leaf "ns-block-timer" with operation "create".
     */
    public void markNsBlockTimerCreate() throws JNCException {
        markLeafCreate("nsBlockTimer");
    }

    /**
     * Marks the leaf "ns-block-timer" with operation "delete".
     */
    public void markNsBlockTimerDelete() throws JNCException {
        markLeafDelete("nsBlockTimer");
    }

    /* Access methods for optional leaf child: "ns-fr-max-segment-size". */

    /**
     * Gets the value for child leaf "ns-fr-max-segment-size".
     * @return The value of the leaf.
     */
    public YangUInt16 getNsFrMaxSegmentSizeValue() throws JNCException {
        YangUInt16 nsFrMaxSegmentSize = (YangUInt16)getValue("ns-fr-max-segment-size");
        if (nsFrMaxSegmentSize == null) {
            nsFrMaxSegmentSize = new YangUInt16("1496");  // default
        }
        return nsFrMaxSegmentSize;
    }

    /**
     * Sets the value for child leaf "ns-fr-max-segment-size",
     * using instance of generated typedef class.
     * @param nsFrMaxSegmentSizeValue The value to set.
     * @param nsFrMaxSegmentSizeValue used during instantiation.
     */
    public void setNsFrMaxSegmentSizeValue(YangUInt16 nsFrMaxSegmentSizeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-fr-max-segment-size",
            nsFrMaxSegmentSizeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-fr-max-segment-size",
     * using Java primitive values.
     * @param nsFrMaxSegmentSizeValue used during instantiation.
     */
    public void setNsFrMaxSegmentSizeValue(int nsFrMaxSegmentSizeValue)
            throws JNCException {
        setNsFrMaxSegmentSizeValue(new YangUInt16(nsFrMaxSegmentSizeValue));
    }

    /**
     * Sets the value for child leaf "ns-fr-max-segment-size",
     * using a String value.
     * @param nsFrMaxSegmentSizeValue used during instantiation.
     */
    public void setNsFrMaxSegmentSizeValue(String nsFrMaxSegmentSizeValue)
            throws JNCException {
        setNsFrMaxSegmentSizeValue(new YangUInt16(nsFrMaxSegmentSizeValue));
    }

    /**
     * Unsets the value for child leaf "ns-fr-max-segment-size".
     */
    public void unsetNsFrMaxSegmentSizeValue() throws JNCException {
        delete("ns-fr-max-segment-size");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-fr-max-segment-size" leaf will not have a value.
     */
    public void addNsFrMaxSegmentSize() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-fr-max-segment-size",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-fr-max-segment-size" with operation "replace".
     */
    public void markNsFrMaxSegmentSizeReplace() throws JNCException {
        markLeafReplace("nsFrMaxSegmentSize");
    }

    /**
     * Marks the leaf "ns-fr-max-segment-size" with operation "merge".
     */
    public void markNsFrMaxSegmentSizeMerge() throws JNCException {
        markLeafMerge("nsFrMaxSegmentSize");
    }

    /**
     * Marks the leaf "ns-fr-max-segment-size" with operation "create".
     */
    public void markNsFrMaxSegmentSizeCreate() throws JNCException {
        markLeafCreate("nsFrMaxSegmentSize");
    }

    /**
     * Marks the leaf "ns-fr-max-segment-size" with operation "delete".
     */
    public void markNsFrMaxSegmentSizeDelete() throws JNCException {
        markLeafDelete("nsFrMaxSegmentSize");
    }

    /* Access methods for optional leaf child: "ns-nsvc-alarm-condition". */

    /**
     * Gets the value for child leaf "ns-nsvc-alarm-condition".
     * @return The value of the leaf.
     */
    public YangString getNsNsvcAlarmConditionValue() throws JNCException {
        YangString nsNsvcAlarmCondition = (YangString)getValue("ns-nsvc-alarm-condition");
        if (nsNsvcAlarmCondition == null) {
            nsNsvcAlarmCondition = new YangString("idle,block,dead");  // default
        }
        return nsNsvcAlarmCondition;
    }

    /**
     * Sets the value for child leaf "ns-nsvc-alarm-condition",
     * using instance of generated typedef class.
     * @param nsNsvcAlarmConditionValue The value to set.
     * @param nsNsvcAlarmConditionValue used during instantiation.
     */
    public void setNsNsvcAlarmConditionValue(YangString nsNsvcAlarmConditionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-nsvc-alarm-condition",
            nsNsvcAlarmConditionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-nsvc-alarm-condition",
     * using a String value.
     * @param nsNsvcAlarmConditionValue used during instantiation.
     */
    public void setNsNsvcAlarmConditionValue(String nsNsvcAlarmConditionValue)
            throws JNCException {
        setNsNsvcAlarmConditionValue(new YangString(nsNsvcAlarmConditionValue));
    }

    /**
     * Unsets the value for child leaf "ns-nsvc-alarm-condition".
     */
    public void unsetNsNsvcAlarmConditionValue() throws JNCException {
        delete("ns-nsvc-alarm-condition");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-nsvc-alarm-condition" leaf will not have a value.
     */
    public void addNsNsvcAlarmCondition() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-nsvc-alarm-condition",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-nsvc-alarm-condition" with operation "replace".
     */
    public void markNsNsvcAlarmConditionReplace() throws JNCException {
        markLeafReplace("nsNsvcAlarmCondition");
    }

    /**
     * Marks the leaf "ns-nsvc-alarm-condition" with operation "merge".
     */
    public void markNsNsvcAlarmConditionMerge() throws JNCException {
        markLeafMerge("nsNsvcAlarmCondition");
    }

    /**
     * Marks the leaf "ns-nsvc-alarm-condition" with operation "create".
     */
    public void markNsNsvcAlarmConditionCreate() throws JNCException {
        markLeafCreate("nsNsvcAlarmCondition");
    }

    /**
     * Marks the leaf "ns-nsvc-alarm-condition" with operation "delete".
     */
    public void markNsNsvcAlarmConditionDelete() throws JNCException {
        markLeafDelete("nsNsvcAlarmCondition");
    }

    /* Access methods for optional leaf child: "ns-reset-retry". */

    /**
     * Gets the value for child leaf "ns-reset-retry".
     * @return The value of the leaf.
     */
    public YangUInt8 getNsResetRetryValue() throws JNCException {
        YangUInt8 nsResetRetry = (YangUInt8)getValue("ns-reset-retry");
        if (nsResetRetry == null) {
            nsResetRetry = new YangUInt8("3");  // default
        }
        return nsResetRetry;
    }

    /**
     * Sets the value for child leaf "ns-reset-retry",
     * using instance of generated typedef class.
     * @param nsResetRetryValue The value to set.
     * @param nsResetRetryValue used during instantiation.
     */
    public void setNsResetRetryValue(YangUInt8 nsResetRetryValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-reset-retry",
            nsResetRetryValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-reset-retry",
     * using Java primitive values.
     * @param nsResetRetryValue used during instantiation.
     */
    public void setNsResetRetryValue(short nsResetRetryValue)
            throws JNCException {
        setNsResetRetryValue(new YangUInt8(nsResetRetryValue));
    }

    /**
     * Sets the value for child leaf "ns-reset-retry",
     * using a String value.
     * @param nsResetRetryValue used during instantiation.
     */
    public void setNsResetRetryValue(String nsResetRetryValue)
            throws JNCException {
        setNsResetRetryValue(new YangUInt8(nsResetRetryValue));
    }

    /**
     * Unsets the value for child leaf "ns-reset-retry".
     */
    public void unsetNsResetRetryValue() throws JNCException {
        delete("ns-reset-retry");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-reset-retry" leaf will not have a value.
     */
    public void addNsResetRetry() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-reset-retry",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-reset-retry" with operation "replace".
     */
    public void markNsResetRetryReplace() throws JNCException {
        markLeafReplace("nsResetRetry");
    }

    /**
     * Marks the leaf "ns-reset-retry" with operation "merge".
     */
    public void markNsResetRetryMerge() throws JNCException {
        markLeafMerge("nsResetRetry");
    }

    /**
     * Marks the leaf "ns-reset-retry" with operation "create".
     */
    public void markNsResetRetryCreate() throws JNCException {
        markLeafCreate("nsResetRetry");
    }

    /**
     * Marks the leaf "ns-reset-retry" with operation "delete".
     */
    public void markNsResetRetryDelete() throws JNCException {
        markLeafDelete("nsResetRetry");
    }

    /* Access methods for optional leaf child: "ns-reset-timer". */

    /**
     * Gets the value for child leaf "ns-reset-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getNsResetTimerValue() throws JNCException {
        YangUInt8 nsResetTimer = (YangUInt8)getValue("ns-reset-timer");
        if (nsResetTimer == null) {
            nsResetTimer = new YangUInt8("5");  // default
        }
        return nsResetTimer;
    }

    /**
     * Sets the value for child leaf "ns-reset-timer",
     * using instance of generated typedef class.
     * @param nsResetTimerValue The value to set.
     * @param nsResetTimerValue used during instantiation.
     */
    public void setNsResetTimerValue(YangUInt8 nsResetTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-reset-timer",
            nsResetTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-reset-timer",
     * using Java primitive values.
     * @param nsResetTimerValue used during instantiation.
     */
    public void setNsResetTimerValue(short nsResetTimerValue)
            throws JNCException {
        setNsResetTimerValue(new YangUInt8(nsResetTimerValue));
    }

    /**
     * Sets the value for child leaf "ns-reset-timer",
     * using a String value.
     * @param nsResetTimerValue used during instantiation.
     */
    public void setNsResetTimerValue(String nsResetTimerValue)
            throws JNCException {
        setNsResetTimerValue(new YangUInt8(nsResetTimerValue));
    }

    /**
     * Unsets the value for child leaf "ns-reset-timer".
     */
    public void unsetNsResetTimerValue() throws JNCException {
        delete("ns-reset-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-reset-timer" leaf will not have a value.
     */
    public void addNsResetTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-reset-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-reset-timer" with operation "replace".
     */
    public void markNsResetTimerReplace() throws JNCException {
        markLeafReplace("nsResetTimer");
    }

    /**
     * Marks the leaf "ns-reset-timer" with operation "merge".
     */
    public void markNsResetTimerMerge() throws JNCException {
        markLeafMerge("nsResetTimer");
    }

    /**
     * Marks the leaf "ns-reset-timer" with operation "create".
     */
    public void markNsResetTimerCreate() throws JNCException {
        markLeafCreate("nsResetTimer");
    }

    /**
     * Marks the leaf "ns-reset-timer" with operation "delete".
     */
    public void markNsResetTimerDelete() throws JNCException {
        markLeafDelete("nsResetTimer");
    }

    /* Access methods for optional leaf child: "ns-test-timer". */

    /**
     * Gets the value for child leaf "ns-test-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getNsTestTimerValue() throws JNCException {
        YangUInt8 nsTestTimer = (YangUInt8)getValue("ns-test-timer");
        if (nsTestTimer == null) {
            nsTestTimer = new YangUInt8("30");  // default
        }
        return nsTestTimer;
    }

    /**
     * Sets the value for child leaf "ns-test-timer",
     * using instance of generated typedef class.
     * @param nsTestTimerValue The value to set.
     * @param nsTestTimerValue used during instantiation.
     */
    public void setNsTestTimerValue(YangUInt8 nsTestTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-test-timer",
            nsTestTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-test-timer",
     * using Java primitive values.
     * @param nsTestTimerValue used during instantiation.
     */
    public void setNsTestTimerValue(short nsTestTimerValue) throws JNCException {
        setNsTestTimerValue(new YangUInt8(nsTestTimerValue));
    }

    /**
     * Sets the value for child leaf "ns-test-timer",
     * using a String value.
     * @param nsTestTimerValue used during instantiation.
     */
    public void setNsTestTimerValue(String nsTestTimerValue)
            throws JNCException {
        setNsTestTimerValue(new YangUInt8(nsTestTimerValue));
    }

    /**
     * Unsets the value for child leaf "ns-test-timer".
     */
    public void unsetNsTestTimerValue() throws JNCException {
        delete("ns-test-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-test-timer" leaf will not have a value.
     */
    public void addNsTestTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-test-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-test-timer" with operation "replace".
     */
    public void markNsTestTimerReplace() throws JNCException {
        markLeafReplace("nsTestTimer");
    }

    /**
     * Marks the leaf "ns-test-timer" with operation "merge".
     */
    public void markNsTestTimerMerge() throws JNCException {
        markLeafMerge("nsTestTimer");
    }

    /**
     * Marks the leaf "ns-test-timer" with operation "create".
     */
    public void markNsTestTimerCreate() throws JNCException {
        markLeafCreate("nsTestTimer");
    }

    /**
     * Marks the leaf "ns-test-timer" with operation "delete".
     */
    public void markNsTestTimerDelete() throws JNCException {
        markLeafDelete("nsTestTimer");
    }

    /* Access methods for optional leaf child: "ns-unblock-retries". */

    /**
     * Gets the value for child leaf "ns-unblock-retries".
     * @return The value of the leaf.
     */
    public YangUInt8 getNsUnblockRetriesValue() throws JNCException {
        YangUInt8 nsUnblockRetries = (YangUInt8)getValue("ns-unblock-retries");
        if (nsUnblockRetries == null) {
            nsUnblockRetries = new YangUInt8("3");  // default
        }
        return nsUnblockRetries;
    }

    /**
     * Sets the value for child leaf "ns-unblock-retries",
     * using instance of generated typedef class.
     * @param nsUnblockRetriesValue The value to set.
     * @param nsUnblockRetriesValue used during instantiation.
     */
    public void setNsUnblockRetriesValue(YangUInt8 nsUnblockRetriesValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-unblock-retries",
            nsUnblockRetriesValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ns-unblock-retries",
     * using Java primitive values.
     * @param nsUnblockRetriesValue used during instantiation.
     */
    public void setNsUnblockRetriesValue(short nsUnblockRetriesValue)
            throws JNCException {
        setNsUnblockRetriesValue(new YangUInt8(nsUnblockRetriesValue));
    }

    /**
     * Sets the value for child leaf "ns-unblock-retries",
     * using a String value.
     * @param nsUnblockRetriesValue used during instantiation.
     */
    public void setNsUnblockRetriesValue(String nsUnblockRetriesValue)
            throws JNCException {
        setNsUnblockRetriesValue(new YangUInt8(nsUnblockRetriesValue));
    }

    /**
     * Unsets the value for child leaf "ns-unblock-retries".
     */
    public void unsetNsUnblockRetriesValue() throws JNCException {
        delete("ns-unblock-retries");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ns-unblock-retries" leaf will not have a value.
     */
    public void addNsUnblockRetries() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ns-unblock-retries",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ns-unblock-retries" with operation "replace".
     */
    public void markNsUnblockRetriesReplace() throws JNCException {
        markLeafReplace("nsUnblockRetries");
    }

    /**
     * Marks the leaf "ns-unblock-retries" with operation "merge".
     */
    public void markNsUnblockRetriesMerge() throws JNCException {
        markLeafMerge("nsUnblockRetries");
    }

    /**
     * Marks the leaf "ns-unblock-retries" with operation "create".
     */
    public void markNsUnblockRetriesCreate() throws JNCException {
        markLeafCreate("nsUnblockRetries");
    }

    /**
     * Marks the leaf "ns-unblock-retries" with operation "delete".
     */
    public void markNsUnblockRetriesDelete() throws JNCException {
        markLeafDelete("nsUnblockRetries");
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