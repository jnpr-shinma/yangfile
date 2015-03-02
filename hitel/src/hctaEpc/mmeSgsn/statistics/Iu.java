/* 
 * @(#)Iu.java        1.0 09/12/14
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

import M3ua;

import Ranap;

import Sccp;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/iu"
 * <p>
 * See line 911 in
 * oamPmServerCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Iu extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Iu object.
     */
    public Iu() {
        super(Epc.NAMESPACE, "iu");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Iu clone() {
        return (Iu)cloneContent(new Iu());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Iu cloneShallow() {
        return (Iu)cloneShallowContent(new Iu());
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
            "m3ua",
            "ranap",
            "sccp",
        };
    }

    /* Access methods for list child: "m3ua". */

    /**
     * Gets list entry "m3ua", with specified keys.
     */
    public M3ua getM3ua() throws JNCException {
        String path = "m3ua";
        return (M3ua)searchOne(path);
    }

    /**
     * Iterator method for the list "m3ua".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator m3uaIterator() {
        return new ElementChildrenIterator(children, "m3ua");
    }

    /**
     * Adds list entry "m3ua", using an existing object.
     * @param m3ua The object to add.
     * @return The added child.
     */
    public M3ua addM3ua(M3ua m3ua) throws JNCException {
        insertChild(m3ua, childrenNames());
        return m3ua;
    }

    /**
     * Adds list entry "m3ua".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public M3ua addM3ua() throws JNCException {
        M3ua m3ua = new M3ua();
        insertChild(m3ua, childrenNames());
        return m3ua;
    }

    /**
     * Deletes list entry "m3ua", with specified keys.
     */
    public void deleteM3ua() throws JNCException {
        String path = "m3ua";
        delete(path);
    }

    /* Access methods for list child: "ranap". */

    /**
     * Gets list entry "ranap", with specified keys.
     */
    public Ranap getRanap() throws JNCException {
        String path = "ranap";
        return (Ranap)searchOne(path);
    }

    /**
     * Iterator method for the list "ranap".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator ranapIterator() {
        return new ElementChildrenIterator(children, "ranap");
    }

    /**
     * Adds list entry "ranap", using an existing object.
     * @param ranap The object to add.
     * @return The added child.
     */
    public Ranap addRanap(Ranap ranap) throws JNCException {
        insertChild(ranap, childrenNames());
        return ranap;
    }

    /**
     * Adds list entry "ranap".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Ranap addRanap() throws JNCException {
        Ranap ranap = new Ranap();
        insertChild(ranap, childrenNames());
        return ranap;
    }

    /**
     * Deletes list entry "ranap", with specified keys.
     */
    public void deleteRanap() throws JNCException {
        String path = "ranap";
        delete(path);
    }

    /* Access methods for list child: "sccp". */

    /**
     * Gets list entry "sccp", with specified keys.
     */
    public Sccp getSccp() throws JNCException {
        String path = "sccp";
        return (Sccp)searchOne(path);
    }

    /**
     * Iterator method for the list "sccp".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator sccpIterator() {
        return new ElementChildrenIterator(children, "sccp");
    }

    /**
     * Adds list entry "sccp", using an existing object.
     * @param sccp The object to add.
     * @return The added child.
     */
    public Sccp addSccp(Sccp sccp) throws JNCException {
        insertChild(sccp, childrenNames());
        return sccp;
    }

    /**
     * Adds list entry "sccp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Sccp addSccp() throws JNCException {
        Sccp sccp = new Sccp();
        insertChild(sccp, childrenNames());
        return sccp;
    }

    /**
     * Deletes list entry "sccp", with specified keys.
     */
    public void deleteSccp() throws JNCException {
        String path = "sccp";
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
