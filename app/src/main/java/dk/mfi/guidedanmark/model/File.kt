package dk.mfi.guidedanmark.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

data class File(
    val AltText: Any,
    val Copyright: Any,
    val Description: Any,
    val FileType: String,
    val Id: Int,
    val MetaTag: Any,
    val Name: String,
    val Photographer: Any,
    val Uri: String
)