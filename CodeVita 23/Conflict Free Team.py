n, c = map(int, input().split())
conflicts = [tuple(map(int, input().split())) for _ in range(c)]
expertise = list(map(int, input().split()))

def max_team_expertise(n, conflicts, expertise):
    max_expertise = float('-inf')

    def dfs(node, visited, total_expertise):
        visited.add(node)
        total_expertise += expertise[node - 1]
        local_max = total_expertise

        for neighbor in graph[node]:
            if neighbor not in visited:
                local_max = max(local_max, dfs(neighbor, visited.copy(), total_expertise))

        return local_max

    for i in range(1, n + 1):
        visited = set()
        graph = {j: [] for j in range(1, n + 1)}
        for conflict in conflicts:
            u, v = conflict
            graph[u].append(v)
            graph[v].append(u)

        max_expertise = max(max_expertise, dfs(i, visited, 0))

    return max_expertise

result = max_team_expertise(n, conflicts, expertise)
print(result)

