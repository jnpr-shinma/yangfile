/* 
 * @(#)Sbc.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.statistics;

import Element;

import ElementChildrenIterator;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/sbc"
 * <p>
 * See line 1627 in
 * oamPmServerCli.yang
 * <p>
 * Children with the same name as this class are fully qualified.
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Sbc extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Sbc object.
     */
    public Sbc() {
        super(Epc.NAMESPACE, "sbc");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Sbc clone() {
        return (Sbc)cloneContent(new Sbc());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Sbc cloneShallow() {
        return (Sbc)cloneShallowContent(new Sbc());
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
            "sbc",
        };
    }

    /* Access methods for list child: "sbc". */

    /**
     * Gets list entry "sbc", with specified keys.
     */
    public hctaEpc.mmeSgsn.statistics.sbc.Sbc getSbc() throws JNCException {
        String path = "sbc";
        return (hctaEpc.mmeSgsn.statistics.sbc.Sbc)searchOne(path);
    }

    /**
     * Iterator method for the list "sbc".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator sbcIterator() {
        return new ElementChildrenIterator(children, "sbc");
    }

    /**
     * Adds list entry "sbc", using an existing object.
     * @param sbc The object to add.
     * @return The added child.
     */
    public hctaEpc.mmeSgsn.statistics.sbc.Sbc addSbc(hctaEpc.mmeSgsn.statistics.sbc.Sbc sbc)
            throws JNCException {
        insertChild(sbc, childrenNames());
        return sbc;
    }

    /**
     * Adds list entry "sbc".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public hctaEpc.mmeSgsn.statistics.sbc.Sbc addSbc() throws JNCException {
        hctaEpc.mmeSgsn.statistics.sbc.Sbc sbc = new hctaEpc.mmeSgsn.statistics.sbc.Sbc();
        insertChild(sbc, childrenNames());
        return sbc;
    }

    /**
     * Deletes list entry "sbc", with specified keys.
     */
    public void deleteSbc() throws JNCException {
        String path = "sbc";
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
