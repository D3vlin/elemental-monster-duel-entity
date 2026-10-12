# elemental-monster-duel-entity

## 📌 Overview

**elemental-monster-duel-entity** is one of 6 repositories in the distributed
architecture of Elemental Monster Duel. It holds JPA entity mappings — the
persistence layer objects used to read and write data.

---

## 🎯 Purpose

This repository exists to:

- Map relational tables to JPA entities, one `@Entity` per table
- Keep ORM annotations and persistence concerns isolated in one place

---

## 🧱 Project Architecture Context

This repo is one of 6 in the Elemental Monster Duel ecosystem, each
independently versioned and maintained:

| Module | Responsibility | Repository |
|---|---|---|
| `db` | Database schema | https://github.com/D3vlin/elemental-monster-duel-db |
| `entity` | JPA mapping | — (this) |
| `dto` | Data transport | https://github.com/D3vlin/elemental-monster-duel-dto |
| `mapper` | Entity ↔ DTO | https://github.com/D3vlin/elemental-monster-duel-mapper |
| `api` | REST interface | https://github.com/D3vlin/elemental-monster-duel-api |
| `ui` | Frontend | https://github.com/D3vlin/elemental-monster-duel-ui |

---

## 🚀 Why a Dedicated Entity Module?

- JPA annotations stay isolated here, never leaking into a module that
  doesn't need them
- Schema changes have exactly one place that needs to catch up
- A persistence detail never leaks into the public contract by accident

---

## License

No license — all rights reserved.
