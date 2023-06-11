/**
 * Crea una funció que li enviem com a parametre un string i ens retorni la cantitat de caracters que te. La funcio main es solicitara la carrega dels noms per teclat. Cridarem la funció dues vegades. També imprimirem al mail quina de les dues paraules te mes caracters.
 */

fun llarg(nom: String): Int{
    return nom.length
}

fun main(args: Array<String>) {
    print("Donam un nom: ")
    val nom1 = readln()

    print("Donam un altre nom: ")
    val nom2 = readln()

    if(llarg(nom1) ==  llarg(nom2))
        print("Els dos son igual de llargs")
    else
        if (llarg(nom1) > llarg(nom2))
            print("$nom1 es mes llarg")
        else
            print("$nom2 es mes llarg")
}