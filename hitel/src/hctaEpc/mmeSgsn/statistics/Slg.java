/* 
 * @(#)Slg.java        1.0 09/12/14
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

import Sc;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/slg"
 * <p>
 * See line 1879 in
 * oamPmServerCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Slg extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Slg object.
     */
    public Slg() {
        super(Epc.NAMESPACE, "slg");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Slg clone() {
        return (Slg)cloneContent(new Slg());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Slg cloneShallow() {
        return (Slg)cloneShallowContent(new Slg());
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
            "sc",
        };
    }

    /* Access methods for list child: "sc". */

    /**
     * Gets list entry "sc", with specified keys.
     */
    public Sc getSc() throws JNCException {
        String path = "sc";
        return (Sc)searchOne(path);
    }

    /**
     * Iterator method for the list "sc".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator scIterator() {
        return new ElementChildrenIterator(children, "sc");
    }

    /**
     * Adds list entry "sc", using an existing object.
     * @param sc The object to add.
     * @return The added child.
     */
    public Sc addSc(Sc sc) throws JNCException {
        insertChild(sc, childrenNames());
        return sc;
    }

    /**
     * Adds list entry "sc".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Sc addSc() throws JNCException {
        Sc sc = new Sc();
        insertChild(sc, childrenNames());
        return sc;
    }

    /**
     * Deletes list entry "sc", with specified keys.
     */
    public void deleteSc() throws JNCException {
        String path = "sc";
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
