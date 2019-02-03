package dk.mfi.guidedanmark.model


data class Stamdata(
    val Address: Address,
    val BookingLinks: List<Any>,
    val CanonicalUrl: String,
    val Capacity: Any,
    val Category: Category,
    val ContactInformation: ContactInformation,
    val Created: String,
    val CreatedBy: Any,
    val Descriptions: List<Description>,
    val Distances: List<Any>,
    val ExternalLinks: List<Any>,
    val Files: List<File>,
    val Id: Int,
    val Language: String,
    val MainCategory: MainCategory,
    val MediaChannels: List<MediaChannel>,
    val MetaTags: List<MetaTag>,
    val Modified: String,
    val ModifiedBy: String,
    val Name: String,
    val Online: Boolean,
    val Owner: Owner,
    val Periods: List<Any>,
    val PeriodsLink: Any,
    val Places: List<Any>,
    val PriceGroups: List<Any>,
    val PriceGroupsLink: Any,
    val Priority: Int,
    val RelatedProducts: List<Any>,
    val Rooms: List<Any>,
    val Routes: List<Any>,
    val Serialized: String,
    val SocialMediaLinks: List<Any>
)