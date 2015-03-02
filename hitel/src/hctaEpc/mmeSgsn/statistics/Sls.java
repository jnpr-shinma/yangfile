/* 
 * @(#)Sls.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.statistics;

import Element;

import ElementChildrenIterator;

import Epc;

import General;

import JNCException;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/sls"
 * <p>
 * See line 1898 in
 * oamPmServerCli.yang
 * <p>
 * Children with the same name as this class are fully qualified.
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Sls extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Sls object.
     */
    public Sls() {
        super(Epc.NAMESPACE, "sls");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Sls clone() {
        return (Sls)cloneContent(new Sls());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Sls cloneShallow() {
        return (Sls)cloneShallowContent(new Sls());
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
            "sls",
            "general",
        };
    }

    /* Access methods for list child: "sls". */

    /**
     * Gets list entry "sls", with specified keys.
     */
    public hctaEpc.mmeSgsn.statistics.sls.Sls getSls() throws JNCException {
        String path = "sls";
        return (hctaEpc.mmeSgsn.statistics.sls.Sls)searchOne(path);
    }

    /**
     * Iterator method for the list "sls".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator slsIterator() {
        return new ElementChildrenIterator(children, "sls");
    }

    /**
     * Adds list entry "sls", using an existing object.
     * @param sls The object to add.
     * @return The added child.
     */
    public hctaEpc.mmeSgsn.statistics.sls.Sls addSls(hctaEpc.mmeSgsn.statistics.sls.Sls sls)
            throws JNCException {
        insertChild(sls, childrenNames());
        return sls;
    }

    /**
     * Adds list entry "sls".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public hctaEpc.mmeSgsn.statistics.sls.Sls addSls() throws JNCException {
        hctaEpc.mmeSgsn.statistics.sls.Sls sls = new hctaEpc.mmeSgsn.statistics.sls.Sls();
        insertChild(sls, childrenNames());
        return sls;
    }

    /**
     * Deletes list entry "sls", with specified keys.
     */
    public void deleteSls() throws JNCException {
        String path = "sls";
        delete(path);
    }

    /* Access methods for list child: "general". */

    /**
     * Gets list entry "general", with specified keys.
     */
    public General getGeneral() throws JNCException {
        String path = "general";
        return (General)searchOne(path);
    }

    /**
     * Iterator method for the list "general".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator generalIterator() {
        return new ElementChildrenIterator(children, "general");
    }

    /**
     * Adds list entry "general", using an existing object.
     * @param general The object to add.
     * @return The added child.
     */
    public General addGeneral(General general) throws JNCException {
        insertChild(general, childrenNames());
        return general;
    }

    /**
     * Adds list entry "general".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public General addGeneral() throws JNCException {
        General general = new General();
        insertChild(general, childrenNames());
        return general;
    }

    /**
     * Deletes list entry "general", with specified keys.
     */
    public void deleteGeneral() throws JNCException {
        String path = "general";
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