# 2-Pasos per crear primer projecte Android studio amb Kotlin

Un cop iniciem l'entorn d'Android Studio crearem un nou projecte, per comensar crearem l'esquelet basic de la nostra aplicació, seleccionarem "Empty Views Activity":

![IMG](1.PNG)

A la segona finestra hem d'especificar el nom de l'aplicació, la url de la nostra empresa, que sera el nom del paquet que asigna pels arxius font, l'ubicació al disc del nostre projecte i hem de  seleccionar que inclogui suport per programar amb Kotlin.

![IMG](2.PNG)

Finalment tenim creat el nostre primer projecte amb Android Studio, configurat per programar amb Kotlin i ara podem veure l'entorn d'Android Studio per a codificar l'aplicació.

![IMG]()

Android Studio ens generara tots els directoris i arxius basics per iniciar el nostre projecte, els podem veure al costat esquerra del entorn de desenvolupament.

![IMG](4.PNG)

Ara no farem un analisis del significat i objectiu de cada una d'aquestes seccions i arxius generats, els anirem veien a mesura que avansem amb el curs de manera mes profunda.

L'interficie visual del nostre programa per Android s'enmagatzema en un fitxer XML dins la carpeta res, subcarpeta layout, i l'arxiu es diu activity_main.xml. A aquesta carpeta tenim creada la nostra primera pantalla.

Al seleccionar aquest arxiu a Android Studio ens permet visualitzar el contingut en mode "Design" o "Code" es a dir vista diseny o vista codi.

Vista diseny:

![IMG](5.PNG)

Vista codi:

![IMG](6.PNG)

També tenim la vista "blueprint" que ens mostra una interficie simplificada, molt util cuan tenim pantalles complexes que ja veurem mes endavan. Podem veure nomes la vista disenyl, blueprint o les dues seleeccionan un d'aquests botons.

![IMG](7.PNG)

Andorid Studio ja ha insertat un control de tipus ConstraintLayout que permet ingresar controls visuals i situarlos en relació als costats de la finestra o relatiu a altres controls ( mes endavant analitzarem aquest layout )

Ja veurem que podem modificar tot aquest arxiu per que s'adapti a l'aplicació que volem desenvolupar.

Al llarg d'aquest curs anirem veien els objectius de cada una de les seccions que te Android Studio per implementar l'interficie, codificar amb Kotlin les funcionalitats de l'aplicació etc.

Abans de probar l'aplicació a l'emulador d'un dispositiu Android farem un petit cambi a l'interficie que apareix al telefon. borrarem la capa que diu "Hello World" ( simplement seleccionan amb el ratolí l'element i prement esborrar, es pot fer des de cualsevol de les vistes)

De la "Palette" Arrastrarem un "Button" al centre de la pantalla i a la finestra "Propietats" estan seleccionat el "Button" cambiarem la propietat text per la cadena "Hola mon", despres d'arrosegar el botó, pitjarem l'icona "Infer Constraints" per que el botó quedi enllasat amb els costats.

![IMG](8.png)

Per executar l'aplicació primer hem de configurar un emulador, o un  dispositiu fisic, ho podem fer a travñes del Device Manager

![IMG](9.PNG)

I ja podem executar Run -> Run App o premen el triangle verd. Després d'una estona apareixera l'emulador Android per pantalla. L'arranc es lent el primer cop, pero tingues en compte que no cal tancar cada vevegada que vulguis probar codi, en tenir-lo ences acceleres el proces, ja que un cop carregat tot va molt mes rapid. El resultat serà similar al següent:

![IMG](10.PNG)

No passa res si presionem el botó, ja que no li hem codificat cap event.
