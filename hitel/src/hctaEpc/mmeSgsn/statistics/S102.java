/* 
 * @(#)S102.java        1.0 09/12/14
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

import Msg;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/s102"
 * <p>
 * See line 1512 in
 * oamPmServerCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class S102 extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty S102 object.
     */
    public S102() {
        super(Epc.NAMESPACE, "s102");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public S102 clone() {
        return (S102)cloneContent(new S102());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public S102 cloneShallow() {
        return (S102)cloneShallowContent(new S102());
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
            "general",
            "msg",
        };
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

    /* Access methods for list child: "msg". */

    /**
     * Gets list entry "msg", with specified keys.
     */
    public Msg getMsg() throws JNCException {
        String path = "msg";
        return (Msg)searchOne(path);
    }

    /**
     * Iterator method for the list "msg".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator msgIterator() {
        return new ElementChildrenIterator(children, "msg");
    }

    /**
     * Adds list entry "msg", using an existing object.
     * @param msg The object to add.
     * @return The added child.
     */
    public Msg addMsg(Msg msg) throws JNCException {
        insertChild(msg, childrenNames());
        return msg;
    }

    /**
     * Adds list entry "msg".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Msg addMsg() throws JNCException {
        Msg msg = new Msg();
        insertChild(msg, childrenNames());
        return msg;
    }

    /**
     * Deletes list entry "msg", with specified keys.
     */
    public void deleteMsg() throws JNCException {
        String path = "msg";
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
