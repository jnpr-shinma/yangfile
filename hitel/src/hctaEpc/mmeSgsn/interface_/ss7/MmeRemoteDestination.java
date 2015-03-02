/* 
 * @(#)MmeRemoteDestination.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.ss7;

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
 * generated to "src/hctaEpc/mmeSgsn/interface_/ss7/mme-remote-destination"
 * <p>
 * See line 101 in
 * sigtranConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeRemoteDestination extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeRemoteDestination object.
     */
    public MmeRemoteDestination() {
        super(Epc.NAMESPACE, "mme-remote-destination");
    }

    /**
     * Constructor for an initialized MmeRemoteDestination object,
     * 
     * @param destinationPointCodeValue Key argument of child.
     */
    public MmeRemoteDestination(YangString destinationPointCodeValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-remote-destination");
        Leaf destinationPointCode = new Leaf(Epc.NAMESPACE, "destination-point-code");
        destinationPointCode.setValue(destinationPointCodeValue);
        insertChild(destinationPointCode, childrenNames());
    }

    /**
     * Constructor for an initialized MmeRemoteDestination object,
     * with String keys.
     * @param destinationPointCodeValue Key argument of child.
     */
    public MmeRemoteDestination(String destinationPointCodeValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-remote-destination");
        Leaf destinationPointCode = new Leaf(Epc.NAMESPACE, "destination-point-code");
        destinationPointCode.setValue(new YangString(destinationPointCodeValue));
        insertChild(destinationPointCode, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeRemoteDestination clone() {
        MmeRemoteDestination copy;
        try {
            copy = new MmeRemoteDestination(getDestinationPointCodeValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeRemoteDestination)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeRemoteDestination cloneShallow() {
        MmeRemoteDestination copy;
        try {
            copy = new MmeRemoteDestination(getDestinationPointCodeValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeRemoteDestination)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "destination-point-code",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "destination-point-code",
            "xudt-option",
            "ludt-option",
            "remote-subsystems",
        };
    }

    /* Access methods for leaf child: "destination-point-code". */

    /**
     * Gets the value for child leaf "destination-point-code".
     * @return The value of the leaf.
     */
    public YangString getDestinationPointCodeValue() throws JNCException {
        return (YangString)getValue("destination-point-code");
    }

    /**
     * Sets the value for child leaf "destination-point-code",
     * using instance of generated typedef class.
     * @param destinationPointCodeValue The value to set.
     * @param destinationPointCodeValue used during instantiation.
     */
    public void setDestinationPointCodeValue(YangString destinationPointCodeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "destination-point-code",
            destinationPointCodeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "destination-point-code",
     * using a String value.
     * @param destinationPointCodeValue used during instantiation.
     */
    public void setDestinationPointCodeValue(String destinationPointCodeValue)
            throws JNCException {
        setDestinationPointCodeValue(new YangString(destinationPointCodeValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "destination-point-code" leaf will not have a value.
     */
    public void addDestinationPointCode() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "destination-point-code",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "xudt-option". */

    /**
     * Gets the value for child leaf "xudt-option".
     * @return The value of the leaf.
     */
    public YangEnumeration getXudtOptionValue() throws JNCException {
        YangEnumeration xudtOption = (YangEnumeration)getValue("xudt-option");
        if (xudtOption == null) {
            xudtOption = new YangEnumeration("enable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return xudtOption;
    }

    /**
     * Sets the value for child leaf "xudt-option",
     * using instance of generated typedef class.
     * @param xudtOptionValue The value to set.
     * @param xudtOptionValue used during instantiation.
     */
    public void setXudtOptionValue(YangEnumeration xudtOptionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "xudt-option",
            xudtOptionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "xudt-option",
     * using a String value.
     * @param xudtOptionValue used during instantiation.
     */
    public void setXudtOptionValue(String xudtOptionValue) throws JNCException {
        setXudtOptionValue(new YangEnumeration(xudtOptionValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "xudt-option".
     */
    public void unsetXudtOptionValue() throws JNCException {
        delete("xudt-option");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "xudt-option" leaf will not have a value.
     */
    public void addXudtOption() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "xudt-option",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "xudt-option" with operation "replace".
     */
    public void markXudtOptionReplace() throws JNCException {
        markLeafReplace("xudtOption");
    }

    /**
     * Marks the leaf "xudt-option" with operation "merge".
     */
    public void markXudtOptionMerge() throws JNCException {
        markLeafMerge("xudtOption");
    }

    /**
     * Marks the leaf "xudt-option" with operation "create".
     */
    public void markXudtOptionCreate() throws JNCException {
        markLeafCreate("xudtOption");
    }

    /**
     * Marks the leaf "xudt-option" with operation "delete".
     */
    public void markXudtOptionDelete() throws JNCException {
        markLeafDelete("xudtOption");
    }

    /* Access methods for optional leaf child: "ludt-option". */

    /**
     * Gets the value for child leaf "ludt-option".
     * @return The value of the leaf.
     */
    public YangEnumeration getLudtOptionValue() throws JNCException {
        YangEnumeration ludtOption = (YangEnumeration)getValue("ludt-option");
        if (ludtOption == null) {
            ludtOption = new YangEnumeration("disable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return ludtOption;
    }

    /**
     * Sets the value for child leaf "ludt-option",
     * using instance of generated typedef class.
     * @param ludtOptionValue The value to set.
     * @param ludtOptionValue used during instantiation.
     */
    public void setLudtOptionValue(YangEnumeration ludtOptionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ludt-option",
            ludtOptionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ludt-option",
     * using a String value.
     * @param ludtOptionValue used during instantiation.
     */
    public void setLudtOptionValue(String ludtOptionValue) throws JNCException {
        setLudtOptionValue(new YangEnumeration(ludtOptionValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "ludt-option".
     */
    public void unsetLudtOptionValue() throws JNCException {
        delete("ludt-option");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ludt-option" leaf will not have a value.
     */
    public void addLudtOption() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ludt-option",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ludt-option" with operation "replace".
     */
    public void markLudtOptionReplace() throws JNCException {
        markLeafReplace("ludtOption");
    }

    /**
     * Marks the leaf "ludt-option" with operation "merge".
     */
    public void markLudtOptionMerge() throws JNCException {
        markLeafMerge("ludtOption");
    }

    /**
     * Marks the leaf "ludt-option" with operation "create".
     */
    public void markLudtOptionCreate() throws JNCException {
        markLeafCreate("ludtOption");
    }

    /**
     * Marks the leaf "ludt-option" with operation "delete".
     */
    public void markLudtOptionDelete() throws JNCException {
        markLeafDelete("ludtOption");
    }

    /* Access methods for optional leaf child: "remote-subsystems". */

    /**
     * Gets the value for child leaf "remote-subsystems".
     * @return The value of the leaf.
     */
    public YangString getRemoteSubsystemsValue() throws JNCException {
        YangString remoteSubsystems = (YangString)getValue("remote-subsystems");
        if (remoteSubsystems == null) {
            remoteSubsystems = new YangString("unused-or-default");  // default
        }
        return remoteSubsystems;
    }

    /**
     * Sets the value for child leaf "remote-subsystems",
     * using instance of generated typedef class.
     * @param remoteSubsystemsValue The value to set.
     * @param remoteSubsystemsValue used during instantiation.
     */
    public void setRemoteSubsystemsValue(YangString remoteSubsystemsValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "remote-subsystems",
            remoteSubsystemsValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "remote-subsystems",
     * using a String value.
     * @param remoteSubsystemsValue used during instantiation.
     */
    public void setRemoteSubsystemsValue(String remoteSubsystemsValue)
            throws JNCException {
        setRemoteSubsystemsValue(new YangString(remoteSubsystemsValue));
    }

    /**
     * Unsets the value for child leaf "remote-subsystems".
     */
    public void unsetRemoteSubsystemsValue() throws JNCException {
        delete("remote-subsystems");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "remote-subsystems" leaf will not have a value.
     */
    public void addRemoteSubsystems() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "remote-subsystems",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "remote-subsystems" with operation "replace".
     */
    public void markRemoteSubsystemsReplace() throws JNCException {
        markLeafReplace("remoteSubsystems");
    }

    /**
     * Marks the leaf "remote-subsystems" with operation "merge".
     */
    public void markRemoteSubsystemsMerge() throws JNCException {
        markLeafMerge("remoteSubsystems");
    }

    /**
     * Marks the leaf "remote-subsystems" with operation "create".
     */
    public void markRemoteSubsystemsCreate() throws JNCException {
        markLeafCreate("remoteSubsystems");
    }

    /**
     * Marks the leaf "remote-subsystems" with operation "delete".
     */
    public void markRemoteSubsystemsDelete() throws JNCException {
        markLeafDelete("remoteSubsystems");
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
