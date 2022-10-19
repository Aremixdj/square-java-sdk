
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.apimatic.core.types.BaseModel;
import java.util.Objects;

/**
 * This is a model class for Card type.
 */
public class Card {
    private final String id;
    private final String cardBrand;
    private final String last4;
    private final Long expMonth;
    private final Long expYear;
    private final String cardholderName;
    private final Address billingAddress;
    private final String fingerprint;
    private final String customerId;
    private final String merchantId;
    private final String referenceId;
    private final Boolean enabled;
    private final String cardType;
    private final String prepaidType;
    private final String bin;
    private final Long version;
    private final String cardCoBrand;

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  cardBrand  String value for cardBrand.
     * @param  last4  String value for last4.
     * @param  expMonth  Long value for expMonth.
     * @param  expYear  Long value for expYear.
     * @param  cardholderName  String value for cardholderName.
     * @param  billingAddress  Address value for billingAddress.
     * @param  fingerprint  String value for fingerprint.
     * @param  customerId  String value for customerId.
     * @param  merchantId  String value for merchantId.
     * @param  referenceId  String value for referenceId.
     * @param  enabled  Boolean value for enabled.
     * @param  cardType  String value for cardType.
     * @param  prepaidType  String value for prepaidType.
     * @param  bin  String value for bin.
     * @param  version  Long value for version.
     * @param  cardCoBrand  String value for cardCoBrand.
     */
    @JsonCreator
    public Card(
            @JsonProperty("id") String id,
            @JsonProperty("card_brand") String cardBrand,
            @JsonProperty("last_4") String last4,
            @JsonProperty("exp_month") Long expMonth,
            @JsonProperty("exp_year") Long expYear,
            @JsonProperty("cardholder_name") String cardholderName,
            @JsonProperty("billing_address") Address billingAddress,
            @JsonProperty("fingerprint") String fingerprint,
            @JsonProperty("customer_id") String customerId,
            @JsonProperty("merchant_id") String merchantId,
            @JsonProperty("reference_id") String referenceId,
            @JsonProperty("enabled") Boolean enabled,
            @JsonProperty("card_type") String cardType,
            @JsonProperty("prepaid_type") String prepaidType,
            @JsonProperty("bin") String bin,
            @JsonProperty("version") Long version,
            @JsonProperty("card_co_brand") String cardCoBrand) {
        this.id = id;
        this.cardBrand = cardBrand;
        this.last4 = last4;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cardholderName = cardholderName;
        this.billingAddress = billingAddress;
        this.fingerprint = fingerprint;
        this.customerId = customerId;
        this.merchantId = merchantId;
        this.referenceId = referenceId;
        this.enabled = enabled;
        this.cardType = cardType;
        this.prepaidType = prepaidType;
        this.bin = bin;
        this.version = version;
        this.cardCoBrand = cardCoBrand;
    }

    /**
     * Getter for Id.
     * Unique ID for this card. Generated by Square.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Getter for CardBrand.
     * Indicates a card's brand, such as `VISA` or `MASTERCARD`.
     * @return Returns the String
     */
    @JsonGetter("card_brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardBrand() {
        return cardBrand;
    }

    /**
     * Getter for Last4.
     * The last 4 digits of the card number.
     * @return Returns the String
     */
    @JsonGetter("last_4")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLast4() {
        return last4;
    }

    /**
     * Getter for ExpMonth.
     * The expiration month of the associated card as an integer between 1 and 12.
     * @return Returns the Long
     */
    @JsonGetter("exp_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getExpMonth() {
        return expMonth;
    }

    /**
     * Getter for ExpYear.
     * The four-digit year of the card's expiration date.
     * @return Returns the Long
     */
    @JsonGetter("exp_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getExpYear() {
        return expYear;
    }

