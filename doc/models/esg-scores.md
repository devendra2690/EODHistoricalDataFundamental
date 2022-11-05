
# ESG Scores

## Structure

`ESGScores`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Disclaimer` | `String` | Required | - | String getDisclaimer() | setDisclaimer(String disclaimer) |
| `RatingDate` | `String` | Required | - | String getRatingDate() | setRatingDate(String ratingDate) |
| `TotalEsg` | `double` | Required | - | double getTotalEsg() | setTotalEsg(double totalEsg) |
| `TotalEsgPercentile` | `double` | Required | - | double getTotalEsgPercentile() | setTotalEsgPercentile(double totalEsgPercentile) |
| `EnvironmentScore` | `double` | Required | - | double getEnvironmentScore() | setEnvironmentScore(double environmentScore) |
| `EnvironmentScorePercentile` | `int` | Required | - | int getEnvironmentScorePercentile() | setEnvironmentScorePercentile(int environmentScorePercentile) |
| `SocialScore` | `double` | Required | - | double getSocialScore() | setSocialScore(double socialScore) |
| `SocialScorePercentile` | `int` | Required | - | int getSocialScorePercentile() | setSocialScorePercentile(int socialScorePercentile) |
| `GovernanceScore` | `double` | Required | - | double getGovernanceScore() | setGovernanceScore(double governanceScore) |
| `GovernanceScorePercentile` | `int` | Required | - | int getGovernanceScorePercentile() | setGovernanceScorePercentile(int governanceScorePercentile) |
| `ControversyLevel` | `int` | Required | - | int getControversyLevel() | setControversyLevel(int controversyLevel) |
| `ActivitiesInvolvement` | [`Map<String, GeneratedObject9>`](../../doc/models/generated-object-9.md) | Required | - | Map<String, GeneratedObject9> getActivitiesInvolvement() | setActivitiesInvolvement(Map<String, GeneratedObject9> activitiesInvolvement) |

## Example (as JSON)

```json
{
  "Disclaimer": "The ESG data currently in a very early Beta stage and not intended for any production use. It will be removed from the feed on December 31, 2020.",
  "RatingDate": "2019-01-01",
  "TotalEsg": 26.15,
  "TotalEsgPercentile": 36.8,
  "EnvironmentScore": 0.99,
  "EnvironmentScorePercentile": 5,
  "SocialScore": 13.98,
  "SocialScorePercentile": 5,
  "GovernanceScore": 11.18,
  "GovernanceScorePercentile": 5,
  "ControversyLevel": 3,
  "ActivitiesInvolvement": {
    "0": {
      "Activity": "adult",
      "Involvement": "No"
    },
    "1": {
      "Activity": "alcoholic",
      "Involvement": "No"
    }
  }
}
```

