/**
 * This class is generated by jOOQ
 */
package org.cobraparser.db.tables.records;

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
public class GlobalsRecord extends org.jooq.impl.UpdatableRecordImpl<org.cobraparser.db.tables.records.GlobalsRecord> implements
    org.jooq.Record3<String, Integer, Boolean> {

  private static final long serialVersionUID = 1572132991;

  /**
   * Setter for <code>PUBLIC.GLOBALS.NOTACOLUMN</code>.
   */
  public void setNotacolumn(final String value) {
    setValue(0, value);
  }

  /**
   * Getter for <code>PUBLIC.GLOBALS.NOTACOLUMN</code>.
   */
  public String getNotacolumn() {
    return (String) getValue(0);
  }

  /**
   * Setter for <code>PUBLIC.GLOBALS.SCHEMAVERSION</code>.
   */
  public void setSchemaversion(final Integer value) {
    setValue(1, value);
  }

  /**
   * Getter for <code>PUBLIC.GLOBALS.SCHEMAVERSION</code>.
   */
  public Integer getSchemaversion() {
    return (Integer) getValue(1);
  }

  /**
   * Setter for <code>PUBLIC.GLOBALS.PERMISSIONSINITIALIZED</code>.
   */
  public void setPermissionsinitialized(final Boolean value) {
    setValue(2, value);
  }

  /**
   * Getter for <code>PUBLIC.GLOBALS.PERMISSIONSINITIALIZED</code>.
   */
  public Boolean getPermissionsinitialized() {
    return (Boolean) getValue(2);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Record1<String> key() {
    return (org.jooq.Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record3 type implementation
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row3<String, Integer, Boolean> fieldsRow() {
    return (org.jooq.Row3) super.fieldsRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row3<String, Integer, Boolean> valuesRow() {
    return (org.jooq.Row3) super.valuesRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<String> field1() {
    return org.cobraparser.db.tables.Globals.GLOBALS.NOTACOLUMN;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<Integer> field2() {
    return org.cobraparser.db.tables.Globals.GLOBALS.SCHEMAVERSION;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<Boolean> field3() {
    return org.cobraparser.db.tables.Globals.GLOBALS.PERMISSIONSINITIALIZED;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value1() {
    return getNotacolumn();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer value2() {
    return getSchemaversion();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Boolean value3() {
    return getPermissionsinitialized();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GlobalsRecord value1(final String value) {
    setNotacolumn(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GlobalsRecord value2(final Integer value) {
    setSchemaversion(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GlobalsRecord value3(final Boolean value) {
    setPermissionsinitialized(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GlobalsRecord values(final String value1, final Integer value2, final Boolean value3) {
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached GlobalsRecord
   */
  public GlobalsRecord() {
    super(org.cobraparser.db.tables.Globals.GLOBALS);
  }

  /**
   * Create a detached, initialised GlobalsRecord
   */
  public GlobalsRecord(final String notacolumn, final Integer schemaversion,
      final Boolean permissionsinitialized) {
    super(org.cobraparser.db.tables.Globals.GLOBALS);

    setValue(0, notacolumn);
    setValue(1, schemaversion);
    setValue(2, permissionsinitialized);
  }
}
