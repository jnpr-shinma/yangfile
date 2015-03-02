/* 
 * @(#)MmeDiameterPeer.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.diameter;
import .ietfInetTypes.IpAddress;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangString;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/diameter/mme-diameter-peer"
 * <p>
 * See line 157 in
 * dcConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeDiameterPeer extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeDiameterPeer object.
     */
    public MmeDiameterPeer() {
        super(Epc.NAMESPACE, "mme-diameter-peer");
    }

    /**
     * Constructor for an initialized MmeDiameterPeer object,
     * 
     * @param hostIdentityValue Key argument of child.
     */
    public MmeDiameterPeer(YangString hostIdentityValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-diameter-peer");
        Leaf hostIdentity = new Leaf(Epc.NAMESPACE, "host-identity");
        hostIdentity.setValue(hostIdentityValue);
        insertChild(hostIdentity, childrenNames());
    }

    /**
     * Constructor for an initialized MmeDiameterPeer object,
     * with String keys.
     * @param hostIdentityValue Key argument of child.
     */
    public MmeDiameterPeer(String hostIdentityValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-diameter-peer");
        Leaf hostIdentity = new Leaf(Epc.NAMESPACE, "host-identity");
        hostIdentity.setValue(new YangString(hostIdentityValue));
        insertChild(hostIdentity, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeDiameterPeer clone() {
        MmeDiameterPeer copy;
        try {
            copy = new MmeDiameterPeer(getHostIdentityValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeDiameterPeer)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeDiameterPeer cloneShallow() {
        MmeDiameterPeer copy;
        try {
            copy = new MmeDiameterPeer(getHostIdentityValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeDiameterPeer)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "host-identity",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "host-identity",
            "ip-address",
            "port-number",
            "ip-address2",
        };
    }

    /* Access methods for leaf child: "host-identity". */

    /**
     * Gets the value for child leaf "host-identity".
     * @return The value of the leaf.
     */
    public YangString getHostIdentityValue() throws JNCException {
        return (YangString)getValue("host-identity");
    }

    /**
     * Sets the value for child leaf "host-identity",
     * using instance of generated typedef class.
     * @param hostIdentityValue The value to set.
     * @param hostIdentityValue used during instantiation.
     */
    public void setHostIdentityValue(YangString hostIdentityValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "host-identity",
            hostIdentityValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "host-identity",
     * using a String value.
     * @param hostIdentityValue used during instantiation.
     */
    public void setHostIdentityValue(String hostIdentityValue)
            throws JNCException {
        setHostIdentityValue(new YangString(hostIdentityValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "host-identity" leaf will not have a value.
     */
    public void addHostIdentity() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "host-identity",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "ip-address". */

    /**
     * Gets the value for child leaf "ip-address".
     * @return The value of the leaf.
     */
    public IpAddress getIpAddressValue() throws JNCException {
        return (IpAddress)getValue("ip-address");
    }

    /**
     * Sets the value for child leaf "ip-address",
     * using a JNC type value.
     * @param ipAddressValue The value to set.
     * @param ipAddressValue used during instantiation.
     */
    public void setIpAddressValue(IpAddress ipAddressValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address",
            ipAddressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address",
     * using a String value.
     * @param ipAddressValue used during instantiation.
     */
    public void setIpAddressValue(String ipAddressValue) throws JNCException {
        setIpAddressValue(new IpAddress(ipAddressValue));
    }

    /**
     * Unsets the value for child leaf "ip-address".
     */
    public void unsetIpAddressValue() throws JNCException {
        delete("ip-address");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address" leaf will not have a value.
     */
    public void addIpAddress() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address" with operation "replace".
     */
    public void markIpAddressReplace() throws JNCException {
        markLeafReplace("ipAddress");
    }

    /**
     * Marks the leaf "ip-address" with operation "merge".
     */
    public void markIpAddressMerge() throws JNCException {
        markLeafMerge("ipAddress");
    }

    /**
     * Marks the leaf "ip-address" with operation "create".
     */
    public void markIpAddressCreate() throws JNCException {
        markLeafCreate("ipAddress");
    }

    /**
     * Marks the leaf "ip-address" with operation "delete".
     */
    public void markIpAddressDelete() throws JNCException {
        markLeafDelete("ipAddress");
    }

    /* Access methods for optional leaf child: "port-number". */

    /**
     * Gets the value for child leaf "port-number".
     * @return The value of the leaf.
     */
    public YangUInt16 getPortNumberValue() throws JNCException {
        YangUInt16 portNumber = (YangUInt16)getValue("port-number");
        if (portNumber == null) {
            portNumber = new YangUInt16("3868");  // default
        }
        return portNumber;
    }

    /**
     * Sets the value for child leaf "port-number",
     * using instance of generated typedef class.
     * @param portNumberValue The value to set.
     * @param portNumberValue used during instantiation.
     */
    public void setPortNumberValue(YangUInt16 portNumberValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "port-number",
            portNumberValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "port-number",
     * using Java primitive values.
     * @param portNumberValue used during instantiation.
     */
    public void setPortNumberValue(int portNumberValue) throws JNCException {
        setPortNumberValue(new YangUInt16(portNumberValue));
    }

    /**
     * Sets the value for child leaf "port-number",
     * using a String value.
     * @param portNumberValue used during instantiation.
     */
    public void setPortNumberValue(String portNumberValue) throws JNCException {
        setPortNumberValue(new YangUInt16(portNumberValue));
    }

    /**
     * Unsets the value for child leaf "port-number".
     */
    public void unsetPortNumberValue() throws JNCException {
        delete("port-number");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "port-number" leaf will not have a value.
     */
    public void addPortNumber() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "port-number",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "port-number" with operation "replace".
     */
    public void markPortNumberReplace() throws JNCException {
        markLeafReplace("portNumber");
    }

    /**
     * Marks the leaf "port-number" with operation "merge".
     */
    public void markPortNumberMerge() throws JNCException {
        markLeafMerge("portNumber");
    }

    /**
     * Marks the leaf "port-number" with operation "create".
     */
    public void markPortNumberCreate() throws JNCException {
        markLeafCreate("portNumber");
    }

    /**
     * Marks the leaf "port-number" with operation "delete".
     */
    public void markPortNumberDelete() throws JNCException {
        markLeafDelete("portNumber");
    }

    /* Access methods for optional leaf child: "ip-address2". */

    /**
     * Gets the value for child leaf "ip-address2".
     * @return The value of the leaf.
     */
    public IpAddress getIpAddress2Value() throws JNCException {
        IpAddress ipAddress2 = (IpAddress)getValue("ip-address2");
        if (ipAddress2 == null) {
            ipAddress2 = new IpAddress("0.0.0.0");  // default
        }
        return ipAddress2;
    }

    /**
     * Sets the value for child leaf "ip-address2",
     * using a JNC type value.
     * @param ipAddress2Value The value to set.
     * @param ipAddress2Value used during instantiation.
     */
    public void setIpAddress2Value(IpAddress ipAddress2Value)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address2",
            ipAddress2Value,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address2",
     * using a String value.
     * @param ipAddress2Value used during instantiation.
     */
    public void setIpAddress2Value(String ipAddress2Value) throws JNCException {
        setIpAddress2Value(new IpAddress(ipAddress2Value));
    }

    /**
     * Unsets the value for child leaf "ip-address2".
     */
    public void unsetIpAddress2Value() throws JNCException {
        delete("ip-address2");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address2" leaf will not have a value.
     */
    public void addIpAddress2() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address2",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address2" with operation "replace".
     */
    public void markIpAddress2Replace() throws JNCException {
        markLeafReplace("ipAddress2");
    }

    /**
     * Marks the leaf "ip-address2" with operation "merge".
     */
    public void markIpAddress2Merge() throws JNCException {
        markLeafMerge("ipAddress2");
    }

    /**
     * Marks the leaf "ip-address2" with operation "create".
     */
    public void markIpAddress2Create() throws JNCException {
        markLeafCreate("ipAddress2");
    }

    /**
     * Marks the leaf "ip-address2" with operation "delete".
     */
    public void markIpAddress2Delete() throws JNCException {
        markLeafDelete("ipAddress2");
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