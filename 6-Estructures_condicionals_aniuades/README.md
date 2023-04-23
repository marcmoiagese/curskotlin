# Estructures condicionals aniuades

Diguem que una estructura és acollida quan, tant per la branca de veritat com per la de fals d'una estructura condicional, apareix una altra estructura condicional. 

```css
[INICI]
   │
   ▼
[CONDICIONAL ANIUAT]
   │
   ├──❏ Condició A és veritable?
   │       │
   │       ├──❏ Sí
   │       │   │
   │       │   ├──❏ Condició B és veritable?
   │       │   │       │
   │       │   │       ├──❏ Sí
   │       │   │       │   │
   │       │   │       │   └──► [FAI X]
   │       │   │       │
   │       │   │       └──❏ No
   │       │   │           │
   │       │   │           └──► [FAI Y]
   │       │   │
   │       │   └──► [FAI Z]
   │       │
   │       └──❏ No
   │           │
   │           └──► [FAI W]
   │
   └──► [SORTIR DEL CONDICIONAL ANIUAT]
   │
   │
   ▼
[FI]
```
