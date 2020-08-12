fun main() {
    val nilai = 85
    val hasil : Char

    hasil = if(nilai > 90 && nilai <= 100) {
        'A'
    } else if (nilai > 80 && nilai <=90) {
        'B'
    } else if (nilai >70 && nilai <=80) {
        'C'
    } else {
        'D'
    }
    print(hasil)
}