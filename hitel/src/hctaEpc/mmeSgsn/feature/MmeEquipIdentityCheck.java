/* 
 * @(#)MmeEquipIdentityCheck.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.feature;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/feature/mme-equip-identity-check"
 * <p>
 * See line 257 in
 * featuresConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeEquipIdentityCheck extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeEquipIdentityCheck object.
     */
    public MmeEquipIdentityCheck() {
        super(Epc.NAMESPACE, "mme-equip-identity-check");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeEquipIdentityCheck clone() {
        return (MmeEquipIdentityCheck)cloneContent(new MmeEquipIdentityCheck());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeEquipIdentityCheck cloneShallow() {
        return (MmeEquipIdentityCheck)cloneShallowContent(new MmeEquipIdentityCheck());
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
            "allow-grey-mobile",
            "log-black-grey-mobile",
            "imei-check-lifetime",
            "imei-check-during-internode",
        };
    }

    /* Access methods for optional leaf child: "allow-grey-mobile". */

    /**
     * Gets the value for child leaf "allow-grey-mobile".
     * @return The value of the leaf.
     */
    public YangEnumeration getAllowGreyMobileValue() throws JNCException {
        YangEnumeration allowGreyMobile = (YangEnumeration)getValue("allow-grey-mobile");
        if (allowGreyMobile == null) {
            allowGreyMobile = new YangEnumeration("enable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return allowGreyMobile;
    }

    /**
     * Sets the value for child leaf "allow-grey-mobile",
     * using instance of generated typedef class.
     * @param allowGreyMobileValue The value to set.
     * @param allowGreyMobileValue used during instantiation.
     */
    public void setAllowGreyMobileValue(YangEnumeration allowGreyMobileValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "allow-grey-mobile",
            allowGreyMobileValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "allow-grey-mobile",
     * using a String value.
     * @param allowGreyMobileValue used during instantiation.
     */
    public void setAllowGreyMobileValue(String allowGreyMobileValue)
            throws JNCException {
        setAllowGreyMobileValue(new YangEnumeration(allowGreyMobileValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "allow-grey-mobile".
     */
    public void unsetAllowGreyMobileValue() throws JNCException {
        delete("allow-grey-mobile");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "allow-grey-mobile" leaf will not have a value.
     */
    public void addAllowGreyMobile() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "allow-grey-mobile",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "allow-grey-mobile" with operation "replace".
     */
    public void markAllowGreyMobileReplace() throws JNCException {
        markLeafReplace("allowGreyMobile");
    }

    /**
     * Marks the leaf "allow-grey-mobile" with operation "merge".
     */
    public void markAllowGreyMobileMerge() throws JNCException {
        markLeafMerge("allowGreyMobile");
    }

    /**
     * Marks the leaf "allow-grey-mobile" with operation "create".
     */
    public void markAllowGreyMobileCreate() throws JNCException {
        markLeafCreate("allowGreyMobile");
    }

    /**
     * Marks the leaf "allow-grey-mobile" with operation "delete".
     */
    public void markAllowGreyMobileDelete() throws JNCException {
        markLeafDelete("allowGreyMobile");
    }

    /* Access methods for optional leaf child: "log-black-grey-mobile". */

    /**
     * Gets the value for child leaf "log-black-grey-mobile".
     * @return The value of the leaf.
     */
    public YangEnumeration getLogBlackGreyMobileValue() throws JNCException {
        YangEnumeration logBlackGreyMobile = (YangEnumeration)getValue("log-black-grey-mobile");
        if (logBlackGreyMobile == null) {
            logBlackGreyMobile = new YangEnumeration("disable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return logBlackGreyMobile;
    }

    /**
     * Sets the value for child leaf "log-black-grey-mobile",
     * using instance of generated typedef class.
     * @param logBlackGreyMobileValue The value to set.
     * @param logBlackGreyMobileValue used during instantiation.
     */
    public void setLogBlackGreyMobileValue(YangEnumeration logBlackGreyMobileValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "log-black-grey-mobile",
            logBlackGreyMobileValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "log-black-grey-mobile",
     * using a String value.
     * @param logBlackGreyMobileValue used during instantiation.
     */
    public void setLogBlackGreyMobileValue(String logBlackGreyMobileValue)
            throws JNCException {
        setLogBlackGreyMobileValue(new YangEnumeration(logBlackGreyMobileValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "log-black-grey-mobile".
     */
    public void unsetLogBlackGreyMobileValue() throws JNCException {
        delete("log-black-grey-mobile");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "log-black-grey-mobile" leaf will not have a value.
     */
    public void addLogBlackGreyMobile() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "log-black-grey-mobile",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "log-black-grey-mobile" with operation "replace".
     */
    public void markLogBlackGreyMobileReplace() throws JNCException {
        markLeafReplace("logBlackGreyMobile");
    }

    /**
     * Marks the leaf "log-black-grey-mobile" with operation "merge".
     */
    public void markLogBlackGreyMobileMerge() throws JNCException {
        markLeafMerge("logBlackGreyMobile");
    }

    /**
     * Marks the leaf "log-black-grey-mobile" with operation "create".
     */
    public void markLogBlackGreyMobileCreate() throws JNCException {
        markLeafCreate("logBlackGreyMobile");
    }

    /**
     * Marks the leaf "log-black-grey-mobile" with operation "delete".
     */
    public void markLogBlackGreyMobileDelete() throws JNCException {
        markLeafDelete("logBlackGreyMobile");
    }

    /* Access methods for optional leaf child: "imei-check-lifetime". */

    /**
     * Gets the value for child leaf "imei-check-lifetime".
     * @return The value of the leaf.
     */
    public YangString getImeiCheckLifetimeValue() throws JNCException {
        YangString imeiCheckLifetime = (YangString)getValue("imei-check-lifetime");
        if (imeiCheckLifetime == null) {
            imeiCheckLifetime = new YangString("disable");  // default
        }
        return imeiCheckLifetime;
    }

    /**
     * Sets the value for child leaf "imei-check-lifetime",
     * using instance of generated typedef class.
     * @param imeiCheckLifetimeValue The value to set.
     * @param imeiCheckLifetimeValue used during instantiation.
     */
    public void setImeiCheckLifetimeValue(YangString imeiCheckLifetimeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imei-check-lifetime",
            imeiCheckLifetimeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "imei-check-lifetime",
     * using a String value.
     * @param imeiCheckLifetimeValue used during instantiation.
     */
    public void setImeiCheckLifetimeValue(String imeiCheckLifetimeValue)
            throws JNCException {
        setImeiCheckLifetimeValue(new YangString(imeiCheckLifetimeValue));
    }

    /**
     * Unsets the value for child leaf "imei-check-lifetime".
     */
    public void unsetImeiCheckLifetimeValue() throws JNCException {
        delete("imei-check-lifetime");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "imei-check-lifetime" leaf will not have a value.
     */
    public void addImeiCheckLifetime() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imei-check-lifetime",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "imei-check-lifetime" with operation "replace".
     */
    public void markImeiCheckLifetimeReplace() throws JNCException {
        markLeafReplace("imeiCheckLifetime");
    }

    /**
     * Marks the leaf "imei-check-lifetime" with operation "merge".
     */
    public void markImeiCheckLifetimeMerge() throws JNCException {
        markLeafMerge("imeiCheckLifetime");
    }

    /**
     * Marks the leaf "imei-check-lifetime" with operation "create".
     */
    public void markImeiCheckLifetimeCreate() throws JNCException {
        markLeafCreate("imeiCheckLifetime");
    }

    /**
     * Marks the leaf "imei-check-lifetime" with operation "delete".
     */
    public void markImeiCheckLifetimeDelete() throws JNCException {
        markLeafDelete("imeiCheckLifetime");
    }

    /* Access methods for optional leaf child: "imei-check-during-internode". */

    /**
     * Gets the value for child leaf "imei-check-during-internode".
     * @return The value of the leaf.
     */
    public YangEnumeration getImeiCheckDuringInternodeValue()
            throws JNCException {
        YangEnumeration imeiCheckDuringInternode = (YangEnumeration)getValue("imei-check-during-internode");
        if (imeiCheckDuringInternode == null) {
            imeiCheckDuringInternode = new YangEnumeration("on", new String[] {  // default
                "on",
                "off",
            });
        }
        return imeiCheckDuringInternode;
    }

    /**
     * Sets the value for child leaf "imei-check-during-internode",
     * using instance of generated typedef class.
     * @param imeiCheckDuringInternodeValue The value to set.
     * @param imeiCheckDuringInternodeValue used during instantiation.
     */
    public void setImeiCheckDuringInternodeValue(YangEnumeration imeiCheckDuringInternodeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imei-check-during-internode",
            imeiCheckDuringInternodeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "imei-check-during-internode",
     * using a String value.
     * @param imeiCheckDuringInternodeValue used during instantiation.
     */
    public void setImeiCheckDuringInternodeValue(String imeiCheckDuringInternodeValue)
            throws JNCException {
        setImeiCheckDuringInternodeValue(new YangEnumeration(imeiCheckDuringInternodeValue, new String[] {
             "on",
             "off",
        }));
    }

    /**
     * Unsets the value for child leaf "imei-check-during-internode".
     */
    public void unsetImeiCheckDuringInternodeValue() throws JNCException {
        delete("imei-check-during-internode");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "imei-check-during-internode" leaf will not have a value.
     */
    public void addImeiCheckDuringInternode() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "imei-check-during-internode",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "imei-check-during-internode" with operation "replace".
     */
    public void markImeiCheckDuringInternodeReplace() throws JNCException {
        markLeafReplace("imeiCheckDuringInternode");
    }

    /**
     * Marks the leaf "imei-check-during-internode" with operation "merge".
     */
    public void markImeiCheckDuringInternodeMerge() throws JNCException {
        markLeafMerge("imeiCheckDuringInternode");
    }

    /**
     * Marks the leaf "imei-check-during-internode" with operation "create".
     */
    public void markImeiCheckDuringInternodeCreate() throws JNCException {
        markLeafCreate("imeiCheckDuringInternode");
    }

    /**
     * Marks the leaf "imei-check-during-internode" with operation "delete".
     */
    public void markImeiCheckDuringInternodeDelete() throws JNCException {
        markLeafDelete("imeiCheckDuringInternode");
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
