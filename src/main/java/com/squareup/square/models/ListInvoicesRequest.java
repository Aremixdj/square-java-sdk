
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.apimatic.core.types.BaseModel;
import java.util.Objects;

/**
 * This is a model class for ListInvoicesRequest type.
 */
public class ListInvoicesRequest {
    private final String locationId;
    private final String cursor;
    private final Integer limit;

    /**
     * Initialization constructor.
     * @param  locationId  String value for locationId.
     * @param  cursor  String value for cursor.
     * @param  limit  Integer value for limit.
     */
    @JsonCreator
    public ListInvoicesRequest(
            @JsonProperty("location_id") String locationId,
            @JsonProperty("cursor") String cursor,
            @JsonProperty("limit") Integer limit) {
        this.locationId = locationId;
        this.cursor = cursor;
        this.limit = limit;
    }

    /**
     * Getter for LocationId.
     * The ID of the location for which to list invoices.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    public String getLocationId() {
        return locationId;
    }

    /**
     * Getter for Cursor.
     * A pagination cursor returned by a previous call to this endpoint. Provide this cursor to
     * retrieve the next set of results for your original query. For more information, see
     * [Pagination](https://developer.squareup.com/docs/working-with-apis/pagination).
     * @return Returns the String
     */
    @JsonGetter("cursor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCursor() {
        return cursor;
    }

    /**
     * Getter for Limit.
     * The maximum number of invoices to return (200 is the maximum `limit`). If not provided, the
     * server uses a default limit of 100 invoices.
     * @return Returns the Integer
     */
    @JsonGetter("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLimit() {
        return limit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, cursor, limit);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListInvoicesRequest)) {
            return false;
        }
        ListInvoicesRequest other = (ListInvoicesRequest) obj;
        return Objects.equals(locationId, other.locationId)
            && Objects.equals(cursor, other.cursor)
            && Objects.equals(limit, other.limit);
    }

    /**
     * Converts this ListInvoicesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListInvoicesRequest [" + "locationId=" + locationId + ", cursor=" + cursor
                + ", limit=" + limit + "]";
    }

    /**
     * Builds a new {@link ListInvoicesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListInvoicesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(locationId)
                .cursor(getCursor())
                .limit(getLimit());
        return builder;
    }

    /**
     * Class to build instances of {@link ListInvoicesRequest}.
     */
    public static class Builder {
        private String locationId;
        private String cursor;
        private Integer limit;

        /**
         * Initialization constructor.
         * @param  locationId  String value for locationId.
         */
        public Builder(String locationId) {
            this.locationId = locationId;
        }

        /**
         * Setter for locationId.
         * @param  locationId  String value for locationId.
         * @return Builder
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        /**
         * Setter for cursor.
         * @param  cursor  String value for cursor.
         * @return Builder
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * Setter for limit.
         * @param  limit  Integer value for limit.
         * @return Builder
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Builds a new {@link ListInvoicesRequest} object using the set fields.
         * @return {@link ListInvoicesRequest}
         */
        public ListInvoicesRequest build() {
            return new ListInvoicesRequest(locationId, cursor, limit);
        }
    }
}
