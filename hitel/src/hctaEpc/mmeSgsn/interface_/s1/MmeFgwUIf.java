/* 
 * @(#)MmeFgwUIf.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.s1;
import .ietfInetTypes.IpAddress;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/s1/mme-fgw-u-if"
 * <p>
 * See line 1428 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeFgwUIf extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeFgwUIf object.
     */
    public MmeFgwUIf() {
        super(Epc.NAMESPACE, "mme-fgw-u-if");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeFgwUIf clone() {
        return (MmeFgwUIf)cloneContent(new MmeFgwUIf());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeFgwUIf cloneShallow() {
        return (MmeFgwUIf)cloneShallowContent(new MmeFgwUIf());
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
            "routing-instance",
            "ip-address",
        };
    }

    /* Access methods for optional leaf child: "routing-instance". */

    /**
     * Gets the value for child leaf "routing-instance".
     * @return The value of the leaf.
     */
    public YangString getRoutingInstanceValue() throws JNCException {
        return (YangString)getValue("routing-instance");
    }

    /**
     * Sets the value for child leaf "routing-instance",
     * using instance of generated typedef class.
     * @param routingInstanceValue The value to set.
     * @param routingInstanceValue used during instantiation.
     */
    public void setRoutingInstanceValue(YangString routingInstanceValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance",
            routingInstanceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "routing-instance",
     * using a String value.
     * @param routingInstanceValue used during instantiation.
     */
    public void setRoutingInstanceValue(String routingInstanceValue)
            throws JNCException {
        setRoutingInstanceValue(new YangString(routingInstanceValue));
    }

    /**
     * Unsets the value for child leaf "routing-instance".
     */
    public void unsetRoutingInstanceValue() throws JNCException {
        delete("routing-instance");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "routing-instance" leaf will not have a value.
     */
    public void addRoutingInstance() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "routing-instance" with operation "replace".
     */
    public void markRoutingInstanceReplace() throws JNCException {
        markLeafReplace("routingInstance");
    }

    /**
     * Marks the leaf "routing-instance" with operation "merge".
     */
    public void markRoutingInstanceMerge() throws JNCException {
        markLeafMerge("routingInstance");
    }

    /**
     * Marks the leaf "routing-instance" with operation "create".
     */
    public void markRoutingInstanceCreate() throws JNCException {
        markLeafCreate("routingInstance");
    }

    /**
     * Marks the leaf "routing-instance" with operation "delete".
     */
    public void markRoutingInstanceDelete() throws JNCException {
        markLeafDelete("routingInstance");
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
