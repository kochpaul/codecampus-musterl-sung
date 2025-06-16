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
=======
# Musterlösung "E-Assessment Plattform"

Dieses Repository demonstriert eine einfache Vorlage für eine programmierbasierte E-Klausur. Die vorliegenden Dateien bilden eine Java-Umgebung, in der mehrere kleine Aufgaben gelöst und über Unit-Tests bewertet werden. Die Ergebnisse können über Maven-Profile zu verschiedenen Archiven (z.B. "blueprint" oder "submission") zusammengefasst werden.

## Projektaufbau

- **`pom.xml`** – Maven-Projektdatei mit allen Abhängigkeiten und Plugins. Unter anderem sind
  Profile definiert, um aus den Quellen eine Klausurversion (`make-exam`) oder eine Abgabe (`make-submission`) zu erzeugen. Die Tests werden mit JUnit 5 ausgeführt.
- **`src/main/java`** – Enthält die Musterimplementierungen der Aufgaben `ExamTask1` bis
  `ExamTask6`. Die Methoden sind bewusst einfach gehalten und sollen von den Studierenden implementiert oder ergänzt werden. Ein Beispiel (Ausschnitt aus `ExamTask1`):

```java
public static boolean areBothTrue(final boolean p_param1, final boolean p_param2) {
    return p_param1 && p_param2;
}
```

- **`src/test/java`** – Unit-Tests zur Bewertung der Aufgaben. Das JUnit-Testskript `ExamUnitTest` ruft die Methoden per Reflection auf und prüft unterschiedliche Eingabefälle. Der Testlauf wird um die Klasse `UniGraderTestResultExtension` erweitert, welche die Ergebnisse in eine JSON-Datei schreibt.
- **`src/assembly`** – Vorlagen für das Maven Assembly Plugin. Je nach Profil werden unterschiedliche Dateien in ZIP-Archive gepackt (z.B. nur die Quelldateien für die Abgabe).
- **`src/eclipse`** – Beispielhafte Run-Konfigurationen für die Eclipse IDE, um die o.g. Maven-Profile aufzurufen.
- **`__MACOSX`** – Enthält nur Meta-Dateien aus macOS und spielt für das Projekt selbst keine Rolle.

## Testlauf

Die Unit-Tests liegen im Paket `src/test/java`. Die Datei `junit-platform.properties` setzt ein Standard-Timeout von 30&nbsp;Sekunden je Test. Der Start des Testlaufs erfolgt üblicherweise über Maven:

```bash
mvn test
```

Im Container dieser Challenge steht Maven nicht zur Verfügung; entsprechend kann der Testlauf hier nicht demonstriert werden.

## Anpassung für Python

Um ein vergleichbares Szenario mit Python zu realisieren, könnte man die Aufgaben als separate Funktionen oder Klassen in einem Modul `tasks/` ablegen und die Tests mit `pytest` schreiben. Ein grober Ablauf wäre:

1. **Projektstruktur**
   - `tasks/` enthält die zu bearbeitenden Python-Dateien (z.B. `task1.py`, `task2.py` ...).
   - `tests/` hält die `pytest`-Tests analog zu `ExamUnitTest`.
   - `requirements.txt` definiert Abhängigkeiten (z.B. `pytest`).
2. **Automatischer Testlauf**
   - Mit `pytest` lassen sich die Funktionen direkt aufrufen. Ein zusätzliches `pytest`-Plugin kann wie `UniGraderTestResultExtension` die Resultate sammeln und als JSON exportieren.
3. **Packaging**
   - Statt des Maven-Assembly-Plugins könnte ein Python-Skript oder `setuptools` verwendet werden, um die benötigten Dateien in ZIP-Archive zu packen.

Durch diese Anpassungen bleibt der Grundgedanke der Vorlage – eine automatisierte Bewertung von Programmieraufgaben – erhalten, während die Umsetzung komplett in Python erfolgt.

