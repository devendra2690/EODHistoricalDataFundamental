
# General

## Structure

`General`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | - | String getCode() | setCode(String code) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Exchange` | `String` | Required | - | String getExchange() | setExchange(String exchange) |
| `CurrencyCode` | `String` | Required | - | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencyName` | `String` | Required | - | String getCurrencyName() | setCurrencyName(String currencyName) |
| `CurrencySymbol` | `String` | Required | - | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `CountryName` | `String` | Required | - | String getCountryName() | setCountryName(String countryName) |
| `CountryISO` | `String` | Required | - | String getCountryISO() | setCountryISO(String countryISO) |
| `ISIN` | `String` | Required | - | String getISIN() | setISIN(String iSIN) |
| `CUSIP` | `String` | Required | - | String getCUSIP() | setCUSIP(String cUSIP) |
| `CIK` | `String` | Required | - | String getCIK() | setCIK(String cIK) |
| `EmployerIdNumber` | `String` | Required | - | String getEmployerIdNumber() | setEmployerIdNumber(String employerIdNumber) |
| `FiscalYearEnd` | `String` | Required | - | String getFiscalYearEnd() | setFiscalYearEnd(String fiscalYearEnd) |
| `IPODate` | `String` | Required | - | String getIPODate() | setIPODate(String iPODate) |
| `InternationalDomestic` | `String` | Required | - | String getInternationalDomestic() | setInternationalDomestic(String internationalDomestic) |
| `Sector` | `String` | Required | - | String getSector() | setSector(String sector) |
| `Industry` | `String` | Required | - | String getIndustry() | setIndustry(String industry) |
| `GicSector` | `String` | Required | - | String getGicSector() | setGicSector(String gicSector) |
| `GicGroup` | `String` | Required | - | String getGicGroup() | setGicGroup(String gicGroup) |
| `GicIndustry` | `String` | Required | - | String getGicIndustry() | setGicIndustry(String gicIndustry) |
| `GicSubIndustry` | `String` | Required | - | String getGicSubIndustry() | setGicSubIndustry(String gicSubIndustry) |
| `HomeCategory` | `String` | Required | - | String getHomeCategory() | setHomeCategory(String homeCategory) |
| `IsDelisted` | `boolean` | Required | - | boolean getIsDelisted() | setIsDelisted(boolean isDelisted) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Address` | `String` | Required | - | String getAddress() | setAddress(String address) |
| `AddressData` | [`AddressData`](../../doc/models/address-data.md) | Required | - | AddressData getAddressData() | setAddressData(AddressData addressData) |
| `Listings` | [`Map<String, GeneratedObject>`](../../doc/models/generated-object.md) | Required | - | Map<String, GeneratedObject> getListings() | setListings(Map<String, GeneratedObject> listings) |
| `Officers` | [`Map<String, GeneratedObject1>`](../../doc/models/generated-object-1.md) | Required | - | Map<String, GeneratedObject1> getOfficers() | setOfficers(Map<String, GeneratedObject1> officers) |
| `Phone` | `String` | Required | - | String getPhone() | setPhone(String phone) |
| `WebURL` | `String` | Required | - | String getWebURL() | setWebURL(String webURL) |
| `LogoURL` | `String` | Required | - | String getLogoURL() | setLogoURL(String logoURL) |
| `FullTimeEmployees` | `int` | Required | - | int getFullTimeEmployees() | setFullTimeEmployees(int fullTimeEmployees) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |

## Example (as JSON)

```json
{
  "Code": "AAPL",
  "Type": "Common Stock",
  "Name": "Apple Inc",
  "Exchange": "NASDAQ",
  "CurrencyCode": "USD",
  "CurrencyName": "US Dollar",
  "CurrencySymbol": "$",
  "CountryName": "USA",
  "CountryISO": "US",
  "ISIN": "US0378331005",
  "CUSIP": "037833100",
  "CIK": "320193",
  "EmployerIdNumber": "94-2404110",
  "FiscalYearEnd": "September",
  "IPODate": "1980-12-12",
  "InternationalDomestic": "International/Domestic",
  "Sector": "Technology",
  "Industry": "Consumer Electronics",
  "GicSector": "Information Technology",
  "GicGroup": "Technology Hardware & Equipment",
  "GicIndustry": "Technology Hardware, Storage & Peripherals",
  "GicSubIndustry": "Technology Hardware, Storage & Peripherals",
  "HomeCategory": "Domestic",
  "IsDelisted": false,
  "Description": "Apple Inc. designs, manufactures, and markets smartphones, personal computers, tablets, wearables, and accessories worldwide. It also sells various related services. In addition, the company offers iPhone, a line of smartphones; Mac, a line of personal computers; iPad, a line of multi-purpose tablets; AirPods Max, an over-ear wireless headphone; and wearables, home, and accessories comprising AirPods, Apple TV, Apple Watch, Beats products, HomePod, and iPod touch. Further, it provides AppleCare support services; cloud services store services; and operates various platforms, including the App Store that allow customers to discover and download applications and digital content, such as books, music, video, games, and podcasts. Additionally, the company offers various services, such as Apple Arcade, a game subscription service; Apple Music, which offers users a curated listening experience with on-demand radio stations; Apple News+, a subscription news and magazine service; Apple TV+, which offers exclusive original content; Apple Card, a co-branded credit card; and Apple Pay, a cashless payment service, as well as licenses its intellectual property. The company serves consumers, and small and mid-sized businesses; and the education, enterprise, and government markets. It distributes third-party applications for its products through the App Store. The company also sells its products through its retail and online stores, and direct sales force; and third-party cellular network carriers, wholesalers, retailers, and resellers. Apple Inc. was incorporated in 1977 and is headquartered in Cupertino, California.",
  "Address": "One Apple Park Way, Cupertino, CA, United States, 95014",
  "AddressData": {
    "Street": "One Apple Park Way",
    "City": "Cupertino",
    "State": "CA",
    "Country": "United States",
    "ZIP": "95014"
  },
  "Listings": {
    "0": {
      "Code": "0R2V",
      "Exchange": "LSE",
      "Name": "Apple Inc."
    }
  },
  "Officers": {
    "0": {
      "Name": "Mr. Timothy D. Cook",
      "Title": "CEO & Director",
      "YearBorn": "1961"
    }
  },
  "Phone": "408 996 1010",
  "WebURL": "https://www.apple.com",
  "LogoURL": "/img/logos/US/aapl.png",
  "FullTimeEmployees": 154000,
  "UpdatedAt": "2022-08-01"
}
```

