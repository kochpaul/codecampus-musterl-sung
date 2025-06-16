# Musterlösung "E-Assessment Plattform" – Python Version

Diese Variante zeigt, wie die vorliegende Musterlösung komplett mit Python umgesetzt werden kann. Die Java-Klassen aus der Originalvorlage wurden durch einfache Python‑Funktionen ersetzt und mit `pytest` getestet.

## Projektaufbau

- **`exam_tasks/`** – Enthält die sechs Beispielaufgaben `exam_task1` bis `exam_task6`. Jede Datei stellt eine Funktion bereit, die von den Tests aufgerufen wird. Ein kurzer Ausschnitt aus `exam_task1.py`:

```python
def are_both_true(param1: bool, param2: bool) -> bool:
    return param1 and param2
```

- **`tests/`** – `pytest`‑Tests, die das Verhalten der Funktionen überprüfen. Die Datei `test_tasks.py` enthält direkt umgesetzte Testfälle der ursprünglichen JUnit‑Tests.
- **`requirements.txt`** (optional) – Falls zusätzliche Bibliotheken benötigt werden, können sie hier eingetragen und mit `pip install -r requirements.txt` installiert werden.

## Testausführung

Der Testlauf erfolgt mit `pytest`. Innerhalb dieses Containers können die Tests wie folgt gestartet werden:

```bash
pytest -q
```

`pytest` gibt die Ergebnisse für jede Aufgabe aus. Eine Erweiterung könnte die Resultate in eine JSON‑Datei schreiben, ähnlich wie es die Java‑Version mit `UniGraderTestResultExtension` macht.

## Packaging

Zum Verpacken der Aufgaben und Tests kann einfach ein ZIP‑Archiv erstellt werden, z.B. mittels `zip` oder einem kurzen Python‑Skript. Eine aufwändige Build‑Umgebung wie Maven ist hierfür nicht erforderlich.

Diese Python‑Umsetzung behält den Gedanken der automatisierten Bewertung bei, ist jedoch schlanker und leichter auf andere Sprachen übertragbar.

