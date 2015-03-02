/* 
 * @(#)MmeFgwStd.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw.trace;
import .ietfInetTypes.Ipv4Address;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangString;

import YangUInt32;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/trace/mme-fgw-std"
 * <p>
 * See line 1469 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeFgwStd extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeFgwStd object.
     */
    public MmeFgwStd() {
        super(Epc.NAMESPACE, "mme-fgw-std");
    }

    /**
     * Constructor for an initialized MmeFgwStd object,
     * 
     * @param enodebPlmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public MmeFgwStd(YangString enodebPlmnIdValue, YangUInt32 enodebIdValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-fgw-std");
        Leaf enodebPlmnId = new Leaf(Epc.NAMESPACE, "enodeb-plmn-id");
        enodebPlmnId.setValue(enodebPlmnIdValue);
        insertChild(enodebPlmnId, childrenNames());
        Leaf enodebId = new Leaf(Epc.NAMESPACE, "enodeb-id");
        enodebId.setValue(enodebIdValue);
        insertChild(enodebId, childrenNames());
    }

    /**
     * Constructor for an initialized MmeFgwStd object,
     * with String keys.
     * @param enodebPlmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public MmeFgwStd(String enodebPlmnIdValue, String enodebIdValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-fgw-std");
        Leaf enodebPlmnId = new Leaf(Epc.NAMESPACE, "enodeb-plmn-id");
        enodebPlmnId.setValue(new YangString(enodebPlmnIdValue));
        insertChild(enodebPlmnId, childrenNames());
        Leaf enodebId = new Leaf(Epc.NAMESPACE, "enodeb-id");
        enodebId.setValue(new YangUInt32(enodebIdValue));
        insertChild(enodebId, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeFgwStd clone() {
        MmeFgwStd copy;
        try {
            copy = new MmeFgwStd(getEnodebPlmnIdValue().toString(), getEnodebIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFgwStd)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeFgwStd cloneShallow() {
        MmeFgwStd copy;
        try {
            copy = new MmeFgwStd(getEnodebPlmnIdValue().toString(), getEnodebIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFgwStd)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "enodeb-plmn-id",
            "enodeb-id",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "enodeb-plmn-id",
            "enodeb-id",
            "reference-id",
            "fgw-s1-interface-mask",
            "trace-depth",
            "nms-ip",
        };
    }

    /* Access methods for leaf child: "enodeb-plmn-id". */

    /**
     * Gets the value for child leaf "enodeb-plmn-id".
     * @return The value of the leaf.
     */
    public YangString getEnodebPlmnIdValue() throws JNCException {
        return (YangString)getValue("enodeb-plmn-id");
    }

    /**
     * Sets the value for child leaf "enodeb-plmn-id",
     * using instance of generated typedef class.
     * @param enodebPlmnIdValue The value to set.
     * @param enodebPlmnIdValue used during instantiation.
     */
    public void setEnodebPlmnIdValue(YangString enodebPlmnIdValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "enodeb-plmn-id",
            enodebPlmnIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "enodeb-plmn-id",
     * using a String value.
     * @param enodebPlmnIdValue used during instantiation.
     */
    public void setEnodebPlmnIdValue(String enodebPlmnIdValue)
            throws JNCException {
        setEnodebPlmnIdValue(new YangString(enodebPlmnIdValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "enodeb-plmn-id" leaf will not have a value.
     */
    public void addEnodebPlmnId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "enodeb-plmn-id",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "enodeb-id". */

    /**
     * Gets the value for child leaf "enodeb-id".
     * @return The value of the leaf.
     */
    public YangUInt32 getEnodebIdValue() throws JNCException {
        return (YangUInt32)getValue("enodeb-id");
    }

    /**
     * Sets the value for child leaf "enodeb-id",
     * using instance of generated typedef class.
     * @param enodebIdValue The value to set.
     * @param enodebIdValue used during instantiation.
     */
    public void setEnodebIdValue(YangUInt32 enodebIdValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "enodeb-id",
            enodebIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "enodeb-id",
     * using Java primitive values.
     * @param enodebIdValue used during instantiation.
     */
    public void setEnodebIdValue(long enodebIdValue) throws JNCException {
        setEnodebIdValue(new YangUInt32(enodebIdValue));
    }

    /**
     * Sets the value for child leaf "enodeb-id",
     * using a String value.
     * @param enodebIdValue used during instantiation.
     */
    public void setEnodebIdValue(String enodebIdValue) throws JNCException {
        setEnodebIdValue(new YangUInt32(enodebIdValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "enodeb-id" leaf will not have a value.
     */
    public void addEnodebId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "enodeb-id",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "reference-id". */

    /**
     * Gets the value for child leaf "reference-id".
     * @return The value of the leaf.
     */
    public YangString getReferenceIdValue() throws JNCException {
        return (YangString)getValue("reference-id");
    }

    /**
     * Sets the value for child leaf "reference-id",
     * using instance of generated typedef class.
     * @param referenceIdValue The value to set.
     * @param referenceIdValue used during instantiation.
     */
    public void setReferenceIdValue(YangString referenceIdValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "reference-id",
            referenceIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "reference-id",
     * using a String value.
     * @param referenceIdValue used during instantiation.
     */
    public void setReferenceIdValue(String referenceIdValue)
            throws JNCException {
        setReferenceIdValue(new YangString(referenceIdValue));
    }

    /**
     * Unsets the value for child leaf "reference-id".
     */
    public void unsetReferenceIdValue() throws JNCException {
        delete("reference-id");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "reference-id" leaf will not have a value.
     */
    public void addReferenceId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "reference-id",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "reference-id" with operation "replace".
     */
    public void markReferenceIdReplace() throws JNCException {
        markLeafReplace("referenceId");
    }

    /**
     * Marks the leaf "reference-id" with operation "merge".
     */
    public void markReferenceIdMerge() throws JNCException {
        markLeafMerge("referenceId");
    }

    /**
     * Marks the leaf "reference-id" with operation "create".
     */
    public void markReferenceIdCreate() throws JNCException {
        markLeafCreate("referenceId");
    }

    /**
     * Marks the leaf "reference-id" with operation "delete".
     */
    public void markReferenceIdDelete() throws JNCException {
        markLeafDelete("referenceId");
    }

    /* Access methods for optional leaf child: "fgw-s1-interface-mask". */

    /**
     * Gets the value for child leaf "fgw-s1-interface-mask".
     * @return The value of the leaf.
     */
    public YangEnumeration getFgwS1InterfaceMaskValue() throws JNCException {
        YangEnumeration fgwS1InterfaceMask = (YangEnumeration)getValue("fgw-s1-interface-mask");
        if (fgwS1InterfaceMask == null) {
            fgwS1InterfaceMask = new YangEnumeration("s1Andx2", new String[] {  // default
                "s1",
                "x2",
                "s1Andx2",
            });
        }
        return fgwS1InterfaceMask;
    }

    /**
     * Sets the value for child leaf "fgw-s1-interface-mask",
     * using instance of generated typedef class.
     * @param fgwS1InterfaceMaskValue The value to set.
     * @param fgwS1InterfaceMaskValue used during instantiation.
     */
    public void setFgwS1InterfaceMaskValue(YangEnumeration fgwS1InterfaceMaskValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "fgw-s1-interface-mask",
            fgwS1InterfaceMaskValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "fgw-s1-interface-mask",
     * using a String value.
     * @param fgwS1InterfaceMaskValue used during instantiation.
     */
    public void setFgwS1InterfaceMaskValue(String fgwS1InterfaceMaskValue)
            throws JNCException {
        setFgwS1InterfaceMaskValue(new YangEnumeration(fgwS1InterfaceMaskValue, new String[] {
             "s1",
             "x2",
             "s1Andx2",
        }));
    }

    /**
     * Unsets the value for child leaf "fgw-s1-interface-mask".
     */
    public void unsetFgwS1InterfaceMaskValue() throws JNCException {
        delete("fgw-s1-interface-mask");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "fgw-s1-interface-mask" leaf will not have a value.
     */
    public void addFgwS1InterfaceMask() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "fgw-s1-interface-mask",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "fgw-s1-interface-mask" with operation "replace".
     */
    public void markFgwS1InterfaceMaskReplace() throws JNCException {
        markLeafReplace("fgwS1InterfaceMask");
    }

    /**
     * Marks the leaf "fgw-s1-interface-mask" with operation "merge".
     */
    public void markFgwS1InterfaceMaskMerge() throws JNCException {
        markLeafMerge("fgwS1InterfaceMask");
    }

    /**
     * Marks the leaf "fgw-s1-interface-mask" with operation "create".
     */
    public void markFgwS1InterfaceMaskCreate() throws JNCException {
        markLeafCreate("fgwS1InterfaceMask");
    }

    /**
     * Marks the leaf "fgw-s1-interface-mask" with operation "delete".
     */
    public void markFgwS1InterfaceMaskDelete() throws JNCException {
        markLeafDelete("fgwS1InterfaceMask");
    }

    /* Access methods for optional leaf child: "trace-depth". */

    /**
     * Gets the value for child leaf "trace-depth".
     * @return The value of the leaf.
     */
    public YangEnumeration getTraceDepthValue() throws JNCException {
        YangEnumeration traceDepth = (YangEnumeration)getValue("trace-depth");
        if (traceDepth == null) {
            traceDepth = new YangEnumeration("med", new String[] {  // default
                "min",
                "med",
                "max",
            });
        }
        return traceDepth;
    }

    /**
     * Sets the value for child leaf "trace-depth",
     * using instance of generated typedef class.
     * @param traceDepthValue The value to set.
     * @param traceDepthValue used during instantiation.
     */
    public void setTraceDepthValue(YangEnumeration traceDepthValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "trace-depth",
            traceDepthValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "trace-depth",
     * using a String value.
     * @param traceDepthValue used during instantiation.
     */
    public void setTraceDepthValue(String traceDepthValue) throws JNCException {
        setTraceDepthValue(new YangEnumeration(traceDepthValue, new String[] {
             "min",
             "med",
             "max",
        }));
    }

    /**
     * Unsets the value for child leaf "trace-depth".
     */
    public void unsetTraceDepthValue() throws JNCException {
        delete("trace-depth");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "trace-depth" leaf will not have a value.
     */
    public void addTraceDepth() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "trace-depth",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "trace-depth" with operation "replace".
     */
    public void markTraceDepthReplace() throws JNCException {
        markLeafReplace("traceDepth");
    }

    /**
     * Marks the leaf "trace-depth" with operation "merge".
     */
    public void markTraceDepthMerge() throws JNCException {
        markLeafMerge("traceDepth");
    }

    /**
     * Marks the leaf "trace-depth" with operation "create".
     */
    public void markTraceDepthCreate() throws JNCException {
        markLeafCreate("traceDepth");
    }

    /**
     * Marks the leaf "trace-depth" with operation "delete".
     */
    public void markTraceDepthDelete() throws JNCException {
        markLeafDelete("traceDepth");
    }

    /* Access methods for optional leaf child: "nms-ip". */

    /**
     * Gets the value for child leaf "nms-ip".
     * @return The value of the leaf.
     */
    public Ipv4Address getNmsIpValue() throws JNCException {
        Ipv4Address nmsIp = (Ipv4Address)getValue("nms-ip");
        if (nmsIp == null) {
            nmsIp = new Ipv4Address("0.0.0.0");  // default
        }
        return nmsIp;
    }

    /**
     * Sets the value for child leaf "nms-ip",
     * using a JNC type value.
     * @param nmsIpValue The value to set.
     * @param nmsIpValue used during instantiation.
     */
    public void setNmsIpValue(Ipv4Address nmsIpValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nms-ip",
            nmsIpValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "nms-ip",
     * using a String value.
     * @param nmsIpValue used during instantiation.
     */
    public void setNmsIpValue(String nmsIpValue) throws JNCException {
        setNmsIpValue(new Ipv4Address(nmsIpValue));
    }

    /**
     * Unsets the value for child leaf "nms-ip".
     */
    public void unsetNmsIpValue() throws JNCException {
        delete("nms-ip");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "nms-ip" leaf will not have a value.
     */
    public void addNmsIp() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nms-ip",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "nms-ip" with operation "replace".
     */
    public void markNmsIpReplace() throws JNCException {
        markLeafReplace("nmsIp");
    }

    /**
     * Marks the leaf "nms-ip" with operation "merge".
     */
    public void markNmsIpMerge() throws JNCException {
        markLeafMerge("nmsIp");
    }

    /**
     * Marks the leaf "nms-ip" with operation "create".
     */
    public void markNmsIpCreate() throws JNCException {
        markLeafCreate("nmsIp");
    }

    /**
     * Marks the leaf "nms-ip" with operation "delete".
     */
    public void markNmsIpDelete() throws JNCException {
        markLeafDelete("nmsIp");
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
