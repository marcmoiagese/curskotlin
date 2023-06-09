# Instalacio de Kotlin

Kotlin es un llenguatge de programació bastant nou, desenvolupat per l'empresa JetBrains, es un llenguatge acceptat per Google  per la plataforma Android, Actualment, quan compilem un programa Kotlin, es genera codi JVM que es interpretat per la maquina virtual Java.

Com que es genera un codi intermig per ser interpretat per la JVM, ens permet interactuar facilment amb llibreries escrites per java.

Per poder comensar amb Kotlin, primer hem d'instalar [JDK](https://www.oracle.com/java/technologies/downloads/)

També nesecitarem instalar Kotlin, que podem fent-ho seguin les propies instruccons de la seva [documentació](https://kotlinlang.org/docs/command-line.html#manual-install)

Això ens instalara el compilador kotlinc que ens permetrà compilar el codi des de consola.

```bash
kotlinc hola.kt -include-runtime -d hola.jar
```

I després ja podem executar el programa a través de java.

```bash
java -jar hola.jar
```

Tambe podém utilitzar l'entorn [IntelliJ IDEA](https://www.jetbrains.com/idea/?fromMenu#chooseYourEdition) per comensar amb kotlin que disposa de la verió Community, que es gratuita. I ens instalarà tot el que requereix Kotlin de manera automàtica.

## Index Programacio amb Kotlin

- [1- Hola Mon amb Kotlin](https://github.com/marcmoiagese/curskotlin/tree/master/1-Hola_mon)
- [2- Tipus de variables](https://github.com/marcmoiagese/curskotlin/tree/master/2-Tipus_de_variables)
- [3- Entrada de dades per consola](https://github.com/marcmoiagese/curskotlin/tree/master/3-Entrada_dades_consola)
- [4- Condicional If](https://github.com/marcmoiagese/curskotlin/tree/master/4-Condicional_if)
- [5- Estructura condicional com a expresió](https://github.com/marcmoiagese/curskotlin/tree/master/5-Estructura_condicional_com_a_expresio)
- [6- Estructures condicionals aniuades](https://github.com/marcmoiagese/curskotlin/tree/master/6-Estructures_condicionals_aniuades)
- [7- Condicionals compostos amb operadors logics](https://github.com/marcmoiagese/curskotlin/tree/master/7-Condicionals_compostos_amb_operadors_logics)
- [8- Estructura repetitiva while](https://github.com/marcmoiagese/curskotlin/tree/master/8-Estructura-repetitiva-while)
- [9- Estructura repetitiva do while](https://github.com/marcmoiagese/curskotlin/tree/master/9-Estructura_repetitiva_do_while)
- [10- Estructura repetitiva for](https://github.com/marcmoiagese/curskotlin/tree/master/10-Estructura_repetitiva_for)
- [11- Estructura concicional when](https://github.com/marcmoiagese/curskotlin/tree/master/11-Estructura_condicional_when)
- [12- Estructuracondicional when amb argument](https://github.com/marcmoiagese/curskotlin/tree/master/12-Estructura_condicional_when_amb_argument)
- [13- Concepte de funcions](https://github.com/marcmoiagese/curskotlin/tree/master/13-Concepte_de_funcions)
- [14- Funcions: parametres](https://github.com/marcmoiagese/curskotlin/tree/master/14-Funcions_parametres)
- [15- Funcions: Amb retorn de dades](https://github.com/marcmoiagese/curskotlin/tree/master/15-Funcions_amb_retorn_de_dades)
- [16- Funcions: Amb una unica expresio](https://github.com/marcmoiagese/curskotlin/tree/master/16-Funcions_amb_una_unica_expresio)
- [17- Funcions: Amb paràmetres, amb valors per defecte](https://github.com/marcmoiagese/curskotlin/tree/master/17-Funcions_amb_parametres_amb_valors_per_defecte)
- [18- Funcions: Crida de la funció amb arguments nombrats](https://github.com/marcmoiagese/curskotlin/tree/master/18-Funcions_crida_de_la_funcio_amb_arguments_nombrats)
- [19- Funcions: Internes o Locals](https://github.com/marcmoiagese/curskotlin/tree/master/19-Funcions_internes_o_locals)
- [20- Vectors: Concepte](https://github.com/marcmoiagese/curskotlin/tree/master/20-Vectors_conceptes)
- [21- Funcions: Enviament de parametres i retorn de dades en vectors](https://github.com/marcmoiagese/curskotlin/tree/master/21-Funcions_parametres_i_retorn_del_tipus_de_vector)
- [22- POO: Conceptes de programació orientada a objectes](https://github.com/marcmoiagese/curskotlin/tree/master/22-POO-Conceptes_de_programacio_orientada_a_objectes)
- [23- POO: Constructor de la classe](https://github.com/marcmoiagese/curskotlin/tree/master/23-POO-Constructor_de_la_classe)
- [24- POO: Crida de mètodes desde un altre mètode de la mateixa classe](https://github.com/marcmoiagese/curskotlin/tree/master/24-POO-Crida_de_metodes_des_d_un_altre_metode_de_la_mateixa_classe)
- [25- POO: Colaboració de classes](https://github.com/marcmoiagese/curskotlin/tree/master/25-POO-Colaboracio_de_classes)
- [26- POO: Modificadors d'acces privat i public](https://github.com/marcmoiagese/curskotlin/tree/master/26-POO-Modificadors_d_acces_privat_i_public)
- [27- POO: Propietats i els seus mètodes opcionals set i get](https://github.com/marcmoiagese/curskotlin/tree/master/27-POO-Propietats_i_els_seus_metodes_opcionals_set_i_get)
- [28- POO: data class](https://github.com/marcmoiagese/curskotlin/tree/master/28-POO-data_class)
- [29- POO: enum class](https://github.com/marcmoiagese/curskotlin/tree/master/29-POO-enum_class)
- [30- POO: Objecte nombrat](https://github.com/marcmoiagese/curskotlin/tree/master/30-POO-Objecte_nomrat)
- [31- POO: Herencia](https://github.com/marcmoiagese/curskotlin/tree/master/31-POO-Herencia)
- [32- POO: Herència classes abstractes](https://github.com/marcmoiagese/curskotlin/tree/master/32-POO-Herencia_classes_abstractes)
- [33- POO: Declaració i implementació d'interficies](https://github.com/marcmoiagese/curskotlin/tree/master/33-POO-Declaracio_i_implementacio_d_interficies)
- [34- POO: Vectors amb objectes](https://github.com/marcmoiagese/curskotlin/tree/master/34-POO-Vectors_amb_Objectes)
- [35- Funcions d'ordre superior](https://github.com/marcmoiagese/curskotlin/tree/master/35-Funcions_d_ordre_superior)
- [36- Expresions lambda](https://github.com/marcmoiagese/curskotlin/tree/master/36-Expresions_lambda)
- [37- Expresions lambda amb vecors IntArray, FloatArray, DoubleArray, etc](https://github.com/marcmoiagese/curskotlin/tree/master/37-Expresions_lambda_amb_vecors_IntArray_FloatArray_DoubleArray_etc)
- [38- Expresions lambda: Acces a les variables externes a la expresio lambda](https://github.com/marcmoiagese/curskotlin/tree/master/38-Expresions_lambda_Acces_a_les_variables_externes_a_la_expresio_lambda)
- [39- Funcions d'extensió](https://github.com/marcmoiagese/curskotlin/tree/master/39-Funcions_d_extensio)
- [40- Sobrecarrega d'operadors](https://github.com/marcmoiagese/curskotlin/tree/master/40-Sobrecarrega_d_operadors)
- [41- Funcions: Número variable de paràmetres](https://github.com/marcmoiagese/curskotlin/tree/master/41-Funcions_numero_variable_de_parametres)
- [42- Valors nuls a les variables](https://github.com/marcmoiagese/curskotlin/tree/master/42-valors_nuls_a_les_variables)
- [43- Coleccions](https://github.com/marcmoiagese/curskotlin/tree/master/43-Coleccions)
- [44- Coleccions: List i MutableList](https://github.com/marcmoiagese/curskotlin/tree/master/44-Coleccions_List_i_MutableList)
- [45- Coleccions: Map i MutableMap](https://github.com/marcmoiagese/curskotlin/tree/master/45-Coleccions_Map_i_MutableMap)
- [46- Coleccions: Set i MutableSet](https://github.com/marcmoiagese/curskotlin/tree/master/46-Coleccions_Set_i_MutableSet)
- [47- Package i Import](https://github.com/marcmoiagese/curskotlin/tree/master/47-Package_i_Import)
- [48- Corrutines](https://github.com/marcmoiagese/curskotlin/tree/master/48-Corrutines)
- 49- Corrutines: launch i runBlocking
- 50- Corrutines: runBlocking i coroutineScope
- 51- Corrutines: Funcions de supresió (suspend fun)
- 52- Corrutines: Fluxes (Flow)

## Index Programacio Kotlin per Android

- 1- Instalacio de les eines per programar per android amb Kotlin
- 2- Passes a seguir per crear el primer prijecte amb Android Studio amb Kotlin
- 3- Capturar el click d'un botó
- 4- Controls RadioGroup i  RadioButton
- 5- Control CheckBox
- 6- Control Spinner
- 7- Control ListView ( Amb una llista de tipus String )
- 8- Control ImageButton
- 9- Notificacions senzilles mitjançant la classe Toast
- 10- Control EditText
- 11- Executar una segona "Activity"
- 12- Executar una segona "activity" i enviarli paràmetres
- 13- Enmagatzemament de dades mitjançant la classe SharedPreferences
- 14- Enmagatzemament de dades en un arxiu de text a la memoria interna
- 15- Enmagatzemament de dades en un arxiu de text localitzat a una tarja SD
- 16- Enmagatzemament a una base de dades SQLite
- 17- Instalació del programa Android a un dispositiu real
- 18- Layout(LinearLayout)
- 19- Layout(TableLayout)
- 20- Layout(FrameLayout)
- 21- Layout(ScrollView  i LinearLayout)
- 22- Icona de l'aplicació
- 23- Reproducció d'audio (Arxiu contingut a l'aplicació)
- 24- Reproducció, pausa, continuació  i aturada d'un arxiu d'audio
- 25- Reproducció d'audio (arxiu contingut en una tarja SD)
- 26- Reproducció d'audio (arxiu localitzat a internet)
- 27- Reproducció d'audio utilitzan el reproductor del propi Android ( mitjançant Intent)
- 28- Grabació d'audio mitjançant el grabador que proveeix Android  ( Mitjançant Intent )
- 29- Captura d'audio  mitjançant la classe MediaRecorder
- 30- Dibuixar: Graficar pixels
- 31- Dibuixar: pintar fons i dibuixar línies
- 32- Dibuixar: rectangles
- 33- Dibuixar: Cercles
- 34- Dibuixar: ovals
- 35- Dibuixar: text
- 36- Dibuixar: text amb fonts externes 
- 37- Dibuixar: text sobre un cami
- 38- Dibuixar: una imatge
- 39- Event touch: Dibuixar un cercle
