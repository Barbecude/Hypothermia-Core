# Graph Report - Hypothermia Core  (2026-09-15)

## Corpus Check
- 28 files · ~13,466 words
- Verdict: corpus is large enough that graph structure adds value.
- Unclassified: 8 file(s) not represented in the graph (top: (none) 4, .properties 2, .jar 1)

## Summary
- 123 nodes · 146 edges · 21 communities (13 shown, 6 thin omitted)
- Extraction: 100% EXTRACTED · 0% INFERRED · 0% AMBIGUOUS
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- What You Must Do When Invoked
- org.spongepowered.asm.mixin.Mixin
- /graphify
- graphify reference: extra exports and benchmark
- ExampleMod
- graphify reference: query, path, explain
- ExampleModClient
- gradlew
- graphify reference: add a URL and watch a folder
- graphify reference: commit hook and native CLAUDE.md integration
- graphify reference: incremental update and cluster-only
- Example Mod
- opencode.json
- graphify.js
- graphify reference: GitHub clone and cross-repo merge
- graphify reference: transcribe video and audio
- AGENTS.md
- extraction-spec.md
- SereneSeasonsFoodMixin

## God Nodes (most connected - your core abstractions)
1. `What You Must Do When Invoked` - 12 edges
2. `/graphify` - 10 edges
3. `graphify reference: extra exports and benchmark` - 8 edges
4. `SereneSeasonsFoodMixin` - 5 edges
5. `ExampleMod` - 5 edges
6. `graphify reference: query, path, explain` - 5 edges
7. `ExampleClientMixin` - 4 edges
8. `ExampleMixin` - 4 edges
9. `FallingSnowOptimizationMixin` - 4 edges
10. `Step 3 - Extract entities and relationships` - 4 edges

## Surprising Connections (you probably didn't know these)
- `SereneSeasonsFoodMixin` --references--> `org.spongepowered.asm.mixin.Mixin`  [EXTRACTED]
  src/client/java/com/example/client/mixin/SereneSeasonsFoodMixin.java →   _Bridges community 20 → community 1_

## Import Cycles
- None detected.

## Communities (21 total, 6 thin omitted)

### Community 0 - "What You Must Do When Invoked"
Cohesion: 0.13
Nodes (15): Part A - Structural extraction for code files, Part B - Semantic extraction (parallel subagents), Part C - Merge AST + semantic into final extraction, Step 0 - GitHub repos and multi-path merge (only if a URL or several paths), Step 1 - Ensure graphify is installed, Step 2.5 - Video and audio (only if video files detected), Step 2 - Detect files, Step 3 - Extract entities and relationships (+7 more)

### Community 1 - "org.spongepowered.asm.mixin.Mixin"
Cohesion: 0.21
Nodes (10): net.minecraft.client.Minecraft, net.minecraft.server.MinecraftServer, org.spongepowered.asm.mixin.injection.callback.CallbackInfo, org.spongepowered.asm.mixin.injection.Inject, org.spongepowered.asm.mixin.Mixin, ExampleClientMixin, AlexMobsFixMixin, ExampleMixin (+2 more)

### Community 2 - "/graphify"
Cohesion: 0.20
Nodes (9): For /graphify add and --watch, For /graphify query, For the commit hook and native CLAUDE.md integration, For --update and --cluster-only, /graphify, Honesty Rules, Interpreter guard for subcommands, Usage (+1 more)

### Community 3 - "graphify reference: extra exports and benchmark"
Cohesion: 0.22
Nodes (8): graphify reference: extra exports and benchmark, Step 6b - Wiki (only if --wiki flag), Step 7 - Neo4j export (only if --neo4j or --neo4j-push flag), Step 7a - FalkorDB export (only if --falkordb or --falkordb-push flag), Step 7b - SVG export (only if --svg flag), Step 7c - GraphML export (only if --graphml flag), Step 7d - MCP server (only if --mcp flag), Step 8 - Token reduction benchmark (only if total_words > 5000)

### Community 4 - "ExampleMod"
Cohesion: 0.36
Nodes (5): net.fabricmc.api.ModInitializer, net.minecraft.resources.ResourceLocation, org.slf4j.Logger, ExampleMod, Override

### Community 5 - "graphify reference: query, path, explain"
Cohesion: 0.33
Nodes (5): For /graphify explain, For /graphify path, graphify reference: query, path, explain, Step 0 — Constrained query expansion (REQUIRED before traversal), Step 1 — Traversal

### Community 6 - "ExampleModClient"
Cohesion: 0.50
Nodes (3): net.fabricmc.api.ClientModInitializer, ExampleModClient, Override

### Community 7 - "gradlew"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

### Community 8 - "graphify reference: add a URL and watch a folder"
Cohesion: 0.50
Nodes (3): For /graphify add, For --watch, graphify reference: add a URL and watch a folder

### Community 9 - "graphify reference: commit hook and native CLAUDE.md integration"
Cohesion: 0.50
Nodes (3): For git commit hook, For native CLAUDE.md integration, graphify reference: commit hook and native CLAUDE.md integration

### Community 10 - "graphify reference: incremental update and cluster-only"
Cohesion: 0.50
Nodes (3): For --cluster-only, For --update (incremental re-extraction), graphify reference: incremental update and cluster-only

### Community 11 - "Example Mod"
Cohesion: 0.50
Nodes (3): Example Mod, License, Setup

### Community 20 - "SereneSeasonsFoodMixin"
Cohesion: 0.33
Nodes (4): org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable, org.spongepowered.asm.mixin.injection.Redirect, SereneSeasonsFoodMixin, ColdSweatCompatibilityMixin

## Knowledge Gaps
- **47 isolated node(s):** `$schema`, `plugin`, `Usage`, `What graphify is for`, `Step 0 - GitHub repos and multi-path merge (only if a URL or several paths)` (+42 more)
  These have ≤1 connection - possible missing edges or undocumented components. (Counts symbols only; 63 node(s) total have ≤1 connection when file, concept and rationale nodes are included.)
- **6 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `What You Must Do When Invoked` connect `What You Must Do When Invoked` to `/graphify`?**
  _High betweenness centrality (0.030) - this node is a cross-community bridge._
- **Why does `/graphify` connect `/graphify` to `What You Must Do When Invoked`?**
  _High betweenness centrality (0.023) - this node is a cross-community bridge._
- **What connects `$schema`, `plugin`, `Usage` to the rest of the system?**
  _47 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `What You Must Do When Invoked` be split into smaller, more focused modules?**
  _Cohesion score 0.13333333333333333 - nodes in this community are weakly interconnected._