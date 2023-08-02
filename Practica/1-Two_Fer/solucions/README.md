# Tingues en compte que hi ha moltes solucions per aquest problema, deixo aqui unes quantes.

```kotlin
fun twofer(nom: String?="tu"): String {
  return "Una per tu "+nom+", una per jo." 
}
```

També podriam simplificar-ho mes

```kotlin
fun twofer(nom: String = "tu") = "una per $name, una per jo."
```
