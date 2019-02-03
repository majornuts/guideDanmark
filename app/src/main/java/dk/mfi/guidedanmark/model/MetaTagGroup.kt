package dk.mfi.guidedanmark.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MetaTagGroup(
    val CanonicalName: String,
    val CategoryId: Int,
    val Id: Int,
    val Name: String,
    val ShowOnWeb: Boolean,
    val UseInSearch: Boolean
)