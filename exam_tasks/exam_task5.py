
def get_city(ch: str) -> str | None:
    """Return a city name for given lower-case character."""
    match ch:
        case 'a':
            return "Aachen"
        case 'b':
            return "Berlin"
        case 'c':
            return "Chemnitz"
        case 'd':
            return "Duisburg"
        case _:
            return None

