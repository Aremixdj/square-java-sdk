
# List Payments Request

Describes a request to list payments using
[ListPayments](../../doc/api/payments.md#list-payments).

The maximum results per page is 100.

## Structure

`ListPaymentsRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `BeginTime` | `String` | Optional | Indicates the start of the time range to retrieve payments for, in RFC 3339 format.  <br>The range is determined using the `created_at` field for each Payment.<br>Inclusive. Default: The current time minus one year. | String getBeginTime() |
| `EndTime` | `String` | Optional | Indicates the end of the time range to retrieve payments for, in RFC 3339 format.  The<br>range is determined using the `created_at` field for each Payment.<br><br>Default: The current time. | String getEndTime() |
| `SortOrder` | `String` | Optional | The order in which results are listed by `Payment.created_at`:<br><br>- `ASC` - Oldest to newest.<br>- `DESC` - Newest to oldest (default). | String getSortOrder() |
| `Cursor` | `String` | Optional | A pagination cursor returned by a previous call to this endpoint.<br>Provide this cursor to retrieve the next set of results for the original query.<br><br>For more information, see [Pagination](https://developer.squareup.com/docs/build-basics/common-api-patterns/pagination). | String getCursor() |
| `LocationId` | `String` | Optional | Limit results to the location supplied. By default, results are returned<br>for the default (main) location associated with the seller. | String getLocationId() |
| `Total` | `Long` | Optional | The exact amount in the `total_money` for a payment. | Long getTotal() |
| `Last4` | `String` | Optional | The last four digits of a payment card. | String getLast4() |
| `CardBrand` | `String` | Optional | The brand of the payment card (for example, VISA). | String getCardBrand() |
| `Limit` | `Integer` | Optional | The maximum number of results to be returned in a single page.<br>It is possible to receive fewer results than the specified limit on a given page.<br><br>The default value of 100 is also the maximum allowed value. If the provided value is<br>greater than 100, it is ignored and the default value is used instead.<br><br>Default: `100` | Integer getLimit() |

## Example (as JSON)

```json
{
  "begin_time": "begin_time2",
  "end_time": "end_time2",
  "sort_order": "sort_order0",
  "cursor": "cursor6",
  "location_id": "location_id4"
}
```

