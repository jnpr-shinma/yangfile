/* 
 * @(#)Trace.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw;

import Element;

import ElementChildrenIterator;

import Epc;

import JNCException;

import MmeFgwStd;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/trace"
 * <p>
 * See line 1466 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Trace extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Trace object.
     */
    public Trace() {
        super(Epc.NAMESPACE, "trace");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Trace clone() {
        return (Trace)cloneContent(new Trace());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Trace cloneShallow() {
        return (Trace)cloneShallowContent(new Trace());
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
            "mme-fgw-std",
        };
    }

    /* Access methods for list child: "mme-fgw-std". */

    /**
     * Gets list entry "mmeFgwStd", with specified keys.
     * @param enodebPlmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public MmeFgwStd getMmeFgwStd(YangString enodebPlmnIdValue, YangUInt32 enodebIdValue)
            throws JNCException {
        String path = "mme-fgw-std[enodebPlmnId='" + enodebPlmnIdValue + "'][enodebId='" + enodebIdValue + "']";
        return (MmeFgwStd)searchOne(path);
    }

    /**
     * Gets list entry "mmeFgwStd", with specified keys.
     * The keys are specified as strings.
     * @param enodebPlmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public MmeFgwStd getMmeFgwStd(String enodebPlmnIdValue, String enodebIdValue)
            throws JNCException {
        String path = "mme-fgw-std[enodebPlmnId='" + enodebPlmnIdValue + "'][enodebId='" + enodebIdValue + "']";
        return (MmeFgwStd)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-fgw-std".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeFgwStdIterator() {
        return new ElementChildrenIterator(children, "mme-fgw-std");
    }

    /**
     * Adds list entry "mmeFgwStd", using an existing object.
     * @param mmeFgwStd The object to add.
     * @return The added child.
     */
    public MmeFgwStd addMmeFgwStd(MmeFgwStd mmeFgwStd) throws JNCException {
        insertChild(mmeFgwStd, childrenNames());
        return mmeFgwStd;
    }

    /**
     * Adds list entry "mmeFgwStd", with specified keys.
     * @param enodebPlmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwStd addMmeFgwStd(YangString enodebPlmnIdValue, YangUInt32 enodebIdValue)
            throws JNCException {
        MmeFgwStd mmeFgwStd = new MmeFgwStd(enodebPlmnIdValue, enodebIdValue);
        return addMmeFgwStd(mmeFgwStd);
    }

    /**
     * Adds list entry "mmeFgwStd", with specified keys.
     * The keys are specified as strings.
     * @param enodebPlmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwStd addMmeFgwStd(String enodebPlmnIdValue, String enodebIdValue)
            throws JNCException {
        MmeFgwStd mmeFgwStd = new MmeFgwStd(enodebPlmnIdValue, enodebIdValue);
        return addMmeFgwStd(mmeFgwStd);
    }

    /**
     * Adds list entry "mmeFgwStd".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFgwStd addMmeFgwStd() throws JNCException {
        MmeFgwStd mmeFgwStd = new MmeFgwStd();
        insertChild(mmeFgwStd, childrenNames());
        return mmeFgwStd;
    }

    /**
     * Deletes list entry "mmeFgwStd", with specified keys.
     * @param enodebPlmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public void deleteMmeFgwStd(YangString enodebPlmnIdValue, YangUInt32 enodebIdValue)
            throws JNCException {
        String path = "mme-fgw-std[enodebPlmnId='" + enodebPlmnIdValue + "'][enodebId='" + enodebIdValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeFgwStd", with specified keys.
     * The keys are specified as strings.
     * @param enodebPlmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public void deleteMmeFgwStd(String enodebPlmnIdValue, String enodebIdValue)
            throws JNCException {
        String path = "mme-fgw-std[enodebPlmnId='" + enodebPlmnIdValue + "'][enodebId='" + enodebIdValue + "']";
        delete(path);
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
