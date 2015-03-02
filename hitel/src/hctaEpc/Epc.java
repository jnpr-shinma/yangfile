/* 
 * @(#)Epc.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc;

import com.tailf.jnc.JNCException;
import com.tailf.jnc.SchemaNode;
import com.tailf.jnc.SchemaParser;
import com.tailf.jnc.SchemaTree;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;

import java.util.HashMap;

/**
 * The root class for namespace http://hitachi-cta.com/ns/epc (accessible from 
 * HctaEpc.NAMESPACE) with prefix "epc" (HctaEpc.PREFIX).
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Epc {

    public static final String NAMESPACE = "http://hitachi-cta.com/ns/epc";

    public static final String PREFIX = "epc";

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() throws JNCException {
        YangElement.setPackage(NAMESPACE, "hctaEpc");
        Epc.registerSchema();
    }

    /**
     * Register the schema for this namespace in the global
     * schema table (CsTree) making it possible to lookup
     * CsNode entries for all tagpaths
     */
    public static void registerSchema() throws JNCException {
        SchemaParser parser = new SchemaParser();
        HashMap<Tagpath, SchemaNode> h = SchemaTree.create(NAMESPACE);
        parser.readFile("src/hctaEpc/Epc.schema", h);
    }

}
