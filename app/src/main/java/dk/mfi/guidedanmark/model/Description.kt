package dk.mfi.guidedanmark.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Description(
    val DescriptionType: String,
    val DescriptionTypeID: Int,
    val Html: String,
    val Text: String
)