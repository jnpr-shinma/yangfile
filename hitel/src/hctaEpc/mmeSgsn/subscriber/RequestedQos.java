/* 
 * @(#)RequestedQos.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.subscriber;

import Element;

import ElementChildrenIterator;

import Epc;

import Imsi;

import JNCException;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/subscriber/requested-qos"
 * <p>
 * See line 1261 in
 * scCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class RequestedQos extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty RequestedQos object.
     */
    public RequestedQos() {
        super(Epc.NAMESPACE, "requested-qos");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public RequestedQos clone() {
        return (RequestedQos)cloneContent(new RequestedQos());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public RequestedQos cloneShallow() {
        return (RequestedQos)cloneShallowContent(new RequestedQos());
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
            "imsi",
        };
    }

    /* Access methods for list child: "imsi". */

    /**
     * Gets list entry "imsi", with specified keys.
     */
    public Imsi getImsi() throws JNCException {
        String path = "imsi";
        return (Imsi)searchOne(path);
    }

    /**
     * Iterator method for the list "imsi".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator imsiIterator() {
        return new ElementChildrenIterator(children, "imsi");
    }

    /**
     * Adds list entry "imsi", using an existing object.
     * @param imsi The object to add.
     * @return The added child.
     */
    public Imsi addImsi(Imsi imsi) throws JNCException {
        insertChild(imsi, childrenNames());
        return imsi;
    }

    /**
     * Adds list entry "imsi".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Imsi addImsi() throws JNCException {
        Imsi imsi = new Imsi();
        insertChild(imsi, childrenNames());
        return imsi;
    }

    /**
     * Deletes list entry "imsi", with specified keys.
     */
    public void deleteImsi() throws JNCException {
        String path = "imsi";
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
