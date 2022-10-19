
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
 * This is a model class for DeleteCustomerCustomAttributeResponse type.
 */
public class DeleteCustomerCustomAttributeResponse {
    private HttpContext httpContext;
    private final List<Error> errors;

    /**
     * Initialization constructor.
     * @param  errors  List of Error value for errors.
     */
    @JsonCreator
    public DeleteCustomerCustomAttributeResponse(
            @JsonProperty("errors") List<Error> errors) {
        this.errors = errors;
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

    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteCustomerCustomAttributeResponse)) {
            return false;
        }
        DeleteCustomerCustomAttributeResponse other = (DeleteCustomerCustomAttributeResponse) obj;
        return Objects.equals(errors, other.errors);
    }

    /**
     * Converts this DeleteCustomerCustomAttributeResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeleteCustomerCustomAttributeResponse [" + "errors=" + errors + "]";
    }

    /**
     * Builds a new {@link DeleteCustomerCustomAttributeResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeleteCustomerCustomAttributeResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errors(getErrors());
        return builder;
    }

    /**
     * Class to build instances of {@link DeleteCustomerCustomAttributeResponse}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;



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
         * Builds a new {@link DeleteCustomerCustomAttributeResponse} object using the set fields.
         * @return {@link DeleteCustomerCustomAttributeResponse}
         */
        public DeleteCustomerCustomAttributeResponse build() {
            DeleteCustomerCustomAttributeResponse model =
                    new DeleteCustomerCustomAttributeResponse(errors);
            model.httpContext = httpContext;
            return model;
        }
    }
}
