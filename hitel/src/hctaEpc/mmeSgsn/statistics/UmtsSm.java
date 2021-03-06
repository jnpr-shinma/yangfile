/* 
 * @(#)UmtsSm.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.statistics;

import Camel;

import Deactivation;

import Element;

import ElementChildrenIterator;

import Epc;

import General;

import Irau;

import IrauFail;

import JNCException;

import Modify;

import PriActGgsnFail;

import PrimaryAct;

import PrimaryActFail;

import Procedure;

import SecActGgsnFail;

import SecondaryAct;

import SecondaryActFail;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/umtsSm"
 * <p>
 * See line 2209 in
 * oamPmServerCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class UmtsSm extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty UmtsSm object.
     */
    public UmtsSm() {
        super(Epc.NAMESPACE, "umtsSm");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public UmtsSm clone() {
        return (UmtsSm)cloneContent(new UmtsSm());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public UmtsSm cloneShallow() {
        return (UmtsSm)cloneShallowContent(new UmtsSm());
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
            "camel",
            "deactivation",
            "general",
            "irau",
            "irauFail",
            "modify",
            "priActGgsnFail",
            "primaryAct",
            "primaryActFail",
            "procedure",
            "secActGgsnFail",
            "secondaryAct",
            "secondaryActFail",
        };
    }

    /* Access methods for list child: "camel". */

    /**
     * Gets list entry "camel", with specified keys.
     */
    public Camel getCamel() throws JNCException {
        String path = "camel";
        return (Camel)searchOne(path);
    }

    /**
     * Iterator method for the list "camel".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator camelIterator() {
        return new ElementChildrenIterator(children, "camel");
    }

    /**
     * Adds list entry "camel", using an existing object.
     * @param camel The object to add.
     * @return The added child.
     */
    public Camel addCamel(Camel camel) throws JNCException {
        insertChild(camel, childrenNames());
        return camel;
    }

    /**
     * Adds list entry "camel".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Camel addCamel() throws JNCException {
        Camel camel = new Camel();
        insertChild(camel, childrenNames());
        return camel;
    }

    /**
     * Deletes list entry "camel", with specified keys.
     */
    public void deleteCamel() throws JNCException {
        String path = "camel";
        delete(path);
    }

    /* Access methods for list child: "deactivation". */

    /**
     * Gets list entry "deactivation", with specified keys.
     */
    public Deactivation getDeactivation() throws JNCException {
        String path = "deactivation";
        return (Deactivation)searchOne(path);
    }

    /**
     * Iterator method for the list "deactivation".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator deactivationIterator() {
        return new ElementChildrenIterator(children, "deactivation");
    }

    /**
     * Adds list entry "deactivation", using an existing object.
     * @param deactivation The object to add.
     * @return The added child.
     */
    public Deactivation addDeactivation(Deactivation deactivation)
            throws JNCException {
        insertChild(deactivation, childrenNames());
        return deactivation;
    }

    /**
     * Adds list entry "deactivation".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Deactivation addDeactivation() throws JNCException {
        Deactivation deactivation = new Deactivation();
        insertChild(deactivation, childrenNames());
        return deactivation;
    }

    /**
     * Deletes list entry "deactivation", with specified keys.
     */
    public void deleteDeactivation() throws JNCException {
        String path = "deactivation";
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

    /* Access methods for list child: "irau". */

    /**
     * Gets list entry "irau", with specified keys.
     */
    public Irau getIrau() throws JNCException {
        String path = "irau";
        return (Irau)searchOne(path);
    }

    /**
     * Iterator method for the list "irau".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator irauIterator() {
        return new ElementChildrenIterator(children, "irau");
    }

    /**
     * Adds list entry "irau", using an existing object.
     * @param irau The object to add.
     * @return The added child.
     */
    public Irau addIrau(Irau irau) throws JNCException {
        insertChild(irau, childrenNames());
        return irau;
    }

    /**
     * Adds list entry "irau".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Irau addIrau() throws JNCException {
        Irau irau = new Irau();
        insertChild(irau, childrenNames());
        return irau;
    }

    /**
     * Deletes list entry "irau", with specified keys.
     */
    public void deleteIrau() throws JNCException {
        String path = "irau";
        delete(path);
    }

    /* Access methods for list child: "irauFail". */

    /**
     * Gets list entry "irauFail", with specified keys.
     */
    public IrauFail getIrauFail() throws JNCException {
        String path = "irauFail";
        return (IrauFail)searchOne(path);
    }

    /**
     * Iterator method for the list "irauFail".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator irauFailIterator() {
        return new ElementChildrenIterator(children, "irauFail");
    }

    /**
     * Adds list entry "irauFail", using an existing object.
     * @param irauFail The object to add.
     * @return The added child.
     */
    public IrauFail addIrauFail(IrauFail irauFail) throws JNCException {
        insertChild(irauFail, childrenNames());
        return irauFail;
    }

    /**
     * Adds list entry "irauFail".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public IrauFail addIrauFail() throws JNCException {
        IrauFail irauFail = new IrauFail();
        insertChild(irauFail, childrenNames());
        return irauFail;
    }

    /**
     * Deletes list entry "irauFail", with specified keys.
     */
    public void deleteIrauFail() throws JNCException {
        String path = "irauFail";
        delete(path);
    }

    /* Access methods for list child: "modify". */

    /**
     * Gets list entry "modify", with specified keys.
     */
    public Modify getModify() throws JNCException {
        String path = "modify";
        return (Modify)searchOne(path);
    }

    /**
     * Iterator method for the list "modify".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator modifyIterator() {
        return new ElementChildrenIterator(children, "modify");
    }

    /**
     * Adds list entry "modify", using an existing object.
     * @param modify The object to add.
     * @return The added child.
     */
    public Modify addModify(Modify modify) throws JNCException {
        insertChild(modify, childrenNames());
        return modify;
    }

    /**
     * Adds list entry "modify".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Modify addModify() throws JNCException {
        Modify modify = new Modify();
        insertChild(modify, childrenNames());
        return modify;
    }

    /**
     * Deletes list entry "modify", with specified keys.
     */
    public void deleteModify() throws JNCException {
        String path = "modify";
        delete(path);
    }

    /* Access methods for list child: "priActGgsnFail". */

    /**
     * Gets list entry "priActGgsnFail", with specified keys.
     */
    public PriActGgsnFail getPriActGgsnFail() throws JNCException {
        String path = "priActGgsnFail";
        return (PriActGgsnFail)searchOne(path);
    }

    /**
     * Iterator method for the list "priActGgsnFail".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator priActGgsnFailIterator() {
        return new ElementChildrenIterator(children, "priActGgsnFail");
    }

    /**
     * Adds list entry "priActGgsnFail", using an existing object.
     * @param priActGgsnFail The object to add.
     * @return The added child.
     */
    public PriActGgsnFail addPriActGgsnFail(PriActGgsnFail priActGgsnFail)
            throws JNCException {
        insertChild(priActGgsnFail, childrenNames());
        return priActGgsnFail;
    }

    /**
     * Adds list entry "priActGgsnFail".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public PriActGgsnFail addPriActGgsnFail() throws JNCException {
        PriActGgsnFail priActGgsnFail = new PriActGgsnFail();
        insertChild(priActGgsnFail, childrenNames());
        return priActGgsnFail;
    }

    /**
     * Deletes list entry "priActGgsnFail", with specified keys.
     */
    public void deletePriActGgsnFail() throws JNCException {
        String path = "priActGgsnFail";
        delete(path);
    }

    /* Access methods for list child: "primaryAct". */

    /**
     * Gets list entry "primaryAct", with specified keys.
     */
    public PrimaryAct getPrimaryAct() throws JNCException {
        String path = "primaryAct";
        return (PrimaryAct)searchOne(path);
    }

    /**
     * Iterator method for the list "primaryAct".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator primaryActIterator() {
        return new ElementChildrenIterator(children, "primaryAct");
    }

    /**
     * Adds list entry "primaryAct", using an existing object.
     * @param primaryAct The object to add.
     * @return The added child.
     */
    public PrimaryAct addPrimaryAct(PrimaryAct primaryAct) throws JNCException {
        insertChild(primaryAct, childrenNames());
        return primaryAct;
    }

    /**
     * Adds list entry "primaryAct".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public PrimaryAct addPrimaryAct() throws JNCException {
        PrimaryAct primaryAct = new PrimaryAct();
        insertChild(primaryAct, childrenNames());
        return primaryAct;
    }

    /**
     * Deletes list entry "primaryAct", with specified keys.
     */
    public void deletePrimaryAct() throws JNCException {
        String path = "primaryAct";
        delete(path);
    }

    /* Access methods for list child: "primaryActFail". */

    /**
     * Gets list entry "primaryActFail", with specified keys.
     */
    public PrimaryActFail getPrimaryActFail() throws JNCException {
        String path = "primaryActFail";
        return (PrimaryActFail)searchOne(path);
    }

    /**
     * Iterator method for the list "primaryActFail".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator primaryActFailIterator() {
        return new ElementChildrenIterator(children, "primaryActFail");
    }

    /**
     * Adds list entry "primaryActFail", using an existing object.
     * @param primaryActFail The object to add.
     * @return The added child.
     */
    public PrimaryActFail addPrimaryActFail(PrimaryActFail primaryActFail)
            throws JNCException {
        insertChild(primaryActFail, childrenNames());
        return primaryActFail;
    }

    /**
     * Adds list entry "primaryActFail".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public PrimaryActFail addPrimaryActFail() throws JNCException {
        PrimaryActFail primaryActFail = new PrimaryActFail();
        insertChild(primaryActFail, childrenNames());
        return primaryActFail;
    }

    /**
     * Deletes list entry "primaryActFail", with specified keys.
     */
    public void deletePrimaryActFail() throws JNCException {
        String path = "primaryActFail";
        delete(path);
    }

    /* Access methods for list child: "procedure". */

    /**
     * Gets list entry "procedure", with specified keys.
     */
    public Procedure getProcedure() throws JNCException {
        String path = "procedure";
        return (Procedure)searchOne(path);
    }

    /**
     * Iterator method for the list "procedure".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator procedureIterator() {
        return new ElementChildrenIterator(children, "procedure");
    }

    /**
     * Adds list entry "procedure", using an existing object.
     * @param procedure The object to add.
     * @return The added child.
     */
    public Procedure addProcedure(Procedure procedure) throws JNCException {
        insertChild(procedure, childrenNames());
        return procedure;
    }

    /**
     * Adds list entry "procedure".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Procedure addProcedure() throws JNCException {
        Procedure procedure = new Procedure();
        insertChild(procedure, childrenNames());
        return procedure;
    }

    /**
     * Deletes list entry "procedure", with specified keys.
     */
    public void deleteProcedure() throws JNCException {
        String path = "procedure";
        delete(path);
    }

    /* Access methods for list child: "secActGgsnFail". */

    /**
     * Gets list entry "secActGgsnFail", with specified keys.
     */
    public SecActGgsnFail getSecActGgsnFail() throws JNCException {
        String path = "secActGgsnFail";
        return (SecActGgsnFail)searchOne(path);
    }

    /**
     * Iterator method for the list "secActGgsnFail".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator secActGgsnFailIterator() {
        return new ElementChildrenIterator(children, "secActGgsnFail");
    }

    /**
     * Adds list entry "secActGgsnFail", using an existing object.
     * @param secActGgsnFail The object to add.
     * @return The added child.
     */
    public SecActGgsnFail addSecActGgsnFail(SecActGgsnFail secActGgsnFail)
            throws JNCException {
        insertChild(secActGgsnFail, childrenNames());
        return secActGgsnFail;
    }

    /**
     * Adds list entry "secActGgsnFail".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public SecActGgsnFail addSecActGgsnFail() throws JNCException {
        SecActGgsnFail secActGgsnFail = new SecActGgsnFail();
        insertChild(secActGgsnFail, childrenNames());
        return secActGgsnFail;
    }

    /**
     * Deletes list entry "secActGgsnFail", with specified keys.
     */
    public void deleteSecActGgsnFail() throws JNCException {
        String path = "secActGgsnFail";
        delete(path);
    }

    /* Access methods for list child: "secondaryAct". */

    /**
     * Gets list entry "secondaryAct", with specified keys.
     */
    public SecondaryAct getSecondaryAct() throws JNCException {
        String path = "secondaryAct";
        return (SecondaryAct)searchOne(path);
    }

    /**
     * Iterator method for the list "secondaryAct".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator secondaryActIterator() {
        return new ElementChildrenIterator(children, "secondaryAct");
    }

    /**
     * Adds list entry "secondaryAct", using an existing object.
     * @param secondaryAct The object to add.
     * @return The added child.
     */
    public SecondaryAct addSecondaryAct(SecondaryAct secondaryAct)
            throws JNCException {
        insertChild(secondaryAct, childrenNames());
        return secondaryAct;
    }

    /**
     * Adds list entry "secondaryAct".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public SecondaryAct addSecondaryAct() throws JNCException {
        SecondaryAct secondaryAct = new SecondaryAct();
        insertChild(secondaryAct, childrenNames());
        return secondaryAct;
    }

    /**
     * Deletes list entry "secondaryAct", with specified keys.
     */
    public void deleteSecondaryAct() throws JNCException {
        String path = "secondaryAct";
        delete(path);
    }

    /* Access methods for list child: "secondaryActFail". */

    /**
     * Gets list entry "secondaryActFail", with specified keys.
     */
    public SecondaryActFail getSecondaryActFail() throws JNCException {
        String path = "secondaryActFail";
        return (SecondaryActFail)searchOne(path);
    }

    /**
     * Iterator method for the list "secondaryActFail".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator secondaryActFailIterator() {
        return new ElementChildrenIterator(children, "secondaryActFail");
    }

    /**
     * Adds list entry "secondaryActFail", using an existing object.
     * @param secondaryActFail The object to add.
     * @return The added child.
     */
    public SecondaryActFail addSecondaryActFail(SecondaryActFail secondaryActFail)
            throws JNCException {
        insertChild(secondaryActFail, childrenNames());
        return secondaryActFail;
    }

    /**
     * Adds list entry "secondaryActFail".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public SecondaryActFail addSecondaryActFail() throws JNCException {
        SecondaryActFail secondaryActFail = new SecondaryActFail();
        insertChild(secondaryActFail, childrenNames());
        return secondaryActFail;
    }

    /**
     * Deletes list entry "secondaryActFail", with specified keys.
     */
    public void deleteSecondaryActFail() throws JNCException {
        String path = "secondaryActFail";
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
