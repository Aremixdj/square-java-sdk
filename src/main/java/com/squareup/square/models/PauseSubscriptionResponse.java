
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.square.http.client.HttpContext;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for PauseSubscriptionResponse type.
 */
public class PauseSubscriptionResponse {
    private HttpContext httpContext;
    private final List<Error> errors;
    private final Subscription subscription;
    private final List<SubscriptionAction> actions;

    /**
     * Initialization constructor.
     * @param  errors  List of Error value for errors.
     * @param  subscription  Subscription value for subscription.
     * @param  actions  List of SubscriptionAction value for actions.
     */
    @JsonCreator
    public PauseSubscriptionResponse(
            @JsonProperty("errors") List<Error> errors,
            @JsonProperty("subscription") Subscription subscription,
            @JsonProperty("actions") List<SubscriptionAction> actions) {
        this.errors = errors;
        this.subscription = subscription;
        this.actions = actions;
    }

    @JsonIgnore
    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Errors.
     * Errors encountered during the request.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * Getter for Subscription.
     * Represents a subscription purchased by a customer. For more information, see [Manage
     * Subscriptions](https://developer.squareup.com/docs/subscriptions-api/manage-subscriptions).
     * @return Returns the Subscription
     */
    @JsonGetter("subscription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Getter for Actions.
     * The list of a `PAUSE` action and a possible `RESUME` action created by the request.
     * @return Returns the List of SubscriptionAction
     */
    @JsonGetter("actions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SubscriptionAction> getActions() {
        return actions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, subscription, actions);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PauseSubscriptionResponse)) {
            return false;
        }
        PauseSubscriptionResponse other = (PauseSubscriptionResponse) obj;
        return Objects.equals(errors, other.errors)
            && Objects.equals(subscription, other.subscription)
            && Objects.equals(actions, other.actions);
    }

    /**
     * Converts this PauseSubscriptionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PauseSubscriptionResponse [" + "errors=" + errors + ", subscription=" + subscription
                + ", actions=" + actions + "]";
    }

    /**
     * Builds a new {@link PauseSubscriptionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PauseSubscriptionResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errors(getErrors())
                .subscription(getSubscription())
                .actions(getActions());
        return builder;
    }

    /**
     * Class to build instances of {@link PauseSubscriptionResponse}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;
        private Subscription subscription;
        private List<SubscriptionAction> actions;



        /**
         * Setter for httpContext.
         * @param  httpContext  HttpContext value for httpContext.
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  List of Error value for errors.
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Setter for subscription.
         * @param  subscription  Subscription value for subscription.
         * @return Builder
         */
        public Builder subscription(Subscription subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Setter for actions.
         * @param  actions  List of SubscriptionAction value for actions.
         * @return Builder
         */
        public Builder actions(List<SubscriptionAction> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * Builds a new {@link PauseSubscriptionResponse} object using the set fields.
         * @return {@link PauseSubscriptionResponse}
         */
        public PauseSubscriptionResponse build() {
            PauseSubscriptionResponse model =
                    new PauseSubscriptionResponse(errors, subscription, actions);
            model.httpContext = httpContext;
            return model;
        }
    }
}
