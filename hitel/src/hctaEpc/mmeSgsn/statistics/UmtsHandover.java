/* 
 * @(#)UmtsHandover.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.statistics;

import Element;

import ElementChildrenIterator;

import Epc;

import InterRat;

import IntraRat;

import JNCException;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/umtsHandover"
 * <p>
 * See line 2014 in
 * oamPmServerCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class UmtsHandover extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty UmtsHandover object.
     */
    public UmtsHandover() {
        super(Epc.NAMESPACE, "umtsHandover");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public UmtsHandover clone() {
        return (UmtsHandover)cloneContent(new UmtsHandover());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public UmtsHandover cloneShallow() {
        return (UmtsHandover)cloneShallowContent(new UmtsHandover());
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
            "interRat",
            "intraRat",
        };
    }

    /* Access methods for list child: "interRat". */

    /**
     * Gets list entry "interRat", with specified keys.
     */
    public InterRat getInterRat() throws JNCException {
        String path = "interRat";
        return (InterRat)searchOne(path);
    }

    /**
     * Iterator method for the list "interRat".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator interRatIterator() {
        return new ElementChildrenIterator(children, "interRat");
    }

    /**
     * Adds list entry "interRat", using an existing object.
     * @param interRat The object to add.
     * @return The added child.
     */
    public InterRat addInterRat(InterRat interRat) throws JNCException {
        insertChild(interRat, childrenNames());
        return interRat;
    }

    /**
     * Adds list entry "interRat".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public InterRat addInterRat() throws JNCException {
        InterRat interRat = new InterRat();
        insertChild(interRat, childrenNames());
        return interRat;
    }

    /**
     * Deletes list entry "interRat", with specified keys.
     */
    public void deleteInterRat() throws JNCException {
        String path = "interRat";
        delete(path);
    }

    /* Access methods for list child: "intraRat". */

    /**
     * Gets list entry "intraRat", with specified keys.
     */
    public IntraRat getIntraRat() throws JNCException {
        String path = "intraRat";
        return (IntraRat)searchOne(path);
    }

    /**
     * Iterator method for the list "intraRat".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator intraRatIterator() {
        return new ElementChildrenIterator(children, "intraRat");
    }

    /**
     * Adds list entry "intraRat", using an existing object.
     * @param intraRat The object to add.
     * @return The added child.
     */
    public IntraRat addIntraRat(IntraRat intraRat) throws JNCException {
        insertChild(intraRat, childrenNames());
        return intraRat;
    }

    /**
     * Adds list entry "intraRat".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public IntraRat addIntraRat() throws JNCException {
        IntraRat intraRat = new IntraRat();
        insertChild(intraRat, childrenNames());
        return intraRat;
    }

    /**
     * Deletes list entry "intraRat", with specified keys.
     */
    public void deleteIntraRat() throws JNCException {
        String path = "intraRat";
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