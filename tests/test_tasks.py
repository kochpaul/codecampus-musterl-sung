import os, sys
sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), "..")))
import pytest

from exam_tasks import (
    exam_task1,
    exam_task2,
    exam_task3,
    exam_task4,
    exam_task5,
    exam_task6,
)

# ExamTask1

def test_are_both_true_both_true():
    assert exam_task1.are_both_true(True, True)

def test_are_both_true_mixed():
    assert not exam_task1.are_both_true(False, True)
    assert not exam_task1.are_both_true(True, False)
    assert not exam_task1.are_both_true(False, False)

# ExamTask2

def test_calculate_sum_null_or_empty():
    assert exam_task2.calculate_sum(None) == 0
    assert exam_task2.calculate_sum([]) == 0

def test_calculate_sum_values():
    assert exam_task2.calculate_sum([2, 3, -1]) == 4
    assert exam_task2.calculate_sum([5, 5, 5]) == 15

# ExamTask3

def test_is_prime_cases():
    assert not exam_task3.is_prime(-3)
    assert not exam_task3.is_prime(0)
    assert not exam_task3.is_prime(1)
    assert exam_task3.is_prime(2)
    assert exam_task3.is_prime(11)

# ExamTask4

def test_count_consonants():
    assert exam_task4.count_consonants(None) == 0
    assert exam_task4.count_consonants("") == 0
    assert exam_task4.count_consonants("abcc") == 3
    assert exam_task4.count_consonants("ccc") == 3
    assert exam_task4.count_consonants("xUz") == 2

# ExamTask5

def test_get_city():
    assert exam_task5.get_city('a') == "Aachen"
    assert exam_task5.get_city('b') == "Berlin"
    assert exam_task5.get_city('c') == "Chemnitz"
    assert exam_task5.get_city('d') == "Duisburg"
    assert exam_task5.get_city('A') is None
    assert exam_task5.get_city('x') is None

# ExamTask6

def test_get_count_of_most_used_character():
    assert exam_task6.get_count_of_most_used_character(None) == 0
    assert exam_task6.get_count_of_most_used_character("") == 0
    assert exam_task6.get_count_of_most_used_character("aaBBbbccDDeDDee") == 4
    assert exam_task6.get_count_of_most_used_character("abc") == 1
    assert exam_task6.get_count_of_most_used_character("aaaa") == 4
    assert exam_task6.get_count_of_most_used_character("aAbBcCdD") == 1

