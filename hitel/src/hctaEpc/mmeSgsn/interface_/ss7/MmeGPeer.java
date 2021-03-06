/* 
 * @(#)MmeGPeer.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.ss7;
import .ietfInetTypes.Ipv4Address;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangString;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/ss7/mme-g-peer"
 * <p>
 * See line 549 in
 * sigtranConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeGPeer extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeGPeer object.
     */
    public MmeGPeer() {
        super(Epc.NAMESPACE, "mme-g-peer");
    }

    /**
     * Constructor for an initialized MmeGPeer object,
     * 
     * @param gPeerNameValue Key argument of child.
     */
    public MmeGPeer(YangString gPeerNameValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-g-peer");
        Leaf gPeerName = new Leaf(Epc.NAMESPACE, "g-peer-name");
        gPeerName.setValue(gPeerNameValue);
        insertChild(gPeerName, childrenNames());
    }

    /**
     * Constructor for an initialized MmeGPeer object,
     * with String keys.
     * @param gPeerNameValue Key argument of child.
     */
    public MmeGPeer(String gPeerNameValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-g-peer");
        Leaf gPeerName = new Leaf(Epc.NAMESPACE, "g-peer-name");
        gPeerName.setValue(new YangString(gPeerNameValue));
        insertChild(gPeerName, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeGPeer clone() {
        MmeGPeer copy;
        try {
            copy = new MmeGPeer(getGPeerNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeGPeer)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeGPeer cloneShallow() {
        MmeGPeer copy;
        try {
            copy = new MmeGPeer(getGPeerNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeGPeer)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "g-peer-name",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "g-peer-name",
            "app-server-name",
            "ip-address1",
            "ip-address2",
            "peer-type",
            "association-creation",
            "port-str",
            "compat-mode",
            "network-appearance",
        };
    }

    /* Access methods for leaf child: "g-peer-name". */

    /**
     * Gets the value for child leaf "g-peer-name".
     * @return The value of the leaf.
     */
    public YangString getGPeerNameValue() throws JNCException {
        return (YangString)getValue("g-peer-name");
    }

    /**
     * Sets the value for child leaf "g-peer-name",
     * using instance of generated typedef class.
     * @param gPeerNameValue The value to set.
     * @param gPeerNameValue used during instantiation.
     */
    public void setGPeerNameValue(YangString gPeerNameValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "g-peer-name",
            gPeerNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "g-peer-name",
     * using a String value.
     * @param gPeerNameValue used during instantiation.
     */
    public void setGPeerNameValue(String gPeerNameValue) throws JNCException {
        setGPeerNameValue(new YangString(gPeerNameValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "g-peer-name" leaf will not have a value.
     */
    public void addGPeerName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "g-peer-name",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "app-server-name". */

    /**
     * Gets the value for child leaf "app-server-name".
     * @return The value of the leaf.
     */
    public YangString getAppServerNameValue() throws JNCException {
        return (YangString)getValue("app-server-name");
    }

    /**
     * Sets the value for child leaf "app-server-name",
     * using instance of generated typedef class.
     * @param appServerNameValue The value to set.
     * @param appServerNameValue used during instantiation.
     */
    public void setAppServerNameValue(YangString appServerNameValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "app-server-name",
            appServerNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "app-server-name",
     * using a String value.
     * @param appServerNameValue used during instantiation.
     */
    public void setAppServerNameValue(String appServerNameValue)
            throws JNCException {
        setAppServerNameValue(new YangString(appServerNameValue));
    }

    /**
     * Unsets the value for child leaf "app-server-name".
     */
    public void unsetAppServerNameValue() throws JNCException {
        delete("app-server-name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "app-server-name" leaf will not have a value.
     */
    public void addAppServerName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "app-server-name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "app-server-name" with operation "replace".
     */
    public void markAppServerNameReplace() throws JNCException {
        markLeafReplace("appServerName");
    }

    /**
     * Marks the leaf "app-server-name" with operation "merge".
     */
    public void markAppServerNameMerge() throws JNCException {
        markLeafMerge("appServerName");
    }

    /**
     * Marks the leaf "app-server-name" with operation "create".
     */
    public void markAppServerNameCreate() throws JNCException {
        markLeafCreate("appServerName");
    }

    /**
     * Marks the leaf "app-server-name" with operation "delete".
     */
    public void markAppServerNameDelete() throws JNCException {
        markLeafDelete("appServerName");
    }

    /* Access methods for optional leaf child: "ip-address1". */

    /**
     * Gets the value for child leaf "ip-address1".
     * @return The value of the leaf.
     */
    public Ipv4Address getIpAddress1Value() throws JNCException {
        return (Ipv4Address)getValue("ip-address1");
    }

    /**
     * Sets the value for child leaf "ip-address1",
     * using a JNC type value.
     * @param ipAddress1Value The value to set.
     * @param ipAddress1Value used during instantiation.
     */
    public void setIpAddress1Value(Ipv4Address ipAddress1Value)
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
        setIpAddress1Value(new Ipv4Address(ipAddress1Value));
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

    /* Access methods for optional leaf child: "ip-address2". */

    /**
     * Gets the value for child leaf "ip-address2".
     * @return The value of the leaf.
     */
    public Ipv4Address getIpAddress2Value() throws JNCException {
        Ipv4Address ipAddress2 = (Ipv4Address)getValue("ip-address2");
        if (ipAddress2 == null) {
            ipAddress2 = new Ipv4Address("0.0.0.0");  // default
        }
        return ipAddress2;
    }

    /**
     * Sets the value for child leaf "ip-address2",
     * using a JNC type value.
     * @param ipAddress2Value The value to set.
     * @param ipAddress2Value used during instantiation.
     */
    public void setIpAddress2Value(Ipv4Address ipAddress2Value)
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
        setIpAddress2Value(new Ipv4Address(ipAddress2Value));
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

    /* Access methods for optional leaf child: "peer-type". */

    /**
     * Gets the value for child leaf "peer-type".
     * @return The value of the leaf.
     */
    public YangEnumeration getPeerTypeValue() throws JNCException {
        return (YangEnumeration)getValue("peer-type");
    }

    /**
     * Sets the value for child leaf "peer-type",
     * using instance of generated typedef class.
     * @param peerTypeValue The value to set.
     * @param peerTypeValue used during instantiation.
     */
    public void setPeerTypeValue(YangEnumeration peerTypeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "peer-type",
            peerTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "peer-type",
     * using a String value.
     * @param peerTypeValue used during instantiation.
     */
    public void setPeerTypeValue(String peerTypeValue) throws JNCException {
        setPeerTypeValue(new YangEnumeration(peerTypeValue, new String[] {
             "sgp",
             "ipspSe",
        }));
    }

    /**
     * Unsets the value for child leaf "peer-type".
     */
    public void unsetPeerTypeValue() throws JNCException {
        delete("peer-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "peer-type" leaf will not have a value.
     */
    public void addPeerType() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "peer-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "peer-type" with operation "replace".
     */
    public void markPeerTypeReplace() throws JNCException {
        markLeafReplace("peerType");
    }

    /**
     * Marks the leaf "peer-type" with operation "merge".
     */
    public void markPeerTypeMerge() throws JNCException {
        markLeafMerge("peerType");
    }

    /**
     * Marks the leaf "peer-type" with operation "create".
     */
    public void markPeerTypeCreate() throws JNCException {
        markLeafCreate("peerType");
    }

    /**
     * Marks the leaf "peer-type" with operation "delete".
     */
    public void markPeerTypeDelete() throws JNCException {
        markLeafDelete("peerType");
    }

    /* Access methods for optional leaf child: "association-creation". */

    /**
     * Gets the value for child leaf "association-creation".
     * @return The value of the leaf.
     */
    public YangEnumeration getAssociationCreationValue() throws JNCException {
        return (YangEnumeration)getValue("association-creation");
    }

    /**
     * Sets the value for child leaf "association-creation",
     * using instance of generated typedef class.
     * @param associationCreationValue The value to set.
     * @param associationCreationValue used during instantiation.
     */
    public void setAssociationCreationValue(YangEnumeration associationCreationValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "association-creation",
            associationCreationValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "association-creation",
     * using a String value.
     * @param associationCreationValue used during instantiation.
     */
    public void setAssociationCreationValue(String associationCreationValue)
            throws JNCException {
        setAssociationCreationValue(new YangEnumeration(associationCreationValue, new String[] {
             "initiate",
             "accept",
        }));
    }

    /**
     * Unsets the value for child leaf "association-creation".
     */
    public void unsetAssociationCreationValue() throws JNCException {
        delete("association-creation");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "association-creation" leaf will not have a value.
     */
    public void addAssociationCreation() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "association-creation",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "association-creation" with operation "replace".
     */
    public void markAssociationCreationReplace() throws JNCException {
        markLeafReplace("associationCreation");
    }

    /**
     * Marks the leaf "association-creation" with operation "merge".
     */
    public void markAssociationCreationMerge() throws JNCException {
        markLeafMerge("associationCreation");
    }

    /**
     * Marks the leaf "association-creation" with operation "create".
     */
    public void markAssociationCreationCreate() throws JNCException {
        markLeafCreate("associationCreation");
    }

    /**
     * Marks the leaf "association-creation" with operation "delete".
     */
    public void markAssociationCreationDelete() throws JNCException {
        markLeafDelete("associationCreation");
    }

    /* Access methods for optional leaf child: "port-str". */

    /**
     * Gets the value for child leaf "port-str".
     * @return The value of the leaf.
     */
    public YangString getPortStrValue() throws JNCException {
        YangString portStr = (YangString)getValue("port-str");
        if (portStr == null) {
            portStr = new YangString("2905");  // default
        }
        return portStr;
    }

    /**
     * Sets the value for child leaf "port-str",
     * using instance of generated typedef class.
     * @param portStrValue The value to set.
     * @param portStrValue used during instantiation.
     */
    public void setPortStrValue(YangString portStrValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "port-str",
            portStrValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "port-str",
     * using a String value.
     * @param portStrValue used during instantiation.
     */
    public void setPortStrValue(String portStrValue) throws JNCException {
        setPortStrValue(new YangString(portStrValue));
    }

    /**
     * Unsets the value for child leaf "port-str".
     */
    public void unsetPortStrValue() throws JNCException {
        delete("port-str");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "port-str" leaf will not have a value.
     */
    public void addPortStr() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "port-str",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "port-str" with operation "replace".
     */
    public void markPortStrReplace() throws JNCException {
        markLeafReplace("portStr");
    }

    /**
     * Marks the leaf "port-str" with operation "merge".
     */
    public void markPortStrMerge() throws JNCException {
        markLeafMerge("portStr");
    }

    /**
     * Marks the leaf "port-str" with operation "create".
     */
    public void markPortStrCreate() throws JNCException {
        markLeafCreate("portStr");
    }

    /**
     * Marks the leaf "port-str" with operation "delete".
     */
    public void markPortStrDelete() throws JNCException {
        markLeafDelete("portStr");
    }

    /* Access methods for optional leaf child: "compat-mode". */

    /**
     * Gets the value for child leaf "compat-mode".
     * @return The value of the leaf.
     */
    public YangEnumeration getCompatModeValue() throws JNCException {
        YangEnumeration compatMode = (YangEnumeration)getValue("compat-mode");
        if (compatMode == null) {
            compatMode = new YangEnumeration("standard", new String[] {  // default
                "standard",
                "usp",
            });
        }
        return compatMode;
    }

    /**
     * Sets the value for child leaf "compat-mode",
     * using instance of generated typedef class.
     * @param compatModeValue The value to set.
     * @param compatModeValue used during instantiation.
     */
    public void setCompatModeValue(YangEnumeration compatModeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "compat-mode",
            compatModeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "compat-mode",
     * using a String value.
     * @param compatModeValue used during instantiation.
     */
    public void setCompatModeValue(String compatModeValue) throws JNCException {
        setCompatModeValue(new YangEnumeration(compatModeValue, new String[] {
             "standard",
             "usp",
        }));
    }

    /**
     * Unsets the value for child leaf "compat-mode".
     */
    public void unsetCompatModeValue() throws JNCException {
        delete("compat-mode");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "compat-mode" leaf will not have a value.
     */
    public void addCompatMode() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "compat-mode",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "compat-mode" with operation "replace".
     */
    public void markCompatModeReplace() throws JNCException {
        markLeafReplace("compatMode");
    }

    /**
     * Marks the leaf "compat-mode" with operation "merge".
     */
    public void markCompatModeMerge() throws JNCException {
        markLeafMerge("compatMode");
    }

    /**
     * Marks the leaf "compat-mode" with operation "create".
     */
    public void markCompatModeCreate() throws JNCException {
        markLeafCreate("compatMode");
    }

    /**
     * Marks the leaf "compat-mode" with operation "delete".
     */
    public void markCompatModeDelete() throws JNCException {
        markLeafDelete("compatMode");
    }

    /* Access methods for optional leaf child: "network-appearance". */

    /**
     * Gets the value for child leaf "network-appearance".
     * @return The value of the leaf.
     */
    public YangString getNetworkAppearanceValue() throws JNCException {
        YangString networkAppearance = (YangString)getValue("network-appearance");
        if (networkAppearance == null) {
            networkAppearance = new YangString("unused");  // default
        }
        return networkAppearance;
    }

    /**
     * Sets the value for child leaf "network-appearance",
     * using instance of generated typedef class.
     * @param networkAppearanceValue The value to set.
     * @param networkAppearanceValue used during instantiation.
     */
    public void setNetworkAppearanceValue(YangString networkAppearanceValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "network-appearance",
            networkAppearanceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "network-appearance",
     * using a String value.
     * @param networkAppearanceValue used during instantiation.
     */
    public void setNetworkAppearanceValue(String networkAppearanceValue)
            throws JNCException {
        setNetworkAppearanceValue(new YangString(networkAppearanceValue));
    }

    /**
     * Unsets the value for child leaf "network-appearance".
     */
    public void unsetNetworkAppearanceValue() throws JNCException {
        delete("network-appearance");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "network-appearance" leaf will not have a value.
     */
    public void addNetworkAppearance() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "network-appearance",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "network-appearance" with operation "replace".
     */
    public void markNetworkAppearanceReplace() throws JNCException {
        markLeafReplace("networkAppearance");
    }

    /**
     * Marks the leaf "network-appearance" with operation "merge".
     */
    public void markNetworkAppearanceMerge() throws JNCException {
        markLeafMerge("networkAppearance");
    }

    /**
     * Marks the leaf "network-appearance" with operation "create".
     */
    public void markNetworkAppearanceCreate() throws JNCException {
        markLeafCreate("networkAppearance");
    }

    /**
     * Marks the leaf "network-appearance" with operation "delete".
     */
    public void markNetworkAppearanceDelete() throws JNCException {
        markLeafDelete("networkAppearance");
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
