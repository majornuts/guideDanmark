package dk.mfi.guidedanmark.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ContactInformation(
    val Email: String,
    val Fax: String,
    val Link: Link,
    val Mobile: Any,
    val Phone: String
)