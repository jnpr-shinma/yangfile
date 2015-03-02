/* 
 * @(#)System.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw;

import Callp;

import Element;

import ElementChildrenIterator;

import Epc;

import JNCException;

import Lb;

import Mgmt;

import NodeSet;

import SystemMtu;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/system"
 * <p>
 * See line 102 in
 * fgwConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class System extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "system-mtu".
     */
    public SystemMtu systemMtu = null;

    /**
     * Field for child container "mgmt".
     */
    public Mgmt mgmt = null;

    /**
     * Field for child container "lb".
     */
    public Lb lb = null;

    /**
     * Constructor for an empty System object.
     */
    public System() {
        super(Epc.NAMESPACE, "system");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public System clone() {
        return (System)cloneContent(new System());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public System cloneShallow() {
        return (System)cloneShallowContent(new System());
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
            "opmode",
            "steering",
            "system-mtu",
            "mgmt",
            "callp",
            "lb",
            "transaction",
        };
    }

    /* Access methods for optional leaf child: "opmode". */

    /**
     * Gets the value for child leaf "opmode".
     * @return The value of the leaf.
     */
    public YangEnumeration getOpmodeValue() throws JNCException {
        YangEnumeration opmode = (YangEnumeration)getValue("opmode");
        if (opmode == null) {
            opmode = new YangEnumeration("product", new String[] {  // default
                "product",
                "desktop",
                "lab",
            });
        }
        return opmode;
    }

    /**
     * Sets the value for child leaf "opmode",
     * using instance of generated typedef class.
     * @param opmodeValue The value to set.
     * @param opmodeValue used during instantiation.
     */
    public void setOpmodeValue(YangEnumeration opmodeValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "opmode",
            opmodeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "opmode",
     * using a String value.
     * @param opmodeValue used during instantiation.
     */
    public void setOpmodeValue(String opmodeValue) throws JNCException {
        setOpmodeValue(new YangEnumeration(opmodeValue, new String[] {
             "product",
             "desktop",
             "lab",
        }));
    }

    /**
     * Unsets the value for child leaf "opmode".
     */
    public void unsetOpmodeValue() throws JNCException {
        delete("opmode");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "opmode" leaf will not have a value.
     */
    public void addOpmode() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "opmode",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "opmode" with operation "replace".
     */
    public void markOpmodeReplace() throws JNCException {
        markLeafReplace("opmode");
    }

    /**
     * Marks the leaf "opmode" with operation "merge".
     */
    public void markOpmodeMerge() throws JNCException {
        markLeafMerge("opmode");
    }

    /**
     * Marks the leaf "opmode" with operation "create".
     */
    public void markOpmodeCreate() throws JNCException {
        markLeafCreate("opmode");
    }

    /**
     * Marks the leaf "opmode" with operation "delete".
     */
    public void markOpmodeDelete() throws JNCException {
        markLeafDelete("opmode");
    }

    /* Access methods for optional leaf child: "steering". */

    /**
     * Gets the value for child leaf "steering".
     * @return The value of the leaf.
     */
    public YangEnumeration getSteeringValue() throws JNCException {
        YangEnumeration steering = (YangEnumeration)getValue("steering");
        if (steering == null) {
            steering = new YangEnumeration("contrail", new String[] {  // default
                "contrail",
                "off",
                "load-balancer",
            });
        }
        return steering;
    }

    /**
     * Sets the value for child leaf "steering",
     * using instance of generated typedef class.
     * @param steeringValue The value to set.
     * @param steeringValue used during instantiation.
     */
    public void setSteeringValue(YangEnumeration steeringValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "steering",
            steeringValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "steering",
     * using a String value.
     * @param steeringValue used during instantiation.
     */
    public void setSteeringValue(String steeringValue) throws JNCException {
        setSteeringValue(new YangEnumeration(steeringValue, new String[] {
             "contrail",
             "off",
             "load-balancer",
        }));
    }

    /**
     * Unsets the value for child leaf "steering".
     */
    public void unsetSteeringValue() throws JNCException {
        delete("steering");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "steering" leaf will not have a value.
     */
    public void addSteering() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "steering",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "steering" with operation "replace".
     */
    public void markSteeringReplace() throws JNCException {
        markLeafReplace("steering");
    }

    /**
     * Marks the leaf "steering" with operation "merge".
     */
    public void markSteeringMerge() throws JNCException {
        markLeafMerge("steering");
    }

    /**
     * Marks the leaf "steering" with operation "create".
     */
    public void markSteeringCreate() throws JNCException {
        markLeafCreate("steering");
    }

    /**
     * Marks the leaf "steering" with operation "delete".
     */
    public void markSteeringDelete() throws JNCException {
        markLeafDelete("steering");
    }

    /* Access methods for container child: "system-mtu". */

    /**
     * Adds container entry "systemMtu", using an existing object.
     * @param systemMtu The object to add.
     * @return The added child.
     */
    public SystemMtu addSystemMtu(SystemMtu systemMtu) throws JNCException {
        this.systemMtu = systemMtu;
        insertChild(systemMtu, childrenNames());
        return systemMtu;
    }

    /**
     * Adds container entry "systemMtu".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public SystemMtu addSystemMtu() throws JNCException {
        SystemMtu systemMtu = new SystemMtu();
        this.systemMtu = systemMtu;
        insertChild(systemMtu, childrenNames());
        return systemMtu;
    }

    /**
     * Deletes container entry "systemMtu".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSystemMtu() throws JNCException {
        this.systemMtu = null;
        String path = "system-mtu";
        return delete(path);
    }

    /* Access methods for container child: "mgmt". */

    /**
     * Adds container entry "mgmt", using an existing object.
     * @param mgmt The object to add.
     * @return The added child.
     */
    public Mgmt addMgmt(Mgmt mgmt) throws JNCException {
        this.mgmt = mgmt;
        insertChild(mgmt, childrenNames());
        return mgmt;
    }

    /**
     * Adds container entry "mgmt".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Mgmt addMgmt() throws JNCException {
        Mgmt mgmt = new Mgmt();
        this.mgmt = mgmt;
        insertChild(mgmt, childrenNames());
        return mgmt;
    }

    /**
     * Deletes container entry "mgmt".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMgmt() throws JNCException {
        this.mgmt = null;
        String path = "mgmt";
        return delete(path);
    }

    /* Access methods for list child: "callp". */

    /**
     * Gets list entry "callp", with specified keys.
     * @param serviceIdValue Key argument of child.
     */
    public Callp getCallp(YangUInt16 serviceIdValue) throws JNCException {
        String path = "callp[serviceId='" + serviceIdValue + "']";
        return (Callp)searchOne(path);
    }

    /**
     * Gets list entry "callp", with specified keys.
     * The keys are specified as strings.
     * @param serviceIdValue Key argument of child.
     */
    public Callp getCallp(String serviceIdValue) throws JNCException {
        String path = "callp[serviceId='" + serviceIdValue + "']";
        return (Callp)searchOne(path);
    }

    /**
     * Iterator method for the list "callp".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator callpIterator() {
        return new ElementChildrenIterator(children, "callp");
    }

    /**
     * Adds list entry "callp", using an existing object.
     * @param callp The object to add.
     * @return The added child.
     */
    public Callp addCallp(Callp callp) throws JNCException {
        insertChild(callp, childrenNames());
        return callp;
    }

    /**
     * Adds list entry "callp", with specified keys.
     * @param serviceIdValue Key argument of child.
     * @return The added child.
     */
    public Callp addCallp(YangUInt16 serviceIdValue) throws JNCException {
        Callp callp = new Callp(serviceIdValue);
        return addCallp(callp);
    }

    /**
     * Adds list entry "callp", with specified keys.
     * The keys are specified as strings.
     * @param serviceIdValue Key argument of child.
     * @return The added child.
     */
    public Callp addCallp(String serviceIdValue) throws JNCException {
        Callp callp = new Callp(serviceIdValue);
        return addCallp(callp);
    }

    /**
     * Adds list entry "callp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Callp addCallp() throws JNCException {
        Callp callp = new Callp();
        insertChild(callp, childrenNames());
        return callp;
    }

    /**
     * Deletes list entry "callp", with specified keys.
     * @param serviceIdValue Key argument of child.
     */
    public void deleteCallp(YangUInt16 serviceIdValue) throws JNCException {
        String path = "callp[serviceId='" + serviceIdValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "callp", with specified keys.
     * The keys are specified as strings.
     * @param serviceIdValue Key argument of child.
     */
    public void deleteCallp(String serviceIdValue) throws JNCException {
        String path = "callp[serviceId='" + serviceIdValue + "']";
        delete(path);
    }

    /* Access methods for container child: "lb". */

    /**
     * Adds container entry "lb", using an existing object.
     * @param lb The object to add.
     * @return The added child.
     */
    public Lb addLb(Lb lb) throws JNCException {
        this.lb = lb;
        insertChild(lb, childrenNames());
        return lb;
    }

    /**
     * Adds container entry "lb".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Lb addLb() throws JNCException {
        Lb lb = new Lb();
        this.lb = lb;
        insertChild(lb, childrenNames());
        return lb;
    }

    /**
     * Deletes container entry "lb".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteLb() throws JNCException {
        this.lb = null;
        String path = "lb";
        return delete(path);
    }

    /* Access methods for optional leaf child: "transaction". */

    /**
     * Gets the value for child leaf "transaction".
     * @return The value of the leaf.
     */
    public YangString getTransactionValue() throws JNCException {
        return (YangString)getValue("transaction");
    }

    /**
     * Sets the value for child leaf "transaction",
     * using instance of generated typedef class.
     * @param transactionValue The value to set.
     * @param transactionValue used during instantiation.
     */
    public void setTransactionValue(YangString transactionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "transaction",
            transactionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "transaction",
     * using a String value.
     * @param transactionValue used during instantiation.
     */
    public void setTransactionValue(String transactionValue)
            throws JNCException {
        setTransactionValue(new YangString(transactionValue));
    }

    /**
     * Unsets the value for child leaf "transaction".
     */
    public void unsetTransactionValue() throws JNCException {
        delete("transaction");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "transaction" leaf will not have a value.
     */
    public void addTransaction() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "transaction",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "transaction" with operation "replace".
     */
    public void markTransactionReplace() throws JNCException {
        markLeafReplace("transaction");
    }

    /**
     * Marks the leaf "transaction" with operation "merge".
     */
    public void markTransactionMerge() throws JNCException {
        markLeafMerge("transaction");
    }

    /**
     * Marks the leaf "transaction" with operation "create".
     */
    public void markTransactionCreate() throws JNCException {
        markLeafCreate("transaction");
    }

    /**
     * Marks the leaf "transaction" with operation "delete".
     */
    public void markTransactionDelete() throws JNCException {
        markLeafDelete("transaction");
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof SystemMtu) systemMtu = (SystemMtu)child;
        else if (child instanceof Mgmt) mgmt = (Mgmt)child;
        else if (child instanceof Lb) lb = (Lb)child;
    }

}
