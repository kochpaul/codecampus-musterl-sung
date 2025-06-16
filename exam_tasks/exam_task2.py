
def calculate_sum(values: list[int] | None) -> int:
    """Return the sum of all numbers in values.
    If the list is None or empty, return 0."""
    if not values:
        return 0
    return sum(values)

