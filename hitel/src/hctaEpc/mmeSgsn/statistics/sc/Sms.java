/* 
 * @(#)Sms.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.statistics.sc;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/sc/sms"
 * <p>
 * See line 1689 in
 * oamPmServerCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Sms extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Sms object.
     */
    public Sms() {
        super(Epc.NAMESPACE, "sms");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Sms clone() {
        return (Sms)cloneContent(new Sms());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Sms cloneShallow() {
        return (Sms)cloneShallowContent(new Sms());
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
            "service",
            "ref-entity-type",
            "ref-entity-tag",
            "ref-subentity-info",
            "register-name",
            "register-value",
        };
    }

    /* Access methods for leaf child: "service". */

    /**
     * Gets the value for child leaf "service".
     * @return The value of the leaf.
     */
    public YangString getServiceValue() throws JNCException {
        return (YangString)getValue("service");
    }

    /**
     * Sets the value for child leaf "service",
     * using instance of generated typedef class.
     * @param serviceValue The value to set.
     * @param serviceValue used during instantiation.
     */
    public void setServiceValue(YangString serviceValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "service",
            serviceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "service",
     * using a String value.
     * @param serviceValue used during instantiation.
     */
    public void setServiceValue(String serviceValue) throws JNCException {
        setServiceValue(new YangString(serviceValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "service" leaf will not have a value.
     */
    public void addService() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "service",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "ref-entity-type". */

    /**
     * Gets the value for child leaf "ref-entity-type".
     * @return The value of the leaf.
     */
    public YangString getRefEntityTypeValue() throws JNCException {
        return (YangString)getValue("ref-entity-type");
    }

    /**
     * Sets the value for child leaf "ref-entity-type",
     * using instance of generated typedef class.
     * @param refEntityTypeValue The value to set.
     * @param refEntityTypeValue used during instantiation.
     */
    public void setRefEntityTypeValue(YangString refEntityTypeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ref-entity-type",
            refEntityTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ref-entity-type",
     * using a String value.
     * @param refEntityTypeValue used during instantiation.
     */
    public void setRefEntityTypeValue(String refEntityTypeValue)
            throws JNCException {
        setRefEntityTypeValue(new YangString(refEntityTypeValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ref-entity-type" leaf will not have a value.
     */
    public void addRefEntityType() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ref-entity-type",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "ref-entity-tag". */

    /**
     * Gets the value for child leaf "ref-entity-tag".
     * @return The value of the leaf.
     */
    public YangString getRefEntityTagValue() throws JNCException {
        return (YangString)getValue("ref-entity-tag");
    }

    /**
     * Sets the value for child leaf "ref-entity-tag",
     * using instance of generated typedef class.
     * @param refEntityTagValue The value to set.
     * @param refEntityTagValue used during instantiation.
     */
    public void setRefEntityTagValue(YangString refEntityTagValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ref-entity-tag",
            refEntityTagValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ref-entity-tag",
     * using a String value.
     * @param refEntityTagValue used during instantiation.
     */
    public void setRefEntityTagValue(String refEntityTagValue)
            throws JNCException {
        setRefEntityTagValue(new YangString(refEntityTagValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ref-entity-tag" leaf will not have a value.
     */
    public void addRefEntityTag() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ref-entity-tag",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "ref-subentity-info". */

    /**
     * Gets the value for child leaf "ref-subentity-info".
     * @return The value of the leaf.
     */
    public YangString getRefSubentityInfoValue() throws JNCException {
        return (YangString)getValue("ref-subentity-info");
    }

    /**
     * Sets the value for child leaf "ref-subentity-info",
     * using instance of generated typedef class.
     * @param refSubentityInfoValue The value to set.
     * @param refSubentityInfoValue used during instantiation.
     */
    public void setRefSubentityInfoValue(YangString refSubentityInfoValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ref-subentity-info",
            refSubentityInfoValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ref-subentity-info",
     * using a String value.
     * @param refSubentityInfoValue used during instantiation.
     */
    public void setRefSubentityInfoValue(String refSubentityInfoValue)
            throws JNCException {
        setRefSubentityInfoValue(new YangString(refSubentityInfoValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ref-subentity-info" leaf will not have a value.
     */
    public void addRefSubentityInfo() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ref-subentity-info",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "register-name". */

    /**
     * Gets the value for child leaf "register-name".
     * @return The value of the leaf.
     */
    public YangString getRegisterNameValue() throws JNCException {
        return (YangString)getValue("register-name");
    }

    /**
     * Sets the value for child leaf "register-name",
     * using instance of generated typedef class.
     * @param registerNameValue The value to set.
     * @param registerNameValue used during instantiation.
     */
    public void setRegisterNameValue(YangString registerNameValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "register-name",
            registerNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "register-name",
     * using a String value.
     * @param registerNameValue used during instantiation.
     */
    public void setRegisterNameValue(String registerNameValue)
            throws JNCException {
        setRegisterNameValue(new YangString(registerNameValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "register-name" leaf will not have a value.
     */
    public void addRegisterName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "register-name",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "register-value". */

    /**
     * Gets the value for child leaf "register-value".
     * @return The value of the leaf.
     */
    public YangString getRegisterValueValue() throws JNCException {
        return (YangString)getValue("register-value");
    }

    /**
     * Sets the value for child leaf "register-value",
     * using instance of generated typedef class.
     * @param registerValueValue The value to set.
     * @param registerValueValue used during instantiation.
     */
    public void setRegisterValueValue(YangString registerValueValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "register-value",
            registerValueValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "register-value",
     * using a String value.
     * @param registerValueValue used during instantiation.
     */
    public void setRegisterValueValue(String registerValueValue)
            throws JNCException {
        setRegisterValueValue(new YangString(registerValueValue));
    }

    /**
     * Unsets the value for child leaf "register-value".
     */
    public void unsetRegisterValueValue() throws JNCException {
        delete("register-value");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "register-value" leaf will not have a value.
     */
    public void addRegisterValue() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "register-value",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "register-value" with operation "replace".
     */
    public void markRegisterValueReplace() throws JNCException {
        markLeafReplace("registerValue");
    }

    /**
     * Marks the leaf "register-value" with operation "merge".
     */
    public void markRegisterValueMerge() throws JNCException {
        markLeafMerge("registerValue");
    }

    /**
     * Marks the leaf "register-value" with operation "create".
     */
    public void markRegisterValueCreate() throws JNCException {
        markLeafCreate("registerValue");
    }

    /**
     * Marks the leaf "register-value" with operation "delete".
     */
    public void markRegisterValueDelete() throws JNCException {
        markLeafDelete("registerValue");
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
