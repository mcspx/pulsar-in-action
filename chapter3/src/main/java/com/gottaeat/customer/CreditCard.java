/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.gottaeat.customer;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CreditCard extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7507475213576831342L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CreditCard\",\"namespace\":\"com.gottaeat.customer\",\"fields\":[{\"name\":\"card_type\",\"type\":{\"type\":\"enum\",\"name\":\"CardType\",\"symbols\":[\"MASTERCARD\",\"AMEX\",\"VISA\",\"DISCOVER\"]}},{\"name\":\"account_number\",\"type\":\"string\"},{\"name\":\"billing_zip\",\"type\":\"string\"},{\"name\":\"ccv\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CreditCard> ENCODER =
      new BinaryMessageEncoder<CreditCard>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CreditCard> DECODER =
      new BinaryMessageDecoder<CreditCard>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CreditCard> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CreditCard> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CreditCard> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CreditCard>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CreditCard to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CreditCard from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CreditCard instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CreditCard fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.gottaeat.customer.CardType card_type;
  @Deprecated public java.lang.CharSequence account_number;
  @Deprecated public java.lang.CharSequence billing_zip;
  @Deprecated public java.lang.CharSequence ccv;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CreditCard() {}

  /**
   * All-args constructor.
   * @param card_type The new value for card_type
   * @param account_number The new value for account_number
   * @param billing_zip The new value for billing_zip
   * @param ccv The new value for ccv
   */
  public CreditCard(com.gottaeat.customer.CardType card_type, java.lang.CharSequence account_number, java.lang.CharSequence billing_zip, java.lang.CharSequence ccv) {
    this.card_type = card_type;
    this.account_number = account_number;
    this.billing_zip = billing_zip;
    this.ccv = ccv;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return card_type;
    case 1: return account_number;
    case 2: return billing_zip;
    case 3: return ccv;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: card_type = (com.gottaeat.customer.CardType)value$; break;
    case 1: account_number = (java.lang.CharSequence)value$; break;
    case 2: billing_zip = (java.lang.CharSequence)value$; break;
    case 3: ccv = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'card_type' field.
   * @return The value of the 'card_type' field.
   */
  public com.gottaeat.customer.CardType getCardType() {
    return card_type;
  }


  /**
   * Sets the value of the 'card_type' field.
   * @param value the value to set.
   */
  public void setCardType(com.gottaeat.customer.CardType value) {
    this.card_type = value;
  }

  /**
   * Gets the value of the 'account_number' field.
   * @return The value of the 'account_number' field.
   */
  public java.lang.CharSequence getAccountNumber() {
    return account_number;
  }


  /**
   * Sets the value of the 'account_number' field.
   * @param value the value to set.
   */
  public void setAccountNumber(java.lang.CharSequence value) {
    this.account_number = value;
  }

  /**
   * Gets the value of the 'billing_zip' field.
   * @return The value of the 'billing_zip' field.
   */
  public java.lang.CharSequence getBillingZip() {
    return billing_zip;
  }


  /**
   * Sets the value of the 'billing_zip' field.
   * @param value the value to set.
   */
  public void setBillingZip(java.lang.CharSequence value) {
    this.billing_zip = value;
  }

  /**
   * Gets the value of the 'ccv' field.
   * @return The value of the 'ccv' field.
   */
  public java.lang.CharSequence getCcv() {
    return ccv;
  }


  /**
   * Sets the value of the 'ccv' field.
   * @param value the value to set.
   */
  public void setCcv(java.lang.CharSequence value) {
    this.ccv = value;
  }

  /**
   * Creates a new CreditCard RecordBuilder.
   * @return A new CreditCard RecordBuilder
   */
  public static com.gottaeat.customer.CreditCard.Builder newBuilder() {
    return new com.gottaeat.customer.CreditCard.Builder();
  }

  /**
   * Creates a new CreditCard RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CreditCard RecordBuilder
   */
  public static com.gottaeat.customer.CreditCard.Builder newBuilder(com.gottaeat.customer.CreditCard.Builder other) {
    if (other == null) {
      return new com.gottaeat.customer.CreditCard.Builder();
    } else {
      return new com.gottaeat.customer.CreditCard.Builder(other);
    }
  }

  /**
   * Creates a new CreditCard RecordBuilder by copying an existing CreditCard instance.
   * @param other The existing instance to copy.
   * @return A new CreditCard RecordBuilder
   */
  public static com.gottaeat.customer.CreditCard.Builder newBuilder(com.gottaeat.customer.CreditCard other) {
    if (other == null) {
      return new com.gottaeat.customer.CreditCard.Builder();
    } else {
      return new com.gottaeat.customer.CreditCard.Builder(other);
    }
  }

  /**
   * RecordBuilder for CreditCard instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CreditCard>
    implements org.apache.avro.data.RecordBuilder<CreditCard> {

    private com.gottaeat.customer.CardType card_type;
    private java.lang.CharSequence account_number;
    private java.lang.CharSequence billing_zip;
    private java.lang.CharSequence ccv;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.gottaeat.customer.CreditCard.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.card_type)) {
        this.card_type = data().deepCopy(fields()[0].schema(), other.card_type);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.account_number)) {
        this.account_number = data().deepCopy(fields()[1].schema(), other.account_number);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.billing_zip)) {
        this.billing_zip = data().deepCopy(fields()[2].schema(), other.billing_zip);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.ccv)) {
        this.ccv = data().deepCopy(fields()[3].schema(), other.ccv);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing CreditCard instance
     * @param other The existing instance to copy.
     */
    private Builder(com.gottaeat.customer.CreditCard other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.card_type)) {
        this.card_type = data().deepCopy(fields()[0].schema(), other.card_type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.account_number)) {
        this.account_number = data().deepCopy(fields()[1].schema(), other.account_number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.billing_zip)) {
        this.billing_zip = data().deepCopy(fields()[2].schema(), other.billing_zip);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ccv)) {
        this.ccv = data().deepCopy(fields()[3].schema(), other.ccv);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'card_type' field.
      * @return The value.
      */
    public com.gottaeat.customer.CardType getCardType() {
      return card_type;
    }


    /**
      * Sets the value of the 'card_type' field.
      * @param value The value of 'card_type'.
      * @return This builder.
      */
    public com.gottaeat.customer.CreditCard.Builder setCardType(com.gottaeat.customer.CardType value) {
      validate(fields()[0], value);
      this.card_type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'card_type' field has been set.
      * @return True if the 'card_type' field has been set, false otherwise.
      */
    public boolean hasCardType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'card_type' field.
      * @return This builder.
      */
    public com.gottaeat.customer.CreditCard.Builder clearCardType() {
      card_type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'account_number' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountNumber() {
      return account_number;
    }


    /**
      * Sets the value of the 'account_number' field.
      * @param value The value of 'account_number'.
      * @return This builder.
      */
    public com.gottaeat.customer.CreditCard.Builder setAccountNumber(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.account_number = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'account_number' field has been set.
      * @return True if the 'account_number' field has been set, false otherwise.
      */
    public boolean hasAccountNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'account_number' field.
      * @return This builder.
      */
    public com.gottaeat.customer.CreditCard.Builder clearAccountNumber() {
      account_number = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'billing_zip' field.
      * @return The value.
      */
    public java.lang.CharSequence getBillingZip() {
      return billing_zip;
    }


    /**
      * Sets the value of the 'billing_zip' field.
      * @param value The value of 'billing_zip'.
      * @return This builder.
      */
    public com.gottaeat.customer.CreditCard.Builder setBillingZip(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.billing_zip = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'billing_zip' field has been set.
      * @return True if the 'billing_zip' field has been set, false otherwise.
      */
    public boolean hasBillingZip() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'billing_zip' field.
      * @return This builder.
      */
    public com.gottaeat.customer.CreditCard.Builder clearBillingZip() {
      billing_zip = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ccv' field.
      * @return The value.
      */
    public java.lang.CharSequence getCcv() {
      return ccv;
    }


    /**
      * Sets the value of the 'ccv' field.
      * @param value The value of 'ccv'.
      * @return This builder.
      */
    public com.gottaeat.customer.CreditCard.Builder setCcv(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.ccv = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ccv' field has been set.
      * @return True if the 'ccv' field has been set, false otherwise.
      */
    public boolean hasCcv() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ccv' field.
      * @return This builder.
      */
    public com.gottaeat.customer.CreditCard.Builder clearCcv() {
      ccv = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CreditCard build() {
      try {
        CreditCard record = new CreditCard();
        record.card_type = fieldSetFlags()[0] ? this.card_type : (com.gottaeat.customer.CardType) defaultValue(fields()[0]);
        record.account_number = fieldSetFlags()[1] ? this.account_number : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.billing_zip = fieldSetFlags()[2] ? this.billing_zip : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.ccv = fieldSetFlags()[3] ? this.ccv : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CreditCard>
    WRITER$ = (org.apache.avro.io.DatumWriter<CreditCard>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CreditCard>
    READER$ = (org.apache.avro.io.DatumReader<CreditCard>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeEnum(this.card_type.ordinal());

    out.writeString(this.account_number);

    out.writeString(this.billing_zip);

    out.writeString(this.ccv);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.card_type = com.gottaeat.customer.CardType.values()[in.readEnum()];

      this.account_number = in.readString(this.account_number instanceof Utf8 ? (Utf8)this.account_number : null);

      this.billing_zip = in.readString(this.billing_zip instanceof Utf8 ? (Utf8)this.billing_zip : null);

      this.ccv = in.readString(this.ccv instanceof Utf8 ? (Utf8)this.ccv : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.card_type = com.gottaeat.customer.CardType.values()[in.readEnum()];
          break;

        case 1:
          this.account_number = in.readString(this.account_number instanceof Utf8 ? (Utf8)this.account_number : null);
          break;

        case 2:
          this.billing_zip = in.readString(this.billing_zip instanceof Utf8 ? (Utf8)this.billing_zip : null);
          break;

        case 3:
          this.ccv = in.readString(this.ccv instanceof Utf8 ? (Utf8)this.ccv : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










