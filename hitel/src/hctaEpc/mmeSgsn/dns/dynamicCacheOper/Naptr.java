/* 
 * @(#)Naptr.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.dns.dynamicCacheOper;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/dns/dynamicCacheOper/naptr"
 * <p>
 * See line 230 in
 * agwCmnDnsCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Naptr extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Naptr object.
     */
    public Naptr() {
        super(Epc.NAMESPACE, "naptr");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Naptr clone() {
        return (Naptr)cloneContent(new Naptr());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Naptr cloneShallow() {
        return (Naptr)cloneShallowContent(new Naptr());
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
            "domain-name",
            "index",
            "full-domain-name",
            "naptr-preference",
            "naptr-order",
            "naptr-flags",
            "naptr-services",
            "naptr-replacement",
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

    /* Access methods for leaf child: "domain-name". */

    /**
     * Gets the value for child leaf "domain-name".
     * @return The value of the leaf.
     */
    public YangString getDomainNameValue() throws JNCException {
        return (YangString)getValue("domain-name");
    }

    /**
     * Sets the value for child leaf "domain-name",
     * using instance of generated typedef class.
     * @param domainNameValue The value to set.
     * @param domainNameValue used during instantiation.
     */
    public void setDomainNameValue(YangString domainNameValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "domain-name",
            domainNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "domain-name",
     * using a String value.
     * @param domainNameValue used during instantiation.
     */
    public void setDomainNameValue(String domainNameValue) throws JNCException {
        setDomainNameValue(new YangString(domainNameValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "domain-name" leaf will not have a value.
     */
    public void addDomainName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "domain-name",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "index". */

    /**
     * Gets the value for child leaf "index".
     * @return The value of the leaf.
     */
    public YangUInt16 getIndexValue() throws JNCException {
        return (YangUInt16)getValue("index");
    }

    /**
     * Sets the value for child leaf "index",
     * using instance of generated typedef class.
     * @param indexValue The value to set.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(YangUInt16 indexValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "index",
            indexValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "index",
     * using Java primitive values.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(int indexValue) throws JNCException {
        setIndexValue(new YangUInt16(indexValue));
    }

    /**
     * Sets the value for child leaf "index",
     * using a String value.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(String indexValue) throws JNCException {
        setIndexValue(new YangUInt16(indexValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "index" leaf will not have a value.
     */
    public void addIndex() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "index",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "full-domain-name". */

    /**
     * Gets the value for child leaf "full-domain-name".
     * @return The value of the leaf.
     */
    public YangString getFullDomainNameValue() throws JNCException {
        return (YangString)getValue("full-domain-name");
    }

    /**
     * Sets the value for child leaf "full-domain-name",
     * using instance of generated typedef class.
     * @param fullDomainNameValue The value to set.
     * @param fullDomainNameValue used during instantiation.
     */
    public void setFullDomainNameValue(YangString fullDomainNameValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "full-domain-name",
            fullDomainNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "full-domain-name",
     * using a String value.
     * @param fullDomainNameValue used during instantiation.
     */
    public void setFullDomainNameValue(String fullDomainNameValue)
            throws JNCException {
        setFullDomainNameValue(new YangString(fullDomainNameValue));
    }

    /**
     * Unsets the value for child leaf "full-domain-name".
     */
    public void unsetFullDomainNameValue() throws JNCException {
        delete("full-domain-name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "full-domain-name" leaf will not have a value.
     */
    public void addFullDomainName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "full-domain-name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "full-domain-name" with operation "replace".
     */
    public void markFullDomainNameReplace() throws JNCException {
        markLeafReplace("fullDomainName");
    }

    /**
     * Marks the leaf "full-domain-name" with operation "merge".
     */
    public void markFullDomainNameMerge() throws JNCException {
        markLeafMerge("fullDomainName");
    }

    /**
     * Marks the leaf "full-domain-name" with operation "create".
     */
    public void markFullDomainNameCreate() throws JNCException {
        markLeafCreate("fullDomainName");
    }

    /**
     * Marks the leaf "full-domain-name" with operation "delete".
     */
    public void markFullDomainNameDelete() throws JNCException {
        markLeafDelete("fullDomainName");
    }

    /* Access methods for optional leaf child: "naptr-preference". */

    /**
     * Gets the value for child leaf "naptr-preference".
     * @return The value of the leaf.
     */
    public YangUInt16 getNaptrPreferenceValue() throws JNCException {
        return (YangUInt16)getValue("naptr-preference");
    }

    /**
     * Sets the value for child leaf "naptr-preference",
     * using instance of generated typedef class.
     * @param naptrPreferenceValue The value to set.
     * @param naptrPreferenceValue used during instantiation.
     */
    public void setNaptrPreferenceValue(YangUInt16 naptrPreferenceValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-preference",
            naptrPreferenceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "naptr-preference",
     * using Java primitive values.
     * @param naptrPreferenceValue used during instantiation.
     */
    public void setNaptrPreferenceValue(int naptrPreferenceValue)
            throws JNCException {
        setNaptrPreferenceValue(new YangUInt16(naptrPreferenceValue));
    }

    /**
     * Sets the value for child leaf "naptr-preference",
     * using a String value.
     * @param naptrPreferenceValue used during instantiation.
     */
    public void setNaptrPreferenceValue(String naptrPreferenceValue)
            throws JNCException {
        setNaptrPreferenceValue(new YangUInt16(naptrPreferenceValue));
    }

    /**
     * Unsets the value for child leaf "naptr-preference".
     */
    public void unsetNaptrPreferenceValue() throws JNCException {
        delete("naptr-preference");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "naptr-preference" leaf will not have a value.
     */
    public void addNaptrPreference() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-preference",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "naptr-preference" with operation "replace".
     */
    public void markNaptrPreferenceReplace() throws JNCException {
        markLeafReplace("naptrPreference");
    }

    /**
     * Marks the leaf "naptr-preference" with operation "merge".
     */
    public void markNaptrPreferenceMerge() throws JNCException {
        markLeafMerge("naptrPreference");
    }

    /**
     * Marks the leaf "naptr-preference" with operation "create".
     */
    public void markNaptrPreferenceCreate() throws JNCException {
        markLeafCreate("naptrPreference");
    }

    /**
     * Marks the leaf "naptr-preference" with operation "delete".
     */
    public void markNaptrPreferenceDelete() throws JNCException {
        markLeafDelete("naptrPreference");
    }

    /* Access methods for optional leaf child: "naptr-order". */

    /**
     * Gets the value for child leaf "naptr-order".
     * @return The value of the leaf.
     */
    public YangUInt16 getNaptrOrderValue() throws JNCException {
        return (YangUInt16)getValue("naptr-order");
    }

    /**
     * Sets the value for child leaf "naptr-order",
     * using instance of generated typedef class.
     * @param naptrOrderValue The value to set.
     * @param naptrOrderValue used during instantiation.
     */
    public void setNaptrOrderValue(YangUInt16 naptrOrderValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-order",
            naptrOrderValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "naptr-order",
     * using Java primitive values.
     * @param naptrOrderValue used during instantiation.
     */
    public void setNaptrOrderValue(int naptrOrderValue) throws JNCException {
        setNaptrOrderValue(new YangUInt16(naptrOrderValue));
    }

    /**
     * Sets the value for child leaf "naptr-order",
     * using a String value.
     * @param naptrOrderValue used during instantiation.
     */
    public void setNaptrOrderValue(String naptrOrderValue) throws JNCException {
        setNaptrOrderValue(new YangUInt16(naptrOrderValue));
    }

    /**
     * Unsets the value for child leaf "naptr-order".
     */
    public void unsetNaptrOrderValue() throws JNCException {
        delete("naptr-order");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "naptr-order" leaf will not have a value.
     */
    public void addNaptrOrder() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-order",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "naptr-order" with operation "replace".
     */
    public void markNaptrOrderReplace() throws JNCException {
        markLeafReplace("naptrOrder");
    }

    /**
     * Marks the leaf "naptr-order" with operation "merge".
     */
    public void markNaptrOrderMerge() throws JNCException {
        markLeafMerge("naptrOrder");
    }

    /**
     * Marks the leaf "naptr-order" with operation "create".
     */
    public void markNaptrOrderCreate() throws JNCException {
        markLeafCreate("naptrOrder");
    }

    /**
     * Marks the leaf "naptr-order" with operation "delete".
     */
    public void markNaptrOrderDelete() throws JNCException {
        markLeafDelete("naptrOrder");
    }

    /* Access methods for optional leaf child: "naptr-flags". */

    /**
     * Gets the value for child leaf "naptr-flags".
     * @return The value of the leaf.
     */
    public YangString getNaptrFlagsValue() throws JNCException {
        return (YangString)getValue("naptr-flags");
    }

    /**
     * Sets the value for child leaf "naptr-flags",
     * using instance of generated typedef class.
     * @param naptrFlagsValue The value to set.
     * @param naptrFlagsValue used during instantiation.
     */
    public void setNaptrFlagsValue(YangString naptrFlagsValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-flags",
            naptrFlagsValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "naptr-flags",
     * using a String value.
     * @param naptrFlagsValue used during instantiation.
     */
    public void setNaptrFlagsValue(String naptrFlagsValue) throws JNCException {
        setNaptrFlagsValue(new YangString(naptrFlagsValue));
    }

    /**
     * Unsets the value for child leaf "naptr-flags".
     */
    public void unsetNaptrFlagsValue() throws JNCException {
        delete("naptr-flags");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "naptr-flags" leaf will not have a value.
     */
    public void addNaptrFlags() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-flags",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "naptr-flags" with operation "replace".
     */
    public void markNaptrFlagsReplace() throws JNCException {
        markLeafReplace("naptrFlags");
    }

    /**
     * Marks the leaf "naptr-flags" with operation "merge".
     */
    public void markNaptrFlagsMerge() throws JNCException {
        markLeafMerge("naptrFlags");
    }

    /**
     * Marks the leaf "naptr-flags" with operation "create".
     */
    public void markNaptrFlagsCreate() throws JNCException {
        markLeafCreate("naptrFlags");
    }

    /**
     * Marks the leaf "naptr-flags" with operation "delete".
     */
    public void markNaptrFlagsDelete() throws JNCException {
        markLeafDelete("naptrFlags");
    }

    /* Access methods for optional leaf child: "naptr-services". */

    /**
     * Gets the value for child leaf "naptr-services".
     * @return The value of the leaf.
     */
    public YangString getNaptrServicesValue() throws JNCException {
        return (YangString)getValue("naptr-services");
    }

    /**
     * Sets the value for child leaf "naptr-services",
     * using instance of generated typedef class.
     * @param naptrServicesValue The value to set.
     * @param naptrServicesValue used during instantiation.
     */
    public void setNaptrServicesValue(YangString naptrServicesValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-services",
            naptrServicesValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "naptr-services",
     * using a String value.
     * @param naptrServicesValue used during instantiation.
     */
    public void setNaptrServicesValue(String naptrServicesValue)
            throws JNCException {
        setNaptrServicesValue(new YangString(naptrServicesValue));
    }

    /**
     * Unsets the value for child leaf "naptr-services".
     */
    public void unsetNaptrServicesValue() throws JNCException {
        delete("naptr-services");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "naptr-services" leaf will not have a value.
     */
    public void addNaptrServices() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-services",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "naptr-services" with operation "replace".
     */
    public void markNaptrServicesReplace() throws JNCException {
        markLeafReplace("naptrServices");
    }

    /**
     * Marks the leaf "naptr-services" with operation "merge".
     */
    public void markNaptrServicesMerge() throws JNCException {
        markLeafMerge("naptrServices");
    }

    /**
     * Marks the leaf "naptr-services" with operation "create".
     */
    public void markNaptrServicesCreate() throws JNCException {
        markLeafCreate("naptrServices");
    }

    /**
     * Marks the leaf "naptr-services" with operation "delete".
     */
    public void markNaptrServicesDelete() throws JNCException {
        markLeafDelete("naptrServices");
    }

    /* Access methods for optional leaf child: "naptr-replacement". */

    /**
     * Gets the value for child leaf "naptr-replacement".
     * @return The value of the leaf.
     */
    public YangString getNaptrReplacementValue() throws JNCException {
        return (YangString)getValue("naptr-replacement");
    }

    /**
     * Sets the value for child leaf "naptr-replacement",
     * using instance of generated typedef class.
     * @param naptrReplacementValue The value to set.
     * @param naptrReplacementValue used during instantiation.
     */
    public void setNaptrReplacementValue(YangString naptrReplacementValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-replacement",
            naptrReplacementValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "naptr-replacement",
     * using a String value.
     * @param naptrReplacementValue used during instantiation.
     */
    public void setNaptrReplacementValue(String naptrReplacementValue)
            throws JNCException {
        setNaptrReplacementValue(new YangString(naptrReplacementValue));
    }

    /**
     * Unsets the value for child leaf "naptr-replacement".
     */
    public void unsetNaptrReplacementValue() throws JNCException {
        delete("naptr-replacement");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "naptr-replacement" leaf will not have a value.
     */
    public void addNaptrReplacement() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "naptr-replacement",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "naptr-replacement" with operation "replace".
     */
    public void markNaptrReplacementReplace() throws JNCException {
        markLeafReplace("naptrReplacement");
    }

    /**
     * Marks the leaf "naptr-replacement" with operation "merge".
     */
    public void markNaptrReplacementMerge() throws JNCException {
        markLeafMerge("naptrReplacement");
    }

    /**
     * Marks the leaf "naptr-replacement" with operation "create".
     */
    public void markNaptrReplacementCreate() throws JNCException {
        markLeafCreate("naptrReplacement");
    }

    /**
     * Marks the leaf "naptr-replacement" with operation "delete".
     */
    public void markNaptrReplacementDelete() throws JNCException {
        markLeafDelete("naptrReplacement");
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