
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for ListMerchantsRequest type.
 */
public class ListMerchantsRequest {
    private final Integer cursor;

    /**
     * Initialization constructor.
     * @param cursor Integer value for cursor.
     */
    @JsonCreator
    public ListMerchantsRequest(
            @JsonProperty("cursor") Integer cursor) {
        this.cursor = cursor;
    }

    /**
     * Getter for Cursor.
     * The cursor generated by the previous response.
     * @return Returns the Integer
     */
    @JsonGetter("cursor")
    public Integer getCursor() {
        return this.cursor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListMerchantsRequest)) {
            return false;
        }
        ListMerchantsRequest other = (ListMerchantsRequest) obj;
        return Objects.equals(cursor, other.cursor);
    }

    /**
     * Converts this ListMerchantsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMerchantsRequest [" + "cursor=" + cursor + "]";
    }

    /**
     * Builds a new {@link ListMerchantsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMerchantsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cursor(getCursor());
        return builder;
    }

    /**
     * Class to build instances of {@link ListMerchantsRequest}.
     */
    public static class Builder {
        private Integer cursor;



        /**
         * Setter for cursor.
         * @param cursor Integer value for cursor.
         * @return Builder
         */
        public Builder cursor(Integer cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * Builds a new {@link ListMerchantsRequest} object using the set fields.
         * @return {@link ListMerchantsRequest}
         */
        public ListMerchantsRequest build() {
            return new ListMerchantsRequest(cursor);
        }
    }
}
