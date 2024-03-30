
# Bill Usage Request

Bill usage request.

## Structure

`BillUsageRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Account identifier. | String getAccountName() | setAccountName(String accountName) |
| `StartDate` | `String` | Required | Start date to search for billable usage, mm-dd-yyyy. | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Required | End date to search for billable usage, mm-dd-yyyy. | String getEndDate() | setEndDate(String endDate) |
| `UsageForAllAccounts` | `Boolean` | Optional | Request usage for single or multiple accounts. | Boolean getUsageForAllAccounts() | setUsageForAllAccounts(Boolean usageForAllAccounts) |

## Example (as JSON)

```json
{
  "accountName": "1234567890-00001",
  "startDate": "04-01-2018",
  "endDate": "04-30-2018",
  "usageForAllAccounts": true
}
```

