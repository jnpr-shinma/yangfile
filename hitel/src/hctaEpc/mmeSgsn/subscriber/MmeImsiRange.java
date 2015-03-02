/* 
 * @(#)MmeImsiRange.java        1.0 09/12/14
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

import YangString;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/subscriber/mme-imsi-range"
 * <p>
 * See line 1283 in
 * scConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeImsiRange extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeImsiRange object.
     */
    public MmeImsiRange() {
        super(Epc.NAMESPACE, "mme-imsi-range");
    }

    /**
     * Constructor for an initialized MmeImsiRange object,
     * 
     * @param rangeValue Key argument of child.
     * @param serviceAreaFieldValue Key argument of child.
     */
    public MmeImsiRange(YangString rangeValue, YangString serviceAreaFieldValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-imsi-range");
        Leaf range = new Leaf(Epc.NAMESPACE, "range");
        range.setValue(rangeValue);
        insertChild(range, childrenNames());
        Leaf serviceAreaField = new Leaf(Epc.NAMESPACE, "service-area-field");
        serviceAreaField.setValue(serviceAreaFieldValue);
        insertChild(serviceAreaField, childrenNames());
    }

    /**
     * Constructor for an initialized MmeImsiRange object,
     * with String keys.
     * @param rangeValue Key argument of child.
     * @param serviceAreaFieldValue Key argument of child.
     */
    public MmeImsiRange(String rangeValue, String serviceAreaFieldValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-imsi-range");
        Leaf range = new Leaf(Epc.NAMESPACE, "range");
        range.setValue(new YangString(rangeValue));
        insertChild(range, childrenNames());
        Leaf serviceAreaField = new Leaf(Epc.NAMESPACE, "service-area-field");
        serviceAreaField.setValue(new YangString(serviceAreaFieldValue));
        insertChild(serviceAreaField, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeImsiRange clone() {
        MmeImsiRange copy;
        try {
            copy = new MmeImsiRange(getRangeValue().toString(), getServiceAreaFieldValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeImsiRange)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeImsiRange cloneShallow() {
        MmeImsiRange copy;
        try {
            copy = new MmeImsiRange(getRangeValue().toString(), getServiceAreaFieldValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeImsiRange)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "range",
            "service-area-field",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "range",
            "service-area-field",
            "subscriber-class",
        };
    }

    /* Access methods for leaf child: "range". */

    /**
     * Gets the value for child leaf "range".
     * @return The value of the leaf.
     */
    public YangString getRangeValue() throws JNCException {
        return (YangString)getValue("range");
    }

    /**
     * Sets the value for child leaf "range",
     * using instance of generated typedef class.
     * @param rangeValue The value to set.
     * @param rangeValue used during instantiation.
     */
    public void setRangeValue(YangString rangeValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "range",
            rangeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "range",
     * using a String value.
     * @param rangeValue used during instantiation.
     */
    public void setRangeValue(String rangeValue) throws JNCException {
        setRangeValue(new YangString(rangeValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "range" leaf will not have a value.
     */
    public void addRange() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "range",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "service-area-field". */

    /**
     * Gets the value for child leaf "service-area-field".
     * @return The value of the leaf.
     */
    public YangString getServiceAreaFieldValue() throws JNCException {
        return (YangString)getValue("service-area-field");
    }

    /**
     * Sets the value for child leaf "service-area-field",
     * using instance of generated typedef class.
     * @param serviceAreaFieldValue The value to set.
     * @param serviceAreaFieldValue used during instantiation.
     */
    public void setServiceAreaFieldValue(YangString serviceAreaFieldValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "service-area-field",
            serviceAreaFieldValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "service-area-field",
     * using a String value.
     * @param serviceAreaFieldValue used during instantiation.
     */
    public void setServiceAreaFieldValue(String serviceAreaFieldValue)
            throws JNCException {
        setServiceAreaFieldValue(new YangString(serviceAreaFieldValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "service-area-field" leaf will not have a value.
     */
    public void addServiceAreaField() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "service-area-field",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "subscriber-class". */

    /**
     * Gets the value for child leaf "subscriber-class".
     * @return The value of the leaf.
     */
    public YangString getSubscriberClassValue() throws JNCException {
        YangString subscriberClass = (YangString)getValue("subscriber-class");
        if (subscriberClass == null) {
            subscriberClass = new YangString("default");  // default
        }
        return subscriberClass;
    }

    /**
     * Sets the value for child leaf "subscriber-class",
     * using instance of generated typedef class.
     * @param subscriberClassValue The value to set.
     * @param subscriberClassValue used during instantiation.
     */
    public void setSubscriberClassValue(YangString subscriberClassValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "subscriber-class",
            subscriberClassValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "subscriber-class",
     * using a String value.
     * @param subscriberClassValue used during instantiation.
     */
    public void setSubscriberClassValue(String subscriberClassValue)
            throws JNCException {
        setSubscriberClassValue(new YangString(subscriberClassValue));
    }

    /**
     * Unsets the value for child leaf "subscriber-class".
     */
    public void unsetSubscriberClassValue() throws JNCException {
        delete("subscriber-class");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "subscriber-class" leaf will not have a value.
     */
    public void addSubscriberClass() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "subscriber-class",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "subscriber-class" with operation "replace".
     */
    public void markSubscriberClassReplace() throws JNCException {
        markLeafReplace("subscriberClass");
    }

    /**
     * Marks the leaf "subscriber-class" with operation "merge".
     */
    public void markSubscriberClassMerge() throws JNCException {
        markLeafMerge("subscriberClass");
    }

    /**
     * Marks the leaf "subscriber-class" with operation "create".
     */
    public void markSubscriberClassCreate() throws JNCException {
        markLeafCreate("subscriberClass");
    }

    /**
     * Marks the leaf "subscriber-class" with operation "delete".
     */
    public void markSubscriberClassDelete() throws JNCException {
        markLeafDelete("subscriberClass");
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