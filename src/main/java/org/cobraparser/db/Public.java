/**
 * This class is generated by jOOQ
 */
package org.cobraparser.db;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.5.0"
    },
    comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends org.jooq.impl.SchemaImpl {

  private static final long serialVersionUID = -1797739777;

  /**
   * The reference instance of <code>PUBLIC</code>
   */
  public static final Public PUBLIC = new Public();

  /**
   * No further instances allowed
   */
  private Public() {
    super("PUBLIC");
  }

  @Override
  public final java.util.List<org.jooq.Table<?>> getTables() {
    final java.util.List result = new java.util.ArrayList();
    result.addAll(getTables0());
    return result;
  }

  private final java.util.List<org.jooq.Table<?>> getTables0() {
    return java.util.Arrays.<org.jooq.Table<?>> asList(
        org.cobraparser.db.tables.Permissions.PERMISSIONS,
        org.cobraparser.db.tables.Cookies.COOKIES,
        org.cobraparser.db.tables.Globals.GLOBALS);
  }
}
