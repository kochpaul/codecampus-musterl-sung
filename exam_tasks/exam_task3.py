
def is_prime(number: int) -> bool:
    """Return True if number is prime."""
    if number <= 1:
        return False
    if number == 2:
        return True
    if number % 2 == 0:
        return False
    for i in range(3, number):
        if number % i == 0:
            return False
    return True

