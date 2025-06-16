
def count_consonants(text: str | None) -> int:
    """Return the number of consonants in text."""
    if not text:
        return 0
    vowels = set("aeiouAEIOU")
    return sum(1 for ch in text if ch.isalpha() and ch not in vowels)

