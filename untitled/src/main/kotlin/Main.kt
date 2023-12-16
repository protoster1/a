import java.util.*
var pierwszyraz = true
var zycia = 3
var zyciaprzeciwnika = 3
val x = Scanner(System.`in`)
fun main() {
    while (true) {
        if (pierwszyraz == true) {
            println("Czy chcesz przeczytać zasady? (tak/nie)")
            val wybor = readln()

            if (wybor == "tak") {
                println("Masz TRZY życia.")
                println("Żeby wygrać przeciwnik musi przegrać mając ZERO żyć.")
                println("Jeśli przegrasz mając ZERO żyć koniec gry.")
                println()
            }
        }
        println()
        println("Wpisz 1 żeby wybrać papier, 2 żeby wybrać kamień, 3 żeby wybrać nożyce.")
        val gracz = x.nextInt()
        val przeciwnik = (1..3).random()

        if (gracz == 1) {
            pierwszyraz = false
            if (przeciwnik == 1) {
                println("Przeciwnik wybrał to samo. REMIS.")
                println()
            }

            if (przeciwnik == 2) {
                println("Przeciwnik wybrał kamień. WYGRAŁEŚ.")
                println()
                zyciaprzeciwnika -= 1
                println("Ilosć żyć przeciwnika: $zyciaprzeciwnika")
                println()
            }

            if (przeciwnik == 3) {
                println("Przeciwnik wybrał nożyce. PRZEGRAŁEŚ.")
                println()
                zycia -= 1
                println("Ilosć twoich żyć: $zycia")
                println()
            }
        }

        if (gracz == 2) {
            pierwszyraz = false
            if (przeciwnik == 1) {
                println("Przeciwnik wybrał papier. PRZEGRAŁEŚ.")
                println()
                zycia -= 1
                println("Ilosć twoich żyć: $zycia")
                println()
            }

            if (przeciwnik == 2) {
                println("Przeciwnik wybrał to samo. REMIS.")
                println()
            }

            if (przeciwnik == 3) {
                println("Przeciwnik wybrał nożyce. WYGRAŁEŚ.")
                println()
                zyciaprzeciwnika -= 1
                println("Ilosć żyć przeciwnika: $zyciaprzeciwnika")
                println()
            }
        }

        if (gracz == 3) {
            pierwszyraz = false
            if (przeciwnik == 1) {
                println("Przeciwnik wybrał papier. WYGRAŁEŚ.")
                println()
                zyciaprzeciwnika -= 1
                println("Ilosć żyć przeciwnika: $zyciaprzeciwnika")
                println()
            }

            if (przeciwnik == 2) {
                println("Przeciwnik wybrał kamień. PRZEGRAŁEŚ.")
                println()
                zycia -= 1
                println("Ilosć twoich żyć: $zycia")
                println()
            }

            if (przeciwnik == 3) {
                println("Przeciwnik wybrał to samo. REMIS.")
                println()
            }
        }

        if (gracz > 3) {
            println("niezle czytanie")
        }

        if (gracz < 1) {
            println("niezle czytanie")
        }

        if (zyciaprzeciwnika == 0) {
            println("WYGRAŁEŚ. Czy chcesz spróbować jeszcze raz? (tak/nie).")
            val wybor = readln()

            if (wybor == "nie") {
                break
            }
        }
        if (zycia == 0) {
            println("PRZEGRAŁEŚ. Czy chcesz spróbować jeszcze raz? (tak/nie).")
            val wybor = readln()

            if (wybor == "nie") {
                break
            }
        }

    }
}