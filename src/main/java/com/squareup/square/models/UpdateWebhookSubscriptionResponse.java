
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.square.http.client.HttpContext;
import io.apimatic.core.types.BaseModel;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for UpdateWebhookSubscriptionResponse type.
 */
public class UpdateWebhookSubscriptionResponse {
    private HttpContext httpContext;
    private final List<Error> errors;
    private final WebhookSubscription subscription;

    /**
     * Initialization constructor.
     * @param  errors  List of Error value for errors.
     * @param  subscription  WebhookSubscription value for subscription.
     */
    @JsonCreator
    public UpdateWebhookSubscriptionResponse(
            @JsonProperty("errors") List<Error> errors,
            @JsonProperty("subscription") WebhookSubscription subscription) {
        this.errors = errors;
        this.subscription = subscription;
    }

    @JsonIgnore
    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Errors.
     * Information on errors encountered during the request.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * Getter for Subscription.
     * Represents the details of a webhook subscription, including notification URL, event types,
     * and signature key.
     * @return Returns the WebhookSubscription
     */
    @JsonGetter("subscription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WebhookSubscription getSubscription() {
        return subscription;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, subscription);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateWebhookSubscriptionResponse)) {
            return false;
        }
        UpdateWebhookSubscriptionResponse other = (UpdateWebhookSubscriptionResponse) obj;
        return Objects.equals(errors, other.errors)
            && Objects.equals(subscription, other.subscription);
    }

    /**
     * Converts this UpdateWebhookSubscriptionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateWebhookSubscriptionResponse [" + "errors=" + errors + ", subscription="
                + subscription + "]";
    }

    /**
     * Builds a new {@link UpdateWebhookSubscriptionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateWebhookSubscriptionResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errors(getErrors())
                .subscription(getSubscription());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateWebhookSubscriptionResponse}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;
        private WebhookSubscription subscription;



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
         * @param  subscription  WebhookSubscription value for subscription.
         * @return Builder
         */
        public Builder subscription(WebhookSubscription subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Builds a new {@link UpdateWebhookSubscriptionResponse} object using the set fields.
         * @return {@link UpdateWebhookSubscriptionResponse}
         */
        public UpdateWebhookSubscriptionResponse build() {
            UpdateWebhookSubscriptionResponse model =
                    new UpdateWebhookSubscriptionResponse(errors, subscription);
            model.httpContext = httpContext;
            return model;
        }
    }
}
