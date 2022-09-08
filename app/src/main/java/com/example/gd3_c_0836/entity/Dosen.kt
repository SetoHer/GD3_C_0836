package com.example.gd3_c_0836.entity

class Dosen(var name: String, var pengajar: String) {

    companion object{
        @JvmField
        var listDosen = arrayOf(
            Dosen( "Fedelis Brian", "Pengajar Kelas A, B, dan D"),
            Dosen( "Thomas Adi", "Pengajar Kelas C")
        )
    }
}
