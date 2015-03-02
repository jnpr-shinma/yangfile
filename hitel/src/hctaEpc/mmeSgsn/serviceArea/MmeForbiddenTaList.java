/* 
 * @(#)MmeForbiddenTaList.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.serviceArea;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangString;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/serviceArea/mme-forbidden-ta-list"
 * <p>
 * See line 550 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeForbiddenTaList extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeForbiddenTaList object.
     */
    public MmeForbiddenTaList() {
        super(Epc.NAMESPACE, "mme-forbidden-ta-list");
    }

    /**
     * Constructor for an initialized MmeForbiddenTaList object,
     * 
     * @param plmnValue Key argument of child.
     * @param tacListValue Key argument of child.
     */
    public MmeForbiddenTaList(YangString plmnValue, YangString tacListValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-forbidden-ta-list");
        Leaf plmn = new Leaf(Epc.NAMESPACE, "plmn");
        plmn.setValue(plmnValue);
        insertChild(plmn, childrenNames());
        Leaf tacList = new Leaf(Epc.NAMESPACE, "tac-list");
        tacList.setValue(tacListValue);
        insertChild(tacList, childrenNames());
    }

    /**
     * Constructor for an initialized MmeForbiddenTaList object,
     * with String keys.
     * @param plmnValue Key argument of child.
     * @param tacListValue Key argument of child.
     */
    public MmeForbiddenTaList(String plmnValue, String tacListValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-forbidden-ta-list");
        Leaf plmn = new Leaf(Epc.NAMESPACE, "plmn");
        plmn.setValue(new YangString(plmnValue));
        insertChild(plmn, childrenNames());
        Leaf tacList = new Leaf(Epc.NAMESPACE, "tac-list");
        tacList.setValue(new YangString(tacListValue));
        insertChild(tacList, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeForbiddenTaList clone() {
        MmeForbiddenTaList copy;
        try {
            copy = new MmeForbiddenTaList(getPlmnValue().toString(), getTacListValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeForbiddenTaList)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeForbiddenTaList cloneShallow() {
        MmeForbiddenTaList copy;
        try {
            copy = new MmeForbiddenTaList(getPlmnValue().toString(), getTacListValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeForbiddenTaList)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "plmn",
            "tac-list",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "plmn",
            "tac-list",
            "forbidden-list",
        };
    }

    /* Access methods for leaf child: "plmn". */

    /**
     * Gets the value for child leaf "plmn".
     * @return The value of the leaf.
     */
    public YangString getPlmnValue() throws JNCException {
        return (YangString)getValue("plmn");
    }

    /**
     * Sets the value for child leaf "plmn",
     * using instance of generated typedef class.
     * @param plmnValue The value to set.
     * @param plmnValue used during instantiation.
     */
    public void setPlmnValue(YangString plmnValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "plmn",
            plmnValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "plmn",
     * using a String value.
     * @param plmnValue used during instantiation.
     */
    public void setPlmnValue(String plmnValue) throws JNCException {
        setPlmnValue(new YangString(plmnValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "plmn" leaf will not have a value.
     */
    public void addPlmn() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "plmn",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "tac-list". */

    /**
     * Gets the value for child leaf "tac-list".
     * @return The value of the leaf.
     */
    public YangString getTacListValue() throws JNCException {
        return (YangString)getValue("tac-list");
    }

    /**
     * Sets the value for child leaf "tac-list",
     * using instance of generated typedef class.
     * @param tacListValue The value to set.
     * @param tacListValue used during instantiation.
     */
    public void setTacListValue(YangString tacListValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "tac-list",
            tacListValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "tac-list",
     * using a String value.
     * @param tacListValue used during instantiation.
     */
    public void setTacListValue(String tacListValue) throws JNCException {
        setTacListValue(new YangString(tacListValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "tac-list" leaf will not have a value.
     */
    public void addTacList() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "tac-list",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "forbidden-list". */

    /**
     * Gets the value for child leaf "forbidden-list".
     * @return The value of the leaf.
     */
    public YangString getForbiddenListValue() throws JNCException {
        return (YangString)getValue("forbidden-list");
    }

    /**
     * Sets the value for child leaf "forbidden-list",
     * using instance of generated typedef class.
     * @param forbiddenListValue The value to set.
     * @param forbiddenListValue used during instantiation.
     */
    public void setForbiddenListValue(YangString forbiddenListValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "forbidden-list",
            forbiddenListValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "forbidden-list",
     * using a String value.
     * @param forbiddenListValue used during instantiation.
     */
    public void setForbiddenListValue(String forbiddenListValue)
            throws JNCException {
        setForbiddenListValue(new YangString(forbiddenListValue));
    }

    /**
     * Unsets the value for child leaf "forbidden-list".
     */
    public void unsetForbiddenListValue() throws JNCException {
        delete("forbidden-list");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "forbidden-list" leaf will not have a value.
     */
    public void addForbiddenList() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "forbidden-list",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "forbidden-list" with operation "replace".
     */
    public void markForbiddenListReplace() throws JNCException {
        markLeafReplace("forbiddenList");
    }

    /**
     * Marks the leaf "forbidden-list" with operation "merge".
     */
    public void markForbiddenListMerge() throws JNCException {
        markLeafMerge("forbiddenList");
    }

    /**
     * Marks the leaf "forbidden-list" with operation "create".
     */
    public void markForbiddenListCreate() throws JNCException {
        markLeafCreate("forbiddenList");
    }

    /**
     * Marks the leaf "forbidden-list" with operation "delete".
     */
    public void markForbiddenListDelete() throws JNCException {
        markLeafDelete("forbiddenList");
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
