
# Customer Name

The customer name to be used for line usage taxation.

## Structure

`CustomerName`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | An optional title for the customer, such as “Mr.” or “Dr.” | String getTitle() | setTitle(String title) |
| `FirstName` | `String` | Required | The customer's first name. | String getFirstName() | setFirstName(String firstName) |
| `MiddleName` | `String` | Optional | The customer's middle name. | String getMiddleName() | setMiddleName(String middleName) |
| `LastName` | `String` | Required | The customer's last name. | String getLastName() | setLastName(String lastName) |
| `Suffix` | `String` | Optional | An optional suffix for the customer name, such as “Jr.” or “III.” | String getSuffix() | setSuffix(String suffix) |

## Example (as JSON)

```json
{
  "title": "President",
  "firstName": "Zaffod",
  "lastName": "Beeblebrox",
  "middleName": "middleName4",
  "suffix": "suffix4"
}
```

