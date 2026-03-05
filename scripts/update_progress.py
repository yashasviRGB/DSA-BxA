import subprocess
import re
from collections import defaultdict

README = "README.md"

# get git commit history
log = subprocess.check_output(
    ["git", "log", "--name-only", "--pretty=format:%ad", "--date=short"]
).decode()

lines = log.split("\n")

date = None
data = defaultdict(list)

for line in lines:
    if re.match(r"\d{4}-\d{2}-\d{2}", line):
        date = line
    elif re.match(r"\d{4}-", line.strip()):
        problem = line.strip().split("-")[0]
        if problem not in data[date]:
            data[date].append(problem)

rows = []

for d in sorted(data.keys()):
    problems = sorted(data[d])
    rows.append(f"| {d} | {len(problems)} | {', '.join(problems)} |")

table = "\n".join(rows)

content = f"""
# LeetCode Progress

| Date | Count | Problems |
|------|------|----------|
{table}
"""

with open(README, "w") as f:
    f.write(content)
