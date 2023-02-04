package strategy

enum class ActionStrategy(val action: String) {
    CITY_CENTER("to_the_city_center"),
    ANOTHER_CITY("to_another_city"),
    NEARBY_STREET("on_nearby_street"),
    SIDE_OF_CITY("other_side_of_city")
}