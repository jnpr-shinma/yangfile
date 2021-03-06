/* 
 * @(#)MmeBearerLimitsProfile.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.subscriber;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangEnumeration;

import YangString;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt32;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/subscriber/mme-bearer-limits-profile"
 * <p>
 * See line 2492 in
 * scConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeBearerLimitsProfile extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeBearerLimitsProfile object.
     */
    public MmeBearerLimitsProfile() {
        super(Epc.NAMESPACE, "mme-bearer-limits-profile");
    }

    /**
     * Constructor for an initialized MmeBearerLimitsProfile object,
     * 
     * @param nameValue Key argument of child.
     * @param qosClassIdentifierValue Key argument of child.
     */
    public MmeBearerLimitsProfile(YangString nameValue, YangEnumeration qosClassIdentifierValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-bearer-limits-profile");
        Leaf name = new Leaf(Epc.NAMESPACE, "name");
        name.setValue(nameValue);
        insertChild(name, childrenNames());
        Leaf qosClassIdentifier = new Leaf(Epc.NAMESPACE, "qos-class-identifier");
        qosClassIdentifier.setValue(qosClassIdentifierValue);
        insertChild(qosClassIdentifier, childrenNames());
    }

    /**
     * Constructor for an initialized MmeBearerLimitsProfile object,
     * with String keys.
     * @param nameValue Key argument of child.
     * @param qosClassIdentifierValue Key argument of child.
     */
    public MmeBearerLimitsProfile(String nameValue, String qosClassIdentifierValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-bearer-limits-profile");
        Leaf name = new Leaf(Epc.NAMESPACE, "name");
        name.setValue(new YangString(nameValue));
        insertChild(name, childrenNames());
        Leaf qosClassIdentifier = new Leaf(Epc.NAMESPACE, "qos-class-identifier");
        qosClassIdentifier.setValue(new YangEnumeration(qosClassIdentifierValue, new String [] {"qci1", "qci2", "qci3", "qci4", "qci5", "qci6", "qci7", "qci8", "qci9", }));
        insertChild(qosClassIdentifier, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeBearerLimitsProfile clone() {
        MmeBearerLimitsProfile copy;
        try {
            copy = new MmeBearerLimitsProfile(getNameValue().toString(), getQosClassIdentifierValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeBearerLimitsProfile)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeBearerLimitsProfile cloneShallow() {
        MmeBearerLimitsProfile copy;
        try {
            copy = new MmeBearerLimitsProfile(getNameValue().toString(), getQosClassIdentifierValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeBearerLimitsProfile)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "name",
            "qos-class-identifier",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "name",
            "qos-class-identifier",
            "arp-priority",
            "max-bitrate-uplink",
            "max-bitrate-downlink",
            "guaranteed-bitrate-uplink",
            "guaranteed-bitrate-downlink",
            "pci",
            "pvi",
        };
    }

    /* Access methods for leaf child: "name". */

    /**
     * Gets the value for child leaf "name".
     * @return The value of the leaf.
     */
    public YangString getNameValue() throws JNCException {
        return (YangString)getValue("name");
    }

    /**
     * Sets the value for child leaf "name",
     * using instance of generated typedef class.
     * @param nameValue The value to set.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(YangString nameValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "name",
            nameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "name",
     * using a String value.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(String nameValue) throws JNCException {
        setNameValue(new YangString(nameValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "name" leaf will not have a value.
     */
    public void addName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "name",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "qos-class-identifier". */

    /**
     * Gets the value for child leaf "qos-class-identifier".
     * @return The value of the leaf.
     */
    public YangEnumeration getQosClassIdentifierValue() throws JNCException {
        return (YangEnumeration)getValue("qos-class-identifier");
    }

    /**
     * Sets the value for child leaf "qos-class-identifier",
     * using instance of generated typedef class.
     * @param qosClassIdentifierValue The value to set.
     * @param qosClassIdentifierValue used during instantiation.
     */
    public void setQosClassIdentifierValue(YangEnumeration qosClassIdentifierValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "qos-class-identifier",
            qosClassIdentifierValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "qos-class-identifier",
     * using a String value.
     * @param qosClassIdentifierValue used during instantiation.
     */
    public void setQosClassIdentifierValue(String qosClassIdentifierValue)
            throws JNCException {
        setQosClassIdentifierValue(new YangEnumeration(qosClassIdentifierValue, new String[] {
             "qci1",
             "qci2",
             "qci3",
             "qci4",
             "qci5",
             "qci6",
             "qci7",
             "qci8",
             "qci9",
        }));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "qos-class-identifier" leaf will not have a value.
     */
    public void addQosClassIdentifier() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "qos-class-identifier",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "arp-priority". */

    /**
     * Gets the value for child leaf "arp-priority".
     * @return The value of the leaf.
     */
    public YangUInt8 getArpPriorityValue() throws JNCException {
        return (YangUInt8)getValue("arp-priority");
    }

    /**
     * Sets the value for child leaf "arp-priority",
     * using instance of generated typedef class.
     * @param arpPriorityValue The value to set.
     * @param arpPriorityValue used during instantiation.
     */
    public void setArpPriorityValue(YangUInt8 arpPriorityValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "arp-priority",
            arpPriorityValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "arp-priority",
     * using Java primitive values.
     * @param arpPriorityValue used during instantiation.
     */
    public void setArpPriorityValue(short arpPriorityValue) throws JNCException {
        setArpPriorityValue(new YangUInt8(arpPriorityValue));
    }

    /**
     * Sets the value for child leaf "arp-priority",
     * using a String value.
     * @param arpPriorityValue used during instantiation.
     */
    public void setArpPriorityValue(String arpPriorityValue)
            throws JNCException {
        setArpPriorityValue(new YangUInt8(arpPriorityValue));
    }

    /**
     * Unsets the value for child leaf "arp-priority".
     */
    public void unsetArpPriorityValue() throws JNCException {
        delete("arp-priority");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "arp-priority" leaf will not have a value.
     */
    public void addArpPriority() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "arp-priority",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "arp-priority" with operation "replace".
     */
    public void markArpPriorityReplace() throws JNCException {
        markLeafReplace("arpPriority");
    }

    /**
     * Marks the leaf "arp-priority" with operation "merge".
     */
    public void markArpPriorityMerge() throws JNCException {
        markLeafMerge("arpPriority");
    }

    /**
     * Marks the leaf "arp-priority" with operation "create".
     */
    public void markArpPriorityCreate() throws JNCException {
        markLeafCreate("arpPriority");
    }

    /**
     * Marks the leaf "arp-priority" with operation "delete".
     */
    public void markArpPriorityDelete() throws JNCException {
        markLeafDelete("arpPriority");
    }

    /* Access methods for optional leaf child: "max-bitrate-uplink". */

    /**
     * Gets the value for child leaf "max-bitrate-uplink".
     * @return The value of the leaf.
     */
    public YangUInt32 getMaxBitrateUplinkValue() throws JNCException {
        YangUInt32 maxBitrateUplink = (YangUInt32)getValue("max-bitrate-uplink");
        if (maxBitrateUplink == null) {
            maxBitrateUplink = new YangUInt32("256000");  // default
        }
        return maxBitrateUplink;
    }

    /**
     * Sets the value for child leaf "max-bitrate-uplink",
     * using instance of generated typedef class.
     * @param maxBitrateUplinkValue The value to set.
     * @param maxBitrateUplinkValue used during instantiation.
     */
    public void setMaxBitrateUplinkValue(YangUInt32 maxBitrateUplinkValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-bitrate-uplink",
            maxBitrateUplinkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "max-bitrate-uplink",
     * using Java primitive values.
     * @param maxBitrateUplinkValue used during instantiation.
     */
    public void setMaxBitrateUplinkValue(long maxBitrateUplinkValue)
            throws JNCException {
        setMaxBitrateUplinkValue(new YangUInt32(maxBitrateUplinkValue));
    }

    /**
     * Sets the value for child leaf "max-bitrate-uplink",
     * using a String value.
     * @param maxBitrateUplinkValue used during instantiation.
     */
    public void setMaxBitrateUplinkValue(String maxBitrateUplinkValue)
            throws JNCException {
        setMaxBitrateUplinkValue(new YangUInt32(maxBitrateUplinkValue));
    }

    /**
     * Unsets the value for child leaf "max-bitrate-uplink".
     */
    public void unsetMaxBitrateUplinkValue() throws JNCException {
        delete("max-bitrate-uplink");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "max-bitrate-uplink" leaf will not have a value.
     */
    public void addMaxBitrateUplink() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-bitrate-uplink",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "max-bitrate-uplink" with operation "replace".
     */
    public void markMaxBitrateUplinkReplace() throws JNCException {
        markLeafReplace("maxBitrateUplink");
    }

    /**
     * Marks the leaf "max-bitrate-uplink" with operation "merge".
     */
    public void markMaxBitrateUplinkMerge() throws JNCException {
        markLeafMerge("maxBitrateUplink");
    }

    /**
     * Marks the leaf "max-bitrate-uplink" with operation "create".
     */
    public void markMaxBitrateUplinkCreate() throws JNCException {
        markLeafCreate("maxBitrateUplink");
    }

    /**
     * Marks the leaf "max-bitrate-uplink" with operation "delete".
     */
    public void markMaxBitrateUplinkDelete() throws JNCException {
        markLeafDelete("maxBitrateUplink");
    }

    /* Access methods for optional leaf child: "max-bitrate-downlink". */

    /**
     * Gets the value for child leaf "max-bitrate-downlink".
     * @return The value of the leaf.
     */
    public YangUInt32 getMaxBitrateDownlinkValue() throws JNCException {
        YangUInt32 maxBitrateDownlink = (YangUInt32)getValue("max-bitrate-downlink");
        if (maxBitrateDownlink == null) {
            maxBitrateDownlink = new YangUInt32("256000");  // default
        }
        return maxBitrateDownlink;
    }

    /**
     * Sets the value for child leaf "max-bitrate-downlink",
     * using instance of generated typedef class.
     * @param maxBitrateDownlinkValue The value to set.
     * @param maxBitrateDownlinkValue used during instantiation.
     */
    public void setMaxBitrateDownlinkValue(YangUInt32 maxBitrateDownlinkValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-bitrate-downlink",
            maxBitrateDownlinkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "max-bitrate-downlink",
     * using Java primitive values.
     * @param maxBitrateDownlinkValue used during instantiation.
     */
    public void setMaxBitrateDownlinkValue(long maxBitrateDownlinkValue)
            throws JNCException {
        setMaxBitrateDownlinkValue(new YangUInt32(maxBitrateDownlinkValue));
    }

    /**
     * Sets the value for child leaf "max-bitrate-downlink",
     * using a String value.
     * @param maxBitrateDownlinkValue used during instantiation.
     */
    public void setMaxBitrateDownlinkValue(String maxBitrateDownlinkValue)
            throws JNCException {
        setMaxBitrateDownlinkValue(new YangUInt32(maxBitrateDownlinkValue));
    }

    /**
     * Unsets the value for child leaf "max-bitrate-downlink".
     */
    public void unsetMaxBitrateDownlinkValue() throws JNCException {
        delete("max-bitrate-downlink");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "max-bitrate-downlink" leaf will not have a value.
     */
    public void addMaxBitrateDownlink() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-bitrate-downlink",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "max-bitrate-downlink" with operation "replace".
     */
    public void markMaxBitrateDownlinkReplace() throws JNCException {
        markLeafReplace("maxBitrateDownlink");
    }

    /**
     * Marks the leaf "max-bitrate-downlink" with operation "merge".
     */
    public void markMaxBitrateDownlinkMerge() throws JNCException {
        markLeafMerge("maxBitrateDownlink");
    }

    /**
     * Marks the leaf "max-bitrate-downlink" with operation "create".
     */
    public void markMaxBitrateDownlinkCreate() throws JNCException {
        markLeafCreate("maxBitrateDownlink");
    }

    /**
     * Marks the leaf "max-bitrate-downlink" with operation "delete".
     */
    public void markMaxBitrateDownlinkDelete() throws JNCException {
        markLeafDelete("maxBitrateDownlink");
    }

    /* Access methods for optional leaf child: "guaranteed-bitrate-uplink". */

    /**
     * Gets the value for child leaf "guaranteed-bitrate-uplink".
     * @return The value of the leaf.
     */
    public YangUInt32 getGuaranteedBitrateUplinkValue() throws JNCException {
        YangUInt32 guaranteedBitrateUplink = (YangUInt32)getValue("guaranteed-bitrate-uplink");
        if (guaranteedBitrateUplink == null) {
            guaranteedBitrateUplink = new YangUInt32("256000");  // default
        }
        return guaranteedBitrateUplink;
    }

    /**
     * Sets the value for child leaf "guaranteed-bitrate-uplink",
     * using instance of generated typedef class.
     * @param guaranteedBitrateUplinkValue The value to set.
     * @param guaranteedBitrateUplinkValue used during instantiation.
     */
    public void setGuaranteedBitrateUplinkValue(YangUInt32 guaranteedBitrateUplinkValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "guaranteed-bitrate-uplink",
            guaranteedBitrateUplinkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "guaranteed-bitrate-uplink",
     * using Java primitive values.
     * @param guaranteedBitrateUplinkValue used during instantiation.
     */
    public void setGuaranteedBitrateUplinkValue(long guaranteedBitrateUplinkValue)
            throws JNCException {
        setGuaranteedBitrateUplinkValue(new YangUInt32(guaranteedBitrateUplinkValue));
    }

    /**
     * Sets the value for child leaf "guaranteed-bitrate-uplink",
     * using a String value.
     * @param guaranteedBitrateUplinkValue used during instantiation.
     */
    public void setGuaranteedBitrateUplinkValue(String guaranteedBitrateUplinkValue)
            throws JNCException {
        setGuaranteedBitrateUplinkValue(new YangUInt32(guaranteedBitrateUplinkValue));
    }

    /**
     * Unsets the value for child leaf "guaranteed-bitrate-uplink".
     */
    public void unsetGuaranteedBitrateUplinkValue() throws JNCException {
        delete("guaranteed-bitrate-uplink");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "guaranteed-bitrate-uplink" leaf will not have a value.
     */
    public void addGuaranteedBitrateUplink() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "guaranteed-bitrate-uplink",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "guaranteed-bitrate-uplink" with operation "replace".
     */
    public void markGuaranteedBitrateUplinkReplace() throws JNCException {
        markLeafReplace("guaranteedBitrateUplink");
    }

    /**
     * Marks the leaf "guaranteed-bitrate-uplink" with operation "merge".
     */
    public void markGuaranteedBitrateUplinkMerge() throws JNCException {
        markLeafMerge("guaranteedBitrateUplink");
    }

    /**
     * Marks the leaf "guaranteed-bitrate-uplink" with operation "create".
     */
    public void markGuaranteedBitrateUplinkCreate() throws JNCException {
        markLeafCreate("guaranteedBitrateUplink");
    }

    /**
     * Marks the leaf "guaranteed-bitrate-uplink" with operation "delete".
     */
    public void markGuaranteedBitrateUplinkDelete() throws JNCException {
        markLeafDelete("guaranteedBitrateUplink");
    }

    /* Access methods for optional leaf child: "guaranteed-bitrate-downlink". */

    /**
     * Gets the value for child leaf "guaranteed-bitrate-downlink".
     * @return The value of the leaf.
     */
    public YangUInt32 getGuaranteedBitrateDownlinkValue() throws JNCException {
        YangUInt32 guaranteedBitrateDownlink = (YangUInt32)getValue("guaranteed-bitrate-downlink");
        if (guaranteedBitrateDownlink == null) {
            guaranteedBitrateDownlink = new YangUInt32("256000");  // default
        }
        return guaranteedBitrateDownlink;
    }

    /**
     * Sets the value for child leaf "guaranteed-bitrate-downlink",
     * using instance of generated typedef class.
     * @param guaranteedBitrateDownlinkValue The value to set.
     * @param guaranteedBitrateDownlinkValue used during instantiation.
     */
    public void setGuaranteedBitrateDownlinkValue(YangUInt32 guaranteedBitrateDownlinkValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "guaranteed-bitrate-downlink",
            guaranteedBitrateDownlinkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "guaranteed-bitrate-downlink",
     * using Java primitive values.
     * @param guaranteedBitrateDownlinkValue used during instantiation.
     */
    public void setGuaranteedBitrateDownlinkValue(long guaranteedBitrateDownlinkValue)
            throws JNCException {
        setGuaranteedBitrateDownlinkValue(new YangUInt32(guaranteedBitrateDownlinkValue));
    }

    /**
     * Sets the value for child leaf "guaranteed-bitrate-downlink",
     * using a String value.
     * @param guaranteedBitrateDownlinkValue used during instantiation.
     */
    public void setGuaranteedBitrateDownlinkValue(String guaranteedBitrateDownlinkValue)
            throws JNCException {
        setGuaranteedBitrateDownlinkValue(new YangUInt32(guaranteedBitrateDownlinkValue));
    }

    /**
     * Unsets the value for child leaf "guaranteed-bitrate-downlink".
     */
    public void unsetGuaranteedBitrateDownlinkValue() throws JNCException {
        delete("guaranteed-bitrate-downlink");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "guaranteed-bitrate-downlink" leaf will not have a value.
     */
    public void addGuaranteedBitrateDownlink() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "guaranteed-bitrate-downlink",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "guaranteed-bitrate-downlink" with operation "replace".
     */
    public void markGuaranteedBitrateDownlinkReplace() throws JNCException {
        markLeafReplace("guaranteedBitrateDownlink");
    }

    /**
     * Marks the leaf "guaranteed-bitrate-downlink" with operation "merge".
     */
    public void markGuaranteedBitrateDownlinkMerge() throws JNCException {
        markLeafMerge("guaranteedBitrateDownlink");
    }

    /**
     * Marks the leaf "guaranteed-bitrate-downlink" with operation "create".
     */
    public void markGuaranteedBitrateDownlinkCreate() throws JNCException {
        markLeafCreate("guaranteedBitrateDownlink");
    }

    /**
     * Marks the leaf "guaranteed-bitrate-downlink" with operation "delete".
     */
    public void markGuaranteedBitrateDownlinkDelete() throws JNCException {
        markLeafDelete("guaranteedBitrateDownlink");
    }

    /* Access methods for optional leaf child: "pci". */

    /**
     * Gets the value for child leaf "pci".
     * @return The value of the leaf.
     */
    public YangEnumeration getPciValue() throws JNCException {
        YangEnumeration pci = (YangEnumeration)getValue("pci");
        if (pci == null) {
            pci = new YangEnumeration("disable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return pci;
    }

    /**
     * Sets the value for child leaf "pci",
     * using instance of generated typedef class.
     * @param pciValue The value to set.
     * @param pciValue used during instantiation.
     */
    public void setPciValue(YangEnumeration pciValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pci",
            pciValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "pci",
     * using a String value.
     * @param pciValue used during instantiation.
     */
    public void setPciValue(String pciValue) throws JNCException {
        setPciValue(new YangEnumeration(pciValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "pci".
     */
    public void unsetPciValue() throws JNCException {
        delete("pci");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "pci" leaf will not have a value.
     */
    public void addPci() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pci",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "pci" with operation "replace".
     */
    public void markPciReplace() throws JNCException {
        markLeafReplace("pci");
    }

    /**
     * Marks the leaf "pci" with operation "merge".
     */
    public void markPciMerge() throws JNCException {
        markLeafMerge("pci");
    }

    /**
     * Marks the leaf "pci" with operation "create".
     */
    public void markPciCreate() throws JNCException {
        markLeafCreate("pci");
    }

    /**
     * Marks the leaf "pci" with operation "delete".
     */
    public void markPciDelete() throws JNCException {
        markLeafDelete("pci");
    }

    /* Access methods for optional leaf child: "pvi". */

    /**
     * Gets the value for child leaf "pvi".
     * @return The value of the leaf.
     */
    public YangEnumeration getPviValue() throws JNCException {
        YangEnumeration pvi = (YangEnumeration)getValue("pvi");
        if (pvi == null) {
            pvi = new YangEnumeration("enable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return pvi;
    }

    /**
     * Sets the value for child leaf "pvi",
     * using instance of generated typedef class.
     * @param pviValue The value to set.
     * @param pviValue used during instantiation.
     */
    public void setPviValue(YangEnumeration pviValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pvi",
            pviValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "pvi",
     * using a String value.
     * @param pviValue used during instantiation.
     */
    public void setPviValue(String pviValue) throws JNCException {
        setPviValue(new YangEnumeration(pviValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "pvi".
     */
    public void unsetPviValue() throws JNCException {
        delete("pvi");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "pvi" leaf will not have a value.
     */
    public void addPvi() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pvi",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "pvi" with operation "replace".
     */
    public void markPviReplace() throws JNCException {
        markLeafReplace("pvi");
    }

    /**
     * Marks the leaf "pvi" with operation "merge".
     */
    public void markPviMerge() throws JNCException {
        markLeafMerge("pvi");
    }

    /**
     * Marks the leaf "pvi" with operation "create".
     */
    public void markPviCreate() throws JNCException {
        markLeafCreate("pvi");
    }

    /**
     * Marks the leaf "pvi" with operation "delete".
     */
    public void markPviDelete() throws JNCException {
        markLeafDelete("pvi");
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
