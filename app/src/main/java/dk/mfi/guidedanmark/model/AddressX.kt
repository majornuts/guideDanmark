package dk.mfi.guidedanmark.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

data class AddressX(
    val AddressLine1: String,
    val AddressLine2: Any,
    val City: String,
    val GeoCoordinate: GeoCoordinate,
    val Municipality: Municipality,
    val PostalCode: String,
    val Region: Any
)