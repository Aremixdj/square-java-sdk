
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
 * This is a model class for RetrieveGiftCardFromGANResponse type.
 */
public class RetrieveGiftCardFromGANResponse {
    private HttpContext httpContext;
    private final List<Error> errors;
    private final GiftCard giftCard;

    /**
     * Initialization constructor.
     * @param  errors  List of Error value for errors.
     * @param  giftCard  GiftCard value for giftCard.
     */
    @JsonCreator
    public RetrieveGiftCardFromGANResponse(
            @JsonProperty("errors") List<Error> errors,
            @JsonProperty("gift_card") GiftCard giftCard) {
        this.errors = errors;
        this.giftCard = giftCard;
    }

    @JsonIgnore
    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Errors.
     * Any errors that occurred during the request.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * Getter for GiftCard.
     * Represents a Square gift card.
     * @return Returns the GiftCard
     */
    @JsonGetter("gift_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GiftCard getGiftCard() {
        return giftCard;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, giftCard);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrieveGiftCardFromGANResponse)) {
            return false;
        }
        RetrieveGiftCardFromGANResponse other = (RetrieveGiftCardFromGANResponse) obj;
        return Objects.equals(errors, other.errors)
            && Objects.equals(giftCard, other.giftCard);
    }

    /**
     * Converts this RetrieveGiftCardFromGANResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RetrieveGiftCardFromGANResponse [" + "errors=" + errors + ", giftCard=" + giftCard
                + "]";
    }

    /**
     * Builds a new {@link RetrieveGiftCardFromGANResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RetrieveGiftCardFromGANResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errors(getErrors())
                .giftCard(getGiftCard());
        return builder;
    }

    /**
     * Class to build instances of {@link RetrieveGiftCardFromGANResponse}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;
        private GiftCard giftCard;



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
         * Setter for giftCard.
         * @param  giftCard  GiftCard value for giftCard.
         * @return Builder
         */
        public Builder giftCard(GiftCard giftCard) {
            this.giftCard = giftCard;
            return this;
        }

        /**
         * Builds a new {@link RetrieveGiftCardFromGANResponse} object using the set fields.
         * @return {@link RetrieveGiftCardFromGANResponse}
         */
        public RetrieveGiftCardFromGANResponse build() {
            RetrieveGiftCardFromGANResponse model =
                    new RetrieveGiftCardFromGANResponse(errors, giftCard);
            model.httpContext = httpContext;
            return model;
        }
    }
}
