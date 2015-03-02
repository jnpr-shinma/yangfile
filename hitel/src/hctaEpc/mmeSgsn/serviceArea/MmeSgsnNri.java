/* 
 * @(#)MmeSgsnNri.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.serviceArea;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangString;

import YangUInt8;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/serviceArea/mme-sgsn-nri"
 * <p>
 * See line 835 in
 * sgsnScConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeSgsnNri extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeSgsnNri object.
     */
    public MmeSgsnNri() {
        super(Epc.NAMESPACE, "mme-sgsn-nri");
    }

    /**
     * Constructor for an initialized MmeSgsnNri object,
     * 
     * @param nriNumberValue Key argument of child.
     * @param poolNameValue Key argument of child.
     */
    public MmeSgsnNri(YangUInt8 nriNumberValue, YangString poolNameValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-sgsn-nri");
        Leaf nriNumber = new Leaf(Epc.NAMESPACE, "nri-number");
        nriNumber.setValue(nriNumberValue);
        insertChild(nriNumber, childrenNames());
        Leaf poolName = new Leaf(Epc.NAMESPACE, "pool-name");
        poolName.setValue(poolNameValue);
        insertChild(poolName, childrenNames());
    }

    /**
     * Constructor for an initialized MmeSgsnNri object,
     * with String keys.
     * @param nriNumberValue Key argument of child.
     * @param poolNameValue Key argument of child.
     */
    public MmeSgsnNri(String nriNumberValue, String poolNameValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-sgsn-nri");
        Leaf nriNumber = new Leaf(Epc.NAMESPACE, "nri-number");
        nriNumber.setValue(new YangUInt8(nriNumberValue));
        insertChild(nriNumber, childrenNames());
        Leaf poolName = new Leaf(Epc.NAMESPACE, "pool-name");
        poolName.setValue(new YangString(poolNameValue));
        insertChild(poolName, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeSgsnNri clone() {
        MmeSgsnNri copy;
        try {
            copy = new MmeSgsnNri(getNriNumberValue().toString(), getPoolNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeSgsnNri)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeSgsnNri cloneShallow() {
        MmeSgsnNri copy;
        try {
            copy = new MmeSgsnNri(getNriNumberValue().toString(), getPoolNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeSgsnNri)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "nri-number",
            "pool-name",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "nri-number",
            "pool-name",
            "nri-type",
            "ip-address-list",
        };
    }

    /* Access methods for leaf child: "nri-number". */

    /**
     * Gets the value for child leaf "nri-number".
     * @return The value of the leaf.
     */
    public YangUInt8 getNriNumberValue() throws JNCException {
        return (YangUInt8)getValue("nri-number");
    }

    /**
     * Sets the value for child leaf "nri-number",
     * using instance of generated typedef class.
     * @param nriNumberValue The value to set.
     * @param nriNumberValue used during instantiation.
     */
    public void setNriNumberValue(YangUInt8 nriNumberValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nri-number",
            nriNumberValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "nri-number",
     * using Java primitive values.
     * @param nriNumberValue used during instantiation.
     */
    public void setNriNumberValue(short nriNumberValue) throws JNCException {
        setNriNumberValue(new YangUInt8(nriNumberValue));
    }

    /**
     * Sets the value for child leaf "nri-number",
     * using a String value.
     * @param nriNumberValue used during instantiation.
     */
    public void setNriNumberValue(String nriNumberValue) throws JNCException {
        setNriNumberValue(new YangUInt8(nriNumberValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "nri-number" leaf will not have a value.
     */
    public void addNriNumber() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nri-number",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "pool-name". */

    /**
     * Gets the value for child leaf "pool-name".
     * @return The value of the leaf.
     */
    public YangString getPoolNameValue() throws JNCException {
        return (YangString)getValue("pool-name");
    }

    /**
     * Sets the value for child leaf "pool-name",
     * using instance of generated typedef class.
     * @param poolNameValue The value to set.
     * @param poolNameValue used during instantiation.
     */
    public void setPoolNameValue(YangString poolNameValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pool-name",
            poolNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "pool-name",
     * using a String value.
     * @param poolNameValue used during instantiation.
     */
    public void setPoolNameValue(String poolNameValue) throws JNCException {
        setPoolNameValue(new YangString(poolNameValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "pool-name" leaf will not have a value.
     */
    public void addPoolName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pool-name",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "nri-type". */

    /**
     * Gets the value for child leaf "nri-type".
     * @return The value of the leaf.
     */
    public YangEnumeration getNriTypeValue() throws JNCException {
        return (YangEnumeration)getValue("nri-type");
    }

    /**
     * Sets the value for child leaf "nri-type",
     * using instance of generated typedef class.
     * @param nriTypeValue The value to set.
     * @param nriTypeValue used during instantiation.
     */
    public void setNriTypeValue(YangEnumeration nriTypeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nri-type",
            nriTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "nri-type",
     * using a String value.
     * @param nriTypeValue used during instantiation.
     */
    public void setNriTypeValue(String nriTypeValue) throws JNCException {
        setNriTypeValue(new YangEnumeration(nriTypeValue, new String[] {
             "local-nri",
             "pool-nri",
             "null-nri",
        }));
    }

    /**
     * Unsets the value for child leaf "nri-type".
     */
    public void unsetNriTypeValue() throws JNCException {
        delete("nri-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "nri-type" leaf will not have a value.
     */
    public void addNriType() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nri-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "nri-type" with operation "replace".
     */
    public void markNriTypeReplace() throws JNCException {
        markLeafReplace("nriType");
    }

    /**
     * Marks the leaf "nri-type" with operation "merge".
     */
    public void markNriTypeMerge() throws JNCException {
        markLeafMerge("nriType");
    }

    /**
     * Marks the leaf "nri-type" with operation "create".
     */
    public void markNriTypeCreate() throws JNCException {
        markLeafCreate("nriType");
    }

    /**
     * Marks the leaf "nri-type" with operation "delete".
     */
    public void markNriTypeDelete() throws JNCException {
        markLeafDelete("nriType");
    }

    /* Access methods for optional leaf child: "ip-address-list". */

    /**
     * Gets the value for child leaf "ip-address-list".
     * @return The value of the leaf.
     */
    public YangString getIpAddressListValue() throws JNCException {
        return (YangString)getValue("ip-address-list");
    }

    /**
     * Sets the value for child leaf "ip-address-list",
     * using instance of generated typedef class.
     * @param ipAddressListValue The value to set.
     * @param ipAddressListValue used during instantiation.
     */
    public void setIpAddressListValue(YangString ipAddressListValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address-list",
            ipAddressListValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address-list",
     * using a String value.
     * @param ipAddressListValue used during instantiation.
     */
    public void setIpAddressListValue(String ipAddressListValue)
            throws JNCException {
        setIpAddressListValue(new YangString(ipAddressListValue));
    }

    /**
     * Unsets the value for child leaf "ip-address-list".
     */
    public void unsetIpAddressListValue() throws JNCException {
        delete("ip-address-list");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address-list" leaf will not have a value.
     */
    public void addIpAddressList() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address-list",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address-list" with operation "replace".
     */
    public void markIpAddressListReplace() throws JNCException {
        markLeafReplace("ipAddressList");
    }

    /**
     * Marks the leaf "ip-address-list" with operation "merge".
     */
    public void markIpAddressListMerge() throws JNCException {
        markLeafMerge("ipAddressList");
    }

    /**
     * Marks the leaf "ip-address-list" with operation "create".
     */
    public void markIpAddressListCreate() throws JNCException {
        markLeafCreate("ipAddressList");
    }

    /**
     * Marks the leaf "ip-address-list" with operation "delete".
     */
    public void markIpAddressListDelete() throws JNCException {
        markLeafDelete("ipAddressList");
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
