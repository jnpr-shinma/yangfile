/* 
 * @(#)AgwDnsIf.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.dns;
import .ietfInetTypes.IpAddress;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/dns/agw-dns-if"
 * <p>
 * See line 206 in
 * agwCmnDnsConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class AgwDnsIf extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty AgwDnsIf object.
     */
    public AgwDnsIf() {
        super(Epc.NAMESPACE, "agw-dns-if");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AgwDnsIf clone() {
        return (AgwDnsIf)cloneContent(new AgwDnsIf());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AgwDnsIf cloneShallow() {
        return (AgwDnsIf)cloneShallowContent(new AgwDnsIf());
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
            "routing-instance",
            "ip-address",
            "dscp-mark",
            "override-ttl",
            "negative-cache-ttl",
            "dynamic-cache-size",
            "initial-retry-timer",
            "max-retry-timer",
            "retry-count",
        };
    }

    /* Access methods for optional leaf child: "routing-instance". */

    /**
     * Gets the value for child leaf "routing-instance".
     * @return The value of the leaf.
     */
    public YangString getRoutingInstanceValue() throws JNCException {
        return (YangString)getValue("routing-instance");
    }

    /**
     * Sets the value for child leaf "routing-instance",
     * using instance of generated typedef class.
     * @param routingInstanceValue The value to set.
     * @param routingInstanceValue used during instantiation.
     */
    public void setRoutingInstanceValue(YangString routingInstanceValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance",
            routingInstanceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "routing-instance",
     * using a String value.
     * @param routingInstanceValue used during instantiation.
     */
    public void setRoutingInstanceValue(String routingInstanceValue)
            throws JNCException {
        setRoutingInstanceValue(new YangString(routingInstanceValue));
    }

    /**
     * Unsets the value for child leaf "routing-instance".
     */
    public void unsetRoutingInstanceValue() throws JNCException {
        delete("routing-instance");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "routing-instance" leaf will not have a value.
     */
    public void addRoutingInstance() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "routing-instance" with operation "replace".
     */
    public void markRoutingInstanceReplace() throws JNCException {
        markLeafReplace("routingInstance");
    }

    /**
     * Marks the leaf "routing-instance" with operation "merge".
     */
    public void markRoutingInstanceMerge() throws JNCException {
        markLeafMerge("routingInstance");
    }

    /**
     * Marks the leaf "routing-instance" with operation "create".
     */
    public void markRoutingInstanceCreate() throws JNCException {
        markLeafCreate("routingInstance");
    }

    /**
     * Marks the leaf "routing-instance" with operation "delete".
     */
    public void markRoutingInstanceDelete() throws JNCException {
        markLeafDelete("routingInstance");
    }

    /* Access methods for optional leaf child: "ip-address". */

    /**
     * Gets the value for child leaf "ip-address".
     * @return The value of the leaf.
     */
    public IpAddress getIpAddressValue() throws JNCException {
        return (IpAddress)getValue("ip-address");
    }

    /**
     * Sets the value for child leaf "ip-address",
     * using a JNC type value.
     * @param ipAddressValue The value to set.
     * @param ipAddressValue used during instantiation.
     */
    public void setIpAddressValue(IpAddress ipAddressValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address",
            ipAddressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address",
     * using a String value.
     * @param ipAddressValue used during instantiation.
     */
    public void setIpAddressValue(String ipAddressValue) throws JNCException {
        setIpAddressValue(new IpAddress(ipAddressValue));
    }

    /**
     * Unsets the value for child leaf "ip-address".
     */
    public void unsetIpAddressValue() throws JNCException {
        delete("ip-address");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address" leaf will not have a value.
     */
    public void addIpAddress() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address" with operation "replace".
     */
    public void markIpAddressReplace() throws JNCException {
        markLeafReplace("ipAddress");
    }

    /**
     * Marks the leaf "ip-address" with operation "merge".
     */
    public void markIpAddressMerge() throws JNCException {
        markLeafMerge("ipAddress");
    }

    /**
     * Marks the leaf "ip-address" with operation "create".
     */
    public void markIpAddressCreate() throws JNCException {
        markLeafCreate("ipAddress");
    }

    /**
     * Marks the leaf "ip-address" with operation "delete".
     */
    public void markIpAddressDelete() throws JNCException {
        markLeafDelete("ipAddress");
    }

    /* Access methods for optional leaf child: "dscp-mark". */

    /**
     * Gets the value for child leaf "dscp-mark".
     * @return The value of the leaf.
     */
    public YangString getDscpMarkValue() throws JNCException {
        YangString dscpMark = (YangString)getValue("dscp-mark");
        if (dscpMark == null) {
            dscpMark = new YangString("de");  // default
        }
        return dscpMark;
    }

    /**
     * Sets the value for child leaf "dscp-mark",
     * using instance of generated typedef class.
     * @param dscpMarkValue The value to set.
     * @param dscpMarkValue used during instantiation.
     */
    public void setDscpMarkValue(YangString dscpMarkValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "dscp-mark",
            dscpMarkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "dscp-mark",
     * using a String value.
     * @param dscpMarkValue used during instantiation.
     */
    public void setDscpMarkValue(String dscpMarkValue) throws JNCException {
        setDscpMarkValue(new YangString(dscpMarkValue));
    }

    /**
     * Unsets the value for child leaf "dscp-mark".
     */
    public void unsetDscpMarkValue() throws JNCException {
        delete("dscp-mark");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "dscp-mark" leaf will not have a value.
     */
    public void addDscpMark() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "dscp-mark",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "dscp-mark" with operation "replace".
     */
    public void markDscpMarkReplace() throws JNCException {
        markLeafReplace("dscpMark");
    }

    /**
     * Marks the leaf "dscp-mark" with operation "merge".
     */
    public void markDscpMarkMerge() throws JNCException {
        markLeafMerge("dscpMark");
    }

    /**
     * Marks the leaf "dscp-mark" with operation "create".
     */
    public void markDscpMarkCreate() throws JNCException {
        markLeafCreate("dscpMark");
    }

    /**
     * Marks the leaf "dscp-mark" with operation "delete".
     */
    public void markDscpMarkDelete() throws JNCException {
        markLeafDelete("dscpMark");
    }

    /* Access methods for optional leaf child: "override-ttl". */

    /**
     * Gets the value for child leaf "override-ttl".
     * @return The value of the leaf.
     */
    public YangString getOverrideTtlValue() throws JNCException {
        YangString overrideTtl = (YangString)getValue("override-ttl");
        if (overrideTtl == null) {
            overrideTtl = new YangString("off");  // default
        }
        return overrideTtl;
    }

    /**
     * Sets the value for child leaf "override-ttl",
     * using instance of generated typedef class.
     * @param overrideTtlValue The value to set.
     * @param overrideTtlValue used during instantiation.
     */
    public void setOverrideTtlValue(YangString overrideTtlValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "override-ttl",
            overrideTtlValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "override-ttl",
     * using a String value.
     * @param overrideTtlValue used during instantiation.
     */
    public void setOverrideTtlValue(String overrideTtlValue)
            throws JNCException {
        setOverrideTtlValue(new YangString(overrideTtlValue));
    }

    /**
     * Unsets the value for child leaf "override-ttl".
     */
    public void unsetOverrideTtlValue() throws JNCException {
        delete("override-ttl");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "override-ttl" leaf will not have a value.
     */
    public void addOverrideTtl() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "override-ttl",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "override-ttl" with operation "replace".
     */
    public void markOverrideTtlReplace() throws JNCException {
        markLeafReplace("overrideTtl");
    }

    /**
     * Marks the leaf "override-ttl" with operation "merge".
     */
    public void markOverrideTtlMerge() throws JNCException {
        markLeafMerge("overrideTtl");
    }

    /**
     * Marks the leaf "override-ttl" with operation "create".
     */
    public void markOverrideTtlCreate() throws JNCException {
        markLeafCreate("overrideTtl");
    }

    /**
     * Marks the leaf "override-ttl" with operation "delete".
     */
    public void markOverrideTtlDelete() throws JNCException {
        markLeafDelete("overrideTtl");
    }

    /* Access methods for optional leaf child: "negative-cache-ttl". */

    /**
     * Gets the value for child leaf "negative-cache-ttl".
     * @return The value of the leaf.
     */
    public YangUInt16 getNegativeCacheTtlValue() throws JNCException {
        YangUInt16 negativeCacheTtl = (YangUInt16)getValue("negative-cache-ttl");
        if (negativeCacheTtl == null) {
            negativeCacheTtl = new YangUInt16("300");  // default
        }
        return negativeCacheTtl;
    }

    /**
     * Sets the value for child leaf "negative-cache-ttl",
     * using instance of generated typedef class.
     * @param negativeCacheTtlValue The value to set.
     * @param negativeCacheTtlValue used during instantiation.
     */
    public void setNegativeCacheTtlValue(YangUInt16 negativeCacheTtlValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "negative-cache-ttl",
            negativeCacheTtlValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "negative-cache-ttl",
     * using Java primitive values.
     * @param negativeCacheTtlValue used during instantiation.
     */
    public void setNegativeCacheTtlValue(int negativeCacheTtlValue)
            throws JNCException {
        setNegativeCacheTtlValue(new YangUInt16(negativeCacheTtlValue));
    }

    /**
     * Sets the value for child leaf "negative-cache-ttl",
     * using a String value.
     * @param negativeCacheTtlValue used during instantiation.
     */
    public void setNegativeCacheTtlValue(String negativeCacheTtlValue)
            throws JNCException {
        setNegativeCacheTtlValue(new YangUInt16(negativeCacheTtlValue));
    }

    /**
     * Unsets the value for child leaf "negative-cache-ttl".
     */
    public void unsetNegativeCacheTtlValue() throws JNCException {
        delete("negative-cache-ttl");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "negative-cache-ttl" leaf will not have a value.
     */
    public void addNegativeCacheTtl() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "negative-cache-ttl",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "negative-cache-ttl" with operation "replace".
     */
    public void markNegativeCacheTtlReplace() throws JNCException {
        markLeafReplace("negativeCacheTtl");
    }

    /**
     * Marks the leaf "negative-cache-ttl" with operation "merge".
     */
    public void markNegativeCacheTtlMerge() throws JNCException {
        markLeafMerge("negativeCacheTtl");
    }

    /**
     * Marks the leaf "negative-cache-ttl" with operation "create".
     */
    public void markNegativeCacheTtlCreate() throws JNCException {
        markLeafCreate("negativeCacheTtl");
    }

    /**
     * Marks the leaf "negative-cache-ttl" with operation "delete".
     */
    public void markNegativeCacheTtlDelete() throws JNCException {
        markLeafDelete("negativeCacheTtl");
    }

    /* Access methods for optional leaf child: "dynamic-cache-size". */

    /**
     * Gets the value for child leaf "dynamic-cache-size".
     * @return The value of the leaf.
     */
    public YangUInt16 getDynamicCacheSizeValue() throws JNCException {
        YangUInt16 dynamicCacheSize = (YangUInt16)getValue("dynamic-cache-size");
        if (dynamicCacheSize == null) {
            dynamicCacheSize = new YangUInt16("5");  // default
        }
        return dynamicCacheSize;
    }

    /**
     * Sets the value for child leaf "dynamic-cache-size",
     * using instance of generated typedef class.
     * @param dynamicCacheSizeValue The value to set.
     * @param dynamicCacheSizeValue used during instantiation.
     */
    public void setDynamicCacheSizeValue(YangUInt16 dynamicCacheSizeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "dynamic-cache-size",
            dynamicCacheSizeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "dynamic-cache-size",
     * using Java primitive values.
     * @param dynamicCacheSizeValue used during instantiation.
     */
    public void setDynamicCacheSizeValue(int dynamicCacheSizeValue)
            throws JNCException {
        setDynamicCacheSizeValue(new YangUInt16(dynamicCacheSizeValue));
    }

    /**
     * Sets the value for child leaf "dynamic-cache-size",
     * using a String value.
     * @param dynamicCacheSizeValue used during instantiation.
     */
    public void setDynamicCacheSizeValue(String dynamicCacheSizeValue)
            throws JNCException {
        setDynamicCacheSizeValue(new YangUInt16(dynamicCacheSizeValue));
    }

    /**
     * Unsets the value for child leaf "dynamic-cache-size".
     */
    public void unsetDynamicCacheSizeValue() throws JNCException {
        delete("dynamic-cache-size");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "dynamic-cache-size" leaf will not have a value.
     */
    public void addDynamicCacheSize() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "dynamic-cache-size",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "dynamic-cache-size" with operation "replace".
     */
    public void markDynamicCacheSizeReplace() throws JNCException {
        markLeafReplace("dynamicCacheSize");
    }

    /**
     * Marks the leaf "dynamic-cache-size" with operation "merge".
     */
    public void markDynamicCacheSizeMerge() throws JNCException {
        markLeafMerge("dynamicCacheSize");
    }

    /**
     * Marks the leaf "dynamic-cache-size" with operation "create".
     */
    public void markDynamicCacheSizeCreate() throws JNCException {
        markLeafCreate("dynamicCacheSize");
    }

    /**
     * Marks the leaf "dynamic-cache-size" with operation "delete".
     */
    public void markDynamicCacheSizeDelete() throws JNCException {
        markLeafDelete("dynamicCacheSize");
    }

    /* Access methods for optional leaf child: "initial-retry-timer". */

    /**
     * Gets the value for child leaf "initial-retry-timer".
     * @return The value of the leaf.
     */
    public YangUInt16 getInitialRetryTimerValue() throws JNCException {
        YangUInt16 initialRetryTimer = (YangUInt16)getValue("initial-retry-timer");
        if (initialRetryTimer == null) {
            initialRetryTimer = new YangUInt16("500");  // default
        }
        return initialRetryTimer;
    }

    /**
     * Sets the value for child leaf "initial-retry-timer",
     * using instance of generated typedef class.
     * @param initialRetryTimerValue The value to set.
     * @param initialRetryTimerValue used during instantiation.
     */
    public void setInitialRetryTimerValue(YangUInt16 initialRetryTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "initial-retry-timer",
            initialRetryTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "initial-retry-timer",
     * using Java primitive values.
     * @param initialRetryTimerValue used during instantiation.
     */
    public void setInitialRetryTimerValue(int initialRetryTimerValue)
            throws JNCException {
        setInitialRetryTimerValue(new YangUInt16(initialRetryTimerValue));
    }

    /**
     * Sets the value for child leaf "initial-retry-timer",
     * using a String value.
     * @param initialRetryTimerValue used during instantiation.
     */
    public void setInitialRetryTimerValue(String initialRetryTimerValue)
            throws JNCException {
        setInitialRetryTimerValue(new YangUInt16(initialRetryTimerValue));
    }

    /**
     * Unsets the value for child leaf "initial-retry-timer".
     */
    public void unsetInitialRetryTimerValue() throws JNCException {
        delete("initial-retry-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "initial-retry-timer" leaf will not have a value.
     */
    public void addInitialRetryTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "initial-retry-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "initial-retry-timer" with operation "replace".
     */
    public void markInitialRetryTimerReplace() throws JNCException {
        markLeafReplace("initialRetryTimer");
    }

    /**
     * Marks the leaf "initial-retry-timer" with operation "merge".
     */
    public void markInitialRetryTimerMerge() throws JNCException {
        markLeafMerge("initialRetryTimer");
    }

    /**
     * Marks the leaf "initial-retry-timer" with operation "create".
     */
    public void markInitialRetryTimerCreate() throws JNCException {
        markLeafCreate("initialRetryTimer");
    }

    /**
     * Marks the leaf "initial-retry-timer" with operation "delete".
     */
    public void markInitialRetryTimerDelete() throws JNCException {
        markLeafDelete("initialRetryTimer");
    }

    /* Access methods for optional leaf child: "max-retry-timer". */

    /**
     * Gets the value for child leaf "max-retry-timer".
     * @return The value of the leaf.
     */
    public YangUInt16 getMaxRetryTimerValue() throws JNCException {
        YangUInt16 maxRetryTimer = (YangUInt16)getValue("max-retry-timer");
        if (maxRetryTimer == null) {
            maxRetryTimer = new YangUInt16("10");  // default
        }
        return maxRetryTimer;
    }

    /**
     * Sets the value for child leaf "max-retry-timer",
     * using instance of generated typedef class.
     * @param maxRetryTimerValue The value to set.
     * @param maxRetryTimerValue used during instantiation.
     */
    public void setMaxRetryTimerValue(YangUInt16 maxRetryTimerValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-retry-timer",
            maxRetryTimerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "max-retry-timer",
     * using Java primitive values.
     * @param maxRetryTimerValue used during instantiation.
     */
    public void setMaxRetryTimerValue(int maxRetryTimerValue)
            throws JNCException {
        setMaxRetryTimerValue(new YangUInt16(maxRetryTimerValue));
    }

    /**
     * Sets the value for child leaf "max-retry-timer",
     * using a String value.
     * @param maxRetryTimerValue used during instantiation.
     */
    public void setMaxRetryTimerValue(String maxRetryTimerValue)
            throws JNCException {
        setMaxRetryTimerValue(new YangUInt16(maxRetryTimerValue));
    }

    /**
     * Unsets the value for child leaf "max-retry-timer".
     */
    public void unsetMaxRetryTimerValue() throws JNCException {
        delete("max-retry-timer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "max-retry-timer" leaf will not have a value.
     */
    public void addMaxRetryTimer() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "max-retry-timer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "max-retry-timer" with operation "replace".
     */
    public void markMaxRetryTimerReplace() throws JNCException {
        markLeafReplace("maxRetryTimer");
    }

    /**
     * Marks the leaf "max-retry-timer" with operation "merge".
     */
    public void markMaxRetryTimerMerge() throws JNCException {
        markLeafMerge("maxRetryTimer");
    }

    /**
     * Marks the leaf "max-retry-timer" with operation "create".
     */
    public void markMaxRetryTimerCreate() throws JNCException {
        markLeafCreate("maxRetryTimer");
    }

    /**
     * Marks the leaf "max-retry-timer" with operation "delete".
     */
    public void markMaxRetryTimerDelete() throws JNCException {
        markLeafDelete("maxRetryTimer");
    }

    /* Access methods for optional leaf child: "retry-count". */

    /**
     * Gets the value for child leaf "retry-count".
     * @return The value of the leaf.
     */
    public YangUInt16 getRetryCountValue() throws JNCException {
        YangUInt16 retryCount = (YangUInt16)getValue("retry-count");
        if (retryCount == null) {
            retryCount = new YangUInt16("6");  // default
        }
        return retryCount;
    }

    /**
     * Sets the value for child leaf "retry-count",
     * using instance of generated typedef class.
     * @param retryCountValue The value to set.
     * @param retryCountValue used during instantiation.
     */
    public void setRetryCountValue(YangUInt16 retryCountValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "retry-count",
            retryCountValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "retry-count",
     * using Java primitive values.
     * @param retryCountValue used during instantiation.
     */
    public void setRetryCountValue(int retryCountValue) throws JNCException {
        setRetryCountValue(new YangUInt16(retryCountValue));
    }

    /**
     * Sets the value for child leaf "retry-count",
     * using a String value.
     * @param retryCountValue used during instantiation.
     */
    public void setRetryCountValue(String retryCountValue) throws JNCException {
        setRetryCountValue(new YangUInt16(retryCountValue));
    }

    /**
     * Unsets the value for child leaf "retry-count".
     */
    public void unsetRetryCountValue() throws JNCException {
        delete("retry-count");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "retry-count" leaf will not have a value.
     */
    public void addRetryCount() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "retry-count",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "retry-count" with operation "replace".
     */
    public void markRetryCountReplace() throws JNCException {
        markLeafReplace("retryCount");
    }

    /**
     * Marks the leaf "retry-count" with operation "merge".
     */
    public void markRetryCountMerge() throws JNCException {
        markLeafMerge("retryCount");
    }

    /**
     * Marks the leaf "retry-count" with operation "create".
     */
    public void markRetryCountCreate() throws JNCException {
        markLeafCreate("retryCount");
    }

    /**
     * Marks the leaf "retry-count" with operation "delete".
     */
    public void markRetryCountDelete() throws JNCException {
        markLeafDelete("retryCount");
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
