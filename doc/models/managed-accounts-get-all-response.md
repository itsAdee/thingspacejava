
# Managed Accounts Get All Response

## Structure

`ManagedAccountsGetAllResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | Account Name | String getAccountName() | setAccountName(String accountName) |
| `ManagedAccAddedList` | [`List<ManagedAccAddedList>`](../../doc/models/managed-acc-added-list.md) | Optional | - | List<ManagedAccAddedList> getManagedAccAddedList() | setManagedAccAddedList(List<ManagedAccAddedList> managedAccAddedList) |
| `ManagedAccProvisionedList` | [`List<ManagedAccProvisionedList>`](../../doc/models/managed-acc-provisioned-list.md) | Optional | - | List<ManagedAccProvisionedList> getManagedAccProvisionedList() | setManagedAccProvisionedList(List<ManagedAccProvisionedList> managedAccProvisionedList) |

## Example (as JSON)

```json
{
  "accountName": "0212312345-00001",
  "ManagedAccAddedList": [
    {
      "id": "id6",
      "txid": "txid6"
    }
  ],
  "managedAccProvisionedList": [
    {
      "id": "id2",
      "txid": "txid0"
    }
  ]
}
```

