
# V2 Change Campaign Dates Request

New dates and time windows.

## Structure

`V2ChangeCampaignDatesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartDate` | `LocalDate` | Required | Campaign start date. | LocalDate getStartDate() | setStartDate(LocalDate startDate) |
| `EndDate` | `LocalDate` | Required | Campaign end date. | LocalDate getEndDate() | setEndDate(LocalDate endDate) |
| `DownloadAfterDate` | `LocalDate` | Optional | Specifies starting date client should download package. If null, client will download as soon as possible. | LocalDate getDownloadAfterDate() | setDownloadAfterDate(LocalDate downloadAfterDate) |
| `DownloadTimeWindowList` | [`List<V2TimeWindow>`](../../doc/models/v2-time-window.md) | Optional | List of allowed download time windows. Removing of existing windows is not allowed. | List<V2TimeWindow> getDownloadTimeWindowList() | setDownloadTimeWindowList(List<V2TimeWindow> downloadTimeWindowList) |
| `InstallAfterDate` | `LocalDate` | Optional | Client will install package after date. If null, client will install as soon as possible. | LocalDate getInstallAfterDate() | setInstallAfterDate(LocalDate installAfterDate) |
| `InstallTimeWindowList` | [`List<V2TimeWindow>`](../../doc/models/v2-time-window.md) | Optional | List of allowed install time windows. Removing of existing windows is not allowed. | List<V2TimeWindow> getInstallTimeWindowList() | setInstallTimeWindowList(List<V2TimeWindow> installTimeWindowList) |

## Example (as JSON)

```json
{
  "startDate": "2020-08-21",
  "endDate": "2020-08-22",
  "downloadAfterDate": "2020-08-21",
  "downloadTimeWindowList": [
    {
      "startTime": 3,
      "endTime": 4
    }
  ],
  "installAfterDate": "2020-08-21",
  "installTimeWindowList": [
    {
      "startTime": 5,
      "endTime": 6
    }
  ]
}
```

