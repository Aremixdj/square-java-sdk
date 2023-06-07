
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for CatalogSubscriptionPlanVariation type.
 */
public class CatalogSubscriptionPlanVariation {
    private final String name;
    private final List<SubscriptionPhase> phases;
    private final OptionalNullable<String> subscriptionPlanId;

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  phases  List of SubscriptionPhase value for phases.
     * @param  subscriptionPlanId  String value for subscriptionPlanId.
     */
    @JsonCreator
    public CatalogSubscriptionPlanVariation(
            @JsonProperty("name") String name,
            @JsonProperty("phases") List<SubscriptionPhase> phases,
            @JsonProperty("subscription_plan_id") String subscriptionPlanId) {
        this.name = name;
        this.phases = phases;
        this.subscriptionPlanId = OptionalNullable.of(subscriptionPlanId);
    }

    /**
     * Internal initialization constructor.
     */
    protected CatalogSubscriptionPlanVariation(String name, List<SubscriptionPhase> phases,
            OptionalNullable<String> subscriptionPlanId) {
        this.name = name;
        this.phases = phases;
        this.subscriptionPlanId = subscriptionPlanId;
    }

    /**
     * Getter for Name.
     * The name of the plan variation.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Getter for Phases.
     * A list containing each [SubscriptionPhase](entity:SubscriptionPhase) for this plan variation.
     * @return Returns the List of SubscriptionPhase
     */
    @JsonGetter("phases")
    public List<SubscriptionPhase> getPhases() {
        return phases;
    }

    /**
     * Internal Getter for SubscriptionPlanId.
     * The id of the subscription plan, if there is one.
     * @return Returns the Internal String
     */
    @JsonGetter("subscription_plan_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSubscriptionPlanId() {
        return this.subscriptionPlanId;
    }

    /**
     * Getter for SubscriptionPlanId.
     * The id of the subscription plan, if there is one.
     * @return Returns the String
     */
    @JsonIgnore
    public String getSubscriptionPlanId() {
        return OptionalNullable.getFrom(subscriptionPlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phases, subscriptionPlanId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatalogSubscriptionPlanVariation)) {
            return false;
        }
        CatalogSubscriptionPlanVariation other = (CatalogSubscriptionPlanVariation) obj;
        return Objects.equals(name, other.name)
            && Objects.equals(phases, other.phases)
            && Objects.equals(subscriptionPlanId, other.subscriptionPlanId);
    }

    /**
     * Converts this CatalogSubscriptionPlanVariation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CatalogSubscriptionPlanVariation [" + "name=" + name + ", phases=" + phases
                + ", subscriptionPlanId=" + subscriptionPlanId + "]";
    }

    /**
     * Builds a new {@link CatalogSubscriptionPlanVariation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CatalogSubscriptionPlanVariation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, phases);
        builder.subscriptionPlanId = internalGetSubscriptionPlanId();
        return builder;
    }

    /**
     * Class to build instances of {@link CatalogSubscriptionPlanVariation}.
     */
    public static class Builder {
        private String name;
        private List<SubscriptionPhase> phases;
        private OptionalNullable<String> subscriptionPlanId;

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  phases  List of SubscriptionPhase value for phases.
         */
        public Builder(String name, List<SubscriptionPhase> phases) {
            this.name = name;
            this.phases = phases;
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
         * Setter for phases.
         * @param  phases  List of SubscriptionPhase value for phases.
         * @return Builder
         */
        public Builder phases(List<SubscriptionPhase> phases) {
            this.phases = phases;
            return this;
        }

        /**
         * Setter for subscriptionPlanId.
         * @param  subscriptionPlanId  String value for subscriptionPlanId.
         * @return Builder
         */
        public Builder subscriptionPlanId(String subscriptionPlanId) {
            this.subscriptionPlanId = OptionalNullable.of(subscriptionPlanId);
            return this;
        }

        /**
         * UnSetter for subscriptionPlanId.
         * @return Builder
         */
        public Builder unsetSubscriptionPlanId() {
            subscriptionPlanId = null;
            return this;
        }

        /**
         * Builds a new {@link CatalogSubscriptionPlanVariation} object using the set fields.
         * @return {@link CatalogSubscriptionPlanVariation}
         */
        public CatalogSubscriptionPlanVariation build() {
            return new CatalogSubscriptionPlanVariation(name, phases, subscriptionPlanId);
        }
    }
}
