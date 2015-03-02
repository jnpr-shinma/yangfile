/* 
 * @(#)MmeFgwS1Interface.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw.interface_.s1;
import .ietfInetTypes.Ipv4Address;
import .ietfInetTypes.Ipv6Address;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangUInt16;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/interface_/s1/mme-fgw-s1-interface"
 * <p>
 * See line 1255 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeFgwS1Interface extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeFgwS1Interface object.
     */
    public MmeFgwS1Interface() {
        super(Epc.NAMESPACE, "mme-fgw-s1-interface");
    }

    /**
     * Constructor for an initialized MmeFgwS1Interface object,
     * 
     * @param callpServiceIdValue Key argument of child.
     */
    public MmeFgwS1Interface(YangUInt16 callpServiceIdValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-fgw-s1-interface");
        Leaf callpServiceId = new Leaf(Epc.NAMESPACE, "callp-service-id");
        callpServiceId.setValue(callpServiceIdValue);
        insertChild(callpServiceId, childrenNames());
    }

    /**
     * Constructor for an initialized MmeFgwS1Interface object,
     * with String keys.
     * @param callpServiceIdValue Key argument of child.
     */
    public MmeFgwS1Interface(String callpServiceIdValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-fgw-s1-interface");
        Leaf callpServiceId = new Leaf(Epc.NAMESPACE, "callp-service-id");
        callpServiceId.setValue(new YangUInt16(callpServiceIdValue));
        insertChild(callpServiceId, childrenNames());
    }

    /**
     * Constructor for an initialized MmeFgwS1Interface object,
     * with keys of built in Java types.
     * @param callpServiceIdValue Key argument of child.
     */
    public MmeFgwS1Interface(int callpServiceIdValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-fgw-s1-interface");
        Leaf callpServiceId = new Leaf(Epc.NAMESPACE, "callp-service-id");
        callpServiceId.setValue(new YangUInt16(callpServiceIdValue));
        insertChild(callpServiceId, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeFgwS1Interface clone() {
        MmeFgwS1Interface copy;
        try {
            copy = new MmeFgwS1Interface(getCallpServiceIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFgwS1Interface)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeFgwS1Interface cloneShallow() {
        MmeFgwS1Interface copy;
        try {
            copy = new MmeFgwS1Interface(getCallpServiceIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFgwS1Interface)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "callp-service-id",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "callp-service-id",
            "routing-instance1",
            "routing-instance2",
            "ip-address1-v4",
            "ip-address2-v4",
            "ip-address1-v6",
            "ip-address2-v6",
            "port",
        };
    }

    /* Access methods for leaf child: "callp-service-id". */

    /**
     * Gets the value for child leaf "callp-service-id".
     * @return The value of the leaf.
     */
    public YangUInt16 getCallpServiceIdValue() throws JNCException {
        return (YangUInt16)getValue("callp-service-id");
    }

    /**
     * Sets the value for child leaf "callp-service-id",
     * using instance of generated typedef class.
     * @param callpServiceIdValue The value to set.
     * @param callpServiceIdValue used during instantiation.
     */
    public void setCallpServiceIdValue(YangUInt16 callpServiceIdValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "callp-service-id",
            callpServiceIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "callp-service-id",
     * using Java primitive values.
     * @param callpServiceIdValue used during instantiation.
     */
    public void setCallpServiceIdValue(int callpServiceIdValue)
            throws JNCException {
        setCallpServiceIdValue(new YangUInt16(callpServiceIdValue));
    }

    /**
     * Sets the value for child leaf "callp-service-id",
     * using a String value.
     * @param callpServiceIdValue used during instantiation.
     */
    public void setCallpServiceIdValue(String callpServiceIdValue)
            throws JNCException {
        setCallpServiceIdValue(new YangUInt16(callpServiceIdValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "callp-service-id" leaf will not have a value.
     */
    public void addCallpServiceId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "callp-service-id",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "routing-instance1". */

    /**
     * Gets the value for child leaf "routing-instance1".
     * @return The value of the leaf.
     */
    public YangString getRoutingInstance1Value() throws JNCException {
        return (YangString)getValue("routing-instance1");
    }

    /**
     * Sets the value for child leaf "routing-instance1",
     * using instance of generated typedef class.
     * @param routingInstance1Value The value to set.
     * @param routingInstance1Value used during instantiation.
     */
    public void setRoutingInstance1Value(YangString routingInstance1Value)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance1",
            routingInstance1Value,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "routing-instance1",
     * using a String value.
     * @param routingInstance1Value used during instantiation.
     */
    public void setRoutingInstance1Value(String routingInstance1Value)
            throws JNCException {
        setRoutingInstance1Value(new YangString(routingInstance1Value));
    }

    /**
     * Unsets the value for child leaf "routing-instance1".
     */
    public void unsetRoutingInstance1Value() throws JNCException {
        delete("routing-instance1");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "routing-instance1" leaf will not have a value.
     */
    public void addRoutingInstance1() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance1",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "routing-instance1" with operation "replace".
     */
    public void markRoutingInstance1Replace() throws JNCException {
        markLeafReplace("routingInstance1");
    }

    /**
     * Marks the leaf "routing-instance1" with operation "merge".
     */
    public void markRoutingInstance1Merge() throws JNCException {
        markLeafMerge("routingInstance1");
    }

    /**
     * Marks the leaf "routing-instance1" with operation "create".
     */
    public void markRoutingInstance1Create() throws JNCException {
        markLeafCreate("routingInstance1");
    }

    /**
     * Marks the leaf "routing-instance1" with operation "delete".
     */
    public void markRoutingInstance1Delete() throws JNCException {
        markLeafDelete("routingInstance1");
    }

    /* Access methods for optional leaf child: "routing-instance2". */

    /**
     * Gets the value for child leaf "routing-instance2".
     * @return The value of the leaf.
     */
    public YangString getRoutingInstance2Value() throws JNCException {
        return (YangString)getValue("routing-instance2");
    }

    /**
     * Sets the value for child leaf "routing-instance2",
     * using instance of generated typedef class.
     * @param routingInstance2Value The value to set.
     * @param routingInstance2Value used during instantiation.
     */
    public void setRoutingInstance2Value(YangString routingInstance2Value)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance2",
            routingInstance2Value,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "routing-instance2",
     * using a String value.
     * @param routingInstance2Value used during instantiation.
     */
    public void setRoutingInstance2Value(String routingInstance2Value)
            throws JNCException {
        setRoutingInstance2Value(new YangString(routingInstance2Value));
    }

    /**
     * Unsets the value for child leaf "routing-instance2".
     */
    public void unsetRoutingInstance2Value() throws JNCException {
        delete("routing-instance2");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "routing-instance2" leaf will not have a value.
     */
    public void addRoutingInstance2() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance2",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "routing-instance2" with operation "replace".
     */
    public void markRoutingInstance2Replace() throws JNCException {
        markLeafReplace("routingInstance2");
    }

    /**
     * Marks the leaf "routing-instance2" with operation "merge".
     */
    public void markRoutingInstance2Merge() throws JNCException {
        markLeafMerge("routingInstance2");
    }

    /**
     * Marks the leaf "routing-instance2" with operation "create".
     */
    public void markRoutingInstance2Create() throws JNCException {
        markLeafCreate("routingInstance2");
    }

    /**
     * Marks the leaf "routing-instance2" with operation "delete".
     */
    public void markRoutingInstance2Delete() throws JNCException {
        markLeafDelete("routingInstance2");
    }

    /* Access methods for optional leaf child: "ip-address1-v4". */

    /**
     * Gets the value for child leaf "ip-address1-v4".
     * @return The value of the leaf.
     */
    public Ipv4Address getIpAddress1V4Value() throws JNCException {
        Ipv4Address ipAddress1V4 = (Ipv4Address)getValue("ip-address1-v4");
        if (ipAddress1V4 == null) {
            ipAddress1V4 = new Ipv4Address("0.0.0.0");  // default
        }
        return ipAddress1V4;
    }

    /**
     * Sets the value for child leaf "ip-address1-v4",
     * using a JNC type value.
     * @param ipAddress1V4Value The value to set.
     * @param ipAddress1V4Value used during instantiation.
     */
    public void setIpAddress1V4Value(Ipv4Address ipAddress1V4Value)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address1-v4",
            ipAddress1V4Value,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address1-v4",
     * using a String value.
     * @param ipAddress1V4Value used during instantiation.
     */
    public void setIpAddress1V4Value(String ipAddress1V4Value)
            throws JNCException {
        setIpAddress1V4Value(new Ipv4Address(ipAddress1V4Value));
    }

    /**
     * Unsets the value for child leaf "ip-address1-v4".
     */
    public void unsetIpAddress1V4Value() throws JNCException {
        delete("ip-address1-v4");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address1-v4" leaf will not have a value.
     */
    public void addIpAddress1V4() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address1-v4",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address1-v4" with operation "replace".
     */
    public void markIpAddress1V4Replace() throws JNCException {
        markLeafReplace("ipAddress1V4");
    }

    /**
     * Marks the leaf "ip-address1-v4" with operation "merge".
     */
    public void markIpAddress1V4Merge() throws JNCException {
        markLeafMerge("ipAddress1V4");
    }

    /**
     * Marks the leaf "ip-address1-v4" with operation "create".
     */
    public void markIpAddress1V4Create() throws JNCException {
        markLeafCreate("ipAddress1V4");
    }

    /**
     * Marks the leaf "ip-address1-v4" with operation "delete".
     */
    public void markIpAddress1V4Delete() throws JNCException {
        markLeafDelete("ipAddress1V4");
    }

    /* Access methods for optional leaf child: "ip-address2-v4". */

    /**
     * Gets the value for child leaf "ip-address2-v4".
     * @return The value of the leaf.
     */
    public Ipv4Address getIpAddress2V4Value() throws JNCException {
        Ipv4Address ipAddress2V4 = (Ipv4Address)getValue("ip-address2-v4");
        if (ipAddress2V4 == null) {
            ipAddress2V4 = new Ipv4Address("0.0.0.0");  // default
        }
        return ipAddress2V4;
    }

    /**
     * Sets the value for child leaf "ip-address2-v4",
     * using a JNC type value.
     * @param ipAddress2V4Value The value to set.
     * @param ipAddress2V4Value used during instantiation.
     */
    public void setIpAddress2V4Value(Ipv4Address ipAddress2V4Value)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address2-v4",
            ipAddress2V4Value,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address2-v4",
     * using a String value.
     * @param ipAddress2V4Value used during instantiation.
     */
    public void setIpAddress2V4Value(String ipAddress2V4Value)
            throws JNCException {
        setIpAddress2V4Value(new Ipv4Address(ipAddress2V4Value));
    }

    /**
     * Unsets the value for child leaf "ip-address2-v4".
     */
    public void unsetIpAddress2V4Value() throws JNCException {
        delete("ip-address2-v4");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address2-v4" leaf will not have a value.
     */
    public void addIpAddress2V4() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address2-v4",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address2-v4" with operation "replace".
     */
    public void markIpAddress2V4Replace() throws JNCException {
        markLeafReplace("ipAddress2V4");
    }

    /**
     * Marks the leaf "ip-address2-v4" with operation "merge".
     */
    public void markIpAddress2V4Merge() throws JNCException {
        markLeafMerge("ipAddress2V4");
    }

    /**
     * Marks the leaf "ip-address2-v4" with operation "create".
     */
    public void markIpAddress2V4Create() throws JNCException {
        markLeafCreate("ipAddress2V4");
    }

    /**
     * Marks the leaf "ip-address2-v4" with operation "delete".
     */
    public void markIpAddress2V4Delete() throws JNCException {
        markLeafDelete("ipAddress2V4");
    }

    /* Access methods for optional leaf child: "ip-address1-v6". */

    /**
     * Gets the value for child leaf "ip-address1-v6".
     * @return The value of the leaf.
     */
    public Ipv6Address getIpAddress1V6Value() throws JNCException {
        Ipv6Address ipAddress1V6 = (Ipv6Address)getValue("ip-address1-v6");
        if (ipAddress1V6 == null) {
            ipAddress1V6 = new Ipv6Address("0:0:0:0:0:0:0:0");  // default
        }
        return ipAddress1V6;
    }

    /**
     * Sets the value for child leaf "ip-address1-v6",
     * using a JNC type value.
     * @param ipAddress1V6Value The value to set.
     * @param ipAddress1V6Value used during instantiation.
     */
    public void setIpAddress1V6Value(Ipv6Address ipAddress1V6Value)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address1-v6",
            ipAddress1V6Value,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address1-v6",
     * using a String value.
     * @param ipAddress1V6Value used during instantiation.
     */
    public void setIpAddress1V6Value(String ipAddress1V6Value)
            throws JNCException {
        setIpAddress1V6Value(new Ipv6Address(ipAddress1V6Value));
    }

    /**
     * Unsets the value for child leaf "ip-address1-v6".
     */
    public void unsetIpAddress1V6Value() throws JNCException {
        delete("ip-address1-v6");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address1-v6" leaf will not have a value.
     */
    public void addIpAddress1V6() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address1-v6",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address1-v6" with operation "replace".
     */
    public void markIpAddress1V6Replace() throws JNCException {
        markLeafReplace("ipAddress1V6");
    }

    /**
     * Marks the leaf "ip-address1-v6" with operation "merge".
     */
    public void markIpAddress1V6Merge() throws JNCException {
        markLeafMerge("ipAddress1V6");
    }

    /**
     * Marks the leaf "ip-address1-v6" with operation "create".
     */
    public void markIpAddress1V6Create() throws JNCException {
        markLeafCreate("ipAddress1V6");
    }

    /**
     * Marks the leaf "ip-address1-v6" with operation "delete".
     */
    public void markIpAddress1V6Delete() throws JNCException {
        markLeafDelete("ipAddress1V6");
    }

    /* Access methods for optional leaf child: "ip-address2-v6". */

    /**
     * Gets the value for child leaf "ip-address2-v6".
     * @return The value of the leaf.
     */
    public Ipv6Address getIpAddress2V6Value() throws JNCException {
        Ipv6Address ipAddress2V6 = (Ipv6Address)getValue("ip-address2-v6");
        if (ipAddress2V6 == null) {
            ipAddress2V6 = new Ipv6Address("0:0:0:0:0:0:0:0");  // default
        }
        return ipAddress2V6;
    }

    /**
     * Sets the value for child leaf "ip-address2-v6",
     * using a JNC type value.
     * @param ipAddress2V6Value The value to set.
     * @param ipAddress2V6Value used during instantiation.
     */
    public void setIpAddress2V6Value(Ipv6Address ipAddress2V6Value)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address2-v6",
            ipAddress2V6Value,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address2-v6",
     * using a String value.
     * @param ipAddress2V6Value used during instantiation.
     */
    public void setIpAddress2V6Value(String ipAddress2V6Value)
            throws JNCException {
        setIpAddress2V6Value(new Ipv6Address(ipAddress2V6Value));
    }

    /**
     * Unsets the value for child leaf "ip-address2-v6".
     */
    public void unsetIpAddress2V6Value() throws JNCException {
        delete("ip-address2-v6");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address2-v6" leaf will not have a value.
     */
    public void addIpAddress2V6() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address2-v6",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address2-v6" with operation "replace".
     */
    public void markIpAddress2V6Replace() throws JNCException {
        markLeafReplace("ipAddress2V6");
    }

    /**
     * Marks the leaf "ip-address2-v6" with operation "merge".
     */
    public void markIpAddress2V6Merge() throws JNCException {
        markLeafMerge("ipAddress2V6");
    }

    /**
     * Marks the leaf "ip-address2-v6" with operation "create".
     */
    public void markIpAddress2V6Create() throws JNCException {
        markLeafCreate("ipAddress2V6");
    }

    /**
     * Marks the leaf "ip-address2-v6" with operation "delete".
     */
    public void markIpAddress2V6Delete() throws JNCException {
        markLeafDelete("ipAddress2V6");
    }

    /* Access methods for optional leaf child: "port". */

    /**
     * Gets the value for child leaf "port".
     * @return The value of the leaf.
     */
    public YangUInt32 getPortValue() throws JNCException {
        YangUInt32 port = (YangUInt32)getValue("port");
        if (port == null) {
            port = new YangUInt32("36412");  // default
        }
        return port;
    }

    /**
     * Sets the value for child leaf "port",
     * using instance of generated typedef class.
     * @param portValue The value to set.
     * @param portValue used during instantiation.
     */
    public void setPortValue(YangUInt32 portValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "port",
            portValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "port",
     * using Java primitive values.
     * @param portValue used during instantiation.
     */
    public void setPortValue(long portValue) throws JNCException {
        setPortValue(new YangUInt32(portValue));
    }

    /**
     * Sets the value for child leaf "port",
     * using a String value.
     * @param portValue used during instantiation.
     */
    public void setPortValue(String portValue) throws JNCException {
        setPortValue(new YangUInt32(portValue));
    }

    /**
     * Unsets the value for child leaf "port".
     */
    public void unsetPortValue() throws JNCException {
        delete("port");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "port" leaf will not have a value.
     */
    public void addPort() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "port",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "port" with operation "replace".
     */
    public void markPortReplace() throws JNCException {
        markLeafReplace("port");
    }

    /**
     * Marks the leaf "port" with operation "merge".
     */
    public void markPortMerge() throws JNCException {
        markLeafMerge("port");
    }

    /**
     * Marks the leaf "port" with operation "create".
     */
    public void markPortCreate() throws JNCException {
        markLeafCreate("port");
    }

    /**
     * Marks the leaf "port" with operation "delete".
     */
    public void markPortDelete() throws JNCException {
        markLeafDelete("port");
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