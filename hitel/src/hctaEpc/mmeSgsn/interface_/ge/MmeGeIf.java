/* 
 * @(#)MmeGeIf.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.ge;

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
 * generated to "src/hctaEpc/mmeSgsn/interface_/ge/mme-ge-if"
 * <p>
 * See line 1105 in
 * sgsnScConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeGeIf extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeGeIf object.
     */
    public MmeGeIf() {
        super(Epc.NAMESPACE, "mme-ge-if");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeGeIf clone() {
        return (MmeGeIf)cloneContent(new MmeGeIf());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeGeIf cloneShallow() {
        return (MmeGeIf)cloneShallowContent(new MmeGeIf());
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
            "max-camel-dialogues",
            "ssf-timer",
            "charging-guard-timer",
            "charging-guard-retry",
            "subscriber-service",
            "version",
        };
    }

    /* Access methods for optional leaf child: "max-camel-dialogues". */

    /**
     * Gets the value for child leaf "max-camel-dialogues".
     * @return The value of the leaf.
     */
    public YangUInt16 getMaxCamelDialoguesValue() throws JNCException {
        YangUInt16 maxCamelDialogues = (YangUInt16)getValue("max-camel-dialogues");
        if (maxCamelDialogues == null) {
            maxCamelDialogues = new YangUInt16("5000");  // default
        }
        return maxCamelDialogues;
    }

    /**
     * Sets the value for child leaf "max-camel-dialogues",
     * using instance of generated typedef class.
     * @param maxCamelDialoguesValue The value to set.
     * @param maxCamelDialoguesValue used during instantiation.
     */
    public void setMaxCamelDialoguesValue(YangUInt16 maxCamelDialoguesValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-camel-dialogues",
            maxCamelDialoguesValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "max-camel-dialogues",
     * using Java primitive values.
     * @param maxCamelDialoguesValue used during instantiation.
     */
    public void setMaxCamelDialoguesValue(int maxCamelDialoguesValue)
            throws JNCException {
        setMaxCamelDialoguesValue(new YangUInt16(maxCamelDialoguesValue));
    }

    /**
     * Sets the value for child leaf "max-camel-dialogues",
     * using a String value.
     * @param maxCamelDialoguesValue used during instantiation.
     */
    public void setMaxCamelDialoguesValue(String maxCamelDialoguesValue)
            throws JNCException {
        setMaxCamelDialoguesValue(new YangUInt16(maxCamelDialoguesValue));
    }

    /**
     * Unsets the value for child leaf "max-camel-dialogues".
     */
    public void unsetMaxCamelDialoguesValue() throws JNCException {
        delete("max-camel-dialogues");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "max-camel-dialogues" leaf will not have a value.
     */
    public void addMaxCamelDialogues() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-camel-dialogues",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "max-camel-dialogues" with operation "replace".
     */
    public void markMaxCamelDialoguesReplace() throws JNCException {
        markLeafReplace("maxCamelDialogues");
    }

    /**
     * Marks the leaf "max-camel-dialogues" with operation "merge".
     */
    public void markMaxCamelDialoguesMerge() throws JNCException {
        markLeafMerge("maxCamelDialogues");
    }

    /**
     * Marks the leaf "max-camel-dialogues" with operation "create".
     */
    public void markMaxCamelDialoguesCreate() throws JNCException {
        markLeafCreate("maxCamelDialogues");
    }

    /**
     * Marks the leaf "max-camel-dialogues" with operation "delete".
     */
    public void markMaxCamelDialoguesDelete() throws JNCException {
        markLeafDelete("maxCamelDialogues");
    }

    /* Access methods for optional leaf child: "ssf-timer". */

    /**
     * Gets the value for child leaf "ssf-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getSsfTimerValue() throws JNCException {
        YangUInt8 ssfTimer = (YangUInt8)getValue("ssf-timer");
        if (ssfTimer == null) {
            ssfTimer = new YangUInt8("3");  // default
        }
        return ssfTimer;
    }

    /**
     * Sets the value for child leaf "ssf-timer",
     * using instance of generated typedef class.
     * @param ssfTimerValue The value to set.
     * @param ssfTimerValue used during instantiation.
     */
    public void setSsfTimerValue(YangUInt8 ssfTimerValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ssf-timer",
            ssfTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ssf-timer",
     * using Java primitive values.
     * @param ssfTimerValue used during instantiation.
     */
    public void setSsfTimerValue(short ssfTimerValue) throws JNCException {
        setSsfTimerValue(new YangUInt8(ssfTimerValue));
    }

    /**
     * Sets the value for child leaf "ssf-timer",
     * using a String value.
     * @param ssfTimerValue used during instantiation.
     */
    public void setSsfTimerValue(String ssfTimerValue) throws JNCException {
        setSsfTimerValue(new YangUInt8(ssfTimerValue));
    }

    /**
     * Unsets the value for child leaf "ssf-timer".
     */
    public void unsetSsfTimerValue() throws JNCException {
        delete("ssf-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ssf-timer" leaf will not have a value.
     */
    public void addSsfTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ssf-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ssf-timer" with operation "replace".
     */
    public void markSsfTimerReplace() throws JNCException {
        markLeafReplace("ssfTimer");
    }

    /**
     * Marks the leaf "ssf-timer" with operation "merge".
     */
    public void markSsfTimerMerge() throws JNCException {
        markLeafMerge("ssfTimer");
    }

    /**
     * Marks the leaf "ssf-timer" with operation "create".
     */
    public void markSsfTimerCreate() throws JNCException {
        markLeafCreate("ssfTimer");
    }

    /**
     * Marks the leaf "ssf-timer" with operation "delete".
     */
    public void markSsfTimerDelete() throws JNCException {
        markLeafDelete("ssfTimer");
    }

    /* Access methods for optional leaf child: "charging-guard-timer". */

    /**
     * Gets the value for child leaf "charging-guard-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getChargingGuardTimerValue() throws JNCException {
        YangUInt8 chargingGuardTimer = (YangUInt8)getValue("charging-guard-timer");
        if (chargingGuardTimer == null) {
            chargingGuardTimer = new YangUInt8("3");  // default
        }
        return chargingGuardTimer;
    }

    /**
     * Sets the value for child leaf "charging-guard-timer",
     * using instance of generated typedef class.
     * @param chargingGuardTimerValue The value to set.
     * @param chargingGuardTimerValue used during instantiation.
     */
    public void setChargingGuardTimerValue(YangUInt8 chargingGuardTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "charging-guard-timer",
            chargingGuardTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "charging-guard-timer",
     * using Java primitive values.
     * @param chargingGuardTimerValue used during instantiation.
     */
    public void setChargingGuardTimerValue(short chargingGuardTimerValue)
            throws JNCException {
        setChargingGuardTimerValue(new YangUInt8(chargingGuardTimerValue));
    }

    /**
     * Sets the value for child leaf "charging-guard-timer",
     * using a String value.
     * @param chargingGuardTimerValue used during instantiation.
     */
    public void setChargingGuardTimerValue(String chargingGuardTimerValue)
            throws JNCException {
        setChargingGuardTimerValue(new YangUInt8(chargingGuardTimerValue));
    }

    /**
     * Unsets the value for child leaf "charging-guard-timer".
     */
    public void unsetChargingGuardTimerValue() throws JNCException {
        delete("charging-guard-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "charging-guard-timer" leaf will not have a value.
     */
    public void addChargingGuardTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "charging-guard-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "charging-guard-timer" with operation "replace".
     */
    public void markChargingGuardTimerReplace() throws JNCException {
        markLeafReplace("chargingGuardTimer");
    }

    /**
     * Marks the leaf "charging-guard-timer" with operation "merge".
     */
    public void markChargingGuardTimerMerge() throws JNCException {
        markLeafMerge("chargingGuardTimer");
    }

    /**
     * Marks the leaf "charging-guard-timer" with operation "create".
     */
    public void markChargingGuardTimerCreate() throws JNCException {
        markLeafCreate("chargingGuardTimer");
    }

    /**
     * Marks the leaf "charging-guard-timer" with operation "delete".
     */
    public void markChargingGuardTimerDelete() throws JNCException {
        markLeafDelete("chargingGuardTimer");
    }

    /* Access methods for optional leaf child: "charging-guard-retry". */

    /**
     * Gets the value for child leaf "charging-guard-retry".
     * @return The value of the leaf.
     */
    public YangUInt8 getChargingGuardRetryValue() throws JNCException {
        YangUInt8 chargingGuardRetry = (YangUInt8)getValue("charging-guard-retry");
        if (chargingGuardRetry == null) {
            chargingGuardRetry = new YangUInt8("0");  // default
        }
        return chargingGuardRetry;
    }

    /**
     * Sets the value for child leaf "charging-guard-retry",
     * using instance of generated typedef class.
     * @param chargingGuardRetryValue The value to set.
     * @param chargingGuardRetryValue used during instantiation.
     */
    public void setChargingGuardRetryValue(YangUInt8 chargingGuardRetryValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "charging-guard-retry",
            chargingGuardRetryValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "charging-guard-retry",
     * using Java primitive values.
     * @param chargingGuardRetryValue used during instantiation.
     */
    public void setChargingGuardRetryValue(short chargingGuardRetryValue)
            throws JNCException {
        setChargingGuardRetryValue(new YangUInt8(chargingGuardRetryValue));
    }

    /**
     * Sets the value for child leaf "charging-guard-retry",
     * using a String value.
     * @param chargingGuardRetryValue used during instantiation.
     */
    public void setChargingGuardRetryValue(String chargingGuardRetryValue)
            throws JNCException {
        setChargingGuardRetryValue(new YangUInt8(chargingGuardRetryValue));
    }

    /**
     * Unsets the value for child leaf "charging-guard-retry".
     */
    public void unsetChargingGuardRetryValue() throws JNCException {
        delete("charging-guard-retry");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "charging-guard-retry" leaf will not have a value.
     */
    public void addChargingGuardRetry() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "charging-guard-retry",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "charging-guard-retry" with operation "replace".
     */
    public void markChargingGuardRetryReplace() throws JNCException {
        markLeafReplace("chargingGuardRetry");
    }

    /**
     * Marks the leaf "charging-guard-retry" with operation "merge".
     */
    public void markChargingGuardRetryMerge() throws JNCException {
        markLeafMerge("chargingGuardRetry");
    }

    /**
     * Marks the leaf "charging-guard-retry" with operation "create".
     */
    public void markChargingGuardRetryCreate() throws JNCException {
        markLeafCreate("chargingGuardRetry");
    }

    /**
     * Marks the leaf "charging-guard-retry" with operation "delete".
     */
    public void markChargingGuardRetryDelete() throws JNCException {
        markLeafDelete("chargingGuardRetry");
    }

    /* Access methods for optional leaf child: "subscriber-service". */

    /**
     * Gets the value for child leaf "subscriber-service".
     * @return The value of the leaf.
     */
    public YangEnumeration getSubscriberServiceValue() throws JNCException {
        YangEnumeration subscriberService = (YangEnumeration)getValue("subscriber-service");
        if (subscriberService == null) {
            subscriberService = new YangEnumeration("all", new String[] {  // default
                "homers",
                "roamers",
                "all",
            });
        }
        return subscriberService;
    }

    /**
     * Sets the value for child leaf "subscriber-service",
     * using instance of generated typedef class.
     * @param subscriberServiceValue The value to set.
     * @param subscriberServiceValue used during instantiation.
     */
    public void setSubscriberServiceValue(YangEnumeration subscriberServiceValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "subscriber-service",
            subscriberServiceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "subscriber-service",
     * using a String value.
     * @param subscriberServiceValue used during instantiation.
     */
    public void setSubscriberServiceValue(String subscriberServiceValue)
            throws JNCException {
        setSubscriberServiceValue(new YangEnumeration(subscriberServiceValue, new String[] {
             "homers",
             "roamers",
             "all",
        }));
    }

    /**
     * Unsets the value for child leaf "subscriber-service".
     */
    public void unsetSubscriberServiceValue() throws JNCException {
        delete("subscriber-service");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "subscriber-service" leaf will not have a value.
     */
    public void addSubscriberService() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "subscriber-service",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "subscriber-service" with operation "replace".
     */
    public void markSubscriberServiceReplace() throws JNCException {
        markLeafReplace("subscriberService");
    }

    /**
     * Marks the leaf "subscriber-service" with operation "merge".
     */
    public void markSubscriberServiceMerge() throws JNCException {
        markLeafMerge("subscriberService");
    }

    /**
     * Marks the leaf "subscriber-service" with operation "create".
     */
    public void markSubscriberServiceCreate() throws JNCException {
        markLeafCreate("subscriberService");
    }

    /**
     * Marks the leaf "subscriber-service" with operation "delete".
     */
    public void markSubscriberServiceDelete() throws JNCException {
        markLeafDelete("subscriberService");
    }

    /* Access methods for optional leaf child: "version". */

    /**
     * Gets the value for child leaf "version".
     * @return The value of the leaf.
     */
    public YangEnumeration getVersionValue() throws JNCException {
        YangEnumeration version = (YangEnumeration)getValue("version");
        if (version == null) {
            version = new YangEnumeration("10.1.0", new String[] {  // default
                "9.2.0",
                "10.1.0",
            });
        }
        return version;
    }

    /**
     * Sets the value for child leaf "version",
     * using instance of generated typedef class.
     * @param versionValue The value to set.
     * @param versionValue used during instantiation.
     */
    public void setVersionValue(YangEnumeration versionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "version",
            versionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "version",
     * using a String value.
     * @param versionValue used during instantiation.
     */
    public void setVersionValue(String versionValue) throws JNCException {
        setVersionValue(new YangEnumeration(versionValue, new String[] {
             "9.2.0",
             "10.1.0",
        }));
    }

    /**
     * Unsets the value for child leaf "version".
     */
    public void unsetVersionValue() throws JNCException {
        delete("version");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "version" leaf will not have a value.
     */
    public void addVersion() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "version",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "version" with operation "replace".
     */
    public void markVersionReplace() throws JNCException {
        markLeafReplace("version");
    }

    /**
     * Marks the leaf "version" with operation "merge".
     */
    public void markVersionMerge() throws JNCException {
        markLeafMerge("version");
    }

    /**
     * Marks the leaf "version" with operation "create".
     */
    public void markVersionCreate() throws JNCException {
        markLeafCreate("version");
    }

    /**
     * Marks the leaf "version" with operation "delete".
     */
    public void markVersionDelete() throws JNCException {
        markLeafDelete("version");
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
