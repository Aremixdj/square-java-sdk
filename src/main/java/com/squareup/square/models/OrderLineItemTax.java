
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * This is a model class for OrderLineItemTax type.
 */
public class OrderLineItemTax {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String uid;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String catalogObjectId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Long catalogVersion;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String percentage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Map<String, String> metadata;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Money appliedMoney;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String scope;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Boolean autoApplied;

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  catalogObjectId  String value for catalogObjectId.
     * @param  catalogVersion  Long value for catalogVersion.
     * @param  name  String value for name.
     * @param  type  String value for type.
     * @param  percentage  String value for percentage.
     * @param  metadata  Map of String, value for metadata.
     * @param  appliedMoney  Money value for appliedMoney.
     * @param  scope  String value for scope.
     * @param  autoApplied  Boolean value for autoApplied.
     */
    @JsonCreator
    public OrderLineItemTax(
            @JsonProperty("uid") String uid,
            @JsonProperty("catalog_object_id") String catalogObjectId,
            @JsonProperty("catalog_version") Long catalogVersion,
            @JsonProperty("name") String name,
            @JsonProperty("type") String type,
            @JsonProperty("percentage") String percentage,
            @JsonProperty("metadata") Map<String, String> metadata,
            @JsonProperty("applied_money") Money appliedMoney,
            @JsonProperty("scope") String scope,
            @JsonProperty("auto_applied") Boolean autoApplied) {
        this.uid = uid;
        this.catalogObjectId = catalogObjectId;
        this.catalogVersion = catalogVersion;
        this.name = name;
        this.type = type;
        this.percentage = percentage;
        this.metadata = metadata;
        this.appliedMoney = appliedMoney;
        this.scope = scope;
        this.autoApplied = autoApplied;
    }