    /**
     * Getter for CardholderName.
     * The name of the cardholder.
     * @return Returns the String
     */
    @JsonGetter("cardholder_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * Getter for BillingAddress.
     * Represents a postal address in a country. For more information, see [Working with
     * Addresses](https://developer.squareup.com/docs/build-basics/working-with-addresses).
     * @return Returns the Address
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Getter for Fingerprint.
     * Intended as a Square-assigned identifier, based on the card number, to identify the card
     * across multiple locations within a single application.
     * @return Returns the String
     */
    @JsonGetter("fingerprint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * Getter for CustomerId.
     * **Required** The ID of a customer created using the Customers API to be associated with the
     * card.
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Getter for MerchantId.
     * The ID of the merchant associated with the card.
     * @return Returns the String
     */
    @JsonGetter("merchant_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Getter for ReferenceId.
     * An optional user-defined reference ID that associates this card with another entity in an
     * external system. For example, a customer ID from an external customer management system.
     * @return Returns the String
     */
    @JsonGetter("reference_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Getter for Enabled.
     * Indicates whether or not a card can be used for payments.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Getter for CardType.
     * Indicates a card's type, such as `CREDIT` or `DEBIT`.
     * @return Returns the String
     */
    @JsonGetter("card_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardType() {
        return cardType;
    }

    /**
     * Getter for PrepaidType.
     * Indicates a card's prepaid type, such as `NOT_PREPAID` or `PREPAID`.
     * @return Returns the String
     */
    @JsonGetter("prepaid_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrepaidType() {
        return prepaidType;
    }

    /**
     * Getter for Bin.
     * The first six digits of the card number, known as the Bank Identification Number (BIN). Only
     * the Payments API returns this field.
     * @return Returns the String
     */
    @JsonGetter("bin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBin() {
        return bin;
    }

    /**
     * Getter for Version.
     * Current version number of the card. Increments with each card update. Requests to update an
     * existing Card object will be rejected unless the version in the request matches the current
     * version for the Card.
     * @return Returns the Long
     */
    @JsonGetter("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getVersion() {
        return version;
    }

    /**
     * Getter for CardCoBrand.
     * Indicates the brand for a co-branded card.
     * @return Returns the String
     */
    @JsonGetter("card_co_brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardCoBrand() {
        return cardCoBrand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardBrand, last4, expMonth, expYear, cardholderName, billingAddress,
                fingerprint, customerId, merchantId, referenceId, enabled, cardType, prepaidType,
                bin, version, cardCoBrand);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card other = (Card) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(cardBrand, other.cardBrand)
            && Objects.equals(last4, other.last4)
            && Objects.equals(expMonth, other.expMonth)
            && Objects.equals(expYear, other.expYear)
            && Objects.equals(cardholderName, other.cardholderName)
            && Objects.equals(billingAddress, other.billingAddress)
            && Objects.equals(fingerprint, other.fingerprint)
            && Objects.equals(customerId, other.customerId)
            && Objects.equals(merchantId, other.merchantId)
            && Objects.equals(referenceId, other.referenceId)
            && Objects.equals(enabled, other.enabled)
            && Objects.equals(cardType, other.cardType)
            && Objects.equals(prepaidType, other.prepaidType)
            && Objects.equals(bin, other.bin)
            && Objects.equals(version, other.version)
            && Objects.equals(cardCoBrand, other.cardCoBrand);
    }

    /**
     * Converts this Card into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Card [" + "id=" + id + ", cardBrand=" + cardBrand + ", last4=" + last4
                + ", expMonth=" + expMonth + ", expYear=" + expYear + ", cardholderName="
                + cardholderName + ", billingAddress=" + billingAddress + ", fingerprint="
                + fingerprint + ", customerId=" + customerId + ", merchantId=" + merchantId
                + ", referenceId=" + referenceId + ", enabled=" + enabled + ", cardType=" + cardType
                + ", prepaidType=" + prepaidType + ", bin=" + bin + ", version=" + version
                + ", cardCoBrand=" + cardCoBrand + "]";
    }

    /**
     * Builds a new {@link Card.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Card.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .cardBrand(getCardBrand())
                .last4(getLast4())
                .expMonth(getExpMonth())
                .expYear(getExpYear())
                .cardholderName(getCardholderName())
                .billingAddress(getBillingAddress())
                .fingerprint(getFingerprint())
                .customerId(getCustomerId())
                .merchantId(getMerchantId())
                .referenceId(getReferenceId())
                .enabled(getEnabled())
                .cardType(getCardType())
                .prepaidType(getPrepaidType())
                .bin(getBin())
                .version(getVersion())
                .cardCoBrand(getCardCoBrand());
        return builder;
    }

    /**
     * Class to build instances of {@link Card}.
     */
    public static class Builder {
        private String id;
        private String cardBrand;
        private String last4;
        private Long expMonth;
        private Long expYear;
        private String cardholderName;
        private Address billingAddress;
        private String fingerprint;
        private String customerId;
        private String merchantId;
        private String referenceId;
        private Boolean enabled;
        private String cardType;
        private String prepaidType;
        private String bin;
        private Long version;
        private String cardCoBrand;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for cardBrand.
         * @param  cardBrand  String value for cardBrand.
         * @return Builder
         */
        public Builder cardBrand(String cardBrand) {
            this.cardBrand = cardBrand;
            return this;
        }

        /**
         * Setter for last4.
         * @param  last4  String value for last4.
         * @return Builder
         */
        public Builder last4(String last4) {
            this.last4 = last4;
            return this;
        }

        /**
         * Setter for expMonth.
         * @param  expMonth  Long value for expMonth.
         * @return Builder
         */
        public Builder expMonth(Long expMonth) {
            this.expMonth = expMonth;
            return this;
        }

        /**
         * Setter for expYear.
         * @param  expYear  Long value for expYear.
         * @return Builder
         */
        public Builder expYear(Long expYear) {
            this.expYear = expYear;
            return this;
        }

        /**
         * Setter for cardholderName.
         * @param  cardholderName  String value for cardholderName.
         * @return Builder
         */
        public Builder cardholderName(String cardholderName) {
            this.cardholderName = cardholderName;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  Address value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(Address billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for fingerprint.
         * @param  fingerprint  String value for fingerprint.
         * @return Builder
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for merchantId.
         * @param  merchantId  String value for merchantId.
         * @return Builder
         */
        public Builder merchantId(String merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        /**
         * Setter for referenceId.
         * @param  referenceId  String value for referenceId.
         * @return Builder
         */
        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for cardType.
         * @param  cardType  String value for cardType.
         * @return Builder
         */
        public Builder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Setter for prepaidType.
         * @param  prepaidType  String value for prepaidType.
         * @return Builder
         */
        public Builder prepaidType(String prepaidType) {
            this.prepaidType = prepaidType;
            return this;
        }

        /**
         * Setter for bin.
         * @param  bin  String value for bin.
         * @return Builder
         */
        public Builder bin(String bin) {
            this.bin = bin;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  Long value for version.
         * @return Builder
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        /**
         * Setter for cardCoBrand.
         * @param  cardCoBrand  String value for cardCoBrand.
         * @return Builder
         */
        public Builder cardCoBrand(String cardCoBrand) {
            this.cardCoBrand = cardCoBrand;
            return this;
        }

        /**
         * Builds a new {@link Card} object using the set fields.
         * @return {@link Card}
         */
        public Card build() {
            return new Card(id, cardBrand, last4, expMonth, expYear, cardholderName, billingAddress,
                    fingerprint, customerId, merchantId, referenceId, enabled, cardType,
                    prepaidType, bin, version, cardCoBrand);
        }
    }
}
