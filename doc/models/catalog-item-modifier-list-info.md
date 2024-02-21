
# Catalog Item Modifier List Info

References a text-based modifier or a list of non text-based modifiers applied to a `CatalogItem` instance
and specifies supported behaviors of the application.

## Structure

`CatalogItemModifierListInfo`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `ModifierListId` | `String` | Required | The ID of the `CatalogModifierList` controlled by this `CatalogModifierListInfo`.<br>**Constraints**: *Minimum Length*: `1` | String getModifierListId() |
| `ModifierOverrides` | [`List<CatalogModifierOverride>`](../../doc/models/catalog-modifier-override.md) | Optional | A set of `CatalogModifierOverride` objects that override whether a given `CatalogModifier` is enabled by default. | List<CatalogModifierOverride> getModifierOverrides() |
| `MinSelectedModifiers` | `Integer` | Optional | If 0 or larger, the smallest number of `CatalogModifier`s that must be selected from this `CatalogModifierList`. | Integer getMinSelectedModifiers() |
| `MaxSelectedModifiers` | `Integer` | Optional | If 0 or larger, the largest number of `CatalogModifier`s that can be selected from this `CatalogModifierList`. | Integer getMaxSelectedModifiers() |
| `Enabled` | `Boolean` | Optional | If `true`, enable this `CatalogModifierList`. The default value is `true`. | Boolean getEnabled() |
| `Ordinal` | `Integer` | Optional | The position of this `CatalogItemModifierListInfo` object within the `modifier_list_info` list applied<br>to a `CatalogItem` instance. | Integer getOrdinal() |

## Example (as JSON)

```json
{
  "modifier_list_id": "modifier_list_id6",
  "modifier_overrides": [
    {
      "modifier_id": "modifier_id8",
      "on_by_default": false
    },
    {
      "modifier_id": "modifier_id8",
      "on_by_default": false
    }
  ],
  "min_selected_modifiers": 170,
  "max_selected_modifiers": 66,
  "enabled": false,
  "ordinal": 204
}
```

