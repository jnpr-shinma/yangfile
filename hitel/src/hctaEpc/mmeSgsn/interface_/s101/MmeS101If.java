/* 
 * @(#)MmeS101If.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.s101;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/s101/mme-s101-if"
 * <p>
 * See line 2289 in
 * scConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeS101If extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeS101If object.
     */
    public MmeS101If() {
        super(Epc.NAMESPACE, "mme-s101-if");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeS101If clone() {
        return (MmeS101If)cloneContent(new MmeS101If());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeS101If cloneShallow() {
        return (MmeS101If)cloneShallowContent(new MmeS101If());
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
            "tunnel-change-delay-timer",
            "wait-for-notification-timer",
            "handover-hold-timer",
            "version",
        };
    }

    /* Access methods for optional leaf child: "tunnel-change-delay-timer". */

    /**
     * Gets the value for child leaf "tunnel-change-delay-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getTunnelChangeDelayTimerValue() throws JNCException {
        YangUInt8 tunnelChangeDelayTimer = (YangUInt8)getValue("tunnel-change-delay-timer");
        if (tunnelChangeDelayTimer == null) {
            tunnelChangeDelayTimer = new YangUInt8("5");  // default
        }
        return tunnelChangeDelayTimer;
    }

    /**
     * Sets the value for child leaf "tunnel-change-delay-timer",
     * using instance of generated typedef class.
     * @param tunnelChangeDelayTimerValue The value to set.
     * @param tunnelChangeDelayTimerValue used during instantiation.
     */
    public void setTunnelChangeDelayTimerValue(YangUInt8 tunnelChangeDelayTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "tunnel-change-delay-timer",
            tunnelChangeDelayTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "tunnel-change-delay-timer",
     * using Java primitive values.
     * @param tunnelChangeDelayTimerValue used during instantiation.
     */
    public void setTunnelChangeDelayTimerValue(short tunnelChangeDelayTimerValue)
            throws JNCException {
        setTunnelChangeDelayTimerValue(new YangUInt8(tunnelChangeDelayTimerValue));
    }

    /**
     * Sets the value for child leaf "tunnel-change-delay-timer",
     * using a String value.
     * @param tunnelChangeDelayTimerValue used during instantiation.
     */
    public void setTunnelChangeDelayTimerValue(String tunnelChangeDelayTimerValue)
            throws JNCException {
        setTunnelChangeDelayTimerValue(new YangUInt8(tunnelChangeDelayTimerValue));
    }

    /**
     * Unsets the value for child leaf "tunnel-change-delay-timer".
     */
    public void unsetTunnelChangeDelayTimerValue() throws JNCException {
        delete("tunnel-change-delay-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "tunnel-change-delay-timer" leaf will not have a value.
     */
    public void addTunnelChangeDelayTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "tunnel-change-delay-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "tunnel-change-delay-timer" with operation "replace".
     */
    public void markTunnelChangeDelayTimerReplace() throws JNCException {
        markLeafReplace("tunnelChangeDelayTimer");
    }

    /**
     * Marks the leaf "tunnel-change-delay-timer" with operation "merge".
     */
    public void markTunnelChangeDelayTimerMerge() throws JNCException {
        markLeafMerge("tunnelChangeDelayTimer");
    }

    /**
     * Marks the leaf "tunnel-change-delay-timer" with operation "create".
     */
    public void markTunnelChangeDelayTimerCreate() throws JNCException {
        markLeafCreate("tunnelChangeDelayTimer");
    }

    /**
     * Marks the leaf "tunnel-change-delay-timer" with operation "delete".
     */
    public void markTunnelChangeDelayTimerDelete() throws JNCException {
        markLeafDelete("tunnelChangeDelayTimer");
    }

    /* Access methods for optional leaf child: "wait-for-notification-timer". */

    /**
     * Gets the value for child leaf "wait-for-notification-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getWaitForNotificationTimerValue() throws JNCException {
        YangUInt8 waitForNotificationTimer = (YangUInt8)getValue("wait-for-notification-timer");
        if (waitForNotificationTimer == null) {
            waitForNotificationTimer = new YangUInt8("5");  // default
        }
        return waitForNotificationTimer;
    }

    /**
     * Sets the value for child leaf "wait-for-notification-timer",
     * using instance of generated typedef class.
     * @param waitForNotificationTimerValue The value to set.
     * @param waitForNotificationTimerValue used during instantiation.
     */
    public void setWaitForNotificationTimerValue(YangUInt8 waitForNotificationTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "wait-for-notification-timer",
            waitForNotificationTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "wait-for-notification-timer",
     * using Java primitive values.
     * @param waitForNotificationTimerValue used during instantiation.
     */
    public void setWaitForNotificationTimerValue(short waitForNotificationTimerValue)
            throws JNCException {
        setWaitForNotificationTimerValue(new YangUInt8(waitForNotificationTimerValue));
    }

    /**
     * Sets the value for child leaf "wait-for-notification-timer",
     * using a String value.
     * @param waitForNotificationTimerValue used during instantiation.
     */
    public void setWaitForNotificationTimerValue(String waitForNotificationTimerValue)
            throws JNCException {
        setWaitForNotificationTimerValue(new YangUInt8(waitForNotificationTimerValue));
    }

    /**
     * Unsets the value for child leaf "wait-for-notification-timer".
     */
    public void unsetWaitForNotificationTimerValue() throws JNCException {
        delete("wait-for-notification-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "wait-for-notification-timer" leaf will not have a value.
     */
    public void addWaitForNotificationTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "wait-for-notification-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "wait-for-notification-timer" with operation "replace".
     */
    public void markWaitForNotificationTimerReplace() throws JNCException {
        markLeafReplace("waitForNotificationTimer");
    }

    /**
     * Marks the leaf "wait-for-notification-timer" with operation "merge".
     */
    public void markWaitForNotificationTimerMerge() throws JNCException {
        markLeafMerge("waitForNotificationTimer");
    }

    /**
     * Marks the leaf "wait-for-notification-timer" with operation "create".
     */
    public void markWaitForNotificationTimerCreate() throws JNCException {
        markLeafCreate("waitForNotificationTimer");
    }

    /**
     * Marks the leaf "wait-for-notification-timer" with operation "delete".
     */
    public void markWaitForNotificationTimerDelete() throws JNCException {
        markLeafDelete("waitForNotificationTimer");
    }

    /* Access methods for optional leaf child: "handover-hold-timer". */

    /**
     * Gets the value for child leaf "handover-hold-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getHandoverHoldTimerValue() throws JNCException {
        YangUInt8 handoverHoldTimer = (YangUInt8)getValue("handover-hold-timer");
        if (handoverHoldTimer == null) {
            handoverHoldTimer = new YangUInt8("5");  // default
        }
        return handoverHoldTimer;
    }

    /**
     * Sets the value for child leaf "handover-hold-timer",
     * using instance of generated typedef class.
     * @param handoverHoldTimerValue The value to set.
     * @param handoverHoldTimerValue used during instantiation.
     */
    public void setHandoverHoldTimerValue(YangUInt8 handoverHoldTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "handover-hold-timer",
            handoverHoldTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "handover-hold-timer",
     * using Java primitive values.
     * @param handoverHoldTimerValue used during instantiation.
     */
    public void setHandoverHoldTimerValue(short handoverHoldTimerValue)
            throws JNCException {
        setHandoverHoldTimerValue(new YangUInt8(handoverHoldTimerValue));
    }

    /**
     * Sets the value for child leaf "handover-hold-timer",
     * using a String value.
     * @param handoverHoldTimerValue used during instantiation.
     */
    public void setHandoverHoldTimerValue(String handoverHoldTimerValue)
            throws JNCException {
        setHandoverHoldTimerValue(new YangUInt8(handoverHoldTimerValue));
    }

    /**
     * Unsets the value for child leaf "handover-hold-timer".
     */
    public void unsetHandoverHoldTimerValue() throws JNCException {
        delete("handover-hold-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "handover-hold-timer" leaf will not have a value.
     */
    public void addHandoverHoldTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "handover-hold-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "handover-hold-timer" with operation "replace".
     */
    public void markHandoverHoldTimerReplace() throws JNCException {
        markLeafReplace("handoverHoldTimer");
    }

    /**
     * Marks the leaf "handover-hold-timer" with operation "merge".
     */
    public void markHandoverHoldTimerMerge() throws JNCException {
        markLeafMerge("handoverHoldTimer");
    }

    /**
     * Marks the leaf "handover-hold-timer" with operation "create".
     */
    public void markHandoverHoldTimerCreate() throws JNCException {
        markLeafCreate("handoverHoldTimer");
    }

    /**
     * Marks the leaf "handover-hold-timer" with operation "delete".
     */
    public void markHandoverHoldTimerDelete() throws JNCException {
        markLeafDelete("handoverHoldTimer");
    }

    /* Access methods for optional leaf child: "version". */

    /**
     * Gets the value for child leaf "version".
     * @return The value of the leaf.
     */
    public YangEnumeration getVersionValue() throws JNCException {
        YangEnumeration version = (YangEnumeration)getValue("version");
        if (version == null) {
            version = new YangEnumeration("10.3.0", new String[] {  // default
                "9.0.0-proprietary",
                "10.3.0",
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
             "9.0.0-proprietary",
             "10.3.0",
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
