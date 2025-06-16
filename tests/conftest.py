import json
from pathlib import Path
import pytest

results = []

@pytest.hookimpl(hookwrapper=True)
def pytest_runtest_makereport(item, call):
    outcome = yield
    rep = outcome.get_result()
    if rep.when == "call":
        status_map = {
            "passed": "PASSED",
            "failed": "FAILED",
            "skipped": "DISABLED",
        }
        result = {
            "id": item.nodeid,
            "name": item.name,
            "status": status_map.get(rep.outcome, rep.outcome.upper()),
            "duration": rep.duration,
        }
        if rep.failed:
            result["error"] = rep.longreprtext
        results.append(result)


def pytest_sessionfinish(session, exitstatus):
    target = Path("target")
    target.mkdir(exist_ok=True)
    report_path = target / "unitTest-report.json"
    with report_path.open("w", encoding="utf-8") as f:
        json.dump(results, f, indent=2)
