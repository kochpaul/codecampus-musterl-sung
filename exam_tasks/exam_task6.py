
def get_count_of_most_used_character(text: str | None) -> int:
    """Return count of the most frequent character in text."""
    if not text:
        return 0
    max_count = 0
    for ch in text:
        count = text.count(ch)
        if count > max_count:
            max_count = count
    return max_count

