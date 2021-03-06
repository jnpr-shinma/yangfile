/* 
 * @(#)MmeAppServer.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.ss7;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangString;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/ss7/mme-app-server"
 * <p>
 * See line 648 in
 * sigtranConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeAppServer extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeAppServer object.
     */
    public MmeAppServer() {
        super(Epc.NAMESPACE, "mme-app-server");
    }

    /**
     * Constructor for an initialized MmeAppServer object,
     * 
     * @param nameValue Key argument of child.
     */
    public MmeAppServer(YangString nameValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-app-server");
        Leaf name = new Leaf(Epc.NAMESPACE, "name");
        name.setValue(nameValue);
        insertChild(name, childrenNames());
    }

    /**
     * Constructor for an initialized MmeAppServer object,
     * with String keys.
     * @param nameValue Key argument of child.
     */
    public MmeAppServer(String nameValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-app-server");
        Leaf name = new Leaf(Epc.NAMESPACE, "name");
        name.setValue(new YangString(nameValue));
        insertChild(name, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeAppServer clone() {
        MmeAppServer copy;
        try {
            copy = new MmeAppServer(getNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeAppServer)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeAppServer cloneShallow() {
        MmeAppServer copy;
        try {
            copy = new MmeAppServer(getNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeAppServer)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "name",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "name",
        };
    }

    /* Access methods for leaf child: "name". */

    /**
     * Gets the value for child leaf "name".
     * @return The value of the leaf.
     */
    public YangString getNameValue() throws JNCException {
        return (YangString)getValue("name");
    }

    /**
     * Sets the value for child leaf "name",
     * using instance of generated typedef class.
     * @param nameValue The value to set.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(YangString nameValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "name",
            nameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "name",
     * using a String value.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(String nameValue) throws JNCException {
        setNameValue(new YangString(nameValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "name" leaf will not have a value.
     */
    public void addName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "name",
            null,
            childrenNames());
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
