/* 
 * @(#)List.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.subscriber;

import Element;

import Epc;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/subscriber/list"
 * <p>
 * See line 960 in
 * scCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class List extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty List object.
     */
    public List() {
        super(Epc.NAMESPACE, "list");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public List clone() {
        return (List)cloneContent(new List());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public List cloneShallow() {
        return (List)cloneShallowContent(new List());
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
        };
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
