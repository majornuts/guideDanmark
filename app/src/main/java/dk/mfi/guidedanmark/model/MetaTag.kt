package dk.mfi.guidedanmark.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MetaTag(
    val Comment: Any,
    val Id: Int,
    val MetaTagGroup: MetaTagGroup,
    val Name: String
)