    /**
     * Getter for Uid.
     * A unique ID that identifies the tax only within this order.
     * @return Returns the String
     */
    @JsonGetter("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Getter for CatalogObjectId.
     * The catalog object ID referencing [CatalogTax]($m/CatalogTax).
     * @return Returns the String
     */
    @JsonGetter("catalog_object_id")
    public String getCatalogObjectId() {
        return catalogObjectId;
    }

    /**
     * Getter for CatalogVersion.
     * The version of the catalog object that this tax references.
     * @return Returns the Long
     */
    @JsonGetter("catalog_version")
    public Long getCatalogVersion() {
        return catalogVersion;
    }

    /**
     * Getter for Name.
     * The tax's name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Getter for Type.
     * Indicates how the tax is applied to the associated line item or order.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Getter for Percentage.
     * The percentage of the tax, as a string representation of a decimal number. For example, a
     * value of `"7.25"` corresponds to a percentage of 7.25%.
     * @return Returns the String
     */
    @JsonGetter("percentage")
    public String getPercentage() {
        return percentage;
    }

    /**
     * Getter for Metadata.
     * Application-defined data attached to this tax. Metadata fields are intended to store
     * descriptive references or associations with an entity in another system or store brief
     * information about the object. Square does not process this field; it only stores and returns
     * it in relevant API calls. Do not use metadata to store any sensitive information (such as
     * personally identifiable information or card details). Keys written by applications must be 60
     * characters or less and must be in the character set `[a-zA-Z0-9_-]`. Entries can also include
     * metadata generated by Square. These keys are prefixed with a namespace, separated from the
     * key with a ':' character. Values have a maximum length of 255 characters. An application can
     * have up to 10 entries per metadata field. Entries written by applications are private and can
     * only be read or modified by the same application. For more information, see
     * [Metadata](https://developer.squareup.com/docs/build-basics/metadata).
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Getter for AppliedMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("applied_money")
    public Money getAppliedMoney() {
        return appliedMoney;
    }

    /**
     * Getter for Scope.
     * Indicates whether this is a line-item or order-level tax.
     * @return Returns the String
     */
    @JsonGetter("scope")
    public String getScope() {
        return scope;
    }

    /**
     * Getter for AutoApplied.
     * Determines whether the tax was automatically applied to the order based on the catalog
     * configuration. For an example, see [Automatically Apply Taxes to an
     * Order](https://developer.squareup.com/docs/orders-api/apply-taxes-and-discounts/auto-apply-taxes).
     * @return Returns the Boolean
     */
    @JsonGetter("auto_applied")
    public Boolean getAutoApplied() {
        return autoApplied;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, catalogObjectId, catalogVersion, name, type, percentage, metadata,
                appliedMoney, scope, autoApplied);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderLineItemTax)) {
            return false;
        }
        OrderLineItemTax other = (OrderLineItemTax) obj;
        return Objects.equals(uid, other.uid)
            && Objects.equals(catalogObjectId, other.catalogObjectId)
            && Objects.equals(catalogVersion, other.catalogVersion)
            && Objects.equals(name, other.name)
            && Objects.equals(type, other.type)
            && Objects.equals(percentage, other.percentage)
            && Objects.equals(metadata, other.metadata)
            && Objects.equals(appliedMoney, other.appliedMoney)
            && Objects.equals(scope, other.scope)
            && Objects.equals(autoApplied, other.autoApplied);
    }

    /**
     * Converts this OrderLineItemTax into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderLineItemTax [" + "uid=" + uid + ", catalogObjectId=" + catalogObjectId
                + ", catalogVersion=" + catalogVersion + ", name=" + name + ", type=" + type
                + ", percentage=" + percentage + ", metadata=" + metadata + ", appliedMoney="
                + appliedMoney + ", scope=" + scope + ", autoApplied=" + autoApplied + "]";
    }

    /**
     * Builds a new {@link OrderLineItemTax.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderLineItemTax.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .catalogObjectId(getCatalogObjectId())
                .catalogVersion(getCatalogVersion())
                .name(getName())
                .type(getType())
                .percentage(getPercentage())
                .metadata(getMetadata())
                .appliedMoney(getAppliedMoney())
                .scope(getScope())
                .autoApplied(getAutoApplied());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderLineItemTax}.
     */
    public static class Builder {
        private String uid;
        private String catalogObjectId;
        private Long catalogVersion;
        private String name;
        private String type;
        private String percentage;
        private Map<String, String> metadata;
        private Money appliedMoney;
        private String scope;
        private Boolean autoApplied;



        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for catalogObjectId.
         * @param  catalogObjectId  String value for catalogObjectId.
         * @return Builder
         */
        public Builder catalogObjectId(String catalogObjectId) {
            this.catalogObjectId = catalogObjectId;
            return this;
        }

        /**
         * Setter for catalogVersion.
         * @param  catalogVersion  Long value for catalogVersion.
         * @return Builder
         */
        public Builder catalogVersion(Long catalogVersion) {
            this.catalogVersion = catalogVersion;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  String value for percentage.
         * @return Builder
         */
        public Builder percentage(String percentage) {
            this.percentage = percentage;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for appliedMoney.
         * @param  appliedMoney  Money value for appliedMoney.
         * @return Builder
         */
        public Builder appliedMoney(Money appliedMoney) {
            this.appliedMoney = appliedMoney;
            return this;
        }

        /**
         * Setter for scope.
         * @param  scope  String value for scope.
         * @return Builder
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Setter for autoApplied.
         * @param  autoApplied  Boolean value for autoApplied.
         * @return Builder
         */
        public Builder autoApplied(Boolean autoApplied) {
            this.autoApplied = autoApplied;
            return this;
        }

        /**
         * Builds a new {@link OrderLineItemTax} object using the set fields.
         * @return {@link OrderLineItemTax}
         */
        public OrderLineItemTax build() {
            return new OrderLineItemTax(uid, catalogObjectId, catalogVersion, name, type,
                    percentage, metadata, appliedMoney, scope, autoApplied);
        }
    }
}
