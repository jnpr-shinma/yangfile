/* 
 * @(#)MmeStaticNseRemoteEndpoint.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.gb;
import .ietfInetTypes.Ipv4Address;

import Element;

import Epc;

import JNCException;

import Leaf;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/gb/mme-static-nse-remote-endpoint"
 * <p>
 * See line 349 in
 * gtlConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeStaticNseRemoteEndpoint extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeStaticNseRemoteEndpoint object.
     */
    public MmeStaticNseRemoteEndpoint() {
        super(Epc.NAMESPACE, "mme-static-nse-remote-endpoint");
    }

    /**
     * Constructor for an initialized MmeStaticNseRemoteEndpoint object,
     * 
     * @param remoteIpAddressValue Key argument of child.
     */
    public MmeStaticNseRemoteEndpoint(Ipv4Address remoteIpAddressValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-static-nse-remote-endpoint");
        Leaf remoteIpAddress = new Leaf(Epc.NAMESPACE, "remote-ip-address");
        remoteIpAddress.setValue(remoteIpAddressValue);
        insertChild(remoteIpAddress, childrenNames());
    }

    /**
     * Constructor for an initialized MmeStaticNseRemoteEndpoint object,
     * with String keys.
     * @param remoteIpAddressValue Key argument of child.
     */
    public MmeStaticNseRemoteEndpoint(String remoteIpAddressValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-static-nse-remote-endpoint");
        Leaf remoteIpAddress = new Leaf(Epc.NAMESPACE, "remote-ip-address");
        remoteIpAddress.setValue(new Ipv4Address(remoteIpAddressValue));
        insertChild(remoteIpAddress, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeStaticNseRemoteEndpoint clone() {
        MmeStaticNseRemoteEndpoint copy;
        try {
            copy = new MmeStaticNseRemoteEndpoint(getRemoteIpAddressValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeStaticNseRemoteEndpoint)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeStaticNseRemoteEndpoint cloneShallow() {
        MmeStaticNseRemoteEndpoint copy;
        try {
            copy = new MmeStaticNseRemoteEndpoint(getRemoteIpAddressValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeStaticNseRemoteEndpoint)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "remote-ip-address",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "remote-ip-address",
            "port",
            "nse-id",
            "signaling-weight",
            "data-weight",
        };
    }

    /* Access methods for leaf child: "remote-ip-address". */

    /**
     * Gets the value for child leaf "remote-ip-address".
     * @return The value of the leaf.
     */
    public Ipv4Address getRemoteIpAddressValue() throws JNCException {
        return (Ipv4Address)getValue("remote-ip-address");
    }

    /**
     * Sets the value for child leaf "remote-ip-address",
     * using a JNC type value.
     * @param remoteIpAddressValue The value to set.
     * @param remoteIpAddressValue used during instantiation.
     */
    public void setRemoteIpAddressValue(Ipv4Address remoteIpAddressValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "remote-ip-address",
            remoteIpAddressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "remote-ip-address",
     * using a String value.
     * @param remoteIpAddressValue used during instantiation.
     */
    public void setRemoteIpAddressValue(String remoteIpAddressValue)
            throws JNCException {
        setRemoteIpAddressValue(new Ipv4Address(remoteIpAddressValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "remote-ip-address" leaf will not have a value.
     */
    public void addRemoteIpAddress() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "remote-ip-address",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "port". */

    /**
     * Gets the value for child leaf "port".
     * @return The value of the leaf.
     */
    public YangUInt16 getPortValue() throws JNCException {
        return (YangUInt16)getValue("port");
    }

    /**
     * Sets the value for child leaf "port",
     * using instance of generated typedef class.
     * @param portValue The value to set.
     * @param portValue used during instantiation.
     */
    public void setPortValue(YangUInt16 portValue) throws JNCException {
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
    public void setPortValue(int portValue) throws JNCException {
        setPortValue(new YangUInt16(portValue));
    }

    /**
     * Sets the value for child leaf "port",
     * using a String value.
     * @param portValue used during instantiation.
     */
    public void setPortValue(String portValue) throws JNCException {
        setPortValue(new YangUInt16(portValue));
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

    /* Access methods for optional leaf child: "nse-id". */

    /**
     * Gets the value for child leaf "nse-id".
     * @return The value of the leaf.
     */
    public YangUInt16 getNseIdValue() throws JNCException {
        return (YangUInt16)getValue("nse-id");
    }

    /**
     * Sets the value for child leaf "nse-id",
     * using instance of generated typedef class.
     * @param nseIdValue The value to set.
     * @param nseIdValue used during instantiation.
     */
    public void setNseIdValue(YangUInt16 nseIdValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nse-id",
            nseIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "nse-id",
     * using Java primitive values.
     * @param nseIdValue used during instantiation.
     */
    public void setNseIdValue(int nseIdValue) throws JNCException {
        setNseIdValue(new YangUInt16(nseIdValue));
    }

    /**
     * Sets the value for child leaf "nse-id",
     * using a String value.
     * @param nseIdValue used during instantiation.
     */
    public void setNseIdValue(String nseIdValue) throws JNCException {
        setNseIdValue(new YangUInt16(nseIdValue));
    }

    /**
     * Unsets the value for child leaf "nse-id".
     */
    public void unsetNseIdValue() throws JNCException {
        delete("nse-id");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "nse-id" leaf will not have a value.
     */
    public void addNseId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nse-id",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "nse-id" with operation "replace".
     */
    public void markNseIdReplace() throws JNCException {
        markLeafReplace("nseId");
    }

    /**
     * Marks the leaf "nse-id" with operation "merge".
     */
    public void markNseIdMerge() throws JNCException {
        markLeafMerge("nseId");
    }

    /**
     * Marks the leaf "nse-id" with operation "create".
     */
    public void markNseIdCreate() throws JNCException {
        markLeafCreate("nseId");
    }

    /**
     * Marks the leaf "nse-id" with operation "delete".
     */
    public void markNseIdDelete() throws JNCException {
        markLeafDelete("nseId");
    }

    /* Access methods for optional leaf child: "signaling-weight". */

    /**
     * Gets the value for child leaf "signaling-weight".
     * @return The value of the leaf.
     */
    public YangUInt16 getSignalingWeightValue() throws JNCException {
        YangUInt16 signalingWeight = (YangUInt16)getValue("signaling-weight");
        if (signalingWeight == null) {
            signalingWeight = new YangUInt16("1");  // default
        }
        return signalingWeight;
    }

    /**
     * Sets the value for child leaf "signaling-weight",
     * using instance of generated typedef class.
     * @param signalingWeightValue The value to set.
     * @param signalingWeightValue used during instantiation.
     */
    public void setSignalingWeightValue(YangUInt16 signalingWeightValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "signaling-weight",
            signalingWeightValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "signaling-weight",
     * using Java primitive values.
     * @param signalingWeightValue used during instantiation.
     */
    public void setSignalingWeightValue(int signalingWeightValue)
            throws JNCException {
        setSignalingWeightValue(new YangUInt16(signalingWeightValue));
    }

    /**
     * Sets the value for child leaf "signaling-weight",
     * using a String value.
     * @param signalingWeightValue used during instantiation.
     */
    public void setSignalingWeightValue(String signalingWeightValue)
            throws JNCException {
        setSignalingWeightValue(new YangUInt16(signalingWeightValue));
    }

    /**
     * Unsets the value for child leaf "signaling-weight".
     */
    public void unsetSignalingWeightValue() throws JNCException {
        delete("signaling-weight");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "signaling-weight" leaf will not have a value.
     */
    public void addSignalingWeight() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "signaling-weight",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "signaling-weight" with operation "replace".
     */
    public void markSignalingWeightReplace() throws JNCException {
        markLeafReplace("signalingWeight");
    }

    /**
     * Marks the leaf "signaling-weight" with operation "merge".
     */
    public void markSignalingWeightMerge() throws JNCException {
        markLeafMerge("signalingWeight");
    }

    /**
     * Marks the leaf "signaling-weight" with operation "create".
     */
    public void markSignalingWeightCreate() throws JNCException {
        markLeafCreate("signalingWeight");
    }

    /**
     * Marks the leaf "signaling-weight" with operation "delete".
     */
    public void markSignalingWeightDelete() throws JNCException {
        markLeafDelete("signalingWeight");
    }

    /* Access methods for optional leaf child: "data-weight". */

    /**
     * Gets the value for child leaf "data-weight".
     * @return The value of the leaf.
     */
    public YangUInt16 getDataWeightValue() throws JNCException {
        YangUInt16 dataWeight = (YangUInt16)getValue("data-weight");
        if (dataWeight == null) {
            dataWeight = new YangUInt16("1");  // default
        }
        return dataWeight;
    }

    /**
     * Sets the value for child leaf "data-weight",
     * using instance of generated typedef class.
     * @param dataWeightValue The value to set.
     * @param dataWeightValue used during instantiation.
     */
    public void setDataWeightValue(YangUInt16 dataWeightValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "data-weight",
            dataWeightValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "data-weight",
     * using Java primitive values.
     * @param dataWeightValue used during instantiation.
     */
    public void setDataWeightValue(int dataWeightValue) throws JNCException {
        setDataWeightValue(new YangUInt16(dataWeightValue));
    }

    /**
     * Sets the value for child leaf "data-weight",
     * using a String value.
     * @param dataWeightValue used during instantiation.
     */
    public void setDataWeightValue(String dataWeightValue) throws JNCException {
        setDataWeightValue(new YangUInt16(dataWeightValue));
    }

    /**
     * Unsets the value for child leaf "data-weight".
     */
    public void unsetDataWeightValue() throws JNCException {
        delete("data-weight");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "data-weight" leaf will not have a value.
     */
    public void addDataWeight() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "data-weight",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "data-weight" with operation "replace".
     */
    public void markDataWeightReplace() throws JNCException {
        markLeafReplace("dataWeight");
    }

    /**
     * Marks the leaf "data-weight" with operation "merge".
     */
    public void markDataWeightMerge() throws JNCException {
        markLeafMerge("dataWeight");
    }

    /**
     * Marks the leaf "data-weight" with operation "create".
     */
    public void markDataWeightCreate() throws JNCException {
        markLeafCreate("dataWeight");
    }

    /**
     * Marks the leaf "data-weight" with operation "delete".
     */
    public void markDataWeightDelete() throws JNCException {
        markLeafDelete("dataWeight");
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
