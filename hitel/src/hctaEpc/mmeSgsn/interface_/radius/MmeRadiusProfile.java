/* 
 * @(#)MmeRadiusProfile.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.radius;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/radius/mme-radius-profile"
 * <p>
 * See line 25 in
 * upsmConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeRadiusProfile extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeRadiusProfile object.
     */
    public MmeRadiusProfile() {
        super(Epc.NAMESPACE, "mme-radius-profile");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeRadiusProfile clone() {
        return (MmeRadiusProfile)cloneContent(new MmeRadiusProfile());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeRadiusProfile cloneShallow() {
        return (MmeRadiusProfile)cloneShallowContent(new MmeRadiusProfile());
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
            "user-password",
            "max-num-peer-retry",
            "peer-down-state-timer",
        };
    }

    /* Access methods for optional leaf child: "user-password". */

    /**
     * Gets the value for child leaf "user-password".
     * @return The value of the leaf.
     */
    public YangString getUserPasswordValue() throws JNCException {
        return (YangString)getValue("user-password");
    }

    /**
     * Sets the value for child leaf "user-password",
     * using instance of generated typedef class.
     * @param userPasswordValue The value to set.
     * @param userPasswordValue used during instantiation.
     */
    public void setUserPasswordValue(YangString userPasswordValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "user-password",
            userPasswordValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "user-password",
     * using a String value.
     * @param userPasswordValue used during instantiation.
     */
    public void setUserPasswordValue(String userPasswordValue)
            throws JNCException {
        setUserPasswordValue(new YangString(userPasswordValue));
    }

    /**
     * Unsets the value for child leaf "user-password".
     */
    public void unsetUserPasswordValue() throws JNCException {
        delete("user-password");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "user-password" leaf will not have a value.
     */
    public void addUserPassword() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "user-password",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "user-password" with operation "replace".
     */
    public void markUserPasswordReplace() throws JNCException {
        markLeafReplace("userPassword");
    }

    /**
     * Marks the leaf "user-password" with operation "merge".
     */
    public void markUserPasswordMerge() throws JNCException {
        markLeafMerge("userPassword");
    }

    /**
     * Marks the leaf "user-password" with operation "create".
     */
    public void markUserPasswordCreate() throws JNCException {
        markLeafCreate("userPassword");
    }

    /**
     * Marks the leaf "user-password" with operation "delete".
     */
    public void markUserPasswordDelete() throws JNCException {
        markLeafDelete("userPassword");
    }

    /* Access methods for optional leaf child: "max-num-peer-retry". */

    /**
     * Gets the value for child leaf "max-num-peer-retry".
     * @return The value of the leaf.
     */
    public YangUInt8 getMaxNumPeerRetryValue() throws JNCException {
        YangUInt8 maxNumPeerRetry = (YangUInt8)getValue("max-num-peer-retry");
        if (maxNumPeerRetry == null) {
            maxNumPeerRetry = new YangUInt8("2");  // default
        }
        return maxNumPeerRetry;
    }

    /**
     * Sets the value for child leaf "max-num-peer-retry",
     * using instance of generated typedef class.
     * @param maxNumPeerRetryValue The value to set.
     * @param maxNumPeerRetryValue used during instantiation.
     */
    public void setMaxNumPeerRetryValue(YangUInt8 maxNumPeerRetryValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-num-peer-retry",
            maxNumPeerRetryValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "max-num-peer-retry",
     * using Java primitive values.
     * @param maxNumPeerRetryValue used during instantiation.
     */
    public void setMaxNumPeerRetryValue(short maxNumPeerRetryValue)
            throws JNCException {
        setMaxNumPeerRetryValue(new YangUInt8(maxNumPeerRetryValue));
    }

    /**
     * Sets the value for child leaf "max-num-peer-retry",
     * using a String value.
     * @param maxNumPeerRetryValue used during instantiation.
     */
    public void setMaxNumPeerRetryValue(String maxNumPeerRetryValue)
            throws JNCException {
        setMaxNumPeerRetryValue(new YangUInt8(maxNumPeerRetryValue));
    }

    /**
     * Unsets the value for child leaf "max-num-peer-retry".
     */
    public void unsetMaxNumPeerRetryValue() throws JNCException {
        delete("max-num-peer-retry");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "max-num-peer-retry" leaf will not have a value.
     */
    public void addMaxNumPeerRetry() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-num-peer-retry",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "max-num-peer-retry" with operation "replace".
     */
    public void markMaxNumPeerRetryReplace() throws JNCException {
        markLeafReplace("maxNumPeerRetry");
    }

    /**
     * Marks the leaf "max-num-peer-retry" with operation "merge".
     */
    public void markMaxNumPeerRetryMerge() throws JNCException {
        markLeafMerge("maxNumPeerRetry");
    }

    /**
     * Marks the leaf "max-num-peer-retry" with operation "create".
     */
    public void markMaxNumPeerRetryCreate() throws JNCException {
        markLeafCreate("maxNumPeerRetry");
    }

    /**
     * Marks the leaf "max-num-peer-retry" with operation "delete".
     */
    public void markMaxNumPeerRetryDelete() throws JNCException {
        markLeafDelete("maxNumPeerRetry");
    }

    /* Access methods for optional leaf child: "peer-down-state-timer". */

    /**
     * Gets the value for child leaf "peer-down-state-timer".
     * @return The value of the leaf.
     */
    public YangUInt8 getPeerDownStateTimerValue() throws JNCException {
        YangUInt8 peerDownStateTimer = (YangUInt8)getValue("peer-down-state-timer");
        if (peerDownStateTimer == null) {
            peerDownStateTimer = new YangUInt8("30");  // default
        }
        return peerDownStateTimer;
    }

    /**
     * Sets the value for child leaf "peer-down-state-timer",
     * using instance of generated typedef class.
     * @param peerDownStateTimerValue The value to set.
     * @param peerDownStateTimerValue used during instantiation.
     */
    public void setPeerDownStateTimerValue(YangUInt8 peerDownStateTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "peer-down-state-timer",
            peerDownStateTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "peer-down-state-timer",
     * using Java primitive values.
     * @param peerDownStateTimerValue used during instantiation.
     */
    public void setPeerDownStateTimerValue(short peerDownStateTimerValue)
            throws JNCException {
        setPeerDownStateTimerValue(new YangUInt8(peerDownStateTimerValue));
    }

    /**
     * Sets the value for child leaf "peer-down-state-timer",
     * using a String value.
     * @param peerDownStateTimerValue used during instantiation.
     */
    public void setPeerDownStateTimerValue(String peerDownStateTimerValue)
            throws JNCException {
        setPeerDownStateTimerValue(new YangUInt8(peerDownStateTimerValue));
    }

    /**
     * Unsets the value for child leaf "peer-down-state-timer".
     */
    public void unsetPeerDownStateTimerValue() throws JNCException {
        delete("peer-down-state-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "peer-down-state-timer" leaf will not have a value.
     */
    public void addPeerDownStateTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "peer-down-state-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "peer-down-state-timer" with operation "replace".
     */
    public void markPeerDownStateTimerReplace() throws JNCException {
        markLeafReplace("peerDownStateTimer");
    }

    /**
     * Marks the leaf "peer-down-state-timer" with operation "merge".
     */
    public void markPeerDownStateTimerMerge() throws JNCException {
        markLeafMerge("peerDownStateTimer");
    }

    /**
     * Marks the leaf "peer-down-state-timer" with operation "create".
     */
    public void markPeerDownStateTimerCreate() throws JNCException {
        markLeafCreate("peerDownStateTimer");
    }

    /**
     * Marks the leaf "peer-down-state-timer" with operation "delete".
     */
    public void markPeerDownStateTimerDelete() throws JNCException {
        markLeafDelete("peerDownStateTimer");
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
