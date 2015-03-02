/* 
 * @(#)MmeFgwEnodeb.java        1.0 09/12/14
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

import Leaf;

import YangString;

import YangUInt32;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/s1/mme-fgw-enodeb"
 * <p>
 * See line 821 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeFgwEnodeb extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeFgwEnodeb object.
     */
    public MmeFgwEnodeb() {
        super(Epc.NAMESPACE, "mme-fgw-enodeb");
    }

    /**
     * Constructor for an initialized MmeFgwEnodeb object,
     * 
     * @param plmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public MmeFgwEnodeb(YangString plmnIdValue, YangUInt32 enodebIdValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-fgw-enodeb");
        Leaf plmnId = new Leaf(Epc.NAMESPACE, "plmn-id");
        plmnId.setValue(plmnIdValue);
        insertChild(plmnId, childrenNames());
        Leaf enodebId = new Leaf(Epc.NAMESPACE, "enodeb-id");
        enodebId.setValue(enodebIdValue);
        insertChild(enodebId, childrenNames());
    }

    /**
     * Constructor for an initialized MmeFgwEnodeb object,
     * with String keys.
     * @param plmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public MmeFgwEnodeb(String plmnIdValue, String enodebIdValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-fgw-enodeb");
        Leaf plmnId = new Leaf(Epc.NAMESPACE, "plmn-id");
        plmnId.setValue(new YangString(plmnIdValue));
        insertChild(plmnId, childrenNames());
        Leaf enodebId = new Leaf(Epc.NAMESPACE, "enodeb-id");
        enodebId.setValue(new YangUInt32(enodebIdValue));
        insertChild(enodebId, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeFgwEnodeb clone() {
        MmeFgwEnodeb copy;
        try {
            copy = new MmeFgwEnodeb(getPlmnIdValue().toString(), getEnodebIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFgwEnodeb)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeFgwEnodeb cloneShallow() {
        MmeFgwEnodeb copy;
        try {
            copy = new MmeFgwEnodeb(getPlmnIdValue().toString(), getEnodebIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFgwEnodeb)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "plmn-id",
            "enodeb-id",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "plmn-id",
            "enodeb-id",
            "ip-address1",
            "unit-id",
            "ip-address2",
        };
    }

    /* Access methods for leaf child: "plmn-id". */

    /**
     * Gets the value for child leaf "plmn-id".
     * @return The value of the leaf.
     */
    public YangString getPlmnIdValue() throws JNCException {
        return (YangString)getValue("plmn-id");
    }

    /**
     * Sets the value for child leaf "plmn-id",
     * using instance of generated typedef class.
     * @param plmnIdValue The value to set.
     * @param plmnIdValue used during instantiation.
     */
    public void setPlmnIdValue(YangString plmnIdValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "plmn-id",
            plmnIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "plmn-id",
     * using a String value.
     * @param plmnIdValue used during instantiation.
     */
    public void setPlmnIdValue(String plmnIdValue) throws JNCException {
        setPlmnIdValue(new YangString(plmnIdValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "plmn-id" leaf will not have a value.
     */
    public void addPlmnId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "plmn-id",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "enodeb-id". */

    /**
     * Gets the value for child leaf "enodeb-id".
     * @return The value of the leaf.
     */
    public YangUInt32 getEnodebIdValue() throws JNCException {
        return (YangUInt32)getValue("enodeb-id");
    }

    /**
     * Sets the value for child leaf "enodeb-id",
     * using instance of generated typedef class.
     * @param enodebIdValue The value to set.
     * @param enodebIdValue used during instantiation.
     */
    public void setEnodebIdValue(YangUInt32 enodebIdValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "enodeb-id",
            enodebIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "enodeb-id",
     * using Java primitive values.
     * @param enodebIdValue used during instantiation.
     */
    public void setEnodebIdValue(long enodebIdValue) throws JNCException {
        setEnodebIdValue(new YangUInt32(enodebIdValue));
    }

    /**
     * Sets the value for child leaf "enodeb-id",
     * using a String value.
     * @param enodebIdValue used during instantiation.
     */
    public void setEnodebIdValue(String enodebIdValue) throws JNCException {
        setEnodebIdValue(new YangUInt32(enodebIdValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "enodeb-id" leaf will not have a value.
     */
    public void addEnodebId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "enodeb-id",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "ip-address1". */

    /**
     * Gets the value for child leaf "ip-address1".
     * @return The value of the leaf.
     */
    public IpAddress getIpAddress1Value() throws JNCException {
        return (IpAddress)getValue("ip-address1");
    }

    /**
     * Sets the value for child leaf "ip-address1",
     * using a JNC type value.
     * @param ipAddress1Value The value to set.
     * @param ipAddress1Value used during instantiation.
     */
    public void setIpAddress1Value(IpAddress ipAddress1Value)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address1",
            ipAddress1Value,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address1",
     * using a String value.
     * @param ipAddress1Value used during instantiation.
     */
    public void setIpAddress1Value(String ipAddress1Value) throws JNCException {
        setIpAddress1Value(new IpAddress(ipAddress1Value));
    }

    /**
     * Unsets the value for child leaf "ip-address1".
     */
    public void unsetIpAddress1Value() throws JNCException {
        delete("ip-address1");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address1" leaf will not have a value.
     */
    public void addIpAddress1() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address1",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address1" with operation "replace".
     */
    public void markIpAddress1Replace() throws JNCException {
        markLeafReplace("ipAddress1");
    }

    /**
     * Marks the leaf "ip-address1" with operation "merge".
     */
    public void markIpAddress1Merge() throws JNCException {
        markLeafMerge("ipAddress1");
    }

    /**
     * Marks the leaf "ip-address1" with operation "create".
     */
    public void markIpAddress1Create() throws JNCException {
        markLeafCreate("ipAddress1");
    }

    /**
     * Marks the leaf "ip-address1" with operation "delete".
     */
    public void markIpAddress1Delete() throws JNCException {
        markLeafDelete("ipAddress1");
    }

    /* Access methods for optional leaf child: "unit-id". */

    /**
     * Gets the value for child leaf "unit-id".
     * @return The value of the leaf.
     */
    public YangUInt16 getUnitIdValue() throws JNCException {
        return (YangUInt16)getValue("unit-id");
    }

    /**
     * Sets the value for child leaf "unit-id",
     * using instance of generated typedef class.
     * @param unitIdValue The value to set.
     * @param unitIdValue used during instantiation.
     */
    public void setUnitIdValue(YangUInt16 unitIdValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "unit-id",
            unitIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "unit-id",
     * using Java primitive values.
     * @param unitIdValue used during instantiation.
     */
    public void setUnitIdValue(int unitIdValue) throws JNCException {
        setUnitIdValue(new YangUInt16(unitIdValue));
    }

    /**
     * Sets the value for child leaf "unit-id",
     * using a String value.
     * @param unitIdValue used during instantiation.
     */
    public void setUnitIdValue(String unitIdValue) throws JNCException {
        setUnitIdValue(new YangUInt16(unitIdValue));
    }

    /**
     * Unsets the value for child leaf "unit-id".
     */
    public void unsetUnitIdValue() throws JNCException {
        delete("unit-id");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "unit-id" leaf will not have a value.
     */
    public void addUnitId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "unit-id",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "unit-id" with operation "replace".
     */
    public void markUnitIdReplace() throws JNCException {
        markLeafReplace("unitId");
    }

    /**
     * Marks the leaf "unit-id" with operation "merge".
     */
    public void markUnitIdMerge() throws JNCException {
        markLeafMerge("unitId");
    }

    /**
     * Marks the leaf "unit-id" with operation "create".
     */
    public void markUnitIdCreate() throws JNCException {
        markLeafCreate("unitId");
    }

    /**
     * Marks the leaf "unit-id" with operation "delete".
     */
    public void markUnitIdDelete() throws JNCException {
        markLeafDelete("unitId");
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
