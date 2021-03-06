/* 
 * @(#)Feature.java        1.0 09/12/14
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

import MmeFgwFeatureControl;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/feature"
 * <p>
 * See line 614 in
 * featuresConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Feature extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Feature object.
     */
    public Feature() {
        super(Epc.NAMESPACE, "feature");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Feature clone() {
        return (Feature)cloneContent(new Feature());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Feature cloneShallow() {
        return (Feature)cloneShallowContent(new Feature());
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
            "mme-fgw-feature-control",
        };
    }

    /* Access methods for list child: "mme-fgw-feature-control". */

    /**
     * Gets list entry "mmeFgwFeatureControl", with specified keys.
     * @param nameValue Key argument of child.
     */
    public MmeFgwFeatureControl getMmeFgwFeatureControl(YangEnumeration nameValue)
            throws JNCException {
        String path = "mme-fgw-feature-control[name='" + nameValue + "']";
        return (MmeFgwFeatureControl)searchOne(path);
    }

    /**
     * Gets list entry "mmeFgwFeatureControl", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public MmeFgwFeatureControl getMmeFgwFeatureControl(String nameValue)
            throws JNCException {
        String path = "mme-fgw-feature-control[name='" + nameValue + "']";
        return (MmeFgwFeatureControl)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-fgw-feature-control".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeFgwFeatureControlIterator() {
        return new ElementChildrenIterator(children, "mme-fgw-feature-control");
    }

    /**
     * Adds list entry "mmeFgwFeatureControl", using an existing object.
     * @param mmeFgwFeatureControl The object to add.
     * @return The added child.
     */
    public MmeFgwFeatureControl addMmeFgwFeatureControl(MmeFgwFeatureControl mmeFgwFeatureControl)
            throws JNCException {
        insertChild(mmeFgwFeatureControl, childrenNames());
        return mmeFgwFeatureControl;
    }

    /**
     * Adds list entry "mmeFgwFeatureControl", with specified keys.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwFeatureControl addMmeFgwFeatureControl(YangEnumeration nameValue)
            throws JNCException {
        MmeFgwFeatureControl mmeFgwFeatureControl = new MmeFgwFeatureControl(nameValue);
        return addMmeFgwFeatureControl(mmeFgwFeatureControl);
    }

    /**
     * Adds list entry "mmeFgwFeatureControl", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwFeatureControl addMmeFgwFeatureControl(String nameValue)
            throws JNCException {
        MmeFgwFeatureControl mmeFgwFeatureControl = new MmeFgwFeatureControl(nameValue);
        return addMmeFgwFeatureControl(mmeFgwFeatureControl);
    }

    /**
     * Adds list entry "mmeFgwFeatureControl".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFgwFeatureControl addMmeFgwFeatureControl() throws JNCException {
        MmeFgwFeatureControl mmeFgwFeatureControl = new MmeFgwFeatureControl();
        insertChild(mmeFgwFeatureControl, childrenNames());
        return mmeFgwFeatureControl;
    }

    /**
     * Deletes list entry "mmeFgwFeatureControl", with specified keys.
     * @param nameValue Key argument of child.
     */
    public void deleteMmeFgwFeatureControl(YangEnumeration nameValue)
            throws JNCException {
        String path = "mme-fgw-feature-control[name='" + nameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeFgwFeatureControl", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public void deleteMmeFgwFeatureControl(String nameValue)
            throws JNCException {
        String path = "mme-fgw-feature-control[name='" + nameValue + "']";
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
