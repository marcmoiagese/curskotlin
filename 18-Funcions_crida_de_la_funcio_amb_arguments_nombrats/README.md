# Funcions: Crida a la funcio amb arguments nombrats

Aquesta característica de Kotlin, ens permet cridar a la funció indican en cualsevol ordre els parametres de la mateixa. Pero hem d'especificar a la crida, el nom del parametre i el valor a enviar.

Per exemple, si tenim la seguent funció definida

```kotlin
fun funcioNom(var1: Int, var2: String, var3: Int){
   <..> codi <..>
}
```

la podem cridar de la seguent manera:

```kotlin
$varvar = 5
funcioNom(var2 = "Catalunya No te Rei", var1 = 10, var3 = $varvar)
``` 
