/* 
 * @(#)MmeMmeArea.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw.serviceArea;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangUInt8;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/serviceArea/mme-mme-area"
 * <p>
 * See line 1388 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeMmeArea extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeMmeArea object.
     */
    public MmeMmeArea() {
        super(Epc.NAMESPACE, "mme-mme-area");
    }

    /**
     * Constructor for an initialized MmeMmeArea object,
     * 
     * @param indexValue Key argument of child.
     */
    public MmeMmeArea(YangUInt8 indexValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-mme-area");
        Leaf index = new Leaf(Epc.NAMESPACE, "index");
        index.setValue(indexValue);
        insertChild(index, childrenNames());
    }

    /**
     * Constructor for an initialized MmeMmeArea object,
     * with String keys.
     * @param indexValue Key argument of child.
     */
    public MmeMmeArea(String indexValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-mme-area");
        Leaf index = new Leaf(Epc.NAMESPACE, "index");
        index.setValue(new YangUInt8(indexValue));
        insertChild(index, childrenNames());
    }

    /**
     * Constructor for an initialized MmeMmeArea object,
     * with keys of built in Java types.
     * @param indexValue Key argument of child.
     */
    public MmeMmeArea(short indexValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-mme-area");
        Leaf index = new Leaf(Epc.NAMESPACE, "index");
        index.setValue(new YangUInt8(indexValue));
        insertChild(index, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeMmeArea clone() {
        MmeMmeArea copy;
        try {
            copy = new MmeMmeArea(getIndexValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeMmeArea)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeMmeArea cloneShallow() {
        MmeMmeArea copy;
        try {
            copy = new MmeMmeArea(getIndexValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeMmeArea)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "index",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "index",
            "mme-area-name",
            "tac-range-list",
            "plmn-list",
        };
    }

    /* Access methods for leaf child: "index". */

    /**
     * Gets the value for child leaf "index".
     * @return The value of the leaf.
     */
    public YangUInt8 getIndexValue() throws JNCException {
        return (YangUInt8)getValue("index");
    }

    /**
     * Sets the value for child leaf "index",
     * using instance of generated typedef class.
     * @param indexValue The value to set.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(YangUInt8 indexValue) throws JNCException {
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
    public void setIndexValue(short indexValue) throws JNCException {
        setIndexValue(new YangUInt8(indexValue));
    }

    /**
     * Sets the value for child leaf "index",
     * using a String value.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(String indexValue) throws JNCException {
        setIndexValue(new YangUInt8(indexValue));
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

    /* Access methods for optional leaf child: "mme-area-name". */

    /**
     * Gets the value for child leaf "mme-area-name".
     * @return The value of the leaf.
     */
    public YangString getMmeAreaNameValue() throws JNCException {
        return (YangString)getValue("mme-area-name");
    }

    /**
     * Sets the value for child leaf "mme-area-name",
     * using instance of generated typedef class.
     * @param mmeAreaNameValue The value to set.
     * @param mmeAreaNameValue used during instantiation.
     */
    public void setMmeAreaNameValue(YangString mmeAreaNameValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "mme-area-name",
            mmeAreaNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "mme-area-name",
     * using a String value.
     * @param mmeAreaNameValue used during instantiation.
     */
    public void setMmeAreaNameValue(String mmeAreaNameValue)
            throws JNCException {
        setMmeAreaNameValue(new YangString(mmeAreaNameValue));
    }

    /**
     * Unsets the value for child leaf "mme-area-name".
     */
    public void unsetMmeAreaNameValue() throws JNCException {
        delete("mme-area-name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "mme-area-name" leaf will not have a value.
     */
    public void addMmeAreaName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "mme-area-name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "mme-area-name" with operation "replace".
     */
    public void markMmeAreaNameReplace() throws JNCException {
        markLeafReplace("mmeAreaName");
    }

    /**
     * Marks the leaf "mme-area-name" with operation "merge".
     */
    public void markMmeAreaNameMerge() throws JNCException {
        markLeafMerge("mmeAreaName");
    }

    /**
     * Marks the leaf "mme-area-name" with operation "create".
     */
    public void markMmeAreaNameCreate() throws JNCException {
        markLeafCreate("mmeAreaName");
    }

    /**
     * Marks the leaf "mme-area-name" with operation "delete".
     */
    public void markMmeAreaNameDelete() throws JNCException {
        markLeafDelete("mmeAreaName");
    }

    /* Access methods for optional leaf child: "tac-range-list". */

    /**
     * Gets the value for child leaf "tac-range-list".
     * @return The value of the leaf.
     */
    public YangString getTacRangeListValue() throws JNCException {
        return (YangString)getValue("tac-range-list");
    }

    /**
     * Sets the value for child leaf "tac-range-list",
     * using instance of generated typedef class.
     * @param tacRangeListValue The value to set.
     * @param tacRangeListValue used during instantiation.
     */
    public void setTacRangeListValue(YangString tacRangeListValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "tac-range-list",
            tacRangeListValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "tac-range-list",
     * using a String value.
     * @param tacRangeListValue used during instantiation.
     */
    public void setTacRangeListValue(String tacRangeListValue)
            throws JNCException {
        setTacRangeListValue(new YangString(tacRangeListValue));
    }

    /**
     * Unsets the value for child leaf "tac-range-list".
     */
    public void unsetTacRangeListValue() throws JNCException {
        delete("tac-range-list");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "tac-range-list" leaf will not have a value.
     */
    public void addTacRangeList() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "tac-range-list",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "tac-range-list" with operation "replace".
     */
    public void markTacRangeListReplace() throws JNCException {
        markLeafReplace("tacRangeList");
    }

    /**
     * Marks the leaf "tac-range-list" with operation "merge".
     */
    public void markTacRangeListMerge() throws JNCException {
        markLeafMerge("tacRangeList");
    }

    /**
     * Marks the leaf "tac-range-list" with operation "create".
     */
    public void markTacRangeListCreate() throws JNCException {
        markLeafCreate("tacRangeList");
    }

    /**
     * Marks the leaf "tac-range-list" with operation "delete".
     */
    public void markTacRangeListDelete() throws JNCException {
        markLeafDelete("tacRangeList");
    }

    /* Access methods for optional leaf child: "plmn-list". */

    /**
     * Gets the value for child leaf "plmn-list".
     * @return The value of the leaf.
     */
    public YangString getPlmnListValue() throws JNCException {
        return (YangString)getValue("plmn-list");
    }

    /**
     * Sets the value for child leaf "plmn-list",
     * using instance of generated typedef class.
     * @param plmnListValue The value to set.
     * @param plmnListValue used during instantiation.
     */
    public void setPlmnListValue(YangString plmnListValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "plmn-list",
            plmnListValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "plmn-list",
     * using a String value.
     * @param plmnListValue used during instantiation.
     */
    public void setPlmnListValue(String plmnListValue) throws JNCException {
        setPlmnListValue(new YangString(plmnListValue));
    }

    /**
     * Unsets the value for child leaf "plmn-list".
     */
    public void unsetPlmnListValue() throws JNCException {
        delete("plmn-list");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "plmn-list" leaf will not have a value.
     */
    public void addPlmnList() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "plmn-list",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "plmn-list" with operation "replace".
     */
    public void markPlmnListReplace() throws JNCException {
        markLeafReplace("plmnList");
    }

    /**
     * Marks the leaf "plmn-list" with operation "merge".
     */
    public void markPlmnListMerge() throws JNCException {
        markLeafMerge("plmnList");
    }

    /**
     * Marks the leaf "plmn-list" with operation "create".
     */
    public void markPlmnListCreate() throws JNCException {
        markLeafCreate("plmnList");
    }

    /**
     * Marks the leaf "plmn-list" with operation "delete".
     */
    public void markPlmnListDelete() throws JNCException {
        markLeafDelete("plmnList");
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